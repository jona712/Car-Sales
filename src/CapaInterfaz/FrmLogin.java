
package CapaInterfaz;

import static CapaInterfaz.FrmCrearUsuario.jCboTipoUsuario;
import javax.swing.JOptionPane;
import CapaInterfaz.FrmMenuPrincipal;
import static CapaInterfaz.FrmMenuPrincipal.desahablitarMenus;
import CapaLogica.Cliente;
import CapaLogica.TipoUsuario;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmLogin extends javax.swing.JFrame {
 FrmMenuPrincipal frmMenuPrincipal;
 static Cliente cliente;
 static String correoUsuario;
 static String claveUsuario;
 static int intentos = 1;
 static ArrayList<Cliente> clienteConectado = new ArrayList<>();
 
    public FrmLogin() {
     initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTxtCorreo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTxtClave = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jBtnRegistrarse = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBtnIngresar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Bmw.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 50));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/User.png"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jTxtCorreo.setBackground(new java.awt.Color(102, 102, 102));
        jTxtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTxtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jTxtCorreo.setBorder(null);
        jPanel5.add(jTxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 260, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 330, 40));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Password.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jTxtClave.setBackground(new java.awt.Color(102, 102, 102));
        jTxtClave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTxtClave.setForeground(new java.awt.Color(0, 0, 0));
        jTxtClave.setBorder(null);
        jPanel6.add(jTxtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 260, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 330, 40));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnRegistrarse.setBackground(new java.awt.Color(102, 102, 102));
        jBtnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        jBtnRegistrarse.setText("Registrarse");
        jBtnRegistrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jBtnRegistrarse.setBorderPainted(false);
        jBtnRegistrarse.setFocusPainted(false);
        jBtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarseActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 40));

        jBtnIngresar.setBackground(new java.awt.Color(102, 102, 102));
        jBtnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Enter.png"))); // NOI18N
        jBtnIngresar.setBorder(null);
        jBtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBtnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBtnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
    }//GEN-LAST:event_formWindowOpened

    private void jBtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarseActionPerformed
        FrmCrearUsuario frmCrearUsuario = new FrmCrearUsuario();
        frmCrearUsuario.jTblUsuarios.setVisible(false);
        FrmCrearUsuario.jPlnTabla.setVisible(false);
        frmCrearUsuario.setVisible(true);
        frmCrearUsuario.setLocationRelativeTo(null);
        frmCrearUsuario.inhabilitarBotones();
    }//GEN-LAST:event_jBtnRegistrarseActionPerformed

    private void jBtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIngresarActionPerformed

        String correo = jTxtCorreo.getText();
        String clave = capturaClave();

        if(!jTxtCorreo.getText().isEmpty()){
            if(!capturaClave().equals("")){
                if(correo.equals("admin") && clave.equals("123")){
                    frmMenuPrincipal.jMnuClienteActivo.setText("Admin");
                    frmMenuPrincipal.verMenus();
                    dispose();
                    intentos = 1;
                }else{
                    if(clienteConectado()){
                        frmMenuPrincipal.verMenusUsuario();
                        frmMenuPrincipal.jMnuClienteActivo.setText(cliente.getUsuario().getNombre());
                        dispose();
                        intentos = 1;
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Correo o Contraseña incorrectos.\n           Verifique los datos.", "Error", JOptionPane.ERROR_MESSAGE);
                        intentos++;
                        if(intentos > 3){
                            JOptionPane.showMessageDialog(rootPane, "Lo sentimos, intentos permitos alcanzado.\n"
                                + "              El programa se cerrará.", "Información", JOptionPane.WARNING_MESSAGE);
                            System.exit(0);
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "La contraseña NO puede quedar vacía.\n"
                    + "              Verifique los datos.", "Información.", JOptionPane.WARNING_MESSAGE);
                jTxtClave.requestFocus();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "El correo NO puede quedar vacío.\n"
                + "          Verifique los datos.", "Información.", JOptionPane.WARNING_MESSAGE);
            jTxtCorreo.requestFocus();
        }
    }//GEN-LAST:event_jBtnIngresarActionPerformed

    public static String capturaClave(){
     String clave = "";
      char [] capturaClave = jTxtClave.getPassword();
       for(int i = 0; i < capturaClave.length; i++) {
        clave += capturaClave[i];   
     }
    return clave;
   }
    
   public static Cliente capturaCliente(){
    Cliente clienteCapturado = null;
    String corr = jTxtCorreo.getText();
    String clav = capturaClave();
    
     try {
         Cliente.consultarCliente(corr);
         clienteCapturado = Cliente.consultarCliente(correoUsuario);
     } catch (Exception ex) {
         Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
     }
     return clienteCapturado;
   }
   
   public boolean clienteConectado(){
    boolean bandera = false;
    String correo = jTxtCorreo.getText();
    String clave = capturaClave();
     try{
      for(Cliente clientes : Cliente.listadoClientes()){
       if(clientes.getUsuario().getCorreo().equals(correo)){
        if(clientes.getUsuario().getClave().equals(clave)){
         cliente = clientes;
          bandera = true;
        }
       }
      }
     }catch(Exception ex){
       Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
     }
    return bandera;
   }
   
    public static void main(String args[]) {
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnIngresar;
    private javax.swing.JButton jBtnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JPasswordField jTxtClave;
    public static javax.swing.JTextField jTxtCorreo;
    // End of variables declaration//GEN-END:variables
}
