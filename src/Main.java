import exceptions.Exceptions;

import javax.security.sasl.SaslClient;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Registration regis = new Registration();
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        try {
            System.out.println("Атнызыды жазыныз: ");
            regis.setFirstname(scan.nextLine());
        } catch (Exceptions ex) {
            System.out.println(ex.getMessage());
        } catch (NullPointerException n) {
            System.out.println("Толтуруу зарыл.");
        } catch (InputMismatchException i) {
            System.out.println("Тамга менен жазыныз.");
        }

        try {
            System.out.println("Фамилиянызды жазыныз: ");
            regis.setSecondName(scan1.nextLine());
        } catch (Exceptions e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException i) {
            System.out.println("Тамга менен жазыныз.");
        }

        try {
            System.out.println("Сиздин жашыныз: ");
            regis.setAge(scan.nextInt());
        } catch (Exceptions ex) {
            System.out.println(ex.getMessage());
        } catch (InputMismatchException in) {
            System.out.println("Жашыныз тамга менен жазылбайт");
        }

        try {
            System.out.println("Mail почтанызды жазыныз: ");
            regis.setMail(scan1.nextLine());
        } catch (Exceptions e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Пароль тузунуз:");
            regis.setPassword(scan1.nextLine());
        } catch (Exceptions e) {
            System.out.println(e.getMessage());
        }
    }
}