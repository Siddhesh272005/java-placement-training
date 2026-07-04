import java.util.Scanner;
public class Add_to_string{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter A number: ");
    String x = sc.nextLine();
    System.out.print("Enter the second number: ");
    String y = sc.nextLine();
    sc.close();

    int val = Integer.parseInt(x) + Integer.parseInt(y);
    System.out.print(val);

  }
}