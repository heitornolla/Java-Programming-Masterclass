public class DishWasher extends SmartKitchenItem{
    private boolean hasWorkToDo;

    public void setHasWorkToDo (boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Doing Dishes");
            setHasWorkToDo(false);
        }
    }
}
