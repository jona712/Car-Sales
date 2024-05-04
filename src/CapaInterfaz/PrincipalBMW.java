
package CapaInterfaz;

import static CapaInterfaz.FrmMenuPrincipal.desahablitarMenus;
import javax.swing.JOptionPane;

public class PrincipalBMW {

 public static void main(String[] args) {
  FrmMenuPrincipal frmMenuPrincipal = new FrmMenuPrincipal(); 
  frmMenuPrincipal.setVisible(true);
  frmMenuPrincipal.ocultarMenus();
 } 
}
