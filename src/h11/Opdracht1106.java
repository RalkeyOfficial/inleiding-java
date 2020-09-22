package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1106 extends Applet {
    int cord;
    int dim = 10;

    public void init() {
        setSize(400,400);
    }

    public void paint(Graphics g) {
        //guide lines
        g.setColor(Color.gray);
        g.drawLine(200,0,200,400);
        g.drawLine(0,200,400,200);
        g.drawString("guide lines", 130,10);

        g.setColor(Color.black);

        for (cord = 195; cord > 145; cord -= 10) {
            g.drawOval(cord, cord, dim, dim);
            dim += 20;
        }

    }
}
