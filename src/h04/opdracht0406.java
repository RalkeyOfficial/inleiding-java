package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht0406 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(20,20,60,160);
        g.fillRect(40,180,20,60);

        g.setColor(Color.red);
        g.fillOval(30,30,40,40);

        g.setColor(Color.orange);
        g.fillOval(30,80,40,40);

        g.setColor(Color.green);
        g.fillOval(30,130,40,40);
    }
}
