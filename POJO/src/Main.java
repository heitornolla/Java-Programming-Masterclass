public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            Student s = new Student("173232" + i * i, switch (i) {
//                case 1 -> "Heitor";
//                case 2 -> "Nataly";
//                case 3 -> "Victor";
//                case 4 -> "Pedro";
//                case 5 -> "Rian";
//                default -> "Anônimo";
//            }, "01/06/2002",
//                    "Java Masterclass");
//            System.out.println(s);
//        for (int i = 1; i <= 5; i++) {
//            LPAStudent s = new LPAStudent("173232" + i * i, switch (i) {
//                case 1 -> "Heitor";
//                case 2 -> "Nataly";
//                case 3 -> "Victor";
//                case 4 -> "Pedro";
//                case 5 -> "Rian";
//                default -> "Anônimo";
//            }, "01/06/2002",
//                    "Java Masterclass");
//            System.out.println(s);
//        }

        Student pojoStudent = new Student("173233", "Heitor", "01/06/2002", "Java");
        LPAStudent recordStudent = new LPAStudent("260664", "Rian", "14/07/2004", "Java");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);
    }
}
