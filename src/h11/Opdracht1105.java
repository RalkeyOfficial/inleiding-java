package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1105 extends Applet {
    int dim = 20;
    int cord;

    public void init() {

    }

    public void paint(Graphics g) {

        for (cord = 10; cord < 110; cord += 20) {
            g.drawRect(cord, cord, dim, dim);
        }

    }
}
