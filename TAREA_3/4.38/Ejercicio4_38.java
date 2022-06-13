/*(Implementar la privacidad con la criptografía) El crecimiento explosivo de las comunicaciones de Internet y el almacenamiento de datos en computadoras conectadas en red, ha incrementado de manera considerable los 
problemas de privacidad. El campo de la criptografía se dedica a la codificación de datos para dificultar (y, mediante 
los esquemas más avanzados, tratar de imposibilitar) su lectura a los usuarios no autorizados. En este ejercicio, usted
investigará un esquema simple para cifrar y descifrar datos. Una compañía que desea enviar datos por Internet le pidió 
a usted que escribiera un programa que los cifre, de modo que se puedan transmitir con más seguridad. Todos los 
datos se transmiten como enteros de cuatro dígitos. Su aplicación debe leer un entero de cuatro dígitos introducido 
por el usuario, y cifrarlo de la siguiente manera: reemplace cada dígito con el resultado de sumarle 7 y obtenga el residuo después de dividir el nuevo valor entre 10. Después intercambie el primer dígito con el tercero, y el segundo dígito con el cuarto. Luego imprima el entero cifrado. Escriba una aplicación separada que reciba como entrada un 
entero de cuatro dígitos cifrado y lo descifre (invirtiendo el esquema de cifrado) para formar el número original. 
[Proyecto de lectura opcional: investigue la criptografía de clave pública en general y el esquema de clave pública 
específico PGP (privacidad bastante buena). Tal vez también quiera investigar el esquema RSA, que se utiliza mucho 
en las aplicaciones de nivel industrial]. */
import java.util.Scanner;

public class Ejercicio4_38 {
    public static void main(String[]args) {
    
        Scanner sc = new Scanner(System.in);
    
        int num = 0, d1 = 0, d2 = 0, d3 = 0, d4 = 0;
        int resul1 = 0, resul2 = 0, resul3 = 0;
        System.out.println("\n\n\tCIFRADOR DE NUMEROS");
        System.out.print("Digite un numero de 4 cifras: "); num = sc.nextInt();
        while(true){
        if (num > 999 && num <10000){
            //separacion del numero en digitos individuales
        resul1 = num / 10;
        d1 = num % 10;
    
        resul2 = resul1 / 10;
        d2 = resul1 % 10;
    
        resul3 = resul2 / 10;
        d3 = resul2 % 10;
    
        d4 = resul3 % 10;
            //incremento de 7 en cada digito
        d1 +=7;
        d2 +=7;
        d3 +=7;
        d4 +=7;
            //aplicacion de modulo a cada digito
        d1 %=10;
        d2 %=10;
        d3 %=10;
        d4 %=10;
        
        System.out.printf("\nEl numero cifrado es: %d%d%d%d", d2, d1, d4, d3);
        System.out.print("\n\n"); 
        break;
        }

        else {System.out.printf("El numero %d no es un numero de 4 cifras.\n", num);
        System.out.print("Digite un numero de 4 cifras: "); num = sc.nextInt();}

    }
    sc.close();
    
}
}