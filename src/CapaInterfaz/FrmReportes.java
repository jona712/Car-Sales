
package CapaInterfaz;

import CapaLogica.Auto;
import CapaLogica.Cliente;
import CapaLogica.Electrico;
import CapaLogica.Factura;
import CapaLogica.Fosil;
import CapaLogica.Hibrido;
import CapaLogica.Parte;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmReportes extends javax.swing.JFrame {

 public FrmReportes() {
  initComponents();
  setSize(950, 600);

 }
   
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SeleccionReportesgGrupoBotones = new javax.swing.ButtonGroup();
        TipoAutoGrupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jRdbClientes = new javax.swing.JRadioButton();
        jRdbAutos = new javax.swing.JRadioButton();
        jRdbPartes = new javax.swing.JRadioButton();
        jRdbFacturas = new javax.swing.JRadioButton();
        jPnlTipoAuto = new javax.swing.JPanel();
        jRdbFosil = new javax.swing.JRadioButton();
        jRdbHibrido = new javax.swing.JRadioButton();
        jRdbElectrico = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaImprimirReportes = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jBtnSalir = new javax.swing.JButton();
        jLblSalir = new javax.swing.JLabel();
        jBtnLimpiar = new javax.swing.JButton();
        jLblLimpiar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jBtnPDF = new javax.swing.JButton();
        jLblLimpiar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setToolTipText("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        SeleccionReportesgGrupoBotones.add(jRdbClientes);
        jRdbClientes.setText("Clientes");
        jRdbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbClientesActionPerformed(evt);
            }
        });

        SeleccionReportesgGrupoBotones.add(jRdbAutos);
        jRdbAutos.setText("Autos");
        jRdbAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbAutosActionPerformed(evt);
            }
        });

        SeleccionReportesgGrupoBotones.add(jRdbPartes);
        jRdbPartes.setText("Partes");
        jRdbPartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbPartesActionPerformed(evt);
            }
        });

        SeleccionReportesgGrupoBotones.add(jRdbFacturas);
        jRdbFacturas.setText("Facturas");
        jRdbFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbFacturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbAutos)
                    .addComponent(jRdbPartes)
                    .addComponent(jRdbClientes)
                    .addComponent(jRdbFacturas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRdbAutos)
                .addGap(18, 18, 18)
                .addComponent(jRdbPartes)
                .addGap(18, 18, 18)
                .addComponent(jRdbClientes)
                .addGap(18, 18, 18)
                .addComponent(jRdbFacturas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnlTipoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Auto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TipoAutoGrupoBotones.add(jRdbFosil);
        jRdbFosil.setText("Fósil");
        jRdbFosil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbFosilActionPerformed(evt);
            }
        });

        TipoAutoGrupoBotones.add(jRdbHibrido);
        jRdbHibrido.setText("Híbrido");
        jRdbHibrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbHibridoActionPerformed(evt);
            }
        });

        TipoAutoGrupoBotones.add(jRdbElectrico);
        jRdbElectrico.setText("Eléctrico");
        jRdbElectrico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbElectricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlTipoAutoLayout = new javax.swing.GroupLayout(jPnlTipoAuto);
        jPnlTipoAuto.setLayout(jPnlTipoAutoLayout);
        jPnlTipoAutoLayout.setHorizontalGroup(
            jPnlTipoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlTipoAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlTipoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdbFosil)
                    .addComponent(jRdbHibrido)
                    .addComponent(jRdbElectrico))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPnlTipoAutoLayout.setVerticalGroup(
            jPnlTipoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlTipoAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRdbFosil)
                .addGap(18, 18, 18)
                .addComponent(jRdbHibrido)
                .addGap(18, 18, 18)
                .addComponent(jRdbElectrico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTxaImprimirReportes.setColumns(20);
        jTxaImprimirReportes.setRows(5);
        jScrollPane1.setViewportView(jTxaImprimirReportes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPnlTipoAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPnlTipoAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Salir.png"))); // NOI18N
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jLblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblSalir.setText("Salir");

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/LimpiarIcon.png"))); // NOI18N
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jLblLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblLimpiar.setText("Limpiar");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jBtnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/PDF.png"))); // NOI18N
        jBtnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPDFActionPerformed(evt);
            }
        });

        jLblLimpiar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblLimpiar1.setText("PDF");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jBtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblSalir)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLblLimpiar)
                                .addComponent(jLblLimpiar1))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
     SeleccionReportesgGrupoBotones.clearSelection();
     jTxaImprimirReportes.setText("");
     jBtnLimpiar.setEnabled(false);
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     hablitarReporteUsuario();
     jPnlTipoAuto.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jRdbAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbAutosActionPerformed
     jPnlTipoAuto.setVisible(true);
     jTxaImprimirReportes.setText("");
     jTxaImprimirReportes.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de autos ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n"+
             reporteAutos());
     jBtnLimpiar.setEnabled(true);
    }//GEN-LAST:event_jRdbAutosActionPerformed

    private void jRdbFosilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbFosilActionPerformed
     String hilera = "";
     try {
      for(Auto fosil : Auto.listadoAutos()) {
       if(fosil instanceof Fosil){
        hilera += fosil.consultaAuto() +"\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de Fósil ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
       }      
      }
      
      jTxaImprimirReportes.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de Fósil ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n"+
      hilera);
     } catch (Exception ex) {
         Logger.getLogger(FrmReportes.class.getName()).log(Level.SEVERE, null, ex);
     }
     SeleccionReportesgGrupoBotones.clearSelection();
     jPnlTipoAuto.setVisible(false);
     TipoAutoGrupoBotones.clearSelection();
    }//GEN-LAST:event_jRdbFosilActionPerformed

    private void jRdbHibridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbHibridoActionPerformed
      String hilera = "";
     try {
      for(Auto hibrido : Auto.listadoAutos()) {
       if(hibrido instanceof Hibrido){
        hilera += hibrido.consultaAuto() + "\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de Híbrido ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
       }      
      }
      
      jTxaImprimirReportes.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de Híbrido ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n"+
      hilera);
     } catch (Exception ex) {
         Logger.getLogger(FrmReportes.class.getName()).log(Level.SEVERE, null, ex);
     }
      SeleccionReportesgGrupoBotones.clearSelection();
      jPnlTipoAuto.setVisible(false);
      TipoAutoGrupoBotones.clearSelection();
    }//GEN-LAST:event_jRdbHibridoActionPerformed

    private void jRdbElectricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbElectricoActionPerformed
      String hilera = "";
     try {
      for(Auto electrico : Auto.listadoAutos()) {
       if(electrico instanceof Electrico){
        hilera += electrico.consultaAuto()+"\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de Eléctrico ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
       }      
      }
      
      jTxaImprimirReportes.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de Eléctrico ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n"+
      hilera);
     } catch (Exception ex) {
         Logger.getLogger(FrmReportes.class.getName()).log(Level.SEVERE, null, ex);
     }
      SeleccionReportesgGrupoBotones.clearSelection();
      jPnlTipoAuto.setVisible(false);
      TipoAutoGrupoBotones.clearSelection();
    }//GEN-LAST:event_jRdbElectricoActionPerformed

    private void jRdbPartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbPartesActionPerformed
     jPnlTipoAuto.setVisible(false);
     jTxaImprimirReportes.setText("");
     jTxaImprimirReportes.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de partes ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n"+
               reportePartes());
       jBtnLimpiar.setEnabled(true);
    }//GEN-LAST:event_jRdbPartesActionPerformed

    private void jRdbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbClientesActionPerformed
     jPnlTipoAuto.setVisible(false);
     jTxaImprimirReportes.setText("");
     jTxaImprimirReportes.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de clientes ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n"+
              reporteClientes());
     
     jBtnLimpiar.setEnabled(true);
    }//GEN-LAST:event_jRdbClientesActionPerformed

    private void jRdbFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbFacturasActionPerformed
     jPnlTipoAuto.setVisible(false);
     jTxaImprimirReportes.setText("");
     jTxaImprimirReportes.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de facturas]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n"+
              reporteFacturas());
      jBtnLimpiar.setEnabled(true);
    }//GEN-LAST:event_jRdbFacturasActionPerformed

    private void jBtnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPDFActionPerformed
     JOptionPane.showMessageDialog(rootPane, "Reporte generado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
     
    }//GEN-LAST:event_jBtnPDFActionPerformed

    public String reporteClientes(){
     String reporte = "";
     try {
         for(Cliente clientes : Cliente.listadoClientes()) {
             reporte+=clientes.toString()+ "\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de clientes ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
         }
     } catch (Exception ex) {
         Logger.getLogger(FrmReportes.class.getName()).log(Level.SEVERE, null, ex);
     }
     return reporte;
    }
    
    public String reporteAutos(){
     String reporte = "";
     try {
         for(Auto autos : Auto.listadoAutos()) {
             reporte+=autos.consultaAuto() + "\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de autos ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
         }
     } catch (Exception ex) {
         Logger.getLogger(FrmReportes.class.getName()).log(Level.SEVERE, null, ex);
     }
     return reporte;
    }
    
     public String reportePartes(){
     String reporte = "";
     try {
         for(Parte partes : Parte.listadoParte()) {
             reporte+=partes.paraFactura() + "\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de partes ]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
         }
     } catch (Exception ex) {
         Logger.getLogger(FrmReportes.class.getName()).log(Level.SEVERE, null, ex);
     }
     return reporte;
    }
     
     public String reporteFacturas(){
     String reporte = "";
       try {
         for(Factura factura : Factura.listadoFacturas()) {
             reporte+=factura.toString()+ "\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ Reporte de facturas]<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
         }
     } catch (Exception ex) {
         Logger.getLogger(FrmReportes.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     return reporte;
    }
     
    public static void hablitarReporteUsuario(){
     if(!FrmLogin.jTxtCorreo.getText().equals("admin")){
      jRdbClientes.setVisible(false);
      jRdbFacturas.setVisible(false);
     }
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
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup SeleccionReportesgGrupoBotones;
    private javax.swing.ButtonGroup TipoAutoGrupoBotones;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnPDF;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLblLimpiar;
    private javax.swing.JLabel jLblLimpiar1;
    private javax.swing.JLabel jLblSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPnlTipoAuto;
    private javax.swing.JRadioButton jRdbAutos;
    public static javax.swing.JRadioButton jRdbClientes;
    private javax.swing.JRadioButton jRdbElectrico;
    public static javax.swing.JRadioButton jRdbFacturas;
    private javax.swing.JRadioButton jRdbFosil;
    private javax.swing.JRadioButton jRdbHibrido;
    private javax.swing.JRadioButton jRdbPartes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTxaImprimirReportes;
    // End of variables declaration//GEN-END:variables
}
