/*3.Leer un valor entero y calcular la sumatoria  1 + ½ +1/3+  … 1/n. */

public class Ejercicio3 {
    public static double sumatoria(int n) {
        if (n == 0) {
            return 0;
        }
        return (1.0 / n) + sumatoria(n - 1);
    }
}
