package interfaz;

import Clases.Cliente;
import Clases.ClienteAnfitrion;
import Clases.ClienteParticular;
import GestionClases.GestionRegistroClienteAnfitrion;
import GestionClases.GestionRegistroClienteParticular;
import interfaz.PantallaAdmin;
import interfaz.PantallaClienteAnfitrion;
import interfaz.PantallaClienteParticular;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PantallaSesion extends javax.swing.JFrame {
    

    GestionRegistroClienteParticular gp = new GestionRegistroClienteParticular();
    GestionRegistroClienteAnfitrion ga = new GestionRegistroClienteAnfitrion();

    public PantallaSesion() {
        initComponents();

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreIniciarSesion = new javax.swing.JLabel();
        textCorreoIS = new javax.swing.JTextField();
        correoIS = new javax.swing.JLabel();
        claveIS = new javax.swing.JLabel();
        botonEntrar = new javax.swing.JButton();
        botonNoTengoCuenta = new javax.swing.JButton();
        textClaveIS = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreIniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nombreIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreIniciarSesion.setText("Iniciar sesión");

        textCorreoIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCorreoISActionPerformed(evt);
            }
        });

        correoIS.setText("Correo:");

        claveIS.setText("Clave:");

        botonEntrar.setText("Entrar");
        botonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEntrarMouseClicked(evt);
            }
        });
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        botonNoTengoCuenta.setText("No tengo cuenta...");
        botonNoTengoCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNoTengoCuentaMouseClicked(evt);
            }
        });
        botonNoTengoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNoTengoCuentaActionPerformed(evt);
            }
        });

        textClaveIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textClaveISActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(nombreIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(correoIS, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCorreoIS)
                            .addComponent(claveIS, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textClaveIS)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonNoTengoCuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(botonEntrar)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoIS, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCorreoIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(claveIS, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textClaveIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNoTengoCuenta)
                    .addComponent(botonEntrar))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCorreoISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCorreoISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCorreoISActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        //if la entrada coincide con algo de la tabla de los admins o con
        //la tabal de anfitriones o clientes.

        String correo = textCorreoIS.getText();
        String clave = textClaveIS.getText();
        
        try{
            FileInputStream fis = new FileInputStream("clientesParticular.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                ClienteParticular clienteParticular = new ClienteParticular();
                clienteParticular = (ClienteParticular) ois.readObject();
                gp.altaClienteParticular(clienteParticular);
            }
        }
        catch (ClassNotFoundException cfe){
           System.out.print(cfe.toString());
        }
        catch (Exception e){
           System.out.print(e.toString());
        }
        
        try{
            FileInputStream fis = new FileInputStream("clientesAnfitrion.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                ClienteAnfitrion clienteAnfitrion = new ClienteAnfitrion();
                clienteAnfitrion = (ClienteAnfitrion) ois.readObject();
                ga.altaClienteAnfitrion(clienteAnfitrion);
            }
        }
        catch (ClassNotFoundException cfe){
           System.out.print(cfe.toString());
        }
        catch (Exception e){
           System.out.print(e.toString());
        }
        
        
        if (gp.busquedaClienteParticular(correo, clave) == null ){
            JOptionPane.showMessageDialog(this, "Correo o clave incorrectos");
        }
        
        if (gp.busquedaClienteParticular(correo, clave) != null){
            PantallaClienteParticular pcp = new PantallaClienteParticular();
            pcp.setVisible(true);
            pcp.setLocationRelativeTo(null);
        }
                
        if (ga.busquedaClienteAnfitrion(correo, clave) == null){
            JOptionPane.showMessageDialog(this, "Correo o clave incorrectos");
        }
        
        if (ga.busquedaClienteAnfitrion(correo, clave) != null){
            PantallaClienteAnfitrion pca = new PantallaClienteAnfitrion();
            pca.setVisible(true);
            pca.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_botonEntrarActionPerformed

   
    
    private void botonNoTengoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNoTengoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonNoTengoCuentaActionPerformed

    private void botonNoTengoCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNoTengoCuentaMouseClicked
        PantallaRegistros pr= new PantallaRegistros();
        pr.setVisible(true);
        this.dispose();
        pr.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonNoTengoCuentaMouseClicked

    private void botonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntrarMouseClicked
        

        

    }//GEN-LAST:event_botonEntrarMouseClicked

    private void textClaveISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textClaveISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textClaveISActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonNoTengoCuenta;
    private javax.swing.JLabel claveIS;
    private javax.swing.JLabel correoIS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreIniciarSesion;
    private javax.swing.JPasswordField textClaveIS;
    private javax.swing.JTextField textCorreoIS;
    // End of variables declaration//GEN-END:variables
}
