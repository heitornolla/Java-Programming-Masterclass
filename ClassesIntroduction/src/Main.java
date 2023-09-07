public class Main {
    public static void main(String[] args) {

        Car luciana = new Car();
        luciana.setMake("Volkswagen");
        luciana.setModel("T-Cross");
        luciana.setDoors(4);
        luciana.setColor("White");

        luciana.describeCar();

        Car heitor = new Car();

        heitor.setMake("Fiat");
        heitor.setModel("Argo");
        heitor.setDoors(4);
        heitor.setColor("Grey");

        heitor.describeCar();
    }
}
