package Hotel;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        setSizebackground();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grouptyperoom = new javax.swing.ButtonGroup();
        optionproducts = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        dnilabel = new javax.swing.JLabel();
        dnifield = new javax.swing.JTextField();
        dayslabel = new javax.swing.JLabel();
        daysfield = new javax.swing.JTextField();
        simpleroom = new javax.swing.JRadioButton();
        dobleroom = new javax.swing.JRadioButton();
        familiarroom = new javax.swing.JRadioButton();
        typeroom = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        payfield = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        products = new javax.swing.JLabel();
        yesradioButton = new javax.swing.JRadioButton();
        noradioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(255, 102, 102));
        title.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        title.setText("Hotel");
        Panel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 36));

        namelabel.setText("Name :");
        Panel.add(namelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldActionPerformed(evt);
            }
        });
        Panel.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 331, -1));

        dnilabel.setText("DNI :");
        Panel.add(dnilabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        Panel.add(dnifield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 332, -1));

        dayslabel.setText("Days :  ");
        Panel.add(dayslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        Panel.add(daysfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 86, -1));

        grouptyperoom.add(simpleroom);
        simpleroom.setText("Simple ");
        Panel.add(simpleroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        grouptyperoom.add(dobleroom);
        dobleroom.setText("Doble");
        Panel.add(dobleroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        grouptyperoom.add(familiarroom);
        familiarroom.setText("Familiar");
        Panel.add(familiarroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        typeroom.setText("Type room : ");
        Panel.add(typeroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        pay.setText("Pay : ");
        Panel.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        Panel.add(payfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 40, -1));
        Panel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 380));

        products.setText("Products : ");
        Panel.add(products, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 30));

        optionproducts.add(yesradioButton);
        yesradioButton.setText("Yes");
        Panel.add(yesradioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        optionproducts.add(noradioButton);
        noradioButton.setText("No");
        noradioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noradioButtonActionPerformed(evt);
            }
        });
        Panel.add(noradioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setSizebackground(){
        ImageIcon imagen1 = new ImageIcon("D:\\Preparacion\\Programación\\Java\\POO\\Imagenes\\hotel.jpg");
        background.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    private void namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldActionPerformed

    }//GEN-LAST:event_namefieldActionPerformed

    private void noradioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noradioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noradioButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel background;
    private javax.swing.JTextField daysfield;
    private javax.swing.JLabel dayslabel;
    private javax.swing.JTextField dnifield;
    private javax.swing.JLabel dnilabel;
    private javax.swing.JRadioButton dobleroom;
    private javax.swing.JRadioButton familiarroom;
    private javax.swing.ButtonGroup grouptyperoom;
    private javax.swing.JTextField namefield;
    private javax.swing.JLabel namelabel;
    private javax.swing.JRadioButton noradioButton;
    private javax.swing.ButtonGroup optionproducts;
    private javax.swing.JLabel pay;
    private javax.swing.JTextField payfield;
    private javax.swing.JLabel products;
    private javax.swing.JRadioButton simpleroom;
    private javax.swing.JLabel title;
    private javax.swing.JLabel typeroom;
    private javax.swing.JRadioButton yesradioButton;
    // End of variables declaration//GEN-END:variables
}
