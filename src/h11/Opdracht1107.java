package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1107 extends Applet {
    int cord;
    int dim = 10;

    public void init() {
        setSize(800, 800);
    }

    public void paint(Graphics g) {
        //guide lines
        g.setColor(Color.gray);
        g.drawLine(400, 0, 400, 800);
        g.drawLine(0, 400, 800, 400);
        g.drawString("guide lines", 330, 10);

        g.setColor(Color.black);

        for (cord = 395; cord > 145; cord -= 5) {
            g.drawOval(cord, cord, dim, dim);
            dim += 10;
        }

    }
}
