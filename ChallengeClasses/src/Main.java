public class Main {
    public static void main(String[] args) {

        bankAccount heitor = new bankAccount();
        heitor.setAccountNumber("118727-9");
        heitor.setBalance(1000.00);
        heitor.setOwnerName("Heitor");
        heitor.printAccountInfo();

        heitor.printBalance();

        heitor.deposit(heitor.getBalance(), 600);
        heitor.printBalance();

        heitor.withdraw(heitor.getBalance(), 800);
        heitor.printBalance();

        heitor.withdraw(heitor.getBalance(), 1000);
        heitor.printBalance();

        heitor.printAccountInfo();

    }
}
