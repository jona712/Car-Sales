
package CapaLogica;

import CapaDatos.AutoBD;
import java.io.Serializable;
import java.util.ArrayList;

public class Auto implements Serializable{
 protected String codigoAuto;
 protected int modelo;
 protected double precio;
 protected ArrayList<Parte> arrayPartes;

 public Auto(String codigoAuto, int modelo, double precio) {
  this.codigoAuto = codigoAuto;
  this.modelo = modelo;
  this.precio = precio;
  this.arrayPartes = new ArrayList<>();
 }
 
 public void agregarParte(Parte parte){
  arrayPartes.add(parte);
 }
 
 public double totalPartes(){
  double total = 0;
   for(Parte parte : arrayPartes) {
    total += parte.getPrecio();
  }
  return total;
 }
 
 public int cantidadPartes(){
  int cantPartes = 0;
   for(int i = 0; i < arrayPartes.size(); i++) {
    cantPartes++;      
  }    
  return cantPartes;
 }
 
 public double restaMontoAuto(){
  return precio - precio;
 }
 
 public double calculaDescuento(){
  return 0;
 };
 
 public String MostrarPartes(){
  String hilera = "";
                  for(Parte parte : arrayPartes){
                  hilera += parte.paraFactura();
                  }
  return hilera;
 }
 
 public String infoAuto(){
  return
         "\nCódigo: " + codigoAuto +
         "\nModelo: " + modelo +
         "\nPrecio: $" + precio+
         "\n===================================";
 }
 
 public String consultaAuto(){
  return "\nCódigo: " + codigoAuto +
         "\nModelo: " + modelo + 
         "\nPrecio: $" + precio;
 }
 
 public String paraFactura(){
  String hilera =
                  "\nCódigo: " + codigoAuto +
                  "\nModelo: " + modelo +
                  "\nPrecio: $" + precio +
                  "\n------------------------------------[ PARTES ]------------------------------------";
                  for(Parte parte : arrayPartes){
                  hilera += parte.paraFactura();
                  }
  return hilera;
 }
 
 public String toString(){
  return codigoAuto + " / " + modelo + " / $" + precio;
 }
 
    public String getCodigoAuto() {
        return codigoAuto;
    }

    public void setCodigoAuto(String codigoAuto) {
        this.codigoAuto = codigoAuto;
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

    public ArrayList<Parte> getArrayPartes() {
        return arrayPartes;
    }

    public void setArrayPartes(ArrayList<Parte> arrayPartes) {
        this.arrayPartes = arrayPartes;
    }
 
    public static Auto consultarAuto(String codigo) throws Exception {
        Auto auto = AutoBD.getInstance().consultarAuto(codigo);
        return auto;
    }
    public static void agregarAuto(Auto auto) throws Exception{
        AutoBD.getInstance().agregarAuto(auto);
    }
    public static void eliminarAuto(String codigoAuto)throws Exception{
      AutoBD.getInstance().eliminarAuto(codigoAuto);
    }
    public static void modificarAuto(Auto auto)throws Exception{
        AutoBD.getInstance().modificarAuto(auto);
    }
    public static ArrayList<Auto> listadoAutos()throws Exception {
       ArrayList<Auto> arrayAutos = AutoBD.getInstance().listaAutos();
       return arrayAutos;
    }
}


