/*(Calculadora de límite de crédito) Desarrolle una aplicación en Java que determine si alguno de los clientes 
de una tienda de departamentos se ha excedido del límite de crédito en una cuenta. Para cada cliente se tienen los siguientes datos:
a) el número de cuenta.
b) el saldo al inicio del mes.
c) el total de todos los artículos cargados por el cliente en el mes.
d) el total de todos los créditos aplicados a la cuenta del cliente en el mes.
e) el límite de crédito permitido.
El programa debe recibir como entrada cada uno de estos datos en forma de números enteros, debe calcular el nuevo 
saldo (= saldo inicial + cargos – créditos), mostrar el nuevo saldo y determinar si éste excede el límite de crédito del
cliente. Para los clientes cuyo límite de crédito sea excedido, el programa debe mostrar el mensaje “Se excedio el 
limite de su credito. */
import java.util.Scanner;
public class Ejercicio4_18 {

    public static void linea(){System.out.println("______________________________________________");}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String Nombre;
    int Numcuenta, SaldoInicial, Cargos, Creditos, LimCredito;

    linea();
    System.out.println("\n\tCALCULADORA DE LIMITE DE CREDITO");
    System.out.print("DIGITE EL NUMERO DE CLIENTES: "); int clientes = sc.nextInt();
    linea();

    for(int i =0; i < clientes; i++){
    System.out.println("Digite los siguientes datos: ");
    System.out.print("NOMBRE: "); Nombre = sc.next();
    System.out.print("NUMERO DE CUENTA: "); Numcuenta = sc.nextInt(); 
    System.out.print("SALDO DE INICIO DE MES:"); SaldoInicial = sc.nextInt();
    System.out.print("CARGOS: "); Cargos = sc.nextInt();
    System.out.print("CREDITOS APLICADOS: "); Creditos = sc.nextInt();
    System.out.print("LIMITE DE CREDITO PERMITIDO: "); LimCredito = sc.nextInt();

        int NuevoSaldo = (SaldoInicial + Cargos) - Creditos;
    if (NuevoSaldo <= LimCredito){
        System.out.printf("%s el nuevo saldo es: %d. Su saldo no excede el limite.\n", Nombre, NuevoSaldo);}
    else System.out.printf("%s el nuevo saldo es: %d. Su saldo excede el limite.\n", Nombre, NuevoSaldo);
    linea();}
    sc.close();
    }
    
}
