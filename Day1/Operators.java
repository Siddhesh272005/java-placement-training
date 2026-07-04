import java.util.Scanner;
public class Operators {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number num1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter a number num2: ");
    int num2 = sc.nextInt();

    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;
    int quotient = num1 / num2;
    int remainder = num1 % num2;

    int result = num1;
    result += num2;
    result -= num1;
    result *= 2;
    result /= 2;

    boolean isGreater = num1 > num2;
    boolean isEqual = num1 == num2;
    boolean andResult = (num1 > 0) && (num2 > 0);
    boolean orResult = (num1 > 0) || (num2 < 0);
    boolean notResult = !(num1 == num2);

    System.out.println("Arithmetic Operators");
    System.out.println("Addition: " + sum);
    System.out.println("Subtraction: " + difference);
    System.out.println("Multiplication: " + product);
    System.out.println("Division: " + quotient);
    System.out.println("Modulus: " + remainder);

    System.out.println("Assignment Operators");
    System.out.println("Result: " + result);

    System.out.println("Logical and Boolean Operators");
    System.out.println("Greater: " + isGreater);
    System.out.println("Equal: " + isEqual);
    System.out.println("AND: " + andResult);
    System.out.println("OR: " + orResult);
    System.out.println("NOT: " + notResult);
  }
}
