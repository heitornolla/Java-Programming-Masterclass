public class SalariedEmployee extends Worker{
    private double annualSalary;
    private boolean retired;


    public SalariedEmployee(String name, String birthDate, double annualSalary) {
        super(name, birthDate);
        this.annualSalary = annualSalary;
    }

    public void retire() {
        this.retired = true;
        System.out.println(super.getName() + "is Retired");
    }




}
