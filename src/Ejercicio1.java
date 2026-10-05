/*1.Leer un numero entero y n calcular la factorial de dicho numero.
 */

public class Ejercicio1 {
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}