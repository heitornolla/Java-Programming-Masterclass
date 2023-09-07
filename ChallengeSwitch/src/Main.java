public class Main {
    public static void main(String[] args) {
        char letter = 'A';
//        switch (letter) {
//            case 'A':
//                System.out.println("Alpha");
//                break;
//            case 'B':
//                System.out.println("Baker");
//                break;
//            case 'C':
//                System.out.println("Charlie");
//                break;
//            default:
//                System.out.println("Not Alpha, nor Baker, nor Charlie");
//        }
        switch (letter) {
            case 'A' -> System.out.println("Alpha");
            case 'B' -> System.out.println("Baker");
            case 'C' -> System.out.println("Charlie");
            default -> System.out.println("Not Alpha, nor Baker, nor Charlie");
        }
    }
}
