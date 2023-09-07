import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number to begin, or a character to exit");
            String entry = sc.nextLine();
            try {
                Integer.parseInt(entry);
            } catch (NumberFormatException e) {
                System.out.println("Goodbye!");
                break;
            }
        }
        }
    }