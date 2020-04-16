package majewski.mateusz;

public class Printer {

    private int tonerLevel;
    private boolean isDuplex;
    private int pagesPrinted;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
        if (tonerLevel >= -1 && tonerLevel <= 100) {
            this.tonerLevel = -1;
        }
        pagesPrinted = 0;
    }

    public void fillToner(int toner) {
        if (toner < 0) {
            System.out.println("Error toner input");
        }
        tonerLevel += toner;

        System.out.println("The toner level is now " + tonerLevel + "%");
    }

    public void printPage(int pagesToPrint, boolean printDuplex) {
        pagesPrinted += pagesToPrint;
        if (printDuplex) {
            if (isDuplex) {
                System.out.println(pagesToPrint + " have been printed using duplex method.");
                System.out.println((int) Math.ceil(pagesToPrint / 2.00) + " paper sheets have been used.");
            }
        } else {
            System.out.println(pagesToPrint + " have been printed using single sided method.");
            System.out.println(pagesToPrint + " paper sheets have been used.");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }
}
