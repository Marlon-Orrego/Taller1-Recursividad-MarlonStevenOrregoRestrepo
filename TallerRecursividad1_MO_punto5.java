
package tallerrecursividad1_mo;

import java.util.Scanner;


public class TallerRecursividad1_MO_punto5 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto;
        System.out.println("Ingrese a continuación la palabra a examinar: ");
        texto=leer.next();
        
        if(funcion_RecursivaPalindromo(texto)==true){
            System.out.println("La palabra es palindroma");
        }else{
            System.out.println("La palabra no es palindroma");
        }
        }
        
    public static boolean funcion_RecursivaPalindromo(String texto){
          
      if(texto.length()<=1){
          return true;
      }
      else{
      if (texto.charAt(0)==texto.charAt(texto.length()-1)){
            return funcion_RecursivaPalindromo(texto.substring(1,texto.length()-1));
      }
      else{
          return false;
      }
      }
        }
   
}
