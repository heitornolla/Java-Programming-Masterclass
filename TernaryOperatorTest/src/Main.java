// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String makeOfCar = "Volkswagen";
        boolean isFiat = makeOfCar == "Volkswagen" ? false : true;
        if (isFiat) {
            System.out.println("Made by Fiat!");
        }

        if (!isFiat) {
            System.out.println("Not a Fiat-made car.");
        }
    }
}
