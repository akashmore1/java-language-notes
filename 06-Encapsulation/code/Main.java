public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println(printer.addToner(-70));
        printer.printPages(40);
        printer.printPages(300);

        Printer printerDuplex = new Printer(100, 1000, true);
        printerDuplex.printPages(40);
        printerDuplex.printPages(300);
    }
}
