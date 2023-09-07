public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Yorkshire", "Big", 35);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void move(String speed) {
        super.move(speed);
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }

    }


    private void bark () {
        System.out.println("Woof");
    }

    private void run () {
        System.out.println("Running");
    }
    private void walk () {
        System.out.println("Walking");
    }
    private void wagTail () {
        System.out.println("Tail wagging");
    }
}
