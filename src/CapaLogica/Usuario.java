
package CapaLogica;

import java.io.Serializable;
import java.util.ArrayList;
import CapaDatos.UsuarioBD;

 public class Usuario implements Serializable{
 protected String correo;
 protected String clave;
 protected String nombre;
 protected Pais paisOrigen;
 protected String direccion;
 protected String telefono;
 protected TipoUsuario tipoUsuario;

 public Usuario(String correo, String clave, String nombre, Pais paisOrigen, String direccion, String telefono, TipoUsuario tipoUsuario) {
  this.correo = correo;
  this.clave = clave;
  this.nombre = nombre;
  this.paisOrigen = paisOrigen;
  this.direccion = direccion;
  this.telefono = telefono;
  this.tipoUsuario = tipoUsuario;
 }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(Pais paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public String toString(){
     return
            "\nNombre: " + nombre +
            "\nTélefono: " + telefono +
            "\nDirección: " + direccion +
            "\nCorreo: " + correo +
            "\nClave: " + clave +
            "\nPaís origen: " + paisOrigen +
            "\nUsuario: " + tipoUsuario;
    }
    
    
    public String paraFacutura(){
     return
            "\nNombre: " + nombre +
            "\nTélefono: " + telefono +
            "\nDirección: " + direccion +
            "\nCorreo: " + correo +
            "\nPaís origen: " + paisOrigen +
            "\nUsuario: " + tipoUsuario;
    }
    
    public static Usuario consultarDepartamento(String codigo) throws Exception {
        Usuario usuario1 = UsuarioBD.getInstance().consultarUsuario(codigo);
        return usuario1;
    }
    public static void agregarUsuario(Usuario usuario) throws Exception{
        UsuarioBD.getInstance().agregarUsuario(usuario);
    }
    public static void eliminarDepartamento(String codigo)throws Exception{
      UsuarioBD.getInstance().eliminarUsuario(codigo);
    }
    public static void modificarDepartamento(Usuario usuario)throws Exception{
        UsuarioBD.getInstance().modificarUsuario(usuario);
    }
    public static ArrayList<Usuario> listadoUsuarios()throws Exception {
       ArrayList<Usuario> arrayUsuarios = UsuarioBD.getInstance().listaUsuarios();
       return arrayUsuarios;
    }
}
