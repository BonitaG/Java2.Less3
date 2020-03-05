import java.util.Scanner;

public class User {

    private String name;
    private int age;


    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName() throws IllegalNameLengthException {
        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.length()> 20) {
            throw new IllegalNameLengthException("Слишком длинное имя");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        System.out.println("Введите возраст");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 100 || age < 0) {
            throw new IllegalAgeException("Неправильно указали возраст");
        }
        this.age = age;
    }
}
