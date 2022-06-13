/*(Factoriales) Los factoriales se utilizan con frecuencia en los problemas de probabilidad. El factorial de un 
entero positivo n (se escribe como n! y se pronuncia factorial de n) es igual al producto de los enteros positivos del
1 a n. Escriba una aplicación que calcule los factoriales del 1 al 20. Use el tipo long. Muestre los resultados en 
formato tabular. 
¿Qué dificultad podría impedir que usted calculara el factorial de 100? 
El valor aproximado de 100! es 9.3326215443944E+157 por lo cual sobrepasa las capacidades de almacenamiento de 
un long, o cualquier otro tipo de dato en java*/
public class Ejercicio5_13 {
    public static void main(String[] args) {
    long n=1;

    for(int i=1; i<20; i++){
        n *= i;
        System.out.printf("Factorial de %d:  %d\n", (i), n );
    }
        
    }
    
}
