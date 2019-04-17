import java.io.IOException;
import java.lang.*;
import java.util.*;
import com.cezarydanilowski.Queue;

/**
 * Program implements data structure called queue, shows haw it works
 * @author Cezary Daniłowski
 * @version 1.0 2019-03-25
 */

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {
        Queue<String> names = new Queue("word".getClass(), 10);

        while (true) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            options();
            names.printQueue();

            choice(names);
        }
    }

    static void options() {
        System.out.println("Welcome! Queue initailisation\n");
        System.out.println("1. Add");
        System.out.println("2. Get first");
        System.out.println("3. Get last");
        System.out.println("4. Remove first");
        System.out.println("5. Remove last");
        System.out.println("6. Exit\n");
    }

    static void choice(Queue<String> names) throws InterruptedException {
        int choice;
        System.out.print("Select option: ");

        choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                if (names.getLastElement() < 10) {
                    System.out.print("Enter element to add: ");
                    String element = scanner.next();
                    names.add(element);
                    System.out.println();
                } else {
                    System.out.println("There's no more place!");
                }
                Thread.sleep(2000);
            } break;

            case 2: {
                if (names.getFirst() == null) {
                    System.out.println("There's nothing to show!\n");
                } else System.out.println(names.getFirst() + "\n");
                Thread.sleep(2000);
            } break;

            case 3: {
                if (names.getLast() == null) {
                    System.out.println("There's nothing to show!\n");
                } else System.out.println(names.getLast() + "\n");
                Thread.sleep(2000);
            } break;

            case 4: {
                if (names.getFirst() == null) {
                    System.out.println("There's nothing to remove!\n");
                } else names.removeFirst();
                Thread.sleep(2000);
            } break;

            case 5: {
                if (names.getLast() == null) {
                    System.out.println("There's nothing to remove!\n");
                } else names.removeLast();
                Thread.sleep(2000);
            } break;

            case 6: {
                scanner.close();
                System.exit(0);
            } break;

            default: {
                System.out.println("There's no such option!\n");
                Thread.sleep(2000);
            }
        }
    }
}
