package h02;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet
{
    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Thijn Douwma", 50, 50);
    }
}
