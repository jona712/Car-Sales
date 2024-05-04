
package CapaLogica;

import CapaDatos.FacturaBD;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import CapaLogica.Coorporativo;
import java.text.DecimalFormat;

public class Factura implements Serializable{
 protected static int contFactura = 1;
 protected int numFactura;
 protected Cliente cliente;
 protected Date fecha;
 protected ArrayList<Auto> arrayAutos;
 protected TipoFactura tipoFactura;
 protected TipoMoneda tipoMoneda;
 protected SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
 protected DecimalFormat formatoNumero = new DecimalFormat("#,##0.00");
 protected final double DESCUENTO1 = 0.10, DESCUENTO2=0.20, DESCUENTO3=0.25, DESCUENTO4= 0.15;
 protected final double DESCUETOTIPOELECTRICO=0.05, DESCUENTOTIPOHIBRIDO = 0.03;
 protected final double IVA = 0.13;
// $
// ₡
 
 public Factura(TipoFactura tipoFactura, Cliente cliente, TipoMoneda tipoMoneda) {
  this.numFactura = contFactura++;
  this.cliente = cliente;
  this.fecha = new Date();
  this.arrayAutos = new ArrayList<>();
  this.tipoFactura = tipoFactura;
  this.tipoMoneda = tipoMoneda;
 }
 
 //Agrega el auto con las partes ya incluidas
 public void agregarAuto(Auto auto){
  arrayAutos.add(auto);
 }
 
 public double totalAutos(){
  double total = 0;
   for(Auto auto : arrayAutos) {
    total += auto.getPrecio();
  }
  return total;
 }
 
 public double totalPartes(){
  double total = 0;
   for(Auto auto : arrayAutos){
    total += auto.totalPartes();
   }
  return total;
 }
 
 public int cantidadPartes(){
  int cantidad = 0;
   for(Auto auto : arrayAutos){
    cantidad += auto.cantidadPartes();
   }
  return cantidad;
 }
 
 public double descuentoPorCantidadPartes(){
  double descuento = 0;
  double diferencia = 0;
   switch(cantidadPartes()){
      case 0:
      case 1:
      case 2: 
              descuento = 0;
      break;
      
      case 3:
      case 4:
      case 5: 
              descuento = totalPartes()*DESCUENTO1;
      break;
      
      case 6:
      case 7:
      case 8:
      case 9:
      case 10: descuento = totalPartes()*DESCUENTO2;
               
      break;
      
      default: if(cliente instanceof Coorporativo){
                descuento = totalPartes()*DESCUENTO3;
               }else{
                if(cliente instanceof Personal){
                 descuento = totalPartes()*DESCUENTO4;
                }     
               }     
   }
  return descuento;
 }
 
 public double subtotal(){
  return totalAutos() + totalPartes();
 }
 
 public double descuentoTipoAuto(){
  double descuento = 0;
   for(Auto auto : arrayAutos){
    if(auto instanceof Electrico){
     descuento = subtotal()*DESCUETOTIPOELECTRICO;
    }else{
     if(auto instanceof Hibrido){
       descuento = subtotal()*DESCUENTOTIPOHIBRIDO;
     }
    }      
   }
   return descuento;
 }
 
 public double sinTipoFactura(){
  return (totalAutos()+totalPartes())-descuentoPorCantidadPartes()-descuentoTipoAuto();
 }
 
 public double descuentoTipoFactura(){
  double descuento = 0;
   if(tipoFactura== TipoFactura.CONTADO){
    descuento = sinTipoFactura() * tipoFactura.getDescuento();
   }
  return descuento;
 }
 
 public double total(){
  return (totalAutos()+totalPartes())-descuentoPorCantidadPartes()-descuentoTipoAuto()-descuentoTipoFactura();
 }
 
 public double IVA(){
  return total() * IVA;
 }
 

 public double totalDolares(){
  double dolares = 0;
  return dolares = ((total() * tipoMoneda.getCambio())/tipoMoneda.getCambio())+IVA(); 
 }
 
 public double totalColones(){
  double colones = 0;
  return colones = (totalDolares() * tipoMoneda.getCambio())+IVA();
 }
 
 public String toString(){
  String hilera = "\n--------------------------------[ BMW AGENCY ]--------------------------------" +
                  "\n                                      Número de Factura: #" + numFactura +
                  "\n                                        Fecha: " + formatoFecha.format(fecha) +
                  "\nTipo de factura: " + tipoFactura +
                  "\nInformación del cliente: " + cliente.paraFacura();
                  for (Auto auto : arrayAutos) {
                   hilera+= "\n-------------------------------------[ AUTOS ]-------------------------------------"+
                   auto.paraFactura();
                  }
                  hilera += "\n-------------------------------------[ TOTAL ]-------------------------------------"+
                  "\nTipo de factura: " + tipoFactura +
                  "\nTipo de moneda: " + tipoMoneda +
                  "\nCantidad partes: " + cantidadPartes() +
                  "\nTotal costo de autos: $" + formatoNumero.format(totalAutos()) +
                  "\nTotal costo de partes: $" + formatoNumero.format(totalPartes()) +   
                  "\nDescuento por cantidad de partes: $" + formatoNumero.format(descuentoPorCantidadPartes()) +
                  "\nDescuento por tipo de auto: $" + formatoNumero.format(descuentoTipoAuto())+
                  "\nDescuento por tipo de factura: $" + descuentoTipoFactura()+
                  "\nIVA: $" + formatoNumero.format(IVA()) +
                  "\nMonto total en dólares: $" + formatoNumero.format(totalDolares()) +
                  "\nMonto total en colones: ₡" + formatoNumero.format(totalColones()) +
                  "\n\n-----------------[ Gracias por usar nuestros servicios ]------------------";
   return hilera;
 }

 public static int getContFactura() {
  return contFactura;
 }

 public static void setContFactura(int contFactura) {
  Factura.contFactura = contFactura;
 }

 public int getNumFactura() {
  return numFactura;
 }

 public void setNumFactura(int numFactura) {
  this.numFactura = numFactura;
 }

 public Cliente getCliente() {
  return cliente;
 }

 public void setCliente(Cliente cliente) {
  this.cliente = cliente;
 }

 public Date getFecha() {
  return fecha;
 }

 public void setFecha(Date fecha) {
  this.fecha = fecha;
 }

 public ArrayList<Auto> getArrayAutos() {
  return arrayAutos;
 }

 public void setArrayAutos(ArrayList<Auto> arrayAutos) {
  this.arrayAutos = arrayAutos;
 }

 public TipoFactura getTipoFactura() {
  return tipoFactura;
 }

 public void setTipoFactura(TipoFactura tipoFactura) {
  this.tipoFactura = tipoFactura;
 }
    
 public static Factura consultarFactura(int numFactura) throws Exception {
  Factura factura = FacturaBD.getInstance().consultarFactura(numFactura);
  return factura;
 }
    
 public static void agregarFactura(Factura factura) throws Exception{
  FacturaBD.getInstance().agregarFactura(factura);
 }
    
 public static void eliminarFactura(int numFactura)throws Exception{
  FacturaBD.getInstance().eliminarFactura(numFactura);
 }
 
 public static void modificarFactura(Factura factura)throws Exception{
  FacturaBD.getInstance().modificarFactura(factura);
 }
    
 public static ArrayList<Factura> listadoFacturas()throws Exception {
  ArrayList<Factura> arrayFacturas = FacturaBD.getInstance().listaFacturas();
  return arrayFacturas;
 }
}
