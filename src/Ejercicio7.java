/*7. Leer dos números enteros y calcular el 
máximo común divisor(M.C.D. ),de dos números enteros (M,N)
utilizando el algoritmo de Euclides.
Si M >= N una función recursiva
para MCD es
MCD = M si N =0 
MCD = MCD (N, M % N) si N <>0 */

public class Ejercicio7 {
    public static int mcd(int m, int n){
        if(n==0){
            return m;
        }
        return mcd(n, m%n);
    }

    public static void main(String[] args) {
        int m = 240;
        int n = 108;
        int solucionMcd = mcd(n, m);
        System.out.println("el MCD de "+m+" y de "+n+" es: "+solucionMcd);
    }
}
