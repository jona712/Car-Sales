
package CapaLogica;

import CapaDatos.ParteBD;
import java.io.Serializable;
import java.util.ArrayList;

public class Parte implements Serializable{
 private String numeroParte;
 private String tipo;
 private int modelo;
 private double precio;
 private Estado estado;

 public Parte(String numeroParte, String tipo, int modelo, double precio, Estado estado) {
     this.numeroParte = numeroParte;
     this.tipo = tipo;
     this.modelo = modelo;
     this.precio = precio;
     this.estado = estado;
 }
  
 public String infoParte(){
  return "\nNo. Parte: " + numeroParte +
         "\nTipo: " + tipo +
         "\nModelo: " + modelo +
         "\nPrecio: $" + precio +
         "\nEstado: " + estado +
         "\n=================================";           
 }
 
 public String paraFactura(){
  return "\nNo. Parte: " + numeroParte +
         "\nTipo: " + tipo +
         "\nModelo: " + modelo +
         "\nPrecio: $" + precio +
         "\nEstado: " + estado +
         "\n";
            
 }
 
 public String toString(){
  return "\n"+numeroParte +" / " + tipo + " / " + modelo + " / $" + precio + " / " + estado;
 }

    public String getNumeroParte() {
        return numeroParte;
    }

    public void setNumeroParte(String numeroParte) {
        this.numeroParte = numeroParte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public static Parte consultarParte(String numParte) throws Exception {
     Parte parte = ParteBD.getInstance().consultarParte(numParte);
     return parte;
    }
    public static void agregarParte(Parte parte) throws Exception{
        ParteBD.getInstance().agregarParte(parte);
    }
    public static void eliminarParte(String numParte)throws Exception{
      ParteBD.getInstance().eliminarParte(numParte);
    }
    public static void modificarParte(Parte parte)throws Exception{
        ParteBD.getInstance().modificarParte(parte);
    }
    public static ArrayList<Parte> listadoParte()throws Exception {
       ArrayList<Parte> arrayPartes = ParteBD.getInstance().listaPartes();
       return arrayPartes;
    }
    
   
}
