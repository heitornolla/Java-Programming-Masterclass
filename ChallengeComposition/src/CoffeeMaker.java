public class CoffeeMaker extends SmartKitchenItem{
    private boolean hasWorkToDo;

    public void setHasWorkToDo (boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee");
            setHasWorkToDo(false);
        }
    }
}
