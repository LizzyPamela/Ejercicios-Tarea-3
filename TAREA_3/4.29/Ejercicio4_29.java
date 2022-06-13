import java.util.Scanner;
public class Ejercicio4_29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDIGITE LA LONGITUD DEL LADO DEL CUADRADO: "); int lado = sc.nextInt();
        if (lado >0 && lado <= 20){
        for (int i=1; i<=lado; i++){  System.out.print("");//lineas verticales del cuadrado
        for (int j=1; j<=lado; j++){  
            if((i==1)|| (i==lado) || (j==1) || (j==lado)){  System.out.print(" *");}
            else System.out.print("  ");
             } System.out.println();}
        }
        else System.out.print("\nEL VALOR DIGITADO ES INAVALIDO.");

       sc.close();

    }
}
