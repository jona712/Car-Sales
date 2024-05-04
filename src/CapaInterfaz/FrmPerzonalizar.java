
package CapaInterfaz;
import CapaLogica.Auto;
import CapaLogica.Cliente;
import CapaLogica.Electrico;
import CapaLogica.Factura;
import CapaLogica.Fosil;
import CapaLogica.Hibrido;
import CapaLogica.Parte;
import CapaLogica.TipoFactura;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmPerzonalizar extends javax.swing.JFrame {
 public static Factura factura;
 static Auto auto;
 static Parte parte;
 static double precioAuto;
 static double precioParte;
 protected DecimalFormat formatoNumero = new DecimalFormat("#");
 
 public FrmPerzonalizar() {
  initComponents();
  setSize(950, 600);

  }
 
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoAutoGrupoBotones = new javax.swing.ButtonGroup();
        TipoPrecioGrupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRbdElectrico = new javax.swing.JRadioButton();
        jRbdFosil = new javax.swing.JRadioButton();
        jRbdHíbrido = new javax.swing.JRadioButton();
        jCboAutos = new javax.swing.JComboBox<>();
        jBtnSeleccionarAuto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaMostrarAuto = new javax.swing.JTextArea();
        jBtnElimarAuto = new javax.swing.JButton();
        jLblElimarAuto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCboPartes = new javax.swing.JComboBox<>();
        jBtnSeleccionarParte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtnElimarParte = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxaMostrarPartes = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLblCostoAuto = new javax.swing.JLabel();
        jTxtCostoAuto = new javax.swing.JTextField();
        jLblCostoPartes = new javax.swing.JLabel();
        jTxtCostoPartes = new javax.swing.JTextField();
        jLblSubtotal = new javax.swing.JLabel();
        jTxtSubtotal = new javax.swing.JTextField();
        jRdbColones = new javax.swing.JRadioButton();
        jRdbDolares = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jBtnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBtnFormalizar = new javax.swing.JButton();
        jLblFormalizar = new javax.swing.JLabel();
        jLblSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Personalización");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selección de Auto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TipoAutoGrupoBotones.add(jRbdElectrico);
        jRbdElectrico.setText("Eléctrico");
        jRbdElectrico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbdElectricoActionPerformed(evt);
            }
        });

        TipoAutoGrupoBotones.add(jRbdFosil);
        jRbdFosil.setText("Fósil");
        jRbdFosil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbdFosilActionPerformed(evt);
            }
        });

        TipoAutoGrupoBotones.add(jRbdHíbrido);
        jRbdHíbrido.setText("Híbrido");
        jRbdHíbrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbdHíbridoActionPerformed(evt);
            }
        });

        jBtnSeleccionarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/AgregarIcon.png"))); // NOI18N
        jBtnSeleccionarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSeleccionarAutoActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccionar");

        jTxaMostrarAuto.setEditable(false);
        jTxaMostrarAuto.setColumns(20);
        jTxaMostrarAuto.setRows(5);
        jScrollPane1.setViewportView(jTxaMostrarAuto);

        jBtnElimarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/EliminarConMenos.png"))); // NOI18N
        jBtnElimarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElimarAutoActionPerformed(evt);
            }
        });

        jLblElimarAuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblElimarAuto.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRbdElectrico)
                                .addGap(18, 18, 18)
                                .addComponent(jRbdFosil)
                                .addGap(18, 18, 18)
                                .addComponent(jRbdHíbrido))
                            .addComponent(jCboAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jBtnSeleccionarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblElimarAuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnElimarAuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRbdElectrico)
                                    .addComponent(jRbdFosil)
                                    .addComponent(jRbdHíbrido))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCboAutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnSeleccionarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnElimarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLblElimarAuto))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Partes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jBtnSeleccionarParte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/AgregarIcon.png"))); // NOI18N
        jBtnSeleccionarParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSeleccionarParteActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccionar");

        jBtnElimarParte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/EliminarConMenos.png"))); // NOI18N
        jBtnElimarParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnElimarParteActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Eliminar");

        jTxaMostrarPartes.setEditable(false);
        jTxaMostrarPartes.setColumns(20);
        jTxaMostrarPartes.setRows(5);
        jScrollPane2.setViewportView(jTxaMostrarPartes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCboPartes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSeleccionarParte, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnElimarParte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnSeleccionarParte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnElimarParte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addComponent(jCboPartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLblCostoAuto.setText("Costo auto:");

        jTxtCostoAuto.setEditable(false);

        jLblCostoPartes.setText("Costo partes:");

        jTxtCostoPartes.setEditable(false);

        jLblSubtotal.setText("Subtotal:");

        jTxtSubtotal.setEditable(false);

        TipoPrecioGrupoBotones.add(jRdbColones);
        jRdbColones.setText("Colones");
        jRdbColones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbColonesActionPerformed(evt);
            }
        });

        TipoPrecioGrupoBotones.add(jRdbDolares);
        jRdbDolares.setText("Dólares");
        jRdbDolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbDolaresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblCostoAuto)
                    .addComponent(jLblCostoPartes)
                    .addComponent(jLblSubtotal))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtCostoPartes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(jTxtCostoAuto, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jTxtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbColones)
                    .addComponent(jRdbDolares))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCostoAuto)
                    .addComponent(jTxtCostoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbColones))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCostoPartes)
                    .addComponent(jTxtCostoPartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRdbDolares))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSubtotal)
                    .addComponent(jTxtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/LimpiarIcon.png"))); // NOI18N
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Limpiar");

        jBtnFormalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Verificar.png"))); // NOI18N
        jBtnFormalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFormalizarActionPerformed(evt);
            }
        });

        jLblFormalizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblFormalizar.setText("Formalizar");

        jLblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Salir.png"))); // NOI18N
        jLblSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLblSalirActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Salir");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnFormalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblFormalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnFormalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblFormalizar)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     jBtnFormalizar.setEnabled(false);
     jBtnSeleccionarParte.setEnabled(false);
     jBtnElimarParte.setEnabled(false);
     jRdbDolares.setVisible(false);
     try{
      llenarComboPartes();
     }catch (Exception ex) {
      Logger.getLogger(FrmPerzonalizar.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_formWindowOpened

    private void jRbdElectricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbdElectricoActionPerformed
     vaciarCombo();
     try {
         llenarComboAutoElectricos();
     } catch (Exception ex) {
         Logger.getLogger(FrmPerzonalizar.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jRbdElectricoActionPerformed

    private void jRbdFosilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbdFosilActionPerformed
     vaciarCombo();
     try {
         llenarComboAutoFosiles();
     } catch (Exception ex) {
         Logger.getLogger(FrmPerzonalizar.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jRbdFosilActionPerformed

    private void jRbdHíbridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbdHíbridoActionPerformed
     vaciarCombo();
     try {
         llenarComboAutoHibridos();
     } catch (Exception ex) {
         Logger.getLogger(FrmPerzonalizar.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jRbdHíbridoActionPerformed

    private void jBtnSeleccionarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSeleccionarAutoActionPerformed
     if(jCboAutos.getSelectedItem() != null){
      //Asigna el auto que fue seleccionado
      auto = (Auto)jCboAutos.getSelectedItem();
      precioAuto = auto.getPrecio();
      
      jTxaMostrarAuto.setText(auto.consultaAuto());
      jBtnFormalizar.setEnabled(true);
      
      //Actualiza el campo costo total del auto y subtotal con el precio del auto
      jTxtCostoAuto.setText(String.valueOf(auto.getPrecio()));
      jTxtSubtotal.setText(String.valueOf(auto.getPrecio()));
      
      
      TipoAutoGrupoBotones.clearSelection();
      jBtnSeleccionarAuto.setEnabled(false);
      jCboAutos.setSelectedItem(null);

      jBtnSeleccionarParte.setEnabled(true);
      jBtnElimarParte.setEnabled(true);
     }else{
      JOptionPane.showMessageDialog(rootPane, "Debe elegir el auto a AGREGAR.", "Información", JOptionPane.INFORMATION_MESSAGE);
      jCboAutos.requestFocus();
     }
    }//GEN-LAST:event_jBtnSeleccionarAutoActionPerformed

    private void jBtnElimarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElimarAutoActionPerformed
     if(jCboAutos.getSelectedItem() != null){
      
      //Actualiza el costo de auto
      jTxtCostoAuto.setText(String.valueOf(auto.restaMontoAuto()));
      
      //Captura el subtotal y le resta el precio de auto eliminado
      Double subtotal = Double.parseDouble(jTxtSubtotal.getText());
      jTxtSubtotal.setText(String.valueOf(subtotal - auto.getPrecio()));
      
      //Limpiar el jTxa
      jTxaMostrarAuto.setText("");
      
      jCboAutos.setSelectedItem(null);
      jCboAutos.removeAllItems();
      TipoAutoGrupoBotones.clearSelection();
      jBtnSeleccionarAuto.setEnabled(true);
     }else{
      JOptionPane.showMessageDialog(rootPane, "Debe elegir el auto a ELIMINAR.", "Información", JOptionPane.INFORMATION_MESSAGE);
       jCboAutos.requestFocus();
     }
    }//GEN-LAST:event_jBtnElimarAutoActionPerformed

    private void jBtnSeleccionarParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSeleccionarParteActionPerformed
     if(jCboPartes.getSelectedItem() != null){
      //Agregar las parte al AUTO
      auto.agregarParte((Parte)jCboPartes.getSelectedItem());
      
      jTxaMostrarPartes.setText(auto.MostrarPartes());
      
      //Actualiza el precio total de partes
      jTxtCostoPartes.setText(String.valueOf(auto.totalPartes()));
      
      //Actualiza el subtotal sumando el precio del auto y las partes
      jTxtSubtotal.setText(String.valueOf(auto.getPrecio() + auto.totalPartes()));
         
      jCboPartes.setSelectedItem(null);
     }else{
      JOptionPane.showMessageDialog(rootPane, "Debe elegir la parte a AGREGAR.", "Información", JOptionPane.INFORMATION_MESSAGE);
      jCboPartes.requestFocus();
     }
     
    }//GEN-LAST:event_jBtnSeleccionarParteActionPerformed

    private void jBtnElimarParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnElimarParteActionPerformed
     if(jCboPartes.getSelectedItem() != null){
      //Elimina la parte seleccionada
      auto.getArrayPartes().remove(jCboPartes.getSelectedItem());
      
      parte = (Parte)jCboPartes.getSelectedItem();
     
      //Captura el precio subtotal
      double subtotal = Double.parseDouble(jTxtSubtotal.getText());
      
      //Actualiza el campo subtotal resta el precio de la parte seleccionada
      jTxtSubtotal.setText(String.valueOf(subtotal - parte.getPrecio()));   
      
      //Muestra las partes agregadas
      jTxaMostrarPartes.setText(auto.MostrarPartes()); 
      
      //Actualiza el subtotal con el total de todas las partes
      jTxtCostoPartes.setText(String.valueOf(auto.totalPartes()));
      
      
      jCboPartes.setSelectedItem(null);
     }else{
      JOptionPane.showMessageDialog(rootPane, "Debe elegir la parte a ELIMINAR.", "Información", JOptionPane.INFORMATION_MESSAGE);
      jCboPartes.requestFocus();
     }
    }//GEN-LAST:event_jBtnElimarParteActionPerformed

    private void jBtnFormalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFormalizarActionPerformed

      if(auto != null){
//       autoSelecionados.add(auto);
       FrmFactura.modeloListaAutos.addElement(auto);
        JOptionPane.showMessageDialog(rootPane, "            La perzonalización se realizó correctamente.\n"
                         + "Consulte en el apartado de factura para finalizar su tramite.", "Información", JOptionPane.INFORMATION_MESSAGE);
      
       jBtnSeleccionarAuto.setEnabled(true);
        jBtnFormalizar.setEnabled(false);
         Limpiar();
     }else{
      JOptionPane.showMessageDialog(rootPane, "Error al formalizar la perzonalización.\n"
           + "      Consulte con el administrador.", "Información", JOptionPane.ERROR_MESSAGE);  
     }
    }//GEN-LAST:event_jBtnFormalizarActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
     Limpiar();
     jBtnFormalizar.setEnabled(false);
     jBtnSeleccionarAuto.setEnabled(true);
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jLblSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLblSalirActionPerformed
     dispose();
    }//GEN-LAST:event_jLblSalirActionPerformed

    private void jRdbColonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbColonesActionPerformed
     if(!jTxtCostoAuto.getText().isEmpty() && !jTxtCostoPartes.getText().isEmpty() && !jTxtSubtotal.getText().isEmpty()){
      double precioAuto = Double.parseDouble(jTxtCostoAuto.getText());
      double precioParte = Double.parseDouble(jTxtCostoPartes.getText());
      double subtotal = Double.parseDouble(jTxtSubtotal.getText());
     
      double precioAutoColones = precioAuto*630;
      double precioParteColones = precioParte*630;
      double subtotalColones = subtotal*630;
     
      jTxtCostoAuto.setText(String.valueOf(formatoNumero.format(precioAutoColones)));
      jTxtCostoPartes.setText(String.valueOf(formatoNumero.format(precioParteColones)));
      jTxtSubtotal.setText(String.valueOf(formatoNumero.format(subtotalColones)));
      
      jRdbDolares.setVisible(true);
      jRdbColones.setVisible(false);
     }else{
      JOptionPane.showMessageDialog(rootPane, "Debe seleccionar articulos", "Información", JOptionPane.INFORMATION_MESSAGE);
      TipoPrecioGrupoBotones.clearSelection();
     }
     
    }//GEN-LAST:event_jRdbColonesActionPerformed

    private void jRdbDolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbDolaresActionPerformed
     if(!jTxtCostoAuto.getText().isEmpty() && !jTxtCostoPartes.getText().isEmpty() && !jTxtSubtotal.getText().isEmpty()){
      double precioAuto = Double.parseDouble(jTxtCostoAuto.getText());
      double precioParte = Double.parseDouble(jTxtCostoPartes.getText());
      double subtotal = Double.parseDouble(jTxtSubtotal.getText());
     
      double precioAutoColones = precioAuto/630;
      double precioParteColones = precioParte/630;
      double subtotalColones = subtotal/630;
     
      jTxtCostoAuto.setText(String.valueOf(formatoNumero.format(precioAutoColones)));
      jTxtCostoPartes.setText(String.valueOf(formatoNumero.format(precioParteColones)));
      jTxtSubtotal.setText(String.valueOf(formatoNumero.format(subtotalColones)));
      
      jRdbColones.setVisible(true);
      jRdbDolares.setVisible(false);
     }else{
      JOptionPane.showMessageDialog(rootPane, "Debe seleccionar articulos", "Información", JOptionPane.INFORMATION_MESSAGE);
      TipoPrecioGrupoBotones.clearSelection();
     }  
    }//GEN-LAST:event_jRdbDolaresActionPerformed

    public void llenarComboAutoHibridos() throws Exception{
     try {
       for(Auto autoHibrido : Auto.listadoAutos()){
        if(autoHibrido instanceof Hibrido){
         jCboAutos.addItem(autoHibrido);
        }
      }
     } catch (Exception ex) {
         Logger.getLogger(FrmPerzonalizar.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    public void llenarComboAutoFosiles() throws Exception{
     try {
       for(Auto autoFosil : Auto.listadoAutos()){
        if(autoFosil instanceof Fosil){
         jCboAutos.addItem(autoFosil);
        }
      }
     } catch (Exception ex) {
         Logger.getLogger(FrmPerzonalizar.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    public void llenarComboAutoElectricos() throws Exception{
     try {
       for(Auto autoElectrico : Auto.listadoAutos()){
        if(autoElectrico instanceof Electrico){
         jCboAutos.addItem(autoElectrico);
        }
      }
     } catch (Exception ex) {
         Logger.getLogger(FrmPerzonalizar.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    public void llenarComboPartes() throws Exception{
     try {
       for(Parte parte : Parte.listadoParte()){
        jCboPartes.addItem(parte);
      }
     } catch (Exception ex) {
         Logger.getLogger(FrmPerzonalizar.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
     
    public void vaciarCombo(){
     jCboAutos.removeAllItems();
    }
    
    public void Limpiar(){
     vaciarCombo();
     jTxaMostrarAuto.setText("");
     jTxaMostrarPartes.setText("");
     jTxtCostoAuto.setText("");
     jTxtCostoPartes.setText("");
     jTxtSubtotal.setText(""); 
     TipoAutoGrupoBotones.clearSelection();
     jCboPartes.setSelectedItem(null);
    }
         
  public static void main(String args[]) {
       
   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPerzonalizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TipoAutoGrupoBotones;
    private javax.swing.ButtonGroup TipoPrecioGrupoBotones;
    private javax.swing.JButton jBtnElimarAuto;
    private javax.swing.JButton jBtnElimarParte;
    private javax.swing.JButton jBtnFormalizar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnSeleccionarAuto;
    private javax.swing.JButton jBtnSeleccionarParte;
    private javax.swing.JComboBox<Auto> jCboAutos;
    private javax.swing.JComboBox<Parte> jCboPartes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLblCostoAuto;
    private javax.swing.JLabel jLblCostoPartes;
    private javax.swing.JLabel jLblElimarAuto;
    private javax.swing.JLabel jLblFormalizar;
    private javax.swing.JButton jLblSalir;
    private javax.swing.JLabel jLblSubtotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRbdElectrico;
    private javax.swing.JRadioButton jRbdFosil;
    private javax.swing.JRadioButton jRbdHíbrido;
    public static javax.swing.JRadioButton jRdbColones;
    public static javax.swing.JRadioButton jRdbDolares;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTxaMostrarAuto;
    private javax.swing.JTextArea jTxaMostrarPartes;
    public static javax.swing.JTextField jTxtCostoAuto;
    private javax.swing.JTextField jTxtCostoPartes;
    private javax.swing.JTextField jTxtSubtotal;
    // End of variables declaration//GEN-END:variables
}
