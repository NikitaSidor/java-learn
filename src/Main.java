import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        float num1 = scan.nextFloat();

        System.out.print("Введите 2 число: ");
        float num2 = scan.nextFloat();

        float res = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;
        float res5 = num1 % num2;

        System.out.println("Результат от сложения: " + res);
        System.out.println("Результат от вычитания: " + res2);
        System.out.println("Результат от умножения: " + res3);
        System.out.println("Результат от деления: " + res4);
        System.out.println("Результат от остатка от деления: " + res5);
    }
}
