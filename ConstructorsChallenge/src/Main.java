public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer("Alo");
        Customer c3 = new Customer("Heitor", 500.00, "alomãe@gmail.com");
        Customer c4 = new Customer("Heitor", "Alopai@gmail.com");

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());
    }
}
