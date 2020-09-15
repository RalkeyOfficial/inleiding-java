package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht0603 extends Applet {
    int a = 2147483647;
    int b = 2147483647;
    int c;
    String end;

    public void init() {
        c = a + b;
        end = "'+' number + '+' number = '-' number            awnser:  " + c;
    }

    public void paint(Graphics g) {
        g.drawString(end, 10, 10);
    }
}
