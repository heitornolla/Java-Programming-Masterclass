public class Main {
    public static void main(String[] args) {
        int tester = 5;
        int counter = 0;
        while (tester <= 21 && counter < 5) {
            if (isEvenNumber(tester)) {
                counter++;
                System.out.println(tester + " is an even number");
            }
            tester++;
        }
    }

    public static boolean isEvenNumber(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
        }
    }
