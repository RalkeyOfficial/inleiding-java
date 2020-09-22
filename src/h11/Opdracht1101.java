package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1101 extends Applet {
    int teller;
    int y;

    public void init() {
        y = 0;
    }

    public void paint(Graphics g) {

        for (teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawLine(50, y, 300, y);
            g.drawString("" + teller, 305, y);
        }

    }

}
