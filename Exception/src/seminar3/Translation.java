package seminar3;


import java.util.InputMismatchException;
import java.util.Scanner;

//Перевод между клиентами.
public class Translation {
    public void translation(int sum, Client client, Client client2) throws InsufficientFundsException {
        int balanse = client.getSumCheck();
        if (balanse - sum < 0) {
            throw new InsufficientFundsException("Недостаточно средств на счете");

        } else {
            balanse = client.getSumCheck() - sum;
            client.setSumCheck(balanse);
            client2.setSumCheck(client2.getSumCheck() + sum);

        }
    }

// Запрос суммы перевода
    public int transferAmount() throws InvalidAmountException {
        int transfer = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ведите сумму перевода: ");
                transfer = scanner.nextInt();
                if (transfer <= 0) {
                    throw new InvalidAmountException("Некорректная сумма перевода");
                }
                return transfer;
            } catch (InputMismatchException e) {
                System.out.println("Введено не число");
                scanner.nextLine();
            }

        }

    }
}


class InvalidAmountException extends Exception {
    InvalidAmountException(String massage) {
        super(massage);
    }
}

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String massage) {
        super(massage);
    }
}

