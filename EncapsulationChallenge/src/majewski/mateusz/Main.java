package majewski.mateusz;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(100, true);
	    printer.fillToner(20);
	    printer.printPage(21,true);
    }
}
