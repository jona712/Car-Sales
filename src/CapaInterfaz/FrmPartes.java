
package CapaInterfaz;

import static CapaInterfaz.FrmAuto.auto;
import CapaLogica.Auto;
import CapaLogica.Estado;
import CapaLogica.Parte;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPartes extends javax.swing.JFrame {

 DefaultTableModel modeloTabla = new DefaultTableModel(); 
 static Parte parte;
 
 public FrmPartes() {
  initComponents();
  setSize(950, 600);
  modeloTabla = (DefaultTableModel)jTblPartes.getModel();
 }
 
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnSalir = new javax.swing.JButton();
        jLblSalir = new javax.swing.JLabel();
        jBtnAgregarParte = new javax.swing.JButton();
        jBtnModificarParte = new javax.swing.JButton();
        jBtnConsultarParte = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLblAgregar = new javax.swing.JLabel();
        jLblModificar = new javax.swing.JLabel();
        jLblEliminar = new javax.swing.JLabel();
        jLblConsultar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jBtnEliminarParte = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLblNumeroParte = new javax.swing.JLabel();
        jBtnVerificar = new javax.swing.JButton();
        jLblVerificar = new javax.swing.JLabel();
        jTxtNumeroParte = new javax.swing.JTextField();
        jLblTipo = new javax.swing.JLabel();
        jTxtTipo = new javax.swing.JTextField();
        jTxtModelo = new javax.swing.JTextField();
        jLblModelo = new javax.swing.JLabel();
        jTxtPrecio = new javax.swing.JTextField();
        jLblPrecio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblPartes = new javax.swing.JTable();
        jCboEstado = new javax.swing.JComboBox();
        jLblEstado = new javax.swing.JLabel();
        jBtnLimpiarCampos = new javax.swing.JLabel();
        jBtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión De Partes");
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

        jLblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblSalir.setText("Salir");

        jBtnAgregarParte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/AgregarIcon.png"))); // NOI18N
        jBtnAgregarParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarParteActionPerformed(evt);
            }
        });

        jBtnModificarParte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/ModificarIcon.png"))); // NOI18N
        jBtnModificarParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarParteActionPerformed(evt);
            }
        });

        jBtnConsultarParte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/ConsultarIcon.png"))); // NOI18N
        jBtnConsultarParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarParteActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblAgregar.setText("Agregar");

        jLblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblModificar.setText("Modificar ");

        jLblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblEliminar.setText("Eliminar");

        jLblConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblConsultar.setText("Consultar");

        jBtnEliminarParte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/EliminarConMenos.png"))); // NOI18N
        jBtnEliminarParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarParteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnAgregarParte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnModificarParte, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnConsultarParte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnEliminarParte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnAgregarParte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jBtnConsultarParte, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(jBtnModificarParte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBtnEliminarParte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblModificar)
                            .addComponent(jLblAgregar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLblEliminar)
                                .addComponent(jLblConsultar))
                            .addComponent(jLblSalir)))
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addComponent(jSeparator1)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLblNumeroParte.setText("NO. De parte:");

        jBtnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Verificar.png"))); // NOI18N
        jBtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarActionPerformed(evt);
            }
        });

        jLblVerificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblVerificar.setText("Verificar");

        jLblTipo.setText("Tipo:");

        jLblModelo.setText("Modelo:");

        jLblPrecio.setText("Precio:");

        jTblPartes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número parte", "Tipo", "Modelo", "Precio", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblPartes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblPartesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblPartes);

        jLblEstado.setText("Estado:");

        jBtnLimpiarCampos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBtnLimpiarCampos.setText("Limpiar");

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/LimpiarIcon.png"))); // NOI18N
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblTipo)
                    .addComponent(jLblNumeroParte)
                    .addComponent(jLblModelo)
                    .addComponent(jLblPrecio)
                    .addComponent(jLblEstado))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtPrecio)
                    .addComponent(jCboEstado, 0, 235, Short.MAX_VALUE)
                    .addComponent(jTxtTipo)
                    .addComponent(jTxtModelo)
                    .addComponent(jTxtNumeroParte, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNumeroParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblNumeroParte))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblTipo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblModelo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblPrecio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblEstado)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jBtnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblVerificar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLimpiarCampos)))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     llenaTablaPartes();
     desactivarBotones();
     jCboEstado.addItem(Estado.NUEVO);
     jCboEstado.addItem(Estado.USADO);
     jCboEstado.setSelectedItem(null);
    }//GEN-LAST:event_formWindowOpened

    private void jBtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerificarActionPerformed
     if(!jTxtNumeroParte.getText().isEmpty() && !jTxtTipo.getText().isEmpty() && !jTxtModelo.getText().isEmpty() && !jTxtPrecio.getText().isEmpty()){   
      if(jCboEstado.getSelectedItem() != null){
       activarBotones();
      }else{
       JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el Estado.", "Información",JOptionPane.INFORMATION_MESSAGE);
      }
     }else{
      JOptionPane.showMessageDialog(rootPane, "Los campos NO pueden quedar vacíos.\n"
                                            + "             Verfique los datos.", "Información", JOptionPane.INFORMATION_MESSAGE);
     }
    }//GEN-LAST:event_jBtnVerificarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
     dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnAgregarParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarParteActionPerformed
     
     String numParte = jTxtNumeroParte.getText();
     String tipo = jTxtTipo.getText();
     int modelo = Integer.parseInt(jTxtModelo.getText());
     double precio = Double.parseDouble(jTxtPrecio.getText());
     Estado estado = (Estado)jCboEstado.getSelectedItem();
       
     parte = new Parte(numParte, tipo, modelo, precio, estado);
     
      if(parte!= null){ //Revisa si el JDialog construyó el nuevo Departamento
       try{
        Parte.agregarParte(parte);
         JOptionPane.showMessageDialog(rootPane, "Parte agregada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
          limpiar();
          
       }catch(Exception e) {
        JOptionPane.showMessageDialog(this, "Error al guardar la PARTE\n"+
                 "el programa se cerrará consulte con el administrador\n"+
                  e.toString()); 
          
        System.exit(0);
       }
        llenaTablaPartes();
        jBtnAgregarParte.setEnabled(false);
      } 
    }//GEN-LAST:event_jBtnAgregarParteActionPerformed

    private void jBtnEliminarParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarParteActionPerformed
      if(jTblPartes.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la parte a ELIMINAR");
            return;          
        }
        
        String numParte =jTblPartes.getValueAt(jTblPartes.getSelectedRow(),0).toString();
        
        try {
            Parte.eliminarParte(numParte);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Error al eliminar la parte\n"+
                         "el programa se cerrará consulte con el administrador\n"+
                         e.toString()); System.exit(0);
        }        
        llenaTablaPartes(); //actualiza la tabla con el nuevo departamento  
    }//GEN-LAST:event_jBtnEliminarParteActionPerformed

    private void jBtnModificarParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarParteActionPerformed
     if(jTblPartes.getSelectedRow()>= 0){
      if(jCboEstado.getSelectedItem() != null){
      String numParte = jTblPartes.getValueAt(jTblPartes.getSelectedRow(),0).toString();
      String tipo = jTxtTipo.getText();
      int modelo = Integer.parseInt(jTxtModelo.getText());
      double precio = Double.parseDouble(jTxtPrecio.getText());
      Estado estado = (Estado)jCboEstado.getSelectedItem();
      parte = new Parte(numParte, tipo, modelo, precio, estado);       
       if(this.parte!= null){
            //Modifica el departamento del archivo
        try{
         Parte.modificarParte(parte);
         limpiar();
        }catch (Exception e) {
         JOptionPane.showMessageDialog(this, "Error al modificar el departamento\n"+
                         "el programa se cerrará consulte con el administrador\n"+
                         e.toString());
         System.exit(0);
        }
         llenaTablaPartes(); //actualiza la tabla con el nuevo departamento
       }
        jTblPartes.clearSelection();//Quita la selección de la fila en la tabla 
      }else{
       JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el estado.", "Información", JOptionPane.INFORMATION_MESSAGE);
       jCboEstado.requestFocus();
      }
     }
     else{
      JOptionPane.showMessageDialog(rootPane, "Debe seleccionar la parte a MODIFICAR.", "Información", JOptionPane.INFORMATION_MESSAGE);
      return;
     }
    }//GEN-LAST:event_jBtnModificarParteActionPerformed

    private void jBtnConsultarParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarParteActionPerformed
      if(jTblPartes.getSelectedRow()>= 0){
      String numParte = jTblPartes.getValueAt(jTblPartes.getSelectedRow(),0).toString(); 
       try {
        parte = Parte.consultarParte(numParte);
        JOptionPane.showMessageDialog(rootPane, parte.paraFactura());
       } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al buscar la PARTE.");
       }
         
     }else{
      JOptionPane.showMessageDialog(null,"Debe seleccionar la parte a CONSULTAR.");
       return;
     }
      jTblPartes.clearSelection();
    }//GEN-LAST:event_jBtnConsultarParteActionPerformed

    private void jTblPartesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblPartesMouseClicked
     jBtnConsultarParte.setEnabled(true);
      jBtnEliminarParte.setEnabled(true);
      
      if(evt.getClickCount()==2){
       jBtnModificarParte.setEnabled(true);
       
       if(jTblPartes.getSelectedRow()>= 0){
           
        String numParte = jTblPartes.getValueAt(jTblPartes.getSelectedRow(),0).toString();
        String tipo = jTblPartes.getValueAt(jTblPartes.getSelectedRow(),1).toString();
        int modelo = Integer.parseInt(jTblPartes.getValueAt(jTblPartes.getSelectedRow(),2).toString());
        double precio = Double.parseDouble(jTblPartes.getValueAt(jTblPartes.getSelectedRow(),3).toString());
        
        jTxtNumeroParte.setText(numParte);
        jTxtTipo.setText(tipo);
        jTxtModelo.setText(String.valueOf(modelo));
        jTxtPrecio.setText(String.valueOf(precio));
        jCboEstado.setSelectedItem(null);
       }  
      }
    }//GEN-LAST:event_jTblPartesMouseClicked

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
     limpiar();
     jBtnAgregarParte.setEnabled(false);
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    public void desactivarBotones(){
     jBtnAgregarParte.setEnabled(false);
     jBtnModificarParte.setEnabled(false);
     jBtnEliminarParte.setEnabled(false);
     jBtnConsultarParte.setEnabled(false);
     jBtnLimpiar.setEnabled(false);
    }
    
    public void activarBotones(){
     jBtnAgregarParte.setEnabled(true);
     jBtnModificarParte.setEnabled(true);
     jBtnEliminarParte.setEnabled(true);
     jBtnConsultarParte.setEnabled(true);
     jBtnLimpiar.setEnabled(true);
    }
    
    public void limpiar(){
     jTxtNumeroParte.setText("");
     jTxtTipo.setText("");
     jTxtModelo.setText("");
     jTxtPrecio.setText("");
     jCboEstado.setSelectedItem(null);
    }
    
    public static Parte getParteMantenimiento() {
     return parte;
    }
    
    public static void setParteMantenimiento(Parte parte) {
     FrmPartes.parte = parte;
    }
    
     private void llenaTablaPartes() {
        try {
            //Llama al método que llena la lista con los Departamentos del ArrayList
            //Llena la tabla con los Departamentos que se grabaron en el ArrayList
            modeloTabla.setRowCount(0);//Limpia la tabla
            Object[] datos = new Object[5];
           //Obtiene el arrayList con la lista de los departamentos que están en el archivo
            ArrayList<Parte> lista= Parte.listadoParte();
            //llenar la tabla a partir del ArrayList que viene del archivo
            for (int i = 0; i < lista.size(); i++) {
                datos[0]  = lista.get(i).getNumeroParte();
                datos[1]  = lista.get(i).getTipo();
                datos[2]  = lista.get(i).getModelo();
                datos[3]  = lista.get(i).getPrecio();
                datos[4]  = lista.get(i).getEstado();
                
                modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al listar la PARTE.\n"+
                         "el programa se cerrará consulte con el administrador\n"+
                         e.toString());
        }
    }
    
    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPartes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregarParte;
    private javax.swing.JButton jBtnConsultarParte;
    private javax.swing.JButton jBtnEliminarParte;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JLabel jBtnLimpiarCampos;
    private javax.swing.JButton jBtnModificarParte;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jBtnVerificar;
    private javax.swing.JComboBox jCboEstado;
    private javax.swing.JLabel jLblAgregar;
    private javax.swing.JLabel jLblConsultar;
    private javax.swing.JLabel jLblEliminar;
    private javax.swing.JLabel jLblEstado;
    private javax.swing.JLabel jLblModelo;
    private javax.swing.JLabel jLblModificar;
    private javax.swing.JLabel jLblNumeroParte;
    private javax.swing.JLabel jLblPrecio;
    private javax.swing.JLabel jLblSalir;
    private javax.swing.JLabel jLblTipo;
    private javax.swing.JLabel jLblVerificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTblPartes;
    private javax.swing.JTextField jTxtModelo;
    private javax.swing.JTextField jTxtNumeroParte;
    private javax.swing.JTextField jTxtPrecio;
    private javax.swing.JTextField jTxtTipo;
    // End of variables declaration//GEN-END:variables
}
