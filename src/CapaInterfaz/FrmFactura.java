
package CapaInterfaz;

import static CapaInterfaz.FrmAuto.auto;
import static CapaInterfaz.FrmPartes.parte;
import CapaLogica.Cliente;
import CapaLogica.Factura;
import CapaInterfaz.FrmPerzonalizar;
import CapaLogica.Auto;
import CapaLogica.Parte;
import CapaLogica.TipoFactura;
import CapaLogica.TipoMoneda;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmFactura extends javax.swing.JFrame {
    
 private DefaultListModel modeloListaCliente = new DefaultListModel();
 static DefaultListModel modeloListaAutos = new DefaultListModel(); 
 static Factura factura;
 static Cliente cliente = null;
 DecimalFormat formatoNumero = new DecimalFormat("#.00");
 
 public FrmFactura() {
  initComponents();
  setSize(950, 600);

 }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoFacturaGrupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLblSalir = new javax.swing.JLabel();
        jBtnSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLblCrearFactura = new javax.swing.JLabel();
        jBtnLimpiar = new javax.swing.JButton();
        jLblLimpiar = new javax.swing.JLabel();
        jBtnCrearFactura = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRbdContado = new javax.swing.JRadioButton();
        jRbdCredito = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaImprimirFactura = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jTxtCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnBuscarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLtsCliente = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLtsListaAutos = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jCboTipoMoneda = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTxtColones = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtDolares = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de facturación");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblSalir.setText("Salir");

        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/Salir.png"))); // NOI18N
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLblCrearFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblCrearFactura.setText("Crear factura");

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/LimpiarIcon.png"))); // NOI18N
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jLblLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblLimpiar.setText("Limpiar");

        jBtnCrearFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaImagenes/ImprimirIcon.png"))); // NOI18N
        jBtnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCrearFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCrearFactura)
                            .addComponent(jLblLimpiar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblSalir)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Facturar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TipoFacturaGrupoBotones.add(jRbdContado);
        jRbdContado.setText("Contado");

        TipoFacturaGrupoBotones.add(jRbdCredito);
        jRbdCredito.setText("Crédito");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRbdCredito)
                    .addComponent(jRbdContado))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRbdContado)
                .addGap(18, 18, 18)
                .addComponent(jRbdCredito)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTxaImprimirFactura.setEditable(false);
        jTxaImprimirFactura.setColumns(20);
        jTxaImprimirFactura.setRows(5);
        jScrollPane1.setViewportView(jTxaImprimirFactura);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cédula");

        jBtnBuscarCliente.setText("Buscar");
        jBtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarClienteActionPerformed(evt);
            }
        });

        jLtsCliente.setModel(modeloListaCliente);
        jScrollPane2.setViewportView(jLtsCliente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnBuscarCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Autos agregados"));

        jLtsListaAutos.setModel(modeloListaAutos);
        jScrollPane3.setViewportView(jLtsListaAutos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo moneda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCboTipoMoneda, 0, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jCboTipoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setText("Colones:");

        jTxtColones.setEditable(false);

        jLabel3.setText("Dólares:");

        jTxtDolares.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtDolares, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jTxtColones))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtColones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
     dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

     jCboTipoMoneda.addItem(TipoMoneda.COLONES);
     jCboTipoMoneda.addItem(TipoMoneda.DOLARES);
     jBtnCrearFactura.setEnabled(false);
     jBtnLimpiar.setEnabled(false);
     jTxaImprimirFactura.setText("");
     jCboTipoMoneda.setSelectedItem(null);
    }//GEN-LAST:event_formWindowOpened

    private void jBtnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCrearFacturaActionPerformed
   
    cliente = (Cliente)modeloListaCliente.get(0);
    
    if(!modeloListaAutos.isEmpty()){
     if(TipoFacturaGrupoBotones.getSelection() != null){
      if(jCboTipoMoneda.getSelectedItem() != null){
         
       if(jRbdContado.isSelected()){
        TipoMoneda tipoMoneda = (TipoMoneda)jCboTipoMoneda.getSelectedItem();
         factura = new Factura(TipoFactura.CONTADO, cliente, tipoMoneda);     
          for(int i = 0; i<modeloListaAutos.getSize(); i++){
           factura.agregarAuto((Auto)modeloListaAutos.getElementAt(i));
          }
          
           jTxaImprimirFactura.setText(factura.toString());
           jTxtColones.setText(String.valueOf("₡"+formatoNumero.format(factura.totalColones())));
           jTxtDolares.setText(String.valueOf("$"+formatoNumero.format(factura.totalDolares())));
           modeloListaAutos.removeAllElements();
           jBtnLimpiar.setEnabled(true);
           
          }
   
        if(jRbdCredito.isSelected()){
         TipoMoneda tipoMoneda = (TipoMoneda)jCboTipoMoneda.getSelectedItem();
          factura = new Factura(TipoFactura.CREDITO, cliente, tipoMoneda);
           for(int i = 0; i<modeloListaAutos.getSize(); i++){
            factura.agregarAuto((Auto)modeloListaAutos.getElementAt(i));
           }
           
           jTxaImprimirFactura.setText(factura.toString());
           jTxtColones.setText(String.valueOf("₡"+formatoNumero.format(factura.totalColones())));
           jTxtDolares.setText(String.valueOf("$"+formatoNumero.format(factura.totalDolares())));
           modeloListaAutos.removeAllElements();
           jBtnLimpiar.setEnabled(true);
           
        }
        
         if(factura !=null){
           try {
               Factura.agregarFactura(factura);
               JOptionPane.showMessageDialog(rootPane, "Factura creada Correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
           } catch (Exception ex) {
               Logger.getLogger(FrmFactura.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
        
      }else{
        JOptionPane.showMessageDialog(rootPane, "Debe selecionar el tipo de moneda.", "Información", JOptionPane.INFORMATION_MESSAGE);
         jCboTipoMoneda.requestFocus();
      }  
     }else{
      JOptionPane.showMessageDialog(rootPane, "Debe selecionar el tipo de pago.", "Información", JOptionPane.INFORMATION_MESSAGE);
     }
    }else{
     JOptionPane.showMessageDialog(rootPane, "             No se han agregado AUTOS.\n"
             + "Verifique en el apartado de PERZONALIZACIÓN.", "Información", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jBtnCrearFacturaActionPerformed

    private void jBtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarClienteActionPerformed
     String cedula = jTxtCedula.getText();
      if(!jTxtCedula.getText().isEmpty()){
       try{
        cliente = Cliente.consultarCliente(cedula);
         if(cliente !=null){
          modeloListaCliente.addElement(cliente);
           jTxtCedula.setText("");
            jBtnCrearFactura.setEnabled(true);
             jBtnLimpiar.setEnabled(true);
        }else{
         JOptionPane.showMessageDialog(rootPane,"      Usuario no encontrado.\n"
               + "          Verifique los datos.", "Información", JOptionPane.ERROR_MESSAGE);
         jTxtCedula.requestFocus();
        }      
       }catch(Exception ex){
        ex.toString();
       }
       
      }else{
       JOptionPane.showMessageDialog(rootPane,"Debe ingresar la cédula.", "Información", JOptionPane.ERROR_MESSAGE); 
        jTxtCedula.requestFocus();
      }
    }//GEN-LAST:event_jBtnBuscarClienteActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
     TipoFacturaGrupoBotones.clearSelection();
     modeloListaAutos.removeAllElements();
     modeloListaCliente.removeAllElements();    
     jTxaImprimirFactura.setText("");
     jCboTipoMoneda.setSelectedItem(null);
     jTxtColones.setText("");
     jTxtDolares.setText("");
     jBtnCrearFactura.setEnabled(false);
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TipoFacturaGrupoBotones;
    private javax.swing.JButton jBtnBuscarCliente;
    private javax.swing.JButton jBtnCrearFactura;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JComboBox jCboTipoMoneda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblCrearFactura;
    private javax.swing.JLabel jLblLimpiar;
    private javax.swing.JLabel jLblSalir;
    private javax.swing.JList<String> jLtsCliente;
    public static javax.swing.JList<String> jLtsListaAutos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRbdContado;
    private javax.swing.JRadioButton jRbdCredito;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTxaImprimirFactura;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtColones;
    private javax.swing.JTextField jTxtDolares;
    // End of variables declaration//GEN-END:variables
}
