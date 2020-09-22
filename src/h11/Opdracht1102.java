package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1102 extends Applet {
    int teller;
    int x;

    public void init() {
        x = 0;
        teller = 20;
    }

    public void paint(Graphics g) {

        while (teller >= 10) {
            x += 20;
            g.drawString("" + teller, x, 10);
            teller--;
        }

    }

}
