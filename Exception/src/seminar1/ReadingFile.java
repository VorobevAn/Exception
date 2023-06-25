package seminar1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args){
        int result = 0;
       try {
            Scanner scanner = new Scanner(new File("numbers.txt"));

           while (scanner.hasNext()){
                result += scanner.nextInt();
            }
            scanner.close();
            System.out.println(result);
        }
       catch (InputMismatchException e){
           System.out.println("Некорректное значение числа в файле");
        }
       catch (FileNotFoundException e){
           System.out.println("Фаил не найден");
       }

    }
}
