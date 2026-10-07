/*12. La serie de Fibonacci puede definirse en términos recursivos asi:
(1) Fib(1) =1 ; Fib(0) =0
(2) Fib(n) =Fib(n-1)+ Fib(n-2) si n >= 2.
Lea un valor entero que representa el limite de la serie e 
imprimala  hasta el valor limite. */

public class Ejercicio12 {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int limite = 10; 

        System.out.println("Serie de Fibonacci hasta el límite " + limite + ":");
        
        for (int i = 0; i <= limite; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}