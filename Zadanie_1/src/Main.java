import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            Animals animals = null;
            System.out.println("""
                    Какое животное вы хотите выбрать?
                    1. собака
                    2. кошка
                    3. попугай
                    0. Выход
                    """);
            switch (scanner.nextInt()) {
                case 1 -> animals = new Dogs();
                case 2 -> animals = new Cats();
                case 3 -> animals = new Parrots();
                case 0 -> System.exit(0);
            }
            animals.print();
        } while (true);


    }
}