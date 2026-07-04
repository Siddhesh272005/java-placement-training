import java.util.Scanner;
public class array_Input {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();

    int [] arr = new int[size];
    System.out.println("Enter the elements of the array: ");

    for(int i=0; i<size; i++){
      arr[i] = sc.nextInt();
    }

    sc.close();

    System.out.println("Elements of the array are");
    for(int j = 0; j<size; j++){
      System.out.println(arr[j]);
    }
  }
}
