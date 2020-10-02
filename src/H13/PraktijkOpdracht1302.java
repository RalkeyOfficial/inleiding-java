package H13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht1302 extends Applet {
    Double ran1, ran2;

    public void init() {
        setSize(800, 800);
        ran1 = Math.random();
        ran2 = Math.random();
    }

    public void paint(Graphics g) {
        Color darkGreen = new Color(10, 90, 0);
        Color darkerGreen = new Color(7, 59, 0);

        g.setColor(darkGreen);
        g.fillRect(0, 150, 800, 650);

        g.setColor(darkerGreen);
        g.fillPolygon(new int[] {400, 800, 0}, new int[] {100, 800, 800}, 3 );

        g.setColor(Color.white);
        g.fillRect(0, 0, 800, 150);

        //row 1
        TekenBoom(g, -20, 160, 80);
        TekenBoom(g, 135, 150, 80);
        TekenBoom(g, 300, 140, 80);
        TekenBoom(g, 465, 155, 80);
        TekenBoom(g, 620, 150, 80);

        //row2
        TekenBoom(g, -130, 348, 160);
        TekenBoom(g, 40, 340, 160);
        TekenBoom(g, 200, 350, 160);
        TekenBoom(g, 400, 360, 160);
        TekenBoom(g, 600, 350, 160);

    }

    void TekenBoom(Graphics g, int x, int y, int size) {

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        Color brown = new Color(80, 40, 20);
        g.setColor(brown);

        //trunk
        g.fillRect(x + size, y + size, size / 5, size);

        //branches
        g2.setStroke(new BasicStroke((float) (size / 12.5)));
        g.drawLine(x + size, y + size, x + (size / 4 * 3), y + (size / 4 * 3) );
        g.drawLine(x + size + (size / 5), y + size, x + size + (size / 4 * 2), y + (size / 4 * 3) );

        //trunk branches
        g.drawLine(x + size, y + (size * 2 - (size / 30)), x + (size / 5 * 4), y + (size * 2 + (size / 50)) );
        g.drawLine(x + size + (size / 5), y + (size * 2 - (size / 30)), x + size + (size / 5 * 2), y + (size * 2 + (size / 50)) );

        //leaves
        g2.setStroke(new BasicStroke(1));
        g.setColor(Color.green);
        g.fillOval(x + size / 4, y + size / 4, size / 4 * 3, size / 4 * 3);
        g.fillOval(x + size / 8 * 6, y + size / 15, size / 4 * 3, size / 4 * 3);
        g.fillOval(x + size + (size / 5), y + size / 4, size / 4 * 3, size / 4 * 3);

    }
}
