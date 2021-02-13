
package tallerrecursividad1_mo;

import java.util.Scanner;


public class TallerRecursividad1_MO_punto1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, m;
        System.out.println("Ingrese el tamaño correspondiente al vector: ");
        n = leer.nextInt();
        int[] vector = new int [n];
        for(int i=0; i<vector.length;i++){
            vector[i]=(int)((Math.random()*25+1));
            System.out.println(vector[i]);
        }
        
        System.out.println("El número menor del arreglo creado es: "+funcion_Recursiva_Llenar_Vector(vector, 0,vector[0]));
        
    }
    
    public static int funcion_Recursiva_Llenar_Vector(int []vector, int indice, int min){
          
            if (indice!=vector.length)
            {
                if(vector[indice]<min){
                  min=funcion_Recursiva_Llenar_Vector(vector, indice+1, vector[indice]);
                }else{
                  min=funcion_Recursiva_Llenar_Vector(vector, indice+1, min);
                }
            }
            return min;
            }
            
            
        }
    

