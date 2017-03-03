
package multiplicacion.optimizada;

import java.util.Scanner;

/**
 *
 * @author Anderson Suarez
 * @version 2.0 
 * @since 01/03/2017
 */
public class MultiplicacionOptimizada {
        public static void multiplicacionMatrices(){
                //Peticion de datos Para las dos matrices
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite numero de filas de la matriz 1:");
                byte filas1= sc.nextByte();
                System.out.print("Digite numero de columnas de la matriz 1:");
                byte columnas1= sc.nextByte();
                System.out.print("Digite numero de filas de la matriz 2:");
                byte filas2= sc.nextByte();
                System.out.print("Digite numero de columnas de la matriz 2:");
                byte columnas2= sc.nextByte();
                System.out.println();
                if(columnas1==filas2){
                    //creacion de matrices
                    byte [][] matriz1 = new byte [filas1][columnas1];
                    byte [][] matriz2 = new byte [filas2][columnas2];
                    llenadoMatrices(matriz1, matriz2);
                  
                }else
                System.out.println("El programa no puede multiplicar las matrices (Numero de filas1 debe ser igual a columnas2) ");      
        }
        public static void  llenadoMatrices(byte matriz1[][], byte matriz2[][]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Llenado de matriz 1");
            for(int i=0; i<matriz1.length; i++){
                for(int j=0; j<matriz1[i].length; j++ ){
                    System.out.print("Digite el valor para la posicion"+ i+ j +": " );
                    matriz1[i][j] = sc.nextByte();
                 }
                 System.out.println();
            }
            System.out.println("Matriz 1:"); 
            //Se imprime la matriz1
            for(int i=0; i<matriz1.length; i++){
                 for(int j=0; j<matriz1[i].length; j++){
                  System.out.print(matriz1 [i][j]+ " ");
                }
            System.out.println();     
            }      
            //Se llena la matriz2
            System.out.println("Llenado de matriz 2");
            for(int i=0; i<matriz2.length; i++){
                for(int j=0; j<matriz2[i].length; j++ ){
                    System.out.print("Digite el valor para la posicion"+ i+ j +": " );
                    matriz2[i][j] = sc.nextByte();
                }
                System.out.println();
            }
            System.out.println("Matriz 2:");
            //Se imprime la matriz2
            for(int i=0; i<matriz2.length; i++){
                for(int j=0; j<matriz2[i].length; j++){
                    System.out.print(matriz2 [i][j] +" ");
                }
                System.out.println();
            }
            System.out.println();
            multiplicacionEImpresion(matriz1, matriz2);
        }
        //multiplicacion de matrices
        public static void multiplicacionEImpresion(byte matriz1[][], byte matriz2[][]){
        byte [][] matrizResult = new byte [matriz1.length][matriz2[0].length];
        for(int i=0; i<matrizResult.length; i++){
            for(int j=0; j<matrizResult[0].length; j++){
                for(int k=0; k<matriz2.length; k++){ 
                    matrizResult[i][j]+=(matriz1[i][k]*matriz2[k][j]);
                }
            }
        }
        //Impresion de la matriz resultado
        System.out.println("Matriz Resultado:");
         for(int i=0; i<matrizResult.length; i++){
            for(int j=0; j<matriz2[i].length; j++){
                System.out.print(matrizResult [i][j]+ " ");
            }
            System.out.println();
        }
        }
                
        public static void main(String[] args) {
      multiplicacionMatrices();        
    }
    
}
