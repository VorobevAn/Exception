package seminar3;

import java.util.InputMismatchException;
import java.util.Scanner;

// Напишите программу-калькулятор, которая запрашивает у пользователя два числа
// и выполняет операцию возведения первого числа в степень второго числа.
// Если введены некорректные числа или происходит деление на ноль,
// необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam = 0, nam2 = 0;
        try {
            while (true) {
                try {
                    System.out.print("Ведите число: ");
                    nam = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println(("Это не число повторите "));
                    scanner.nextLine();
                }
            }
            while (true) {
                try {
                    System.out.println("Введите степень: ");
                    nam2 = scanner.nextInt();
                    calculatePower(nam, nam2);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Некоректная степень: ");
                    scanner.nextLine();
                }
            }

        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

    public static void calculatePower(int number, int degree) throws InvalidInputException {
        if (number == 0 || degree < 0) throw new InvalidInputException("некоректное число");
        System.out.println(Math.pow(number, degree));
    }

}


class InvalidInputException extends Exception {
    InvalidInputException(String massage) {
        super(massage);
    }
}