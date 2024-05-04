
package CapaLogica;

import CapaDatos.ClienteBD;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable{
 protected Usuario usuario;
 protected String tipoCedula;

 public Cliente(Usuario usuario, String tipoCedula) {
  this.usuario = usuario;
  this.tipoCedula = tipoCedula;
 }
 
 public double calculoDescuento(){
  return 0;
 }

 public Usuario getUsuario() {
  return usuario;
 }

 public void setUsuario(Usuario usuario) {
  this.usuario = usuario;
 }

    public String getTipoCedula() {
        return tipoCedula;
    }

    public void setTipoCedula(String tipoCedula) {
        this.tipoCedula = tipoCedula;
    }
 
 public String toString(){
  return 
         "\nCédula: " + tipoCedula + 
          usuario.toString();
 }
 
 public String paraFacura(){
  return 
         "\nCédula: " + tipoCedula + 
          usuario.paraFacutura();
 }
 
    public static Cliente consultarCliente(String correoUsuario) throws Exception {
        Cliente cliente = ClienteBD.getInstance().consultarCliente(correoUsuario);
        return cliente;
    }
    public static void agregarCliente(Cliente cliente) throws Exception{
        ClienteBD.getInstance().agregarCliente(cliente);
    }
    public static void eliminarCliente(String correoUsuario)throws Exception{
      ClienteBD.getInstance().eliminarCliente(correoUsuario);
    }
    public static void modificarCliente(Cliente cliente)throws Exception{
        ClienteBD.getInstance().modificarCliente(cliente);
    }
    public static ArrayList<Cliente> listadoClientes()throws Exception {
       ArrayList<Cliente> arrayClientes = ClienteBD.getInstance().listaClientes();
       return arrayClientes;
    }
}


