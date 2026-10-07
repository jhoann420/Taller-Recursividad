/*Cree una matriz de tamaño mXn y

sume los elementos de la matriz. */

import java.util.Random;

public class Ejercicio11 {

    public static int sumarMatriz(int[][] matriz, int fila, int col) {
        if (fila >= matriz.length) {
            return 0;
        }

        int siguienteCol = col + 1;
        int siguienteFila = fila;

        if (siguienteCol >= matriz[fila].length) {
            siguienteCol = 0;
            siguienteFila = fila + 1;
        }

        return matriz[fila][col] + sumarMatriz(matriz, siguienteFila, siguienteCol);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m = 3; 
        int n = 3; 
        int[][] matriz = new int[m][n];
        Random rand = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(9) + 1;
            }
        }

        System.out.println("Matriz generada:");
        imprimirMatriz(matriz);

        int sumaTotal = sumarMatriz(matriz, 0, 0);

        System.out.println("\nLa suma total de los elementos de la matriz es: " + sumaTotal);
    }
}