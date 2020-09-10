package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht0407 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.fillRoundRect(5,5,210,210,50,50);
        g.setColor(Color.white);
        g.fillRoundRect(10, 10, 200, 200, 50, 50);
        g.setColor(Color.black);
        g.fillOval(30, 30, 40, 40);
        g.fillOval(150, 30, 40, 40);
        g.fillOval(30, 150, 40, 40);
        g.fillOval(150, 150, 40, 40);
    }
}
