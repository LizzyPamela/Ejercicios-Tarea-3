/*5.14 (Programa modificado del interés compuesto) Modifique la aplicación de 
interés compuesto de la figura 5.6, repitiendo sus pasos para las tasas de 
interés del 5, 6, 7, 8, 9 y 10%. Use un ciclo for para variar la tasa de interés */

public class Ejercicio5_14 
{
   public static void main(String args[])
   {
      double amount; // amount on deposit at end of each year
      double principal = 1000.0; // initial amount before interest
      char p = 37;

      // display headers
      System.out.printf("Interes\t Anio \t Monto ");
  
         for(int rate1=5; rate1<=10; rate1++){
            System.out.println("");
            for (int year = 1; year <= 10; year++){
         // calculate new amount for specified year
         amount = principal * Math.pow(1.0 + (0.01*rate1), year);
         System.out.printf(" %d %c", rate1, p);
         System.out.printf("\t %d\t%.2f%n", year, amount);
         // display the year and the amount
        }
      } 
   }
} 