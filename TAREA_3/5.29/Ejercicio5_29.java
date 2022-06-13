import java.util.Scanner;
public class Ejercicio5_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;

    do { 
        System.out.println("\n\tThe Twelve Days of Christmas");
        System.out.print("Type a day number from 1 to 12(type 0 to exit): "); day = sc.nextInt();
switch (day) {
  case 1://First day
    int first; 
    System.out.print("\nOn the fist day...\nPick a verse: "); first = sc.nextInt();
    switch(first){
        case 1:
        System.out.print("\nOn the first day of Christmas\n\n");
       System.out.print("Press any key to continue..."); sc.next(); break;
        case 2:
        System.out.print("\n My true love sent to me partridge in a pear tree.\n\n");
       System.out.print("Press any key to continue..."); sc.next(); break;}
    break;
  case 2://Second day
    int second;
    System.out.print("\nOn the second day...\nPick a verse: "); second = sc.nextInt();
    switch(second){
        case 1:
        System.out.print("\tTwo turtledoves \nOn the second day of Christmas my true love sent to me two turtledoves.\n\n");
        System.out.print("Press any number to continue..."); sc.nextInt();  break;
        case 2: 
        System.out.print("\n My true love sent to me two turtledoves and a partridge in a pear tree.\n\n");
       System.out.print("Press any key to continue..."); sc.next(); break;}
    break;
  case 3://Third day
  int third; 
    System.out.print("\nOn the third day...\nPick a verse: "); third = sc.nextInt();
    switch(third){
        case 1: 
        System.out.print("\nThree French hens\nOn the third day of Christmas\n\n");
       System.out.print("Press any key to continue..."); sc.next(); break;
        case 2: 
        System.out.print("\nMy true love sent to me three French hens, two turtledoves, and a partridge in a pear tree.\n\n");
       System.out.print("Press any key to continue..."); sc.next(); break;
         }
    break;
  case 4://Fourth day
    int fourth;
    System.out.print("\nOn the fourth day...\nPick a verse: "); fourth = sc.nextInt();
    switch(fourth){
        case 1: 
        System.out.print("\nFour calling birds\n On the fourth day of Christmas (what's a calling bird)\n\n");
       System.out.print("Press any key to continue..."); sc.next(); break;
        case 2 :
        System.out.print("\nMy true love sent to me four calling birds, three french hens, two turtle doves, and a partridge in a pear tree!\n\n");
       System.out.print("Press any key to continue..."); sc.next(); break;
         }
    break;
  case 5://Fifth day
  int fifth;
  System.out.print("\nOn the fifth day...\nPick a verse: "); fifth = sc.nextInt();
  switch(fifth){
      case 1: 
      System.out.print("\nFive golden rings\n On the fifth day of Christmas\n\n");
     System.out.print("Press any key to continue..."); sc.next(); break;
      case 2 :
      System.out.print("\nMy true love sent to me, five golden rings, four calling birds, three french hens, two turtle doves, and a partridge in a pear tree!\n\n");
     System.out.print("Press any key to continue..."); sc.next(); break;
       }
    break;
  case 6://Sixth day
  int sixth;
  System.out.print("\nOn the sixth day...\nPick a verse: "); sixth = sc.nextInt();
  switch(sixth){
    case 1: 
    System.out.print("\nSix geese a laying \nOn the sixth day of Christma\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
    case 2 :
    System.out.print("\nMy true love sent to me, six geese a laying, five golden rings, four calling birds, three french hens, two turtle doves, and a partridge in a pear tree!\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
     }
  break;
  case 7://Seventh day
  int seventh;
  System.out.print("\nOn the seventh day...\nPick a verse: "); seventh = sc.nextInt();
  switch(seventh){
    case 1: 
    System.out.print("\nSeven swans a swimming \nOn the seventh day of Christmas\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
    case 2 :
    System.out.print("\nMy true love sent to me, seven swans a-swimming, six geese a laying, five golden rings, four calling birds, three french hens, two turtle doves, and a partridge in a pear tree!\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
     }
    break;
    case 8://Eighth day
    int eighth;
  System.out.print("\nOn the eighth day...\nPick a verse: "); eighth = sc.nextInt();
  switch(eighth){
    case 1: 
    System.out.print("\nEight maids a milking \nOn the eighth day of Christmas\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
    case 2 :
    System.out.print("\nMy true love sent to me, eight maids a milking, seven swans a-swimming, six geese a laying, five golden rings, four calling birds, three french hens, two turtle doves, and a partridge in a pear tree!\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
     }
    break;
  case 9://Ninth day
  int ninth;
  System.out.print("\nOn the ninth day...\nPick a verse: "); ninth = sc.nextInt();
  switch(ninth){
    case 1: 
    System.out.print("\nNine ladies dancing \nOn the ninth day of Christmas\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
    case 2 :
    System.out.print("\nMy true love sent to me, nine ladies dancing, eight maids a milking, seven swans a-swimming, six geese a laying, five golden rings, four calling birds, three french hens, two turtle doves, and a partridge in a pear tree!\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
     }
    break;
  case 10://Tenth day
  int tenth;
  System.out.print("\nOn the tenth day...\nPick a verse: "); tenth = sc.nextInt();
  switch(tenth){
    case 1: 
    System.out.print("\nTen lords a leaping \nOn the eighth day of Christmas\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
    case 2 :
    System.out.print("\nMy true love sent to me, ten lords a leaping, nine ladies dancing, eight maids a milking, seven swans a-swimming, six geese a laying, five golden rings, four calling birds, three french hens, two turtle doves, and a partridge in a pear tree!\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;}
  case 11: //Eleventh day
  int eleventh;
  System.out.print("\nOn the eleventh day...\nPick a verse: "); eleventh = sc.nextInt();
  switch(eleventh){
    case 1: 
    System.out.print("\nEleven pipers piping \nOn the eighth day of Christmas\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
    case 2 :
    System.out.print("\nMy true love sent to me, eleven pipers piping, ten lords a leaping, nine ladies dancing, eight maids a milking, seven swans a-swimming, six geese a laying, five golden rings, four calling birds, three french hens, two turtle doves, and a partridge in a pear tree!\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
     }
    break;
  case 12://Twelfth day
  int twelfth;
  System.out.print("\nOn the twelfth day...\nPick a verse: "); twelfth = sc.nextInt();
  switch(twelfth){
    case 1: 
    System.out.print("\nTwelve drummers drumming \nOn the eighth day of Christmas\n\n");
    System.out.print("Press any number to continue..."); sc.nextInt(); 
   break;
    case 2 :
    System.out.print("\nMy true love sent to me,twelve drummers drumming, eleven pipers piping, ten lords a leaping, nine ladies dancing, eight maids a milking, seven swans a-swimming, six geese a laying, five golden rings, four calling birds, three french hens, two turtle doves, and a partridge in a pear tree!\n\n");
   System.out.print("Press any key to continue..."); sc.next(); break;
     }
} 
        System.out.print("\033[H\033[2J");  System.out.flush();  //limpiar pantalla
   
   } while(day!=0); 
   sc.close();
}
   
   
}

