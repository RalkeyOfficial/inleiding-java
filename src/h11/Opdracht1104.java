package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1104 extends Applet {
    int teller;
    int awn;
    int drie = 3;
    int y = 10;

    public void init() {

    }

    public void paint(Graphics g) {

        for (teller = 0; teller <= 10; teller++) {
            awn = teller * drie;
            g.drawString(teller + " x " + drie + " = " + awn, 10, y);
            y += 10;
        }

    }
}
