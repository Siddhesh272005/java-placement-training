import java.util.Scanner;
import java.util.Arrays;
public class add_new_element_to_array {
  public static void main(String[] args){
    String[] nameList = {"Gokul","kavin","shankar"};
    System.out.print("Enter a name to add in a string: ");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();
    sc.close();

    String[] updatedList = Arrays.copyOf(nameList, nameList.length + 1);
    updatedList[updatedList.length - 1] = newName;

    for(int i = 0; i < updatedList.length; i ++){
      System.out.println(updatedList[i]);
    }
  }
}

