import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal[] animals = {
                new Shark("белый", 30, "мужской"),
                new Turtle("зелёный", 300, "мужской"),
                new Eagle("чорный", 10, "женский")
        };
        System.out.println("ВЕДИТЕ СВЕТ ЖИВОТНОГО КОТОРОГО ХОТИТЕ ПОЛУЧИТЬ");
        String color = scanner.next();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getColor().contains(color)) {
                System.out.println(animals[i]);
            }
        }

        System.out.println("Ведите гендер животного которого хотите получить");
        String gender = scanner.next();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getGender().contains(gender)) {
                System.out.println(animals[i]);
            }
        }
    }

}
