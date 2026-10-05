/*9. Leer 2 números enteros y realizar  la 
multiplicación de los 2 números mediante sumas sucesivas. */

public class Ejercicio9 {
    public static int multiplicacionConSumas(int a, int b){
        if(b==0){
            return 0;
        }
        return a+multiplicacionConSumas(a, b-1);
    }

    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int solucion = multiplicacionConSumas(a, b);
        System.out.println("El resultado de la multiplicacion de "+a+" y "+b+" es: "+solucion);
    }
}
