
package CapaLogica;

import java.io.Serializable;

public enum TipoUsuario implements Serializable{
 ADMINISTRADOR{public String toString(){
  return "Admistrador";
 }},
 USUARIO_REGULAR{public String toString(){
  return "Regular";
 }};
}
