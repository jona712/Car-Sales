
package CapaLogica;

public class Personal extends Cliente{
 
 public Personal(Usuario usuario, String tipoCedula) {
  super(usuario, tipoCedula);
 }

  @Override
  public double calculoDescuento() {
   return 0;
  }
  
  public String toString(){
   return "\nTipo cliente: Personal"+
   super.toString();
  }
 }

