package seminar2;
//Задача 1:
//Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
// Если число отрицательное или равно нулю, программа должна выбрасывать
// исключение InvalidNumberException с сообщением
// "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        number();
    }
    public static void number(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число");
        try {
            examination(scanner.nextInt());
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
            number();
        }catch (InputMismatchException e){
            System.out.println("Вы ввели не число");
            number();
        }finally {
            scanner.close();
        }
    }
    public static void examination(int num) throws InvalidNumberException{
        if (num <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }

    }
}

    class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }

