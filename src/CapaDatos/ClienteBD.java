
package CapaDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import CapaLogica.Cliente;
import CapaLogica.Cliente;


public class ClienteBD {
    private final String RUTA_ARCHIVO = System.getProperty("user.dir")+ "\\src\\CapaArchivo\\Cliente.txt";
    private FileOutputStream archivoSalida;
    private ObjectOutputStream oEscritor;
    private FileInputStream archivoEntrada;
    private ObjectInputStream oLector;
    private ArrayList<Cliente> arrayClientesTemp;
    //Instancia privada de la misma clase
    //implementa el patrón Singleton
    private static ClienteBD instance = null;

    //Constructor privado, se implementa el patrón Singleton
    private ClienteBD() {
       
    }

    //Método público que retorna una única instancia de la 
    //clase, únicamnete se construye la primera vez.
    public static ClienteBD getInstance() {
        if (instance == null) {
            instance = new ClienteBD();
        }
        return instance;
    }

    //OJO: este tipo de comentario genera la ayuda del método
    /**
     * Abre el archivo de datos, para escritura (de tipo output)
     * Tipo de Archivo: Secuencial. Lanza la Exception al
     * nivel donde fue llamado
     * @param 
     * @return no retorna
     */
    public void abrirArchivoOutput() throws Exception { //para grabar en él
        //Abrir el archivo y colocarse al final del archivo
        try {
            File oArchivo = new File(RUTA_ARCHIVO);
            if (!oArchivo.exists()) { //Si el archivo no existe
                //Abrir el archivo de Acceso Secuencial para  escritura
                //La primera vez incluye la cabecera del archivo
                //true indica que se agregarán registros al final            
                archivoSalida = new FileOutputStream(RUTA_ARCHIVO, true);
                oEscritor = new ObjectOutputStream(archivoSalida); //escribe los encabezados la primera vez que graba
            } 
            else { //Si el archivo ya existe en disco
                //Abrir el archivo de Acceso Secuencial para  escritura
                //La primera vez incluye la cabecera del archivo
                archivoSalida = new FileOutputStream(RUTA_ARCHIVO, true);
                oEscritor = new MiObjectOutputStream(archivoSalida);
            }
        } catch (Exception e) {
            throw e; //Se lanza al método que invocó al método en que estoy
        }
    }

    /**
     * Abre  el archivo de datos, para lectura (de tipo input) El
     * apuntador del archivo se coloca al inicio del archivo 
     * Tipo de Archivo: Secuencial.
     * @param 
     * @return void
     */
    public void abrirArchivoInput() throws Exception { //para leer del archivo
        //Abrir el archivo y colocarse al inicio del mismo
        try {
            archivoEntrada = new FileInputStream(RUTA_ARCHIVO);
            oLector = new ObjectInputStream(archivoEntrada);
        } catch (Exception e) {
            throw e;
        }
    }

   
    public void cerrarArchivoOutput() throws Exception {
        try {
            if (oEscritor != null) {
                oEscritor.close();
                oEscritor = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
     /**
     * Permite cerrar el archivo de datos que se abrió para lectura
     */
    private void cerrarArchivoInput() throws Exception {
        try {
            if (oLector != null) {
                oLector.close();
                oLector = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Lista de todos los Departamentos que se encuentran en el archivo
     * @return ArrayList
     */
     public ArrayList<Cliente> listaClientes() throws Exception{
        ArrayList listaDeptos= new ArrayList();
        //Ya que habrá bloque finally se debe encerrar el bloque try
        //el throws del encabezado lanza la excepción del finally      
      try {         
            abrirArchivoInput(); //Se coloca al inicio del archivo
             //Si no hay más datos que leer el ciclo infinito se suspende y se va al catch
            while(true){
                Cliente cliente1 = 
                           (Cliente)oLector.readObject();                
                listaDeptos.add(cliente1);
            }
         } //No se indica el catch ya que no se hará nada, solamente se lanzará por medio del throws  
        catch(Exception ex ){
            
       }
        finally{
           //Ocurra o no ocurra la excepción se cierra el archivo
           cerrarArchivoInput();   
           return listaDeptos;
        } 
       
    }

   //Busca y retorna el objeto Departamento de acuerdo al código que recibe como 
   //parámetro, en caso de que no lo encuentre retorna null
    public Cliente consultarCliente(String cedula)throws Exception {
        Cliente cliente,clienteBuscado= null ;
        try {
            abrirArchivoInput();
            //Si no hay más datos que leer el método available retorna cero
             while(true){
                cliente = (Cliente)oLector.readObject();  //Lee un objeto a la vez             
                if(cliente.getTipoCedula().equalsIgnoreCase(cedula)) {
                    clienteBuscado = cliente;
                }
             }            
        }catch(Exception e){
            
        }
        finally{ //Suceda o no suceda la excepción se deben cerrar los archivos
             cerrarArchivoInput();    
             return clienteBuscado;
        }       
    }


    /**
     * Agregar un nuevo Departamento al final del archivo
     * @param departamento Objeto Departamento a agregar
     * @return void
     */
    public  void agregarCliente(Cliente cliente)throws Exception {        
        try {
            this.abrirArchivoOutput(); //se coloca al final del archivo
            if (oEscritor != null) {
              //Ejecutar la escritura del objeto departamento en el archivo
               oEscritor.writeObject(cliente); //Serializa el objeto y lo graba en el archivo
               oEscritor.flush();  //Envía el contenido del buffer al archivo
               oEscritor.reset();//Se requiere para cuando se reciben subclases de Departamento, es obligatorio si hay herencia
            }
        
        } catch (Exception e) {
            throw e;
        }
        finally{
            //Ocurra o no la excepción se debe cerrar el archivo
            this.cerrarArchivoOutput(); //Cierra el archivo
        }        
    }

    /**
     * Agregar un nuevo Departamento al archivo
     * @param departamento Objeto Departamento a agregar
     * @return void
     */
      public void modificarCliente(Cliente cliente) throws Exception{
        arrayClientesTemp = new ArrayList<Cliente>();
        try {            
            abrirArchivoInput();            
             //Pasar todos los objetos del archivo al ArrayList temporal modificando el 
            //objeto que se recibe como parámetro de acuerdo al código
             Cliente cliente1=null;
            //Si no hay más datos que leer el método available retorna cero
             while(true){//Si va a leer y no hay objeto Departamento se va por el catch
                 cliente1 = (Cliente)oLector.readObject(); //Si lee y no hay deparyamento que leer se cae
                 if(cliente1.getTipoCedula().equalsIgnoreCase(cliente.getTipoCedula())) {
                   cliente1=cliente;
                 }
                 arrayClientesTemp.add(cliente1);
             }  
        }
        catch(Exception ex){
            
        }
        finally{
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo();        
        }
        
    }
    
    
    
    public void eliminarCliente(String cedula) throws Exception {
        arrayClientesTemp = new ArrayList<Cliente>();
        try {            
            abrirArchivoInput();
            Cliente cliente1 = null;
            //Pasa al ArrayList temporal todos los departamentos cuyo código es 
            //diferente al del departamento que se recibe como parámetro
            while(true){
                 cliente1 = (Cliente)oLector.readObject();               
                 if(!cliente1.getTipoCedula().equalsIgnoreCase(cedula)) {
                     arrayClientesTemp.add(cliente1);
                 }
             }                       
        }catch(Exception e){      
           
        }
        finally{
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo(); 
        }               
    }
    

    private void pasarArrayTemporal_Archivo() throws Exception {       
       File archivoOriginal = new File(RUTA_ARCHIVO);
       //Si hay departamentos en el ArrayList y el archivo existe
       //borra el archivo original para volverlo a llenar           
       
          if(archivoOriginal.exists()){
            archivoOriginal.delete();
          }  
          if(!arrayClientesTemp.isEmpty()){
             abrirArchivoOutput();  //Crea el nuevo archivo Departamento.txt
          //Pasa todos los departamentos del ArrayList al archivo
            for (Cliente cliente : arrayClientesTemp) {
             oEscritor.writeObject(cliente);   
             oEscritor.flush(); //Lo envía a disco
             oEscritor.reset(); //limpia el escritor para que se puedan grabar diferentes subclases
            }     
          }
          cerrarArchivoOutput();
    }  
  
}
