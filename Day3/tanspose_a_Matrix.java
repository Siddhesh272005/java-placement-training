import java.util.Scanner;
public class tanspose_a_Matrix {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Matrix transposer");
    System.out.print("Enter the number of row: ");
    int row = sc.nextInt();
    System.out.print("Enter the number of col: ");
    int col = sc.nextInt();

    int[][] matrix = new int[row][col];
    for(int i =0; i<row; i++){
      for(int j=0; j<col; j++){
        matrix[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    sc.close();

    tranpose(matrix, row, col);
  }
  public static void tranpose(int[][] matrix, int row, int col){
    int[][] transpose_Matrix = new int[col][row];
    
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        transpose_Matrix[j][i] = matrix[i][j];
      }
    }

    for(int i=0; i<col; i++){
      for(int j=0; j<row; j++){
        System.out.print(transpose_Matrix[i][j] + "\t");
      }
      System.out.println();
    }
  }
  
}
