/*13.La función de Ackerman se define como:
Ackerman(m, n) = n + 1  si m = 0
Ackerman(m, n) = Ackerman(m - 1, 1)
    si m > 0 y n = 0
Ackerman(m, n) = Ackerman(m - 1,Ackerman(m, n - 1))   si m > 0 y n >0
Ej. 
Si se tiene  Ackermann(1, 2) = 4;  Ackermann(3, 2) = 29
Realice un programa para encontrar el valor de la 
función de Ackerman, para dos valores enteros m,n. */

public class Ejercicio13 {

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } 
        else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } 
        else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        
        int resultado1 = ackermann(m, n);
        System.out.println("Ackermann(" + m + ", " + n + ") = " + resultado1); // Debe dar 4

        int m2 = 3;
        int n2 = 2;
        int resultado2 = ackermann(m2, n2);
        System.out.println("Ackermann(" + m2 + ", " + n2 + ") = " + resultado2); // Debe dar 29
    }
}