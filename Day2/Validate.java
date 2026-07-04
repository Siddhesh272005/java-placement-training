import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName = "Admin@gmail.com";
        String password = "12345";

        System.out.print("Enter your UserId: ");
        String id = sc.nextLine();

        System.out.print("Enter your Password: ");
        String pass = sc.nextLine();

        if (userName.equals(id) && password.equals(pass)) {
            System.out.println("Welcome to Homepage");
        } else {
            System.out.println("Invalid Userid or Password");
        }

        sc.close();
    }
}