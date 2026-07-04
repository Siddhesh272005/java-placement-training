import java.util.Scanner;
public class Even_odd {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();

    if(num % 2 == 0){
      System.out.print("The given no is Even");
    }else{
      System.out.print("The give number is Odd");
    }
  }
}
