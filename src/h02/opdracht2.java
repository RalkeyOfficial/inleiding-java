package h02;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet
{
    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Thijn", 50, 50);

        g.setColor(Color.red);
        g.drawString("Douwma", 50, 70);
    }
}
