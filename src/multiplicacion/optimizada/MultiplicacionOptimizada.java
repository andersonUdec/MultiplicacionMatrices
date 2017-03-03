
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
                    
                llenadoMatriz1(filas1, columnas1);
                llenadoMatriz2(filas2, columnas2);
                multiplicacionEImpresion(filas1, columnas1, columnas2);
                }else
                System.out.println("El programa no puede multiplicar las matrices (Numero de filas1 debe ser igual a columnas2) ");      
        }
        public static void  llenadoMatriz1(byte filas01, byte columnas01){
            Scanner sc = new Scanner(System.in);
            //creacion de matrices
            byte [][] matriz1 = new byte [filas01][columnas01];
            System.out.println("Llenado de matriz 1");
            for(int i=0; i<filas01; i++){
                for(int j=0; j<columnas01; j++ ){
                    System.out.print("Digite el valor para la posicion"+ i+ j +": " );
                    matriz1[i][j] = sc.nextByte();
                 }
                 System.out.println();
            }
            System.out.println("Matriz 1:"); 
            //Se imprime la matriz1
            for(int i=0; i<filas01; i++){
                 for(int j=0; j<columnas01; j++){
                  System.out.print(matriz1 [i][j]+ " ");
                }
            System.out.println();     
            }     
        }
        public static void llenadoMatriz2(byte filas02, byte columnas02){
            Scanner sc = new Scanner(System.in);
            byte [][] matriz2 = new byte [filas02][columnas02];
            System.out.println();  
            //Se llena la matriz2
            System.out.println("Llenado de matriz 2");
            for(int i=0; i<filas02; i++){
                for(int j=0; j<columnas02; j++ ){
                    System.out.print("Digite el valor para la posicion"+ i+ j +": " );
                    matriz2[i][j] = sc.nextByte();
                }
                System.out.println();
            }
            System.out.println("Matriz 2:");
            //Se imprime la matriz2
            for(int i=0; i<filas02; i++){
                for(int j=0; j<columnas02; j++){
                    System.out.print(matriz2 [i][j] +" ");
                }
                System.out.println();
            }
             System.out.println();
        }
        //multiplicacion de matrices
        public static void multiplicacionEImpresion(byte filas01, byte columnas01, byte columnas02){
        byte [][] matrizResult = new byte [filas01][columnas02];
        for(int i=0; i<filas01; i++){
            for(int j=0; j<columnas02; j++){
                for(int k=0; k<columnas01; k++){ 
                    matrizResult[i][j]=matrizResult[i][j]+(matriz01[i][k]*matriz02[k][j]);
                }
            }
        }
        //Impresion de la matriz resultado
        System.out.println("Matriz Resultado:");
         for(int i=0; i<filas01; i++){
            for(int j=0; j<columnas02; j++){
                System.out.print(matrizResult [i][j]+ " ");
            }
            System.out.println();
        }
        }
                
        public static void main(String[] args) {
      multiplicacionMatrices();        
    }
    
}
