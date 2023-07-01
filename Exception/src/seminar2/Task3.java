package seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

//Задача3: - по желанию
//Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
//
//Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
//Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
//Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
//Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
//В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
//- необходимо создать 3 класса собвстенных исключений
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите три числа: ");
        Scanner scanner = new Scanner(System.in);
        try {
            numbers(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        } catch (NumberSumException | NumberOutOfRangeException | DivisionByZeroExceptions e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число!");
        }

    }

    public static void numbers(int nam1, int nam2, int nam3) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroExceptions {
        if (nam1 > 100) throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        if (nam2 < 0) throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        if (Integer.sum(nam1, nam2) < 10) throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        if (nam3 == 0) throw new DivisionByZeroExceptions("Деление на ноль недопустимо");
        System.out.println("Проверка пройдена успешно");

    }

}

class NumberOutOfRangeException extends Exception {
    NumberOutOfRangeException(String massage) {
        super(massage);
    }
}

class NumberSumException extends Exception {
    NumberSumException(String massage) {
        super(massage);
    }
}

class DivisionByZeroExceptions extends Exception {
    DivisionByZeroExceptions(String massage) {
        super(massage);
    }
}