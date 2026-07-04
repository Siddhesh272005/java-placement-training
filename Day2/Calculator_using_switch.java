import java.util.Scanner;
public class Calculator_using_switch {
  public static void main(String[] args){
    System.out.println("Welcome to simple Calculator");
    System.out.println("Choose the Number for the intended action");
    System.out.println("1.Add");
    System.out.println("2.Sub");
    System.out.println("3.Mul");
    System.out.println("4.Div");
    System.out.println("5.Mod");
    System.out.println("====================");
    System.out.print("Enter your choice: ");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    System.out.println("====================");

    System.out.print("Enter the Num1: ");
    int Num1 = sc.nextInt();
    System.out.print("Enter the Num2: ");
    int Num2 = sc.nextInt();
    System.out.println("====================");
    sc.close();

    switch (choice) {
      case 1:
        System.out.print(Num1 + Num2);
        break;
      case 2: 
        System.out.print(Num1 - Num2);
        break;
      case 3:
        System.out.print(Num1 * Num2);
        break;
      case 4:
        if(Num2 == 0){
          System.out.println("Invalid division");
        }else{
          System.out.print(Num1 / Num2);
        }
        break;
      case 5:
        if(Num2 == 0){
          System.out.println("Invalid division");
        }else{
          System.out.print(Num1 % Num2);
        }
        break;
      default:
        System.out.print("Invaid choice");
        break;
    }

  }
  
}
