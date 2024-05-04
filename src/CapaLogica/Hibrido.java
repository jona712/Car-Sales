
package CapaLogica;

public class Hibrido extends Auto{

 public Hibrido(String codigoAuto, int modelo, double precio) {
  super(codigoAuto, modelo, precio);
 }

 @Override
 public double calculaDescuento() {
  return 0;
 }
 
 public String consultaAuto(){
  return super.consultaAuto()+
         "\nTipo: Híbrido";
 }
 
 public String toString(){
 return super.toString() + "/ Híbrido";
 }
}
