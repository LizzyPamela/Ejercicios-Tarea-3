/*Programa para imprimir gráficos de barra) Una aplicación interesante de las computadoras es la 
visualización de gráficos convencionales y de barra. Escriba una aplicación que lea cinco números, 
cada uno entre 1 y 30. Por cada número leído, su programa debe mostrar el mismo número de asteriscos 
adyacentes. Por ejemplo, si su programa lee el número 7, debe mostrar *******. Muestre las barras
 de asteriscos después de leer los cinco números. */
import java.util.Scanner;
public class Ejercicio5_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("\n\nDigite un numero entre 1 y 30: "); num = sc.nextInt();

        while(true){

        if( num >=1 && num <=30){
            System.out.printf("%d   ", num);
            for(int i =0; i<num; i++){ System.out.printf("*"); }
        break;}
        else {System.out.printf("El numero %d esta fuera del rango permitido.\n", num);
              System.out.print("Digite un numero entre 1 y 30: "); num = sc.nextInt();}
        }
        sc.close();
    
    }
}
