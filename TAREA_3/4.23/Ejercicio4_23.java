
import java.util.Scanner;
public class Ejercicio4_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Mayor = 0, Mayor2 =0;
    System.out.println("\nDETECTAR EL MAYOR DE LOS NUMEROS\n");
    for(int i =0; i < 10; i++){
        System.out.printf("\t%d. Numero: ", i + 1);
        int numero = sc.nextInt();
    if(numero > Mayor){ Mayor2= Mayor; Mayor = numero;}//Evaluar el mayor de los numeros en el conjunto
    else if (numero > Mayor2) { Mayor2 = numero;}//Evaluar el segundo mayor numero en el conjunto
    }
    System.out.printf("\nEl mayor numero es %d. ", Mayor);
    System.out.printf("\nEl segundo mayor numero es %d. \n", Mayor2);
    sc.close();
    }
    
}
