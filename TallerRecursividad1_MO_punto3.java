 
package tallerrecursividad1_mo;
import java.util.Scanner;

public class TallerRecursividad1_MO_punto3 {
public static boolean existe;
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int n;
        System.out.print("Ingrese la cantidad de números de la secuencia Triponacci que quiere ver: ");
        n=leer.nextInt();
    for(int i=0;i<n;i++){
        System.out.print(funcion_Recursiva_GenerarSecuenciaTriponacci(i)+" ");
    
    }
        
        
    }
    
    public static int funcion_Recursiva_GenerarSecuenciaTriponacci(int n){
        
          if(n==0)return 0;
          if(n==1)return 1;
          if(n==2)return 2;
          
          return funcion_Recursiva_GenerarSecuenciaTriponacci(n-1)+funcion_Recursiva_GenerarSecuenciaTriponacci(n-2)+funcion_Recursiva_GenerarSecuenciaTriponacci(n-3);
         
    }
        }
    

