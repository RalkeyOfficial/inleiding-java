package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1103 extends Applet {
    int teller = 0;

    int getal1 = 0;
    int getal2 = 1;
    int getal3 = 1;

    int x = 0;

    public void init() {
        setSize(1400,200);
    }

    public void paint(Graphics g) {

        while (teller < 50) {

            x += 35;

            g.drawString("" + getal3, x, 10);
            getal3 = getal1 + getal2;
            getal1 = getal2;
            getal2 = getal3;
            teller++;
        }

    }
}
