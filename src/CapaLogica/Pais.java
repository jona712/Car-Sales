
package CapaLogica;

import CapaDatos.PaisBD;
import java.io.Serializable;
import java.util.ArrayList;

public class Pais implements Serializable{
 private String codigo;
 private String Nombre;

 public Pais(String codigo, String Nombre) {
  this.codigo = codigo;
  this.Nombre = Nombre;
 }
 
 public String toString(){
  return codigo + " " + Nombre;
 }

    public static void agregarPais(Pais pais) throws Exception{
        PaisBD.getInstance().agregarPais(pais);
    }
    
    public static ArrayList<Pais> listadoPaises()throws Exception {
       ArrayList<Pais> arrayClientes = PaisBD.getInstance().listaPaises();
       return arrayClientes;
    }
}
