import java.util.Scanner;
public class calculator {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to simple calculator");
    System.out.print("Please enter a number: ");
    int x = sc.nextInt();
    System.out.print("Please enter a second number: ");
    int y = sc.nextInt();
    sc.close();

    System.out.printf("%d + %d = %d\n",x,y,x+y);
    System.out.printf("%d - %d = %d\n",x,y,x-y);
    System.out.printf("%d x %d = %d\n",x,y,x*y);
    System.out.printf("%d / %d = %d\n",x,y,x/y);
  }
}
