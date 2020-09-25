package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1105 extends Applet {
    //controls!
    int blocklength = 30;
    int amountblocks = 5;

    //dont mind this
    int math;

    public void init() {
        math = 10 + (blocklength * amountblocks);
    }

    public void paint(Graphics g) {

        for (int cord = 10; cord < math; cord += blocklength) {
            g.drawRect(cord, cord, blocklength, blocklength);
        }

    }
}
