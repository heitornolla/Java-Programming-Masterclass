public class Refrigerator extends SmartKitchenItem{
    private boolean hasWorkToDo;

    public void setHasWorkToDo (boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Food ordered");
            setHasWorkToDo(false);
        }
    }
}
