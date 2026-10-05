/*2. Leer  un número entero y  calcular la sumatoria hasta el  numero leído. */

public class Ejercicio2 {
    public static int sumatoria(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumatoria(n - 1);
    }
}
