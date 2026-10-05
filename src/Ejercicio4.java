public class Ejercicio4 {
    public static int invertir(int n, int resultado) {
        if (n == 0) {
            return resultado;
        }
        return invertir(n / 10, resultado * 10 + (n % 10));
    }
    
}