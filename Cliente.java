package Hotel;

public class Cliente {
    
    private String nombre;
    private String DNI;
    private int dias;
    private String tipoH;
    private float pago;
    private String fecha;

    public Cliente() {
    }
    
    public Cliente(String nombre, String DNI, int dias, String tipoH, float pago, String fecha) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.dias = dias;
        this.tipoH = tipoH;
        this.pago = pago;
        this.fecha = fecha;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setTipoH(String tipoH) {
        this.tipoH = tipoH;
    }
    
    public String getDNI() {
        return DNI;
    }

    public int getDias() {
        return dias;
    }

    public void setPago(float pago){
        this.pago+=pago;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoH() {
        return tipoH;
    }
    
    @Override
    public String toString() {
        return "Nombre : " + nombre + "\nFecha : " + fecha + "\nDNI : " + DNI + "\nTipo de habitacion : " + tipoH + "\nPago : " + pago;
    }

    public float getPago() {
        return pago;
    }
}