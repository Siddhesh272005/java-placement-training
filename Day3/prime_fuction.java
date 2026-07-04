import java.util.Scanner;
public class prime_fuction {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to prime number finder: ");
    System.out.print("Please enter a number: ");
    int num = sc.nextInt();
    sc.close();
    int out = prime(num);
    if(out ==0){
      System.out.println("Not a prime number");
    }else{
      System.out.println("It is a prime number");
    }
  }
  public static int prime(int n){
    int count =0;
    for(int i=1; i<=n; i++){
      if(n%i == 0){
        count ++;
      }
    }
    if(count == 2){
      return 1;
    }else{
      return 0;
    }
  }
}
