public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel < 0 ? 0 : tonerLevel > 100 ? 100 : tonerLevel;
        this.pagesPrinted = pagesPrinted < 0 ? 0 : pagesPrinted;
        this.duplex = duplex;
    }

    public Printer() {
        this(100, 0, false);
    }

    public int addToner(int toner) {
        if (tonerLevel + toner > 100 || tonerLevel + toner < -1) {
            return -1;
        }
        return tonerLevel + toner;
    }

    public void printPages(int pages) {
        if (pages < 0) {
            System.out.println("Invalid pages number");
        } else {
            if (duplex) {
                int totalPagesToPrint = pages % 2 == 0 ? pages / 2 : (pages / 2) + 1;
                System.out.println(
                        "This duplex printer has printed total: " + (pagesPrinted + totalPagesToPrint) + " pages");
                pagesPrinted += totalPagesToPrint;
            } else {
                System.out.println("This printer has printed total: " + (pagesPrinted + pages) + " pages");
                pagesPrinted += pages;
            }
        }
    }
}
