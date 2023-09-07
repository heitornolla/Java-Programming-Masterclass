public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen () {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffee, boolean fridge, boolean dish) {
        brewMaster.setHasWorkToDo(coffee);
        iceBox.setHasWorkToDo(fridge);
        dishWasher.setHasWorkToDo(dish);
    }

    public void doKitchenWork () {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
        System.out.println("Kitchen work done! \n");
    }


}
