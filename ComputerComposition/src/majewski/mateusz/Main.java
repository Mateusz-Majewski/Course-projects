package majewski.mateusz;

import javax.swing.text.html.CSS;

public class Main {

    public static void main(String[] args) {
        Dimension dimension = new Dimension(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240", dimension);

	    Resolution resolution = new Resolution(1920, 1080);
	    Monitor monitor = new Monitor("27DSAI", "Samsung", 27, resolution);

	    Motherboard motherboard = new Motherboard("227E", "Asus", 4, 3, "v2.11");

	    PC pc = new PC(theCase, monitor, motherboard);

	    pc.powerUp();

//	    pc.getMonitor().drawPixel(1200, 600, "blue");
//	    pc.getMotherboard().loadProgram("Chrome");
//	    pc.getTheCase().pressPowerButton();

    }
}
