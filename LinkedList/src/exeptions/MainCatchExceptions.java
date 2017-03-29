package exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * 13.03.2017
 * MainCatchExceptions
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainCatchExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            InputStream inputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        while(true) {
            int scannedNumber = scanner.nextInt();
            try {
                System.out.println(10 / scannedNumber);
            } catch (ArithmeticException e) {
                System.out.println("Please, not null value enter");
            }
        }
    }
}
