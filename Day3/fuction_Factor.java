import java.util.Scanner;
public class fuction_Factor{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to factor finder.");
    System.out.print("Please enter a number: ");
    int  num = sc.nextInt();
    sc.close();
    factor(num);
  }
  public static void factor(int n){
    for(int i=n; i>=1; i--){
      if(n%i == 0){
        System.out.println(n/i);
      }
    }
  }
}