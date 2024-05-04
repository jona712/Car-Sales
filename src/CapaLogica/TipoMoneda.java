
package CapaLogica;

public enum TipoMoneda {
 COLONES(630){public String toString(){
  return "Colones";
 }},
 DOLARES(630){public String toString(){
  return "Dólares";
 }};
 
 private double cambio;

    private TipoMoneda(double cambio) {
        this.cambio = cambio;
    }

    public double getCambio() {
        return cambio;
    }
 
 
}
