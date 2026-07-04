import java.util.Scanner;
public class Odd_even_in_array_elemetns {
  public static void main(String[] args){
    System.out.println("Odd or Even elments to perticular range");
    System.out.print("Enter the value: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i= 1; i < n+1; i++){
      if(i % 2 == 0){
        System.out.println(i + " Even");
      }else{
        System.out.println(i + " Odd");
      }
    }
  }
}
