import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
//2.Realice un algoritmo que llene una matriz de 5 * 5 y determine la posición 
//[fila ,columna] del número mayor almacenado en la matriz. Los números son diferentes.
public class ejercicio2 {
    public static void main(String[]args){

        Random random=new Random();
        List <Integer> numeros = new ArrayList<>();
        for (int i =0;i<6*6;i++){
            numeros.add(i);
        }

        Collections.shuffle(numeros, random);

        
        int matriz [][] = new int[6][6];
        int index = 0;

        for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
                matriz[i][j]=numeros.get(index++);
            }
        }

        System.out.println( "La matriz es: ");
        for (int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Y el numero mayor de la matriz es: ");
        int validador=0;
        for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
                if (matriz[i][j]>validador){
                    validador = matriz[i][j];
                }
            }
        }
        System.out.println(validador);
    }
}
