public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        this.tonerLevel = tonerLevel + tonerAmount;
        if (this.tonerLevel > 100) {
            this.tonerLevel = 100;
        }

        if (this.tonerLevel < 0) {
            this.tonerLevel = 0;
            System.out.println("Toner empty");
        }
        return this.tonerLevel;
    }

    public int printPages(int pagesToPrint) {
        this.pagesPrinted = pagesPrinted + pagesToPrint;
        return this.pagesPrinted;
    }

}
