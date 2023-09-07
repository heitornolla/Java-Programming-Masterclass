public class HourlyEmployee extends Worker{
    private double hourlyPay;

    public HourlyEmployee(String name, String birthDate, double hourlyPay) {
        super(name, birthDate);
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }
}
