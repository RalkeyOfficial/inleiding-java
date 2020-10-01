package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1302 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        tekenMuur(g, 20,20,300,400);
    }

    void tekenMuur(Graphics g, int x1, int y1, int width, int height) {
        Color brickColor = new Color(183, 50, 57);
        g.setColor(brickColor);
        g.fillRect(x1, y1, width, height);

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));

        g.setColor(Color.white);
        for (int y = y1 + 20; y <= height + 20; y += 20) {
            g.drawLine(x1, y, x1 + width, y);
        }

        int x;
        int vert1 = 0;
        int vert2 = 20;

        for (int i = y1; i < height; i += 40) {
            for (x = x1; x <= width; x += 60) {

                g.drawLine(x, y1 + vert1, x, y1 + vert2);

            }
            vert1 += 20;
            vert2 += 20;

            for (x = x1 + 30; x <= width; x += 60) {

                g.drawLine(x, y1 + vert1, x, y1 + vert2);

            }
            vert1 += 20;
            vert2 += 20;
        }
        g2.setStroke(new BasicStroke(1));

        g.setColor(Color.black);
        g.drawRect(x1, y1, width, height);

    }
}
