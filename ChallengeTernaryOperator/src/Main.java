public class Main {
    public static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00d;

        double result = (firstValue + secondValue) * 100;

        result %= 40.00;

        boolean isTrue = (result == 0) ? true : false;

        if (isTrue) {
            System.out.println("No remainder!");
        }

        else {
            System.out.println("Some remainder.");
            }
        }
    }
