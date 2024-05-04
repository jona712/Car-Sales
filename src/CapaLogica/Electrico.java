
package CapaLogica;

public class Electrico extends Auto{

 public Electrico(String codigoAuto, int modelo, double precio) {
  super(codigoAuto, modelo, precio);
 }
 
 @Override
 public double calculaDescuento() {
  return 0;
 }
 
 public String consultaAuto(){
  return super.consultaAuto()+
         "\nTipo: Eléctrico";
 }
 
 public String toString(){
 return super.toString() + "/ Eléctrico";
 }
}

