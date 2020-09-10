package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht0405 extends Applet {
    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(20,20,200,100,0,360);
    }
}
