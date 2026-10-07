/*10. Leer n valores enteros, almacenarlos en un arreglo y 
realizar la suma de los elementos del vector. */

public class Ejercicio10 {
    public static int sumaArreglo(int[] arreglo,int suma){
        if(suma == arreglo.length){
            return 0;
        }
        return arreglo[suma] + sumaArreglo(arreglo, suma+1);
    }

    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,9};
        int suma = 0;
        int solucion = sumaArreglo(arreglo, suma);
        System.out.println("la suma del arreglo es: "+solucion);
    }
}
