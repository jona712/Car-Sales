
package CapaLogica;

public class Fosil extends Auto{

 public Fosil(String codigoAuto, int modelo, double precio) {
  super(codigoAuto, modelo, precio);
 }

 @Override
 public double calculaDescuento() {
  return 0;
 }
 
 public String consultaAuto(){
  return super.consultaAuto()+
         "\nTipo: Fósil";
 }
 
 public String toString(){
  return super.toString() + " / Fósil";
 }
}


