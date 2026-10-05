/*8. Leer 2 números enteros y calcular el cociente de la 
división entera.(sugerencia: use restas sucesivas)
 */

public class Ejercicio8 {
    public static int calcularCociente(int a, int b) {
        if (a < b) {
            return 0;
        }
        return 1 + calcularCociente(a - b, b);
    }

    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 3;
        int resultado = calcularCociente(dividendo, divisor);
        
        System.out.println("El cociente de " + dividendo + " / " + divisor + " es: " + resultado);
    }
}
