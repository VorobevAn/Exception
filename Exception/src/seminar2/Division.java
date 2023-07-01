package seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
// с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить результат деления.
public class Division {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа");
        Scanner scanner = new Scanner(System.in);
        try {
            int nams1 = scanner.nextInt();
            int nams2 = scanner.nextInt();
            examination(nams1, nams2);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
        } finally {
            scanner.close();
        }

    }

    public static void examination(int num1, int num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        double result = (double) num1 / num2;
        System.out.print("результат деления: ");
        System.out.format("%.2f", result);
    }
}


class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String massage) {
        super(massage);
    }
}