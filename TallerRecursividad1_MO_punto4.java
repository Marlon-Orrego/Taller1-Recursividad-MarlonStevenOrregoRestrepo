
package tallerrecursividad1_mo;

import java.util.Scanner;


public class TallerRecursividad1_MO_punto4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, m;
        System.out.println("Ingrese la base ");
        n = leer.nextInt();
        System.out.println("Ingrese el exponente ");
        m = leer.nextInt();
        System.out.println("El resultado de " + n + " ^ " + m + " es: " + (funcion_PotenciaRecursiva(n, m)));
        
    }
    
    public static int funcion_PotenciaRecursiva(int n, int m){
   
            if (m == 0)
            {
                return 1;
            }
            else
            {
                return (n*funcion_PotenciaRecursiva(n, m - 1));
            }
        }}
    

