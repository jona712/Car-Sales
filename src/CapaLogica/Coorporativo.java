
package CapaLogica;

public class Coorporativo extends Cliente{

 public Coorporativo(Usuario usuario, String tipoCedula) {
  super(usuario, tipoCedula);
 }
 
  @Override
  public double calculoDescuento() {
   return 0;
  }
  
  public String toString(){
   return "\nTipo cliente: Coorporativo"+
   super.toString();
  }
 }
   

