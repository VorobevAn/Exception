package seminar1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class IncorrectInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите ваш возрост: ");
            int age = scanner.nextInt();
            scanner.close();
            System.out.println("Ваш возрост: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод");

        }

    }


}

