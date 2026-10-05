/*6. Leer  un número llamado base y otro exponente 
y calcular la potencia elevando la base al exponente. */

public class Ejercicio6 {
    public static int calculoExponente(int numero, int exponente, int resultado){   
        if(exponente==0){
            return resultado;
        }

        return calculoExponente(numero, exponente-1, resultado*numero);
    }

/*   public static void main(String[] args) {
        int numero = 6;
        int exponente = 4;
        int resultadoExponente = calculoExponente(numero, exponente, 1);
        System.out.println("el resultado de la potencia de "+numero+" es: "+resultadoExponente);
    }*/
}
