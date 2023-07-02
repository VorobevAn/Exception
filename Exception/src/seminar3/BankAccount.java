package seminar3;


import java.util.InputMismatchException;

public class BankAccount {
    public static void main(String[] args) throws InsufficientFundsException, InvalidAmountException {
        Client aleks = new Client("Aleks", 3000);
        Client smit = new Client("Smit", 2500);
        Client maks = new Client("Maks", 4000);
        Translation translation = new Translation();
        try {
            System.out.println("Баланс: " + aleks.getNaim() + " " + aleks.getSumCheck());
            System.out.println("Баланс: " + smit.getNaim() + " " + smit.getSumCheck());
            translation.translation(translation.transferAmount(), aleks, smit);
            System.out.println("Баланс: " + aleks.getNaim() + " " + aleks.getSumCheck());
            System.out.println("Баланс: " + smit.getNaim() + " " + smit.getSumCheck());
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Перевод отменен " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("некоректный ввод");
        }
    }
}


