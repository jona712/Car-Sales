
package CapaInterfaz;

import CapaLogica.Auto;
import CapaLogica.Electrico;
import CapaLogica.Fosil;
import CapaLogica.Hibrido;
import CapaLogica.Usuario;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmAuto extends javax.swing.JFrame {

  DefaultTableModel modeloTabla = new DefaultTableModel(); 
  static Auto auto = null;
    
 public FrmAuto() {
  initComponents();
  setSize(950, 600);
  modeloTabla = (DefaultTableModel)jTblAutos.getModel();

 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoAutoGrupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jBtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnAgregarAuto = new javax.swing.JButton();
        jBtnModificarAuto = new javax.swing.JButton();
        jBtnConsultarAuto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jBtnEliminarAuto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLblCodigo = new javax.swing.JLabel();
        jLblModelo = new javax.swing.JLabel();
        jLblPrecio = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jTxtModelo = new javax.swing.JTextField();
        jTxtPrecio = new javax.swing.JTextField();
        jBtnVerificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblAutos = new javax.swing.JTable();
        jPlnTipoAuto = new javax.swing.JPanel();
        jRbdElectrico = new javax.swing.JRadioButton();
        jRbdFosil = new javax.swing.JRadioButton();
        jRbdHibrido = new javax.swing.JRadioButton();
        jBtnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión De Autos");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Salir.png"))); // NOI18N
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Salir");

        jBtnAgregarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/AgregarIcon.png"))); // NOI18N
        jBtnAgregarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarAutoActionPerformed(evt);
            }
        });

        jBtnModificarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/ModificarIcon.png"))); // NOI18N
        jBtnModificarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarAutoActionPerformed(evt);
            }
        });

        jBtnConsultarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/ConsultarIcon.png"))); // NOI18N
        jBtnConsultarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarAutoActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Modificar ");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Consultar");

        jBtnEliminarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/EliminarConMenos.png"))); // NOI18N
        jBtnEliminarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarAutoActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnAgregarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnModificarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnConsultarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEliminarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnAgregarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtnConsultarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jBtnModificarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jBtnEliminarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addContainerGap()))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
            .addComponent(jSeparator1)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información vehículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLblCodigo.setText("Código:");

        jLblModelo.setText("Modelo:");

        jLblPrecio.setText("Precio:");

        jBtnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Verificar.png"))); // NOI18N
        jBtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Verificar");

        jTblAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo", "Precio", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblAutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblAutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblAutos);

        jPlnTipoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de auto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TipoAutoGrupoBotones.add(jRbdElectrico);
        jRbdElectrico.setText("Eléctrico");

        TipoAutoGrupoBotones.add(jRbdFosil);
        jRbdFosil.setText("Fósil");

        TipoAutoGrupoBotones.add(jRbdHibrido);
        jRbdHibrido.setText("Híbrido");

        javax.swing.GroupLayout jPlnTipoAutoLayout = new javax.swing.GroupLayout(jPlnTipoAuto);
        jPlnTipoAuto.setLayout(jPlnTipoAutoLayout);
        jPlnTipoAutoLayout.setHorizontalGroup(
            jPlnTipoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlnTipoAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRbdElectrico)
                .addGap(49, 49, 49)
                .addComponent(jRbdFosil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jRbdHibrido)
                .addContainerGap())
        );
        jPlnTipoAutoLayout.setVerticalGroup(
            jPlnTipoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlnTipoAutoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPlnTipoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRbdFosil)
                    .addComponent(jRbdElectrico)
                    .addComponent(jRbdHibrido))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/LimpiarIcon.png"))); // NOI18N
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Limpiar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLblModelo)
                                .addComponent(jLblCodigo))
                            .addComponent(jLblPrecio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTxtPrecio)
                            .addComponent(jTxtCodigo)))
                    .addComponent(jPlnTipoAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(320, 320, 320))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblModelo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblPrecio))
                        .addGap(18, 18, 18)
                        .addComponent(jPlnTipoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
     llenaTablaAutos();
     desactivarBotones();
    }//GEN-LAST:event_formWindowOpened

    private void jBtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerificarActionPerformed
     if(!jTxtCodigo.getText().isEmpty() && !jTxtModelo.getText().isEmpty() && !jTxtPrecio.getText().isEmpty()){   
      if(TipoAutoGrupoBotones.getSelection() != null){
       activarBotones();
       jBtnLimpiar.setEnabled(true);
      }else{
       JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el tipo de Auto.", "Información",JOptionPane.INFORMATION_MESSAGE);
      }
     }else{
      JOptionPane.showMessageDialog(rootPane, "Los campos NO pueden quedar vacíos\n"
                                            + "             Verfique los datos.", "Información", JOptionPane.INFORMATION_MESSAGE);
     }
     
    }//GEN-LAST:event_jBtnVerificarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
     dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnAgregarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarAutoActionPerformed
     String codigo = jTxtCodigo.getText();
     int modelo = Integer.parseInt(jTxtModelo.getText());
     double precio = Double.parseDouble(jTxtPrecio.getText());
     
      if(jRbdElectrico.isSelected()){
       auto = new Electrico(codigo, modelo, precio);
      }
      
      if(jRbdFosil.isSelected()){
       auto = new Fosil(codigo, modelo, precio);
      }
     
      if(jRbdHibrido.isSelected()){
       auto = new Hibrido(codigo, modelo, precio);
      }
     
       if(auto!= null){ //Revisa si el JDialog construyó el nuevo Departamento
        try{
         Auto.agregarAuto(auto);
          JOptionPane.showMessageDialog(rootPane, "Auto agredo correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
           limpiar();
        }catch (Exception e){
          JOptionPane.showMessageDialog(this, "Error al guardar el Auto\n"+
                         "el programa se cerrará consulte con el administrador\n"+
                         e.toString()); 
          System.exit(0);
        }
             //actualiza la tabla de manera que se vea el nuevo departamento
         llenaTablaAutos();
        jBtnAgregarAuto.setEnabled(false);
       }               
    }//GEN-LAST:event_jBtnAgregarAutoActionPerformed

    private void jBtnModificarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarAutoActionPerformed
     if(jTblAutos.getSelectedRow()>= 0){
         
      String codigoAuto = jTblAutos.getValueAt(jTblAutos.getSelectedRow(),0).toString();
      int modelo = Integer.parseInt(jTxtModelo.getText());
      double precio = Double.parseDouble(jTxtPrecio.getText());
      
      if(jRbdElectrico.isSelected()){
       auto = new Electrico(codigoAuto, modelo, precio);
      }
      
      if(jRbdFosil.isSelected()){
       auto = new Fosil(codigoAuto, modelo, precio);
      }
     
      if(jRbdHibrido.isSelected()){
       auto = new Hibrido(codigoAuto, modelo, precio);
      }
             
        //Cuando regresa del JDialog debe traer el departamento con los atributos modificados
       if(auto!= null){
            //Modifica el departamento del archivo
        try {
         Auto.modificarAuto(auto);
          limpiar();
           jTxtCodigo.setEnabled(true);
        } catch (Exception e) {
                         JOptionPane.showMessageDialog(this, "Error al modificar el Auto\n"+
                         "el programa se cerrará consulte con el administrador\n"+
                         e.toString());
        System.exit(0);
            }
            llenaTablaAutos(); //actualiza la tabla con el nuevo departamento
        }
        jTblAutos.clearSelection();//Quita la selección de la fila en la tabla 
      }
      else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar el departamento a MODIFICAR.");
            return;
        }
    }//GEN-LAST:event_jBtnModificarAutoActionPerformed

    private void jBtnConsultarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarAutoActionPerformed
     if(jTblAutos.getSelectedRow()>= 0){
      String codigo = jTblAutos.getValueAt(jTblAutos.getSelectedRow(),0).toString(); 
       try {
        auto = Auto.consultarAuto(codigo);
        JOptionPane.showMessageDialog(rootPane, auto.consultaAuto());
       } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al buscar el Auto");
       }      
     }else{
      JOptionPane.showMessageDialog(null,"Debe seleccionar el departamento a CONSULTAR");
       return;
     }
      jTblAutos.clearSelection();
    }//GEN-LAST:event_jBtnConsultarAutoActionPerformed

    private void jBtnEliminarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarAutoActionPerformed
      if(jTblAutos.getSelectedRow()==-1){
       JOptionPane.showMessageDialog(null,"Debe seleccionar el auto a ELIMINAR");
       return;          
      }       
       String codigo =jTblAutos.getValueAt(jTblAutos.getSelectedRow(),0).toString();
        try {
         Auto.eliminarAuto(codigo);
        }catch(Exception e) {
         JOptionPane.showMessageDialog(this, "Error al eliminar el Auto\n"+
                         "el programa se cerrará consulte con el administrador\n"+
                         e.toString()); System.exit(0);
        }        
         llenaTablaAutos();
    }//GEN-LAST:event_jBtnEliminarAutoActionPerformed

    private void jTblAutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblAutosMouseClicked
     jBtnConsultarAuto.setEnabled(true);
      jBtnEliminarAuto.setEnabled(true);
      
      if(evt.getClickCount()==2){
       jBtnModificarAuto.setEnabled(true);
       
        String codigo = jTblAutos.getValueAt(jTblAutos.getSelectedRow(),0).toString();
        int modelo = Integer.parseInt(jTblAutos.getValueAt(jTblAutos.getSelectedRow(),1).toString());
        double precio = Double.parseDouble(jTblAutos.getValueAt(jTblAutos.getSelectedRow(),2).toString());
        jTblAutos.getValueAt(jTblAutos.getSelectedRow(),3).toString();
        
        jTxtCodigo.setText(codigo);
        jTxtModelo.setText(String.valueOf(modelo));
        jTxtPrecio.setText(String.valueOf(precio));
        
         if(jTblAutos.getValueAt(jTblAutos.getSelectedRow(),3).toString().equals("Híbrido")){
          jRbdHibrido.setSelected(true);
         }else{
             
          if(jTblAutos.getValueAt(jTblAutos.getSelectedRow(),3).toString().equals("Fósil")){
           jRbdFosil.setSelected(true);
          }else{
                     
           if(jTblAutos.getValueAt(jTblAutos.getSelectedRow(),3).toString().equals("Eléctrico")){
            jRbdElectrico.setSelected(true);
           }
          }
         } 
        
        jTxtCodigo.setEnabled(false);
         
      }

    }//GEN-LAST:event_jTblAutosMouseClicked

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
     limpiar();
     jBtnAgregarAuto.setEnabled(false);
     jBtnLimpiar.setEnabled(false);
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    public void desactivarBotones(){
     jBtnAgregarAuto.setEnabled(false);
     jBtnModificarAuto.setEnabled(false);
     jBtnEliminarAuto.setEnabled(false);
     jBtnConsultarAuto.setEnabled(false);
     jBtnLimpiar.setEnabled(false);
    }
    
    public void activarBotones(){
     jBtnAgregarAuto.setEnabled(true);
     jBtnModificarAuto.setEnabled(true);
     jBtnEliminarAuto.setEnabled(true);
     jBtnConsultarAuto.setEnabled(true);
    }
    
    public void limpiar(){
     jTxtCodigo.setText("");
     jTxtModelo.setText("");
     jTxtPrecio.setText("");
     TipoAutoGrupoBotones.clearSelection();
    }
    
     private void llenaTablaAutos() {
        try {
            //Llama al método que llena la lista con los Departamentos del ArrayList
            //Llena la tabla con los Departamentos que se grabaron en el ArrayList
            modeloTabla.setRowCount(0);//Limpia la tabla
            Object[] datos = new Object[4];
           //Obtiene el arrayList con la lista de los departamentos que están en el archivo
            ArrayList<Auto> lista= Auto.listadoAutos();
            //llenar la tabla a partir del ArrayList que viene del archivo
            for (int i = 0; i < lista.size(); i++) {
                datos[0]  = lista.get(i).getCodigoAuto();
                datos[1]  = lista.get(i).getModelo();
                datos[2]  = lista.get(i).getPrecio();
                if(lista.get(i).getClass().getName().equals("CapaLogica.Hibrido")){
                 datos[3]  = "Híbrido";
                }else{
                    
                 if(lista.get(i).getClass().getName().equals("CapaLogica.Fosil")){
                  datos[3] = "Fósil";
                 }else{
                     
                  if(lista.get(i).getClass().getName().equals("CapaLogica.Electrico")){
                   datos [3]  = "Eléctrico";
                  }
                 }
                } 
                modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al listar el departamento\n"+
                         "el programa se cerrará consulte con el administrador\n"+
                         e.toString());
        }
    }
     
    public static void setAutoMantenimiento(Auto auto1) {
     auto = auto1;
    }
     
       
 public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAuto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TipoAutoGrupoBotones;
    private javax.swing.JButton jBtnAgregarAuto;
    private javax.swing.JButton jBtnConsultarAuto;
    private javax.swing.JButton jBtnEliminarAuto;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnModificarAuto;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jBtnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblModelo;
    private javax.swing.JLabel jLblPrecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPlnTipoAuto;
    private javax.swing.JRadioButton jRbdElectrico;
    private javax.swing.JRadioButton jRbdFosil;
    private javax.swing.JRadioButton jRbdHibrido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTblAutos;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtModelo;
    private javax.swing.JTextField jTxtPrecio;
    // End of variables declaration//GEN-END:variables
}
