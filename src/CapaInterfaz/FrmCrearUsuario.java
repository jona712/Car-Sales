
package CapaInterfaz;

import static CapaInterfaz.FrmAuto.auto;
import CapaLogica.Auto;
import CapaLogica.Cliente;
import CapaLogica.Coorporativo;
import CapaLogica.Usuario;
import CapaLogica.Pais;
import CapaLogica.Personal;
import CapaLogica.TipoUsuario;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCrearUsuario extends javax.swing.JFrame {
 
 DefaultTableModel modeloTabla = new DefaultTableModel();
 static Cliente cliente; 
    
 public FrmCrearUsuario() {
  initComponents();
  setSize(950, 600);
  modeloTabla = (DefaultTableModel)jTblUsuarios.getModel();
 
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoUsuarioGrupoBotones = new javax.swing.ButtonGroup();
        TipoRegularBotones = new javax.swing.ButtonGroup();
        jPlnNavegacion = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jBtnEliminarUsuario = new javax.swing.JButton();
        jBtnModificarUsuario = new javax.swing.JButton();
        jLblModificar = new javax.swing.JLabel();
        jBtnSalir = new javax.swing.JButton();
        jLblSalir = new javax.swing.JLabel();
        jLblConsular = new javax.swing.JLabel();
        jBtnRegistrarUsuario = new javax.swing.JButton();
        jLblRegistrarUsuario = new javax.swing.JLabel();
        jBtnConsultarUsuario = new javax.swing.JButton();
        jLblEliminar = new javax.swing.JLabel();
        jPnlInformacionPersonal = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLblCorreoElectronico = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jTxtClave = new javax.swing.JPasswordField();
        jTxtCorreo = new javax.swing.JTextField();
        jLblPais = new javax.swing.JLabel();
        jCboPais = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTxtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtTelefono = new javax.swing.JTextField();
        jPlnTipoRegular = new javax.swing.JPanel();
        jRbdCoorporativo = new javax.swing.JRadioButton();
        jRbdPersonal = new javax.swing.JRadioButton();
        jCboTipoUsuario = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPnlTipoCedula = new javax.swing.JPanel();
        jTxtTipoCedula = new javax.swing.JTextField();
        jLblTipoCedula = new javax.swing.JLabel();
        jBtnBuscar = new javax.swing.JButton();
        jBtnVerificar = new javax.swing.JButton();
        jLblVerificar = new javax.swing.JLabel();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnLimpiarCampos = new javax.swing.JLabel();
        jPlnTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión De Usuarios");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPlnNavegacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jBtnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/EliminarUsuario.png"))); // NOI18N
        jBtnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarUsuarioActionPerformed(evt);
            }
        });

        jBtnModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/ModificarUsuario.png"))); // NOI18N
        jBtnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarUsuarioActionPerformed(evt);
            }
        });

        jLblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblModificar.setText("Modificar");

        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Salir.png"))); // NOI18N
        jBtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jLblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblSalir.setText("Salir");

        jLblConsular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblConsular.setText("Consultar");

        jBtnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/AgregarUsuario.png"))); // NOI18N
        jBtnRegistrarUsuario.setFocusPainted(false);
        jBtnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarUsuarioActionPerformed(evt);
            }
        });

        jLblRegistrarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblRegistrarUsuario.setText("Registrar usuario");

        jBtnConsultarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/BuscarUsuario.png"))); // NOI18N
        jBtnConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarUsuarioActionPerformed(evt);
            }
        });

        jLblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblEliminar.setText("Eliminar");

        javax.swing.GroupLayout jPlnNavegacionLayout = new javax.swing.GroupLayout(jPlnNavegacion);
        jPlnNavegacion.setLayout(jPlnNavegacionLayout);
        jPlnNavegacionLayout.setHorizontalGroup(
            jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlnNavegacionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblConsular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPlnNavegacionLayout.setVerticalGroup(
            jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlnNavegacionLayout.createSequentialGroup()
                .addGroup(jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPlnNavegacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPlnNavegacionLayout.createSequentialGroup()
                                .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPlnNavegacionLayout.createSequentialGroup()
                                .addGroup(jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPlnNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblModificar)
                                    .addComponent(jLblConsular)
                                    .addComponent(jLblEliminar)
                                    .addComponent(jLblRegistrarUsuario)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPnlInformacionPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLblNombre.setText("Nombre:");

        jLabel1.setText("Clave:");

        jLblCorreoElectronico.setText("Email:");

        jTxtNombre.setAlignmentX(0.0F);
        jTxtNombre.setAlignmentY(0.0F);
        jTxtNombre.setVerifyInputWhenFocusTarget(false);

        jTxtClave.setAlignmentX(0.0F);
        jTxtClave.setAlignmentY(0.0F);
        jTxtClave.setVerifyInputWhenFocusTarget(false);
        jTxtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtClaveKeyTyped(evt);
            }
        });

        jTxtCorreo.setAlignmentX(0.0F);
        jTxtCorreo.setAlignmentY(0.0F);
        jTxtCorreo.setVerifyInputWhenFocusTarget(false);

        jLblPais.setText("País:");

        jCboPais.setAlignmentX(0.0F);
        jCboPais.setAlignmentY(0.0F);
        jCboPais.setVerifyInputWhenFocusTarget(false);

        jLabel4.setText("Dirección:");

        jTxtDireccion.setAlignmentX(0.0F);
        jTxtDireccion.setAlignmentY(0.0F);
        jTxtDireccion.setVerifyInputWhenFocusTarget(false);

        jLabel5.setText("Télefono:");

        jTxtTelefono.setAlignmentX(0.0F);
        jTxtTelefono.setAlignmentY(0.0F);
        jTxtTelefono.setVerifyInputWhenFocusTarget(false);
        jTxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtTelefonoKeyTyped(evt);
            }
        });

        jPlnTipoRegular.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPlnTipoRegular.setRequestFocusEnabled(false);
        jPlnTipoRegular.setVerifyInputWhenFocusTarget(false);

        TipoRegularBotones.add(jRbdCoorporativo);
        jRbdCoorporativo.setText("Coorporativo");
        jRbdCoorporativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbdCoorporativoActionPerformed(evt);
            }
        });

        TipoRegularBotones.add(jRbdPersonal);
        jRbdPersonal.setText("Personal");
        jRbdPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbdPersonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPlnTipoRegularLayout = new javax.swing.GroupLayout(jPlnTipoRegular);
        jPlnTipoRegular.setLayout(jPlnTipoRegularLayout);
        jPlnTipoRegularLayout.setHorizontalGroup(
            jPlnTipoRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlnTipoRegularLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPlnTipoRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRbdCoorporativo)
                    .addComponent(jRbdPersonal))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPlnTipoRegularLayout.setVerticalGroup(
            jPlnTipoRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlnTipoRegularLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jRbdCoorporativo)
                .addGap(18, 18, 18)
                .addComponent(jRbdPersonal)
                .addGap(18, 18, 18))
        );

        jCboTipoUsuario.setVerifyInputWhenFocusTarget(false);

        jLabel2.setText("Tipo usuario:");

        jPnlTipoCedula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Cédula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPnlTipoCedula.setPreferredSize(new java.awt.Dimension(341, 112));
        jPnlTipoCedula.setRequestFocusEnabled(false);
        jPnlTipoCedula.setVerifyInputWhenFocusTarget(false);

        jTxtTipoCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtTipoCedulaKeyTyped(evt);
            }
        });

        jLblTipoCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlTipoCedulaLayout = new javax.swing.GroupLayout(jPnlTipoCedula);
        jPnlTipoCedula.setLayout(jPnlTipoCedulaLayout);
        jPnlTipoCedulaLayout.setHorizontalGroup(
            jPnlTipoCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlTipoCedulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlTipoCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTipoCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTxtTipoCedula))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlTipoCedulaLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPnlTipoCedulaLayout.setVerticalGroup(
            jPnlTipoCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlTipoCedulaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLblTipoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jTxtTipoCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnBuscar)
                .addContainerGap())
        );

        jBtnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Verificar.png"))); // NOI18N
        jBtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarActionPerformed(evt);
            }
        });

        jLblVerificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblVerificar.setText("Verificar");

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/LimpiarIcon.png"))); // NOI18N
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jBtnLimpiarCampos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBtnLimpiarCampos.setText("Limpiar");

        jTblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Télefono", "Dirección", "Correo", "Clave", "País", "Usuario", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblUsuarios);

        javax.swing.GroupLayout jPlnTablaLayout = new javax.swing.GroupLayout(jPlnTabla);
        jPlnTabla.setLayout(jPlnTablaLayout);
        jPlnTablaLayout.setHorizontalGroup(
            jPlnTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        jPlnTablaLayout.setVerticalGroup(
            jPlnTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPlnTablaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPnlInformacionPersonalLayout = new javax.swing.GroupLayout(jPnlInformacionPersonal);
        jPnlInformacionPersonal.setLayout(jPnlInformacionPersonalLayout);
        jPnlInformacionPersonalLayout.setHorizontalGroup(
            jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlInformacionPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlInformacionPersonalLayout.createSequentialGroup()
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPnlInformacionPersonalLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPnlInformacionPersonalLayout.createSequentialGroup()
                                .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblCorreoElectronico)
                                    .addComponent(jLabel1)
                                    .addComponent(jLblPais)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                                .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtClave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCboTipoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPnlInformacionPersonalLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPnlInformacionPersonalLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtnLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnVerificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblVerificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlInformacionPersonalLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPlnTipoRegular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPnlTipoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPnlInformacionPersonalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPlnTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPnlInformacionPersonalLayout.createSequentialGroup()
                        .addComponent(jLblNombre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPnlInformacionPersonalLayout.setVerticalGroup(
            jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlInformacionPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnlInformacionPersonalLayout.createSequentialGroup()
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPlnTipoRegular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPnlTipoCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jPlnTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnlInformacionPersonalLayout.createSequentialGroup()
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblNombre)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblCorreoElectronico)
                            .addComponent(jTxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblPais)
                            .addComponent(jCboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnlInformacionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblVerificar)
                            .addComponent(jBtnLimpiarCampos))
                        .addGap(8, 8, 8)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlInformacionPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPlnNavegacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPlnNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnlInformacionPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     jTxtTipoCedula.setVisible(false); 

    //Llena combo Paises
     llenarComboPaises();
     
     //Llena combo Tipo Usuarios
     llenarComboTipoUsuario();
    
     //Inicia los combos en null
     jCboPais.setSelectedItem(null);
     jCboTipoUsuario.setSelectedItem(null);
     
     noUsarBotones();
     llenaTablaUsuarios();   
    }//GEN-LAST:event_formWindowOpened

    private void jBtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerificarActionPerformed
     if(!jTxtNombre.getText().isEmpty() && !jTxtTelefono.getText().isEmpty() && !jTxtDireccion.getText().isEmpty() && !jTxtCorreo.getText().isEmpty() && !capturaClave().equals("")){
      if(jCboPais.getSelectedItem() != null){
       if(jCboTipoUsuario.getSelectedItem() != null){
        if(TipoRegularBotones.getSelection() != null){
             
         if(jRbdCoorporativo.isSelected()){
          
          
          if(validarFormatoArroba())
          if(validadFormatoContra())
          if(validarFormatoContraMayusculas())
          if(validarFormatoContraMinusculas())
          if(validarFormatoContraNumeros())
              
           if(!jTxtTipoCedula.getText().isEmpty()){
            if(validarFormatoCedula()){
             usarBotones();
            }
           }else{
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la cedúla jurídica");
           } 
          }
         
         
      
         if(jRbdPersonal.isSelected()){
          
          
          if(validarFormatoArroba())
          if(validadFormatoContra())
          if(validarFormatoContraMayusculas())
          if(validarFormatoContraMinusculas())
          if(validarFormatoContraNumeros())
             
           if(!jTxtTipoCedula.getText().isEmpty()){
            if(validarFormatoCedula()){
             usarBotones();
            }
            
           }else{
              JOptionPane.showMessageDialog(rootPane, "Debe ingresar la cedúla Física");
           }
          }
         
        }else{
         JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el tipo de Cliente");
        }
        
       }else{
        JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el Tipo de Usuario");
        jCboTipoUsuario.requestFocus();
       }  
        
      }else{
       JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el PAÍS de origen");
       jCboPais.requestFocus();
      }  
      
     }else{
      JOptionPane.showMessageDialog(rootPane, "Los campos NO pueden quedar vacíos.\n"
      + "             Verfique los datos.", "Información", JOptionPane.INFORMATION_MESSAGE);
     } 
    }//GEN-LAST:event_jBtnVerificarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
     dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarUsuarioActionPerformed
     //Captura los datos del USUARIO
     String nombre = jTxtNombre.getText();
     String telefono = jTxtTelefono.getText();
     String direccion = jTxtDireccion.getText();
     String correo = jTxtCorreo.getText();
     String clave = capturaClave();
     Pais pais = (Pais)jCboPais.getSelectedItem();
     TipoUsuario tipoUsuario = (TipoUsuario)jCboTipoUsuario.getSelectedItem();
     
     //Captura el tipo de CEDULA(juridica o fisica)
     String tipoCedula = jTxtTipoCedula.getText();
     
     //Crea el Usuario
     Usuario usuario = new Usuario(correo,clave,nombre,pais,direccion,telefono,tipoUsuario);
     
     //Selecciona el Tipo Cliente
      if(jRbdCoorporativo.isSelected()){
       cliente = new Coorporativo(usuario, tipoCedula);
      }
             
      if(jRbdPersonal.isSelected()){
       cliente = new Personal(usuario, tipoCedula);
      }
             
      try{
       if(clienteExiste()){
        JOptionPane.showMessageDialog(rootPane, "El usuario con cédula "+ jTxtTipoCedula.getText() +" ya se encuentra registrado.", "Información", JOptionPane.INFORMATION_MESSAGE);
        jBtnRegistrarUsuario.setEnabled(false);
        cliente = null; 
       }
                
       }catch (Exception ex) {
        Logger.getLogger(FrmCrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
       }
             
       if(cliente!= null){ //Verifica que CLIENTE no este nulo
        try{
         Cliente.agregarCliente(cliente);
          JOptionPane.showMessageDialog(rootPane, "Usuario agregado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
           limpiar();
            jBtnRegistrarUsuario.setEnabled(false);
             jTxtTipoCedula.setVisible(false);
        }catch(Exception e){
         JOptionPane.showMessageDialog(rootPane, "Error al registrar al Usuario\n"+
                             "                      consulte con el administrador.\n"+ e.toString());
                     //e.printStackTrace();
        }
        //actualiza la tabla de manera que se vea el nuevo usuario
        llenaTablaUsuarios();
       }            
    }//GEN-LAST:event_jBtnRegistrarUsuarioActionPerformed

    private void jBtnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarUsuarioActionPerformed
     if(jTblUsuarios.getSelectedRow()>= 0){
        
      String tipoCedula = jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),0).toString();   
      String nombre = jTxtNombre.getText();
      String telefono = jTxtTelefono.getText();
      String direccion = jTxtDireccion.getText();
      String correo = jTxtCorreo.getText();
      String clave = capturaClave();
      Pais pais = (Pais)jCboPais.getSelectedItem();
      TipoUsuario tipoUsuario = (TipoUsuario)jCboTipoUsuario.getSelectedItem();
       
       if(jCboPais.getSelectedItem() != null){
        //Tipo Cliente
        if(jRbdCoorporativo.isSelected()){
         Usuario usuario = new Usuario(correo, clave, nombre, pais, direccion, telefono, tipoUsuario);
          cliente = new Coorporativo(usuario, tipoCedula);      
        }
          
        if(jRbdPersonal.isSelected()){
         Usuario usuario = new Usuario(correo, clave, nombre, pais, direccion, telefono, tipoUsuario);
          cliente = new Personal(usuario, tipoCedula);
        }
        
        if(cliente!= null){
         //Modifica el usuario del archivo
         try{
          Cliente.modificarCliente(cliente);
           limpiar();
            jRbdCoorporativo.setEnabled(true);
             jRbdPersonal.setEnabled(true);
              jBtnBuscar.setEnabled(true);
            
         }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane, "Error al modificar al Usuario\n"+
                             "                      consulte con el administrador.\n"+ e.toString());
         }
         llenaTablaUsuarios(); //actualiza la tabla con el nuevo departamento
        }
         jTblUsuarios.clearSelection();//Quita la selección de la fila en la tabla      
      }else{
       JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el país.", "Información", JOptionPane.INFORMATION_MESSAGE);
        jCboPais.requestFocus();
      }
     }else{
      JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el usuario a MODIFICAR.", "Información", JOptionPane.INFORMATION_MESSAGE);
       jTblUsuarios.requestFocus();
        return;
     }
    }//GEN-LAST:event_jBtnModificarUsuarioActionPerformed

    private void jBtnConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarUsuarioActionPerformed
     if(jTblUsuarios.getSelectedRow()>= 0){ //Comprueba que seleccione al USUARIO en la tabla
         
     //Captura el correo del USUARIO a consultar
      String cedula = jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),0).toString();
      
      try{
       cliente = cliente.consultarCliente(cedula); //Consulta el CLIENTE con el correo capturado
        JOptionPane.showMessageDialog(rootPane, cliente.toString());
         limpiar();
      }catch(Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al buscar al Usuario."+ex.getMessage().toString());
      }    
     }else{
       JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el usuario a CONSULTAR.", "Información", JOptionPane.INFORMATION_MESSAGE);
        return;
     }
      jTblUsuarios.clearSelection();
    }//GEN-LAST:event_jBtnConsultarUsuarioActionPerformed

    private void jBtnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarUsuarioActionPerformed
     if(jTblUsuarios.getSelectedRow()==-1){ //Comprueba que seleccione al USUARIO en la tabla
      JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el usuario a ELIMINAR.", "Información", JOptionPane.INFORMATION_MESSAGE);
       return;          
     }
       
     //Captura la cédula del usuaruio seleccionado
     String cedula =jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),0).toString();
      try{
       Cliente.eliminarCliente(cedula);
        limpiar();
      }catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, "Error al consultar al Usuario.\n"
               + "                Consulte con el administrador.", "Información", JOptionPane.INFORMATION_MESSAGE);
      }        
     llenaTablaUsuarios();     
    }//GEN-LAST:event_jBtnEliminarUsuarioActionPerformed

    private void jRbdCoorporativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbdCoorporativoActionPerformed
     jLblTipoCedula.setText("Jurídica");
     jTxtTipoCedula.setText("");
     jTxtTipoCedula.setVisible(true);
     
    }//GEN-LAST:event_jRbdCoorporativoActionPerformed

    private void jRbdPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbdPersonalActionPerformed
     jLblTipoCedula.setText("Física");
     jTxtTipoCedula.setText("");
     jTxtTipoCedula.setVisible(true);
    }//GEN-LAST:event_jRbdPersonalActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
     limpiar();
     jRbdCoorporativo.setEnabled(true);
     jRbdPersonal.setEnabled(true);
     jBtnBuscar.setEnabled(true);
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jTxtTipoCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTipoCedulaKeyTyped
        // TODO add your handling code here:
     if(jRbdCoorporativo.isSelected()) {
      if(jTxtTipoCedula.getText().length() >= 10) {
       evt.consume();
      }
     }
       
     if(jRbdPersonal.isSelected()) {
      if(jTxtTipoCedula.getText().length() >= 9) {
       evt.consume();
      }
     }  
    }//GEN-LAST:event_jTxtTipoCedulaKeyTyped

    private void jTxtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtClaveKeyTyped
     if(capturaClave().length() >= 12){
      evt.consume();
     }
    }//GEN-LAST:event_jTxtClaveKeyTyped

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
     String cedula = jTxtTipoCedula.getText();
     Cliente cliente1 = null;
      if(TipoRegularBotones.getSelection() != null){
       if(validarFormatoCedula()){
        try{
         cliente1 = Cliente.consultarCliente(cedula);
          JOptionPane.showMessageDialog(rootPane, cliente1.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
           limpiar();
            jTxtTipoCedula.setVisible(false);
        }catch(Exception ex){
         JOptionPane.showMessageDialog(rootPane,"      Usuario no encontrado.\n"
               + "          Verifique los datos.", "Información", JOptionPane.ERROR_MESSAGE);
        }     
       }
      }else{
       JOptionPane.showMessageDialog(rootPane,"Debe seleccionar el tipo de cliente.", "Información", JOptionPane.INFORMATION_MESSAGE);
      }    
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jTxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTelefonoKeyTyped
     if(jTxtTelefono.getText().length() >= 8){
      evt.consume();
     }
    }//GEN-LAST:event_jTxtTelefonoKeyTyped

    private void jTblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblUsuariosMouseClicked
        jBtnConsultarUsuario.setEnabled(true);
        jBtnEliminarUsuario.setEnabled(true);

        if(evt.getClickCount()==2){
            jBtnModificarUsuario.setEnabled(true);
            jTxtTipoCedula.setEnabled(false);

            String cedula = jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),0).toString();
            String nombre = jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),1).toString();
            String telefono = jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),2).toString();
            String direccion = jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),3).toString();
            String correo = jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),4).toString();
            String clave = jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),5).toString();
            Pais pais = (Pais)jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),6);
            Object tipoUsuario = jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),7);

            if(jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),8).equals("Coorporativo")){
                jRbdCoorporativo.setSelected(true);

            }else{
                if(jTblUsuarios.getValueAt(jTblUsuarios.getSelectedRow(),8).equals("Personal")){
                    jRbdPersonal.setSelected(true);
                }
            }

            jTxtTipoCedula.setText(cedula);
            jTxtNombre.setText(nombre);
            jTxtTelefono.setText(telefono);
            jTxtDireccion.setText(direccion);
            jTxtCorreo.setText(correo);
            jTxtClave.setText(clave);
            jCboPais.setSelectedItem(pais);
            jCboTipoUsuario.setSelectedItem(tipoUsuario);

            jRbdCoorporativo.setEnabled(false);
            jRbdPersonal.setEnabled(false);
            jBtnBuscar.setEnabled(false);
        }
    }//GEN-LAST:event_jTblUsuariosMouseClicked
   
    public static void inhabilitarBotones(){
     jBtnConsultarUsuario.setVisible(false);
     jLblConsular.setVisible(false);
     
     jBtnModificarUsuario.setVisible(false);
     jLblModificar.setVisible(false);
     
     jBtnEliminarUsuario.setVisible(false);
     jLblEliminar.setVisible(false);
     
    }
    
    public static void noUsarBotones(){
     jBtnRegistrarUsuario.setEnabled(false);
     jBtnModificarUsuario.setEnabled(false);
     jBtnConsultarUsuario.setEnabled(false);
     jBtnEliminarUsuario.setEnabled(false);
    }
    
    public static void usarBotones(){
     jBtnRegistrarUsuario.setEnabled(true);
     jBtnModificarUsuario.setEnabled(true);
     jBtnConsultarUsuario.setEnabled(true);
     jBtnEliminarUsuario.setEnabled(true);
    }
    
    public void limpiar(){
     jTxtClave.setText("");
     jTxtCorreo.setText("");
     jTxtDireccion.setText("");
     jTxtNombre.setText("");
     jTxtTelefono.setText("");
     jTxtTipoCedula.setText("");
     jCboPais.setSelectedItem(null);
     jCboTipoUsuario.setSelectedItem(null);
     TipoRegularBotones.clearSelection();
     jTblUsuarios.clearSelection();
     jTxtTipoCedula.setText("");
     jLblTipoCedula.setText("");
    }
    
    public static Usuario getUsuarioMantenimiento() {
     return getUsuarioMantenimiento();
    }

    public String capturaClave(){
     String clave = "";
      char [] capturaClave = jTxtClave.getPassword();
       for(int i = 0; i < capturaClave.length; i++) {
        clave += capturaClave[i];   
       }
     return clave;
    }
   
    private void llenaTablaUsuarios() {
     try {
            //Llama al método que llena la lista con los Departamentos del ArrayList
            //Llena la tabla con los Departamentos que se grabaron en el ArrayList
            modeloTabla.setRowCount(0);//Limpia la tabla
            Object[] datos = new Object[9];
           //Obtiene el arrayList con la lista de los departamentos que están en el archivo
            ArrayList<Cliente> lista= Cliente.listadoClientes();
            //llenar la tabla a partir del ArrayList que viene del archivo
            for (int i = 0; i < lista.size(); i++) {
                datos[0]  = lista.get(i).getTipoCedula();
                datos[1]  = lista.get(i).getUsuario().getNombre();
                datos[2]  = lista.get(i).getUsuario().getTelefono();
                datos[3]  = lista.get(i).getUsuario().getDireccion();
                datos[4]  = lista.get(i).getUsuario().getCorreo();
                datos[5]  = lista.get(i).getUsuario().getClave();
                datos[6]  = lista.get(i).getUsuario().getPaisOrigen();
                datos[7]  = lista.get(i).getUsuario().getTipoUsuario();
                if(lista.get(i).getClass().getName().equals("CapaLogica.Coorporativo")){
                 datos[8] = "Coorporativo"; 
                }else{
                 if(lista.get(i).getClass().getName().equals("CapaLogica.Personal")){
                 datos[8] = "Personal";  
                 }
                }
                
                modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al listar el Usuario\n"+
                         "el programa se cerrará consulte con el administrador\n"+
                         e.toString());
        }
    }
   
    public void llenarComboPaises(){
     jCboPais.addItem(new Pais("DEU", "Alemania"));
     jCboPais.addItem(new Pais("BRA", "Brasil"));
     jCboPais.addItem(new Pais("CHN", "China"));
     jCboPais.addItem(new Pais("IND", "India"));
     jCboPais.addItem(new Pais("RSA", "Sudáfrica"));
     jCboPais.addItem(new Pais("UK", "Reino Unido"));
     jCboPais.addItem(new Pais("EUA", "Estados Unidos"));
     jCboPais.addItem(new Pais("MEX", "México"));
     jCboPais.addItem(new Pais("CRC", "Costa Rica"));
     jCboPais.addItem(new Pais("ARG", "Argentina"));
    }
    
    public void llenarComboTipoUsuario(){
     jCboTipoUsuario.addItem(TipoUsuario.USUARIO_REGULAR);
     if(FrmLogin.jTxtCorreo.getText().equals("admin")){
     jCboTipoUsuario.addItem(TipoUsuario.ADMINISTRADOR);
     }
    }
   
    public boolean clienteExiste() throws Exception{
     boolean bandera = false;
     String cedula = jTxtTipoCedula.getText();
      for(Cliente clienteExistente : Cliente.listadoClientes()) {
       String cedulaExiste = clienteExistente.getTipoCedula();
        if(cedulaExiste.equals(cedula)){
         bandera = true;
        }else{
         bandera= false;
        }
      }
     return bandera;
    }
   
    public boolean validarFormatoCedula(){
     boolean formato = false;
     String cedula = jTxtTipoCedula.getText();
    
      if(jRbdPersonal.isSelected()){
       if(cedula.length() == 9){
        formato = true;
       }else{
        formato = false;
         JOptionPane.showMessageDialog(rootPane, "El formato de cédula Física es de 9 digitos.\n"
                + "                 Verifique los datos.", "Información", JOptionPane.INFORMATION_MESSAGE);
       }
      }
    
    
      if(jRbdCoorporativo.isSelected()){
       if(cedula.length()>9){
        formato = true; 
       }else{
        formato = false;
        JOptionPane.showMessageDialog(rootPane, "El formato de cédula jurídica es de 10 digitos.\n"
                + "                 Verifique los datos.", "Información", JOptionPane.INFORMATION_MESSAGE);
       }
      }   
     return formato;
    }
   
    public boolean validarFormatoArroba(){
     boolean formato = false;
     String correo = jTxtCorreo.getText();
     char arroba = '@';
     char hayArroba = 0;
     
     for(int i = 0; i < correo.length(); i++){
      hayArroba = correo.charAt(i);
       if(hayArroba == arroba){
        return formato = true;
      }
     }
     
     if(hayArroba!=arroba){
       JOptionPane.showMessageDialog(rootPane, "El formato del email debe contener el signo '@'.\n"
                + "                    Verifique los datos.", "Información", JOptionPane.WARNING_MESSAGE);
        jTxtCorreo.requestFocus();
         jBtnRegistrarUsuario.setEnabled(false);
          formato = false;
      }else{
       formato = true;
      }
     return formato;
    }
    
    
    public boolean validadFormatoContra(){
     boolean formato = false;
     String clave = capturaClave();
      if(clave.length() >= 8 && clave.length() <= 12){
       formato = true;
      }else{
       formato = false;
        JOptionPane.showMessageDialog(rootPane, "El formato de la contraseña es de 8 a 12 digitos.\n"
                + "                   Verifique los datos.", "Información", JOptionPane.WARNING_MESSAGE);
        jTxtClave.requestFocus();
     }
      return formato;
    }
    
    public boolean validarFormatoContraMayusculas(){
     boolean formato = false;
     String clave = capturaClave();
     String mayusculas = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
     char caracter1 = 0;
     char caracter2 = 0;

     
     for(int i = 0; i < mayusculas.length(); i++){
      caracter1 = mayusculas.charAt(i);
      for (int j = 0; j < clave.length(); j++){
       caracter2 = clave.charAt(j);
       if( caracter1==caracter2 ){
        return formato = true;       
       }
      }
     }
     
     if(caracter1!=caracter2){
       JOptionPane.showMessageDialog(rootPane, "El formato de la contraseña debe contener al menos una MAYÚSCULA.\n"
                + "                                      Verifique los datos.", "Información", JOptionPane.WARNING_MESSAGE);
        jTxtClave.requestFocus();
         jBtnRegistrarUsuario.setEnabled(false);
          formato = false;
      }else{
       formato = true;
      }
     return formato;
    }
    
    public boolean validarFormatoContraMinusculas(){
     boolean formato = false;
     String clave = capturaClave();
     String mayusculas = "qwertyuiopasdfghjklzxcvbnm";
     char caracter1 = 0;
     char caracter2 = 0;

     
     for(int i = 0; i < mayusculas.length(); i++){
      caracter1 = mayusculas.charAt(i);
      for (int j = 0; j < clave.length(); j++){
       caracter2 = clave.charAt(j);
       if( caracter1==caracter2 ){
        return formato = true;       
       }
      }
     }
     
     if(caracter1!=caracter2){
       JOptionPane.showMessageDialog(rootPane, "El formato de la contraseña debe contener al menos una MINÚSCULA.\n"
                + "                                      Verifique los datos.", "Información", JOptionPane.WARNING_MESSAGE);
        jTxtClave.requestFocus();
         jBtnRegistrarUsuario.setEnabled(false);
          formato = false;
      }else{
       formato = true;
      }
     return formato;
    }
    
    public boolean validarFormatoContraNumeros(){
     boolean formato = false;
     String clave = capturaClave();
     String numeros = "0123456789";
     char caracter1 = 0;
     char caracter2 = 0;

     
     for(int i = 0; i < numeros.length(); i++){
      caracter1 = numeros.charAt(i);
      for (int j = 0; j < clave.length(); j++){
       caracter2 = clave.charAt(j);
       if( caracter1==caracter2 ){
        return formato = true;       
       }
      }
     }
     
     if(caracter1!=caracter2){
       JOptionPane.showMessageDialog(rootPane, "El formato de la contraseña debe contener al menos un NÚMERO.\n"
                + "                                      Verifique los datos.", "Información", JOptionPane.WARNING_MESSAGE);
        jTxtClave.requestFocus();
         jBtnRegistrarUsuario.setEnabled(false);
          formato = false;
      }else{
       formato = true;
      }
     return formato;
    }
         
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrearUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TipoRegularBotones;
    private javax.swing.ButtonGroup TipoUsuarioGrupoBotones;
    private javax.swing.JButton jBtnBuscar;
    public static javax.swing.JButton jBtnConsultarUsuario;
    public static javax.swing.JButton jBtnEliminarUsuario;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JLabel jBtnLimpiarCampos;
    public static javax.swing.JButton jBtnModificarUsuario;
    public static javax.swing.JButton jBtnRegistrarUsuario;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jBtnVerificar;
    public static javax.swing.JComboBox<Pais> jCboPais;
    public static javax.swing.JComboBox jCboTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLblConsular;
    private javax.swing.JLabel jLblCorreoElectronico;
    public static javax.swing.JLabel jLblEliminar;
    public static javax.swing.JLabel jLblModificar;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblPais;
    private javax.swing.JLabel jLblRegistrarUsuario;
    private javax.swing.JLabel jLblSalir;
    private javax.swing.JLabel jLblTipoCedula;
    private javax.swing.JLabel jLblVerificar;
    private javax.swing.JPanel jPlnNavegacion;
    public static javax.swing.JPanel jPlnTabla;
    public static javax.swing.JPanel jPlnTipoRegular;
    private javax.swing.JPanel jPnlInformacionPersonal;
    private javax.swing.JPanel jPnlTipoCedula;
    private javax.swing.JRadioButton jRbdCoorporativo;
    private javax.swing.JRadioButton jRbdPersonal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jTblUsuarios;
    private javax.swing.JPasswordField jTxtClave;
    private javax.swing.JTextField jTxtCorreo;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtTelefono;
    private javax.swing.JTextField jTxtTipoCedula;
    // End of variables declaration//GEN-END:variables
}
