package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1109 extends Applet {


    public void init() {
        setSize(900,900);
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int kolom;

        for (int i = 0; i < 4; i++) {

            for (kolom = 0; kolom < 8; kolom++){
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 100, 100);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 100, 100);
                }
                x += 100;
            }
            x = 50;
            y += 100;

            for (kolom = 0; kolom < 8; kolom++){
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 100, 100);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 100, 100);
                }
                x += 100;
            }
            x = 50;
            y += 100;
        }
        g.drawRect(50,50,800,800);

    }
}
