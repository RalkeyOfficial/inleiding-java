package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht0602 extends Applet {
    int seconds = 1;
    int minut;
    int hours;
    int days;
    int year;

    public void init() {
        minut = seconds * 60;
        hours = minut * 60;
        days = hours * 24;
        year = days * 365;
    }

    public void paint(Graphics g) {
        g.drawString("there are " + hours + " seconds in a hour", 10, 10);
        g.drawString("there are " + days + " seconds in a day", 10, 30);
        g.drawString("there are " + year + " seconds in a year", 10, 50);
    }
}
