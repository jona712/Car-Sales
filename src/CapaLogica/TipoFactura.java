
package CapaLogica;

public enum TipoFactura {
 CONTADO(0.05){public String toString(){
 return "Contado";
 }},
 
 CREDITO(0){public String toString(){
 return "Crédito";
 }},;
 
 private double descuento;

  private TipoFactura(double descuento) {
   this.descuento = descuento;
  }

  public double getDescuento() {
   return descuento;
  }
 }
