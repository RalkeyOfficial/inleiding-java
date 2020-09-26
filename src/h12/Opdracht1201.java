package h12;

import java.applet.Applet;
import java.awt.*;
import java.text.DecimalFormat;

public class Opdracht1201 extends Applet {
    int x;
    double p;
    double getalen[] = {3.4, 5.6, 8, 7.8, 6.9, 5.3, 8.2, 4.6, 7.3, 6};
    DecimalFormat df = new DecimalFormat("#.0");

    public void init() {
        x = 10;
    }

    public void paint(Graphics g) {
        for (int i = 0; i < getalen.length; i++) {
            g.drawString("" + getalen[i], x, 10);
            x += 20;
            p += getalen[i];
        }

        g.drawString("" + df.format(p / getalen.length), 10, 25);
    }
}
