
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       User us = new User();
        for (int i = 0; ; i++) {
           /* System.out.println("Введите имя: ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("Введите возраст:");
            int age = sc.nextInt();*/

            try {
                us.setName();
                us.setAge();
            } catch (IllegalNameLengthException e) {
                System.out.println(e.getMessage());
            } catch (IllegalAgeException ie) {
                System.out.println(ie.getMessage());
            }

        }


    }

}
