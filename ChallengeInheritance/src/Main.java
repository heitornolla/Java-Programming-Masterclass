public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", 77001, "17/08/2023");
        System.out.println(tim);
        System.out.println(tim.getAge(2023));

        SalariedEmployee joe = new SalariedEmployee("Joe", "04/10/2000", 40000);
        HourlyEmployee mary = new HourlyEmployee("Mary", "18/05/2001", 40);

        System.out.println(joe);
        System.out.println(mary);
    }
}
