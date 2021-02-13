
package tallerrecursividad1_mo;
import java.util.Scanner;

public class TallerRecursividad1_MO_punto2 {
public static boolean existe;
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n, m,pos;
        
        System.out.println("Ingrese el tamaño correspondiente al vector: ");
        n = leer.nextInt();
        
        System.out.println("\n-----VECTOR GENERADO-----");
        int[] vector = new int [n];
        for(int i=0; i<vector.length;i++){
            vector[i]=(int)((Math.random()*25+1));
            System.out.print(vector[i]+" ");
        }
        
        System.out.println("\n\nIngrese el dato a buscar");
        m=leer.nextInt();
        
        pos=funcion_Recursiva_HallarValor(vector, 0, m);
        
        if(pos==-1){
            System.out.println("El valor no se encuentra entre los datos del vector");
        }
        if(pos!=-1){
            System.out.println("El valor se encuentra entre los datos del vector en la posición "+pos);
        }
        
        
    }
    
    public static int funcion_Recursiva_HallarValor(int[] vector, int indice, int m){
        
        if (indice==vector.length)
        {
            return -1;
        }else if(vector[indice]==m){
            return indice+1;   
        }else{
             return funcion_Recursiva_HallarValor(vector, indice+1, m);
            } 
        }   
        }
    

