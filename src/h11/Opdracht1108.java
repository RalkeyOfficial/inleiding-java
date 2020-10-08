package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1108 extends Applet {
    int dim = 10;

    public void init() {
        //
        setSize(800,800);
    }

    public void paint(Graphics g) {

        for (int x = 0; x < 50; x++) {
            g.drawOval(10,10,dim,dim);
            dim += 10;
        }

    }
}
