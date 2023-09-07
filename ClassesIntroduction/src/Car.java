public class Car {
    private String make;
    private String color;
    private String model;
    private int doors;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void describeCar() {
        System.out.println("Made by " + make + " model " + model + " " + doors + " doors");
    }

}
