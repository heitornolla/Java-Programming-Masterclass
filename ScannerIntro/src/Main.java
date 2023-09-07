import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getInputFromScanner();
    }

    public static String getInputFromScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        return "Thanks for introducing yourself!";
    }
}
