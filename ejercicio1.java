import java.util.Scanner;
// 1. Realice un algoritmo que almacene números en una matriz de 6 * 6. Imprimir la suma de los números almacenados en la matriz.
public class ejercicio1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el número de filas: ");
        int a=input.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        int b=input.nextInt();

        int matriz [][] = new int[a][b];

        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                System.out.println("ingrese el número de la celda "+i+" "+j);
                matriz[i][j]=input.nextInt();
            }

        }
        System.out.println( "La matriz es: ");
        for (int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Y su suma es: ");
        int sum=0;
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                sum += matriz[i][j];
            }
        }
        System.out.println(sum);
        input.close();

    }

}
