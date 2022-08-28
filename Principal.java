package Hotel;

//Bookstore imports
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Principal {

    static Scanner s = new Scanner(System.in);
    final static int num_habitaciones = 10;
    static Cliente cls[] = new Cliente[num_habitaciones];
    
    public static void main(String[] args){

        //"Data Base"
        cls[0] = new Cliente("Carlos", "72731946", 2, "Simple", (float) 125.7, "12/06/2022");
        cls[1] = new Cliente("Jesús", "72731890", 1, "Doble", (float) 134.8, "12/06/2022");
        
        int index = numClientes(cls);
        
        boolean ban = true;
        
        do{
            String DNI = "";
            
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s","1->Consultar cliente","2->Registrar cliente","3->Consultar ganancia","4->Retirar cliente","5->Consultar habitaciones disponibles","Elija : ");
            int o = s.nextInt();
            s.nextLine();
        
            switch(o){
                case 1: System.out.print("Ingrese el número de DNI : ");
                        DNI = s.nextLine();
                        System.out.println(Consulta_cliente(DNI, cls));
                        break; 
                
                case 2: Registro(cls[index] = new Cliente()); 
                        index++;
                        break;        
                
                case 3: System.out.printf("La ganacia es : %.2f",Consulta_ganancia(cls));
                        break;
                        
                case 4: System.out.print("Ingrese el número de DNI : ");
                        DNI = s.nextLine();
                        if(Retirar_cliente(DNI, cls)){
                            System.out.println("El cliente ha sido retirado.");
                            index--;
                        }else{
                            System.out.println("Hubo un error,no se encontró al cliente.");
                        }
                        break;
                case 5: System.out.println("Numero de habitaciones disponibles " + (num_habitaciones-index));
                        break;
                default: break;
            }
            
            System.out.print("Desea continuar(y/n) : ");
            String d = s.nextLine();
            
            if(d.equalsIgnoreCase("n")){
                ban = false;
            }
        }while(ban == true);
    }
    
    public static int numClientes(Cliente cls[]){
        
        int num = 0;
        
        for(int i = 0; i<cls.length; i++){
            if(cls[i]!=null){
                num++;
            }
        }
        
        return num;
    }
    
    public static void Registro(Cliente c){
        
        String v = "";
        int n = 0;
        String l = "0";
        
        System.out.print("Ingrese su nombre : ");
        v = s.nextLine();
        c.setNombre(v);
        
        do{
            
            n = 0;
            
            System.out.print("Ingrese el número de DNI : ");
            v = s.nextLine();
        
            for(int i = 0; i<v.length(); i++){
                if(48<=v.charAt(i) && v.charAt(i)<=57){
                    continue;
                }else{
                    n+=1;
                    break;
                }
            }
        
            if(v.length() == 8 && n==0){
                c.setDNI(v);
                Fecha(c);
                Habitacion(c);
                Menu(c);
            }else{
                System.out.println("Repita el numero de DNI.");
            }
        }while(n!=0);
    }
    
    public static void Fecha(Cliente c) {
      Date fechadehotel = new Date () ;
      SimpleDateFormat fecha = new SimpleDateFormat (" dd/MM/yyyy ") ;
      c.setFecha(fecha.format(fechadehotel));
    }

    public static void Habitacion(Cliente c){
      System.out.println("¿Que tipo de habitacion le gustaria reservar?"); 
      System.out.println("1.- Simple - 150");
      System.out.println("2.- Doble - 300");
      System.out.println("3.- Familiar - 500"); 
      System.out.print("Elija : ");
      int tipoH = s.nextInt();
      switch (tipoH) {
            case 1:
                c.setPago(150);
                c.setTipoH("simple");
                //ganancia+=150;
                break;
            case 2 :
                c.setPago(300);
                c.setTipoH("Doble");
                //ganancia+=300;
                break;
            case 3 :
                c.setPago(500);
                c.setTipoH("Familiar");
                //ganancia+=500;
                break;
            default:
                System.out.print("No es una opcion.");
      }  
    }

    public static void Menu(Cliente c){
        
        boolean bandera = true;
        char d;
        int num = 0;
        
        do{
            System.out.printf("Platos de comida : %n%s%n%s%n%s%n%s%n%s", "1 -> Ceviche - 20", "2 -> Arroz con Pollo - 15", "3 -> Cabrito - 19", "4 -> Gaseosa - 2.5", "Elija : ");
            num = s.nextInt();
        
            switch(num){
              case 1: c.setPago(20);
                      //ganancia+=20;
                      break;
              case 2: c.setPago(15);
                      //ganancia+=15;
                      break;
              case 3:  c.setPago(19);
                       //ganancia+=19;
                       break;
              case 4: c.setPago((float) 2.5);
                      //ganancia+=2.5;
                      break;
              default : System.out.print("No tenemos ese plato en el menú."); 
                      break;
            }
            
            s.nextLine();
            
            System.out.println("Desea pedir otro producto(y/n) : ");
            d = s.nextLine().charAt(0);
            if(d == 'n'){
                bandera = false;
            }
        }while(bandera == true);   
        
    }

    public static float Consulta_ganancia(Cliente cls[]){
        
        float ganancia = 0;
        int i = 0;
        
        while(i<cls.length && cls[i]!=null){
            ganancia += cls[i].getPago();
            i++;
        }
        
        return ganancia;
    } 
    
    public static String Consulta_cliente(String DNI, Cliente cls[]){
        
        String m = "";
        int i = 0;
        boolean encontrado = false;
        
        while(i<cls.length && cls[i]!=null && !encontrado){
            
            if(DNI.equals(cls[i].getDNI())){
                m = cls[i].toString();
                
                try{
                    File f = new File("C:\\Users\\Usuario\\Desktop\\c.txt");
                    String contenido = m;
                    
                    if(!f.exists()){
                        f.createNewFile();
                    }
                    
                    FileWriter fw = new FileWriter(f.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(contenido);
                    bw.close();
                }catch(Exception e){
                    System.out.println("No se encontró la ruta especificada del archivo!");
                }
                encontrado = true;
            }else{
                m = "No se encontró";
            }
            i++;
        }
        
        return m;
    }

    private static boolean Retirar_cliente(String DNI, Cliente[] cls) {
        int i = 0;
        boolean encontrado = false;
        
        while((i<cls.length && !encontrado )|| cls[i]!=null){
            if(DNI.equals(cls[i].getDNI())){
                cls[i] = null;
                encontrado = true;
                
                for(int j = i+1; j<cls.length ;j++){
                    cls[j-1] = cls[j];
                    cls[j] = null;
                }
                
            }
            i++;
        }
        
        return encontrado;
    }
}