package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.Button;

public class Opdracht1202 extends Applet {
    Button knop[] = new Button[25];

    public void init() {
        for (int i = 0; i < 25; i++) {
            knop[i] = new Button("" + i);
            add(knop[i]);
        }

    }

    public void paint(Graphics g) {

    }
}
