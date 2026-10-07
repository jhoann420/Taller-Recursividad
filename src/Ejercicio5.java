/*5. Leer un numero y  sumar los dígitos de un número. Ejemplo: Entrada: 123 Resultado:6
 */

public class Ejercicio5 {
    public static int sumarDigitos(int n, int resultado){
        if(n==0){
            return resultado;
        }
        return sumarDigitos(n/10  , resultado+(n%10));
        
    }

    public static void main(String[] args) {
        int numero = 4562;
        int resultadoSuma = sumarDigitos(numero, 0);
        System.out.println(resultadoSuma);
    }
}
