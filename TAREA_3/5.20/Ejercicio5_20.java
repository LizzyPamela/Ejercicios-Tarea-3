/*5.20 (Calcular el valor de π) Calcule el valor de π a partir de la serie infinita 
 * Imprima una tabla que muestre el valor aproximado de π, calculando los primeros 200,000 
 * términos de esta serie.*/

public class Ejercicio5_20 {

    public static void main(String[] args) {
        double n =4.0, n1= 4/3, N=0, Pi;
        System.out.println("\nLa serie infinita que determina el valor de Pi es:");
        System.out.println("\tPi = 4 \n\t-4/3 ");

        for(int i=3; i<=200000;i++){
            N += 4/((2*i)-1);
            System.out.printf("\t+4/%d \n",((2*i)-1 ));   }
        

        Pi = n - n1 + N;
        System.out.println("\t\t ....");
        System.out.printf("El valor apriximado de Pi es: %.5f\n\n", Pi);
    }
    
}
