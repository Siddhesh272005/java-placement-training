import java.util.LinkedHashSet;
import java.util.Scanner;
public class duplicatein_String {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String names = sc.nextLine();
    sc.close();
    // String names = "gokul, kavin, mathesh, gokul, laksan";
    String[] words = names.split(" ");

    LinkedHashSet<String> set = new LinkedHashSet<>();

    for(String word: words){
      set.add(word);
    }

    String result = String.join(" ", set);
    System.out.println(result);
  }
}
