import java.util.Scanner;
public class factorial {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Factorial number idetifier");
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();
    int result = fact(num);
    System.out.println("The factorial of given number is " + result);
  }
  public static int fact(int n){
    int sum = 1;
    for(int i=1; i<=n; i++){
      sum = sum * i;
    }
    return sum;
  }
}
