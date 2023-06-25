package seminar1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisionNumbers {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа");
        Scanner scanner = new Scanner(System.in);
        try {
            int nams1 = scanner.nextInt();
            int nams2 = scanner.nextInt();
            double result = (double) nams1 / nams2;
            System.out.print("результат деления: ");
            System.out.format("%.2f", result);
        } catch (InputMismatchException e) {
            System.out.println("Ввели не коректное число ");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль не возможно ");
        } finally {
            scanner.close();
        }
    }
}

