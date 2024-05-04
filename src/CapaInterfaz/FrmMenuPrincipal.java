
package CapaInterfaz;

import static CapaInterfaz.FrmCrearUsuario.jCboTipoUsuario;
import static CapaInterfaz.FrmReportes.jRdbClientes;
import static CapaInterfaz.FrmReportes.jRdbFacturas;
import CapaLogica.TipoUsuario;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrmMenuPrincipal extends javax.swing.JFrame {

 FrmLogin frmLogin;
 
 public FrmMenuPrincipal() {
  initComponents();
  setExtendedState(MAXIMIZED_BOTH);
 }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/CapaImagenes/FondoNuevo.png"));
        Image image = icon.getImage();
        jEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMnuBarraPrincipal = new javax.swing.JMenuBar();
        jMnuArchivo = new javax.swing.JMenu();
        jMnuLogin = new javax.swing.JMenuItem();
        jMnuSalir = new javax.swing.JMenuItem();
        jMnuMantenimiento = new javax.swing.JMenu();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuVehiculos = new javax.swing.JMenuItem();
        jMnuPartes = new javax.swing.JMenuItem();
        jMnuTramites = new javax.swing.JMenu();
        jMnuPersonalizar = new javax.swing.JMenuItem();
        jMnuFacturacion = new javax.swing.JMenuItem();
        jMnuReportes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMnuInformación = new javax.swing.JMenu();
        jMnuAcercaDe = new javax.swing.JMenuItem();
        jMnuClienteActivo = new javax.swing.JMenu();

        jLabel1.setText("jLbLUusuario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema BMW");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImages(null);
        setName("Frm"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jEscritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMnuBarraPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        jMnuBarraPrincipal.setBorder(null);
        jMnuBarraPrincipal.setToolTipText("");
        jMnuBarraPrincipal.setEnabled(false);
        jMnuBarraPrincipal.setMinimumSize(new java.awt.Dimension(441, 50));
        jMnuBarraPrincipal.setPreferredSize(new java.awt.Dimension(155, 50));

        jMnuArchivo.setBorder(null);
        jMnuArchivo.setForeground(new java.awt.Color(255, 255, 255));
        jMnuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/ArchivoIcon.png"))); // NOI18N
        jMnuArchivo.setText("Archivo");
        jMnuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnuArchivo.setMaximumSize(new java.awt.Dimension(140, 50));
        jMnuArchivo.setMinimumSize(new java.awt.Dimension(140, 50));
        jMnuArchivo.setPreferredSize(new java.awt.Dimension(100, 38));

        jMnuLogin.setBackground(new java.awt.Color(51, 51, 51));
        jMnuLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuLogin.setForeground(new java.awt.Color(255, 255, 255));
        jMnuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Login2.png"))); // NOI18N
        jMnuLogin.setText("Login");
        jMnuLogin.setBorder(null);
        jMnuLogin.setMaximumSize(new java.awt.Dimension(150, 50));
        jMnuLogin.setMinimumSize(new java.awt.Dimension(150, 50));
        jMnuLogin.setPreferredSize(new java.awt.Dimension(140, 50));
        jMnuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuLoginActionPerformed(evt);
            }
        });
        jMnuArchivo.add(jMnuLogin);

        jMnuSalir.setBackground(new java.awt.Color(51, 51, 51));
        jMnuSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuSalir.setForeground(new java.awt.Color(255, 255, 255));
        jMnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Salir.png"))); // NOI18N
        jMnuSalir.setText("Salir");
        jMnuSalir.setBorder(null);
        jMnuSalir.setMaximumSize(new java.awt.Dimension(150, 50));
        jMnuSalir.setMinimumSize(new java.awt.Dimension(150, 50));
        jMnuSalir.setPreferredSize(new java.awt.Dimension(140, 50));
        jMnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSalirActionPerformed(evt);
            }
        });
        jMnuArchivo.add(jMnuSalir);

        jMnuBarraPrincipal.add(jMnuArchivo);

        jMnuMantenimiento.setBorder(null);
        jMnuMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        jMnuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/MantenimientoIcon.png"))); // NOI18N
        jMnuMantenimiento.setText("Mantenimiento");
        jMnuMantenimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuMantenimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnuMantenimiento.setMaximumSize(new java.awt.Dimension(180, 50));
        jMnuMantenimiento.setMinimumSize(new java.awt.Dimension(180, 50));
        jMnuMantenimiento.setPreferredSize(new java.awt.Dimension(180, 38));

        jMnuClientes.setBackground(new java.awt.Color(51, 51, 51));
        jMnuClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuClientes.setForeground(new java.awt.Color(255, 255, 255));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Clientes2.png"))); // NOI18N
        jMnuClientes.setText("Clientes");
        jMnuClientes.setBorder(null);
        jMnuClientes.setMargin(new java.awt.Insets(3, 10, 3, 10));
        jMnuClientes.setMinimumSize(new java.awt.Dimension(150, 50));
        jMnuClientes.setPreferredSize(new java.awt.Dimension(180, 50));
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        jMnuMantenimiento.add(jMnuClientes);

        jMnuVehiculos.setBackground(new java.awt.Color(51, 51, 51));
        jMnuVehiculos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        jMnuVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/VehiculosIcon.png"))); // NOI18N
        jMnuVehiculos.setText("Autos");
        jMnuVehiculos.setBorder(null);
        jMnuVehiculos.setMargin(new java.awt.Insets(3, 10, 3, 10));
        jMnuVehiculos.setPreferredSize(new java.awt.Dimension(180, 50));
        jMnuVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVehiculosActionPerformed(evt);
            }
        });
        jMnuMantenimiento.add(jMnuVehiculos);

        jMnuPartes.setBackground(new java.awt.Color(51, 51, 51));
        jMnuPartes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuPartes.setForeground(new java.awt.Color(255, 255, 255));
        jMnuPartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/ExtrasVehiculo.png"))); // NOI18N
        jMnuPartes.setText("Partes");
        jMnuPartes.setBorder(null);
        jMnuPartes.setMargin(new java.awt.Insets(3, 10, 3, 10));
        jMnuPartes.setPreferredSize(new java.awt.Dimension(180, 50));
        jMnuPartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuPartesActionPerformed(evt);
            }
        });
        jMnuMantenimiento.add(jMnuPartes);

        jMnuBarraPrincipal.add(jMnuMantenimiento);

        jMnuTramites.setBorder(null);
        jMnuTramites.setForeground(new java.awt.Color(255, 255, 255));
        jMnuTramites.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/FacturacionIcon.png"))); // NOI18N
        jMnuTramites.setText("Trámites");
        jMnuTramites.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuTramites.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnuTramites.setMaximumSize(new java.awt.Dimension(150, 50));
        jMnuTramites.setMinimumSize(new java.awt.Dimension(150, 50));

        jMnuPersonalizar.setBackground(new java.awt.Color(51, 51, 51));
        jMnuPersonalizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuPersonalizar.setForeground(new java.awt.Color(255, 255, 255));
        jMnuPersonalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/PersonalizarIcon.png"))); // NOI18N
        jMnuPersonalizar.setText("Personalizar");
        jMnuPersonalizar.setBorder(null);
        jMnuPersonalizar.setMaximumSize(new java.awt.Dimension(150, 50));
        jMnuPersonalizar.setMinimumSize(new java.awt.Dimension(150, 50));
        jMnuPersonalizar.setPreferredSize(new java.awt.Dimension(150, 50));
        jMnuPersonalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuPersonalizarActionPerformed(evt);
            }
        });
        jMnuTramites.add(jMnuPersonalizar);

        jMnuFacturacion.setBackground(new java.awt.Color(51, 51, 51));
        jMnuFacturacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        jMnuFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/factura.png"))); // NOI18N
        jMnuFacturacion.setText("Facturación");
        jMnuFacturacion.setBorder(null);
        jMnuFacturacion.setMaximumSize(new java.awt.Dimension(150, 50));
        jMnuFacturacion.setMinimumSize(new java.awt.Dimension(150, 50));
        jMnuFacturacion.setPreferredSize(new java.awt.Dimension(150, 50));
        jMnuFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFacturacionActionPerformed(evt);
            }
        });
        jMnuTramites.add(jMnuFacturacion);

        jMnuBarraPrincipal.add(jMnuTramites);

        jMnuReportes.setBorder(null);
        jMnuReportes.setForeground(new java.awt.Color(255, 255, 255));
        jMnuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Registro.png"))); // NOI18N
        jMnuReportes.setText("Registro");
        jMnuReportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnuReportes.setMaximumSize(new java.awt.Dimension(150, 50));
        jMnuReportes.setMinimumSize(new java.awt.Dimension(150, 50));

        jMenuItem1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Reportes.png"))); // NOI18N
        jMenuItem1.setText("Reportes");
        jMenuItem1.setBorder(null);
        jMenuItem1.setMaximumSize(new java.awt.Dimension(150, 50));
        jMenuItem1.setMinimumSize(new java.awt.Dimension(150, 50));
        jMenuItem1.setPreferredSize(new java.awt.Dimension(150, 50));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMnuReportes.add(jMenuItem1);

        jMnuBarraPrincipal.add(jMnuReportes);

        jMnuInformación.setBorder(null);
        jMnuInformación.setForeground(new java.awt.Color(255, 255, 255));
        jMnuInformación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Información.png"))); // NOI18N
        jMnuInformación.setText("Ayuda");
        jMnuInformación.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuInformación.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnuInformación.setMaximumSize(new java.awt.Dimension(150, 50));
        jMnuInformación.setMinimumSize(new java.awt.Dimension(150, 50));

        jMnuAcercaDe.setBackground(new java.awt.Color(51, 51, 51));
        jMnuAcercaDe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMnuAcercaDe.setForeground(new java.awt.Color(255, 255, 255));
        jMnuAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/clipart1142273.png"))); // NOI18N
        jMnuAcercaDe.setText("Acerca de");
        jMnuAcercaDe.setBorder(null);
        jMnuAcercaDe.setMaximumSize(new java.awt.Dimension(150, 50));
        jMnuAcercaDe.setMinimumSize(new java.awt.Dimension(150, 50));
        jMnuAcercaDe.setPreferredSize(new java.awt.Dimension(150, 50));
        jMnuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuAcercaDeActionPerformed(evt);
            }
        });
        jMnuInformación.add(jMnuAcercaDe);

        jMnuBarraPrincipal.add(jMnuInformación);

        jMnuClienteActivo.setBorder(null);
        jMnuClienteActivo.setForeground(new java.awt.Color(255, 255, 255));
        jMnuClienteActivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Conectado.png"))); // NOI18N
        jMnuClienteActivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnuClienteActivo.setMinimumSize(new java.awt.Dimension(200, 50));
        jMnuClienteActivo.setPreferredSize(new java.awt.Dimension(200, 50));
        jMnuClienteActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClienteActivoActionPerformed(evt);
            }
        });
        jMnuBarraPrincipal.add(jMnuClienteActivo);

        setJMenuBar(jMnuBarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

     frmLogin = new FrmLogin();
     frmLogin.setVisible(true);
     frmLogin.setLocationRelativeTo(null);
     
    }//GEN-LAST:event_formWindowOpened

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed
     FrmCrearUsuario frmCrearUsuario = new FrmCrearUsuario();
     frmCrearUsuario.setVisible(true);
     frmCrearUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMnuVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVehiculosActionPerformed
     FrmAuto frmAuto = new FrmAuto();
     frmAuto.setVisible(true);
     frmAuto.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMnuVehiculosActionPerformed

    private void jMnuPartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuPartesActionPerformed
     FrmPartes frmPartes = new FrmPartes();
     frmPartes.setVisible(true);
     frmPartes.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMnuPartesActionPerformed

    private void jMnuPersonalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuPersonalizarActionPerformed
     FrmPerzonalizar frmPerzonalizar = new FrmPerzonalizar();
     frmPerzonalizar.setVisible(true);
     frmPerzonalizar.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMnuPersonalizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
     int decision = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea abandonar el sistema?", "Aviso", JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
      if(decision == JOptionPane.YES_OPTION){
       System.exit(0);
      }
    }//GEN-LAST:event_formWindowClosing

    private void jMnuFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFacturacionActionPerformed
     FrmFactura frmFactura = new FrmFactura();
     frmFactura.setVisible(true);
     frmFactura.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMnuFacturacionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     FrmReportes frmReportes = new FrmReportes();
     frmReportes.setVisible(true);
     frmReportes.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMnuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuAcercaDeActionPerformed
        FrmAcercaDe frmAcercaDe = new FrmAcercaDe();
        frmAcercaDe.setVisible(true);
        frmAcercaDe.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMnuAcercaDeActionPerformed

    private void jMnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSalirActionPerformed
        int decision = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea abandonar el sistema?", "Aviso", JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
        if(decision == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMnuSalirActionPerformed

    private void jMnuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuLoginActionPerformed
        ocultarMenus();
        frmLogin = new FrmLogin();
        frmLogin.setVisible(true);
        frmLogin.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMnuLoginActionPerformed

    private void jMnuClienteActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClienteActivoActionPerformed

    }//GEN-LAST:event_jMnuClienteActivoActionPerformed
  
    public static void ocultarMenus(){
     jMnuMantenimiento.setVisible(false);
     jMnuTramites.setVisible(false);
     jMnuReportes.setVisible(false);
     jMnuClienteActivo.setVisible(false);
    }
    
    public static void verMenus(){
     jMnuMantenimiento.setVisible(true);
     jMnuTramites.setVisible(true);
     jMnuReportes.setVisible(true);
     jMnuClienteActivo.setVisible(true);
    }
    
    public static void verMenusUsuario(){
     jMnuArchivo.setVisible(true);
     jMnuTramites.setVisible(true);
     jMnuReportes.setVisible(true);
     jMnuClienteActivo.setVisible(true);
    }
    
    public static void desahablitarMenus(){
     jMnuMantenimiento.setEnabled(false);
     jMnuTramites.setEnabled(false);
     jMnuReportes.setEnabled(false);
    }
    
     public static void hablitarMenus(){
     jMnuMantenimiento.setEnabled(true);
     jMnuTramites.setEnabled(true);
     jMnuReportes.setEnabled(true);
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMnuAcercaDe;
    public static javax.swing.JMenu jMnuArchivo;
    public javax.swing.JMenuBar jMnuBarraPrincipal;
    public static javax.swing.JMenu jMnuClienteActivo;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenuItem jMnuFacturacion;
    public static javax.swing.JMenu jMnuInformación;
    private javax.swing.JMenuItem jMnuLogin;
    public static javax.swing.JMenu jMnuMantenimiento;
    private javax.swing.JMenuItem jMnuPartes;
    public static javax.swing.JMenuItem jMnuPersonalizar;
    public static javax.swing.JMenu jMnuReportes;
    private javax.swing.JMenuItem jMnuSalir;
    public static javax.swing.JMenu jMnuTramites;
    private javax.swing.JMenuItem jMnuVehiculos;
    // End of variables declaration//GEN-END:variables

}


