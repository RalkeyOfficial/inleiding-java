package H13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht1301 extends Applet {


    public void init() {
        setSize(800,800);
    }

    public void paint(Graphics g) {
        TekenBoom(g, 10, 10, 200);
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
