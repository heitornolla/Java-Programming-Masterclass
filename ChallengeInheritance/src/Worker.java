public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public String getName() {
        return name;
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker() {};

    public int getAge(int currentYear) {
        int birthYear = Integer.parseInt(this.birthDate.substring(6));
        return (currentYear - birthYear);
    }

    void collectPay() {
        System.out.println("Payment collected");
    }

    void terminate(String endDate) {
        this.endDate = endDate;
        System.out.println("Employee Terminated");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
