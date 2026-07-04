import java.util.Scanner;
public class two_Dimensional_Array {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to multidimenssional array (2 dimensional):");
    System.out.print("Enter the size of the array Row: ");
    int row = sc.nextInt();
    System.out.print("Enter the size fo the array Col: ");
    int col = sc.nextInt();

    int[][] arr = new int[row][col];
    
    System.out.println("Enter the elements fo the array: ");
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        arr[i][j] = sc.nextInt();
      }

    }

    System.out.println("Elements of the array are: ");
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }

  }

}
