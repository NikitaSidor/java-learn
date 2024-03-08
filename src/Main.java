import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ввкдите Ваше имя: ");
        String username = scan.nextLine();
        System.out.println("Привет, " + username);
    }
}
