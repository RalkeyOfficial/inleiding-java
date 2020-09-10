package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht0403 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        //pole
        g.setColor(Color.darkGray);
        g.fillRect(20,20,10,200);
        //flag Red
        g.setColor(Color.red);
        g.fillRect(30,20,120,30);
        //glag White
        g.setColor(Color.black);
        g.drawRect(30,20,120,90);
        //Flag Blue
        g.setColor(Color.blue);
        g.fillRect(30,80,120,30);
    }
}
