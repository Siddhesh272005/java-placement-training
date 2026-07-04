import java.util.Scanner;
public class matrix_Multiplication {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Matrix Mulitplier");
    System.out.println("Matrix one");
    System.out.print("Enter the number of row: ");
    int row1 = sc.nextInt();
    System.out.print("Enter the number of col: ");
    int col1 = sc.nextInt();

    int[][] matrix1 = new int[row1][col1];
    for(int i =0; i<row1; i++){
      for(int j=0; j<col1; j++){
        matrix1[i][j] = sc.nextInt();
      }
      System.out.println();
    }

    System.out.println("Matrix two");
    System.out.print("Enter the number of row: ");
    int row2 = sc.nextInt();
    System.out.print("Enter the number of col: ");
    int col2 = sc.nextInt();

    int[][] matrix2 = new int[row2][col2];
    for(int i =0; i<row2; i++){
      for(int j=0; j<col2; j++){
        matrix2[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    sc.close();
    Mulitplier(matrix1, matrix2, row1, row2, col1, col2);
  }
  public static void Mulitplier(int[][] matrix1, int[][] matrix2,int row1,int row2,int col1,int col2){

    int[][] result = new int[row1][col2]; 
    if(col1 != row1){
      System.out.println("The matrix multiplicaiton is not possible.");
    }else{
      for(int i=0; i<row1; i++){
        for(int j=0; j<col2; j++){
          for(int k=0; k<col1; k++){
            result[i][j] += matrix1[i][k] * matrix2[k][j];
          }
        }
      }
    }

    for(int i=0; i<row1; i++){
      for(int j=0; j<col2; j++){
        System.out.print(result[i][j] + "\t");
      }
      System.out.println();
    }


  }
}
