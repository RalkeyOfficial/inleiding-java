package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1303 extends Applet {
    Button brick, betton, clear;

    public void init() {
        setSize(550, 900);

        brick = new Button("Brick");
        betton = new Button("betton");
        clear = new Button("clear");

        brick.addActionListener(new buttonListenerBrick());
        betton.addActionListener(new buttonListenerBetton());
        clear.addActionListener(new buttonListenerClear());

        add(brick);
        add(betton);
        add(clear);
    }

    public void paint(Graphics g) {

    }

    class buttonListenerBrick implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            tekenBrickMuur(g, 10, 110, 400, 400);
        }
    }

    class buttonListenerBetton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            tekenbetonMuur(g, 500, 110, 400, 400);
        }
    }

    class buttonListenerClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            g.setColor(Color.white);
//            g.fillRect(0,0,1000,1000);
        }
    }

    void tekenBrickMuur(Graphics g, int x1, int y1, int width, int height) {
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
        int idkAnymore = 0;
        int idkAnymore1 = 20;

        for (int i = y1; i < height; i += 40) {
            for (x = x1; x <= width; x += 60) {

                g.drawLine(x, y1 + idkAnymore, x, y1 + idkAnymore1);

            }
            idkAnymore += 20;
            idkAnymore1 += 20;

            for (x = x1 + 30; x <= width; x += 60) {

                g.drawLine(x, y1 + idkAnymore, x, y1 + idkAnymore1);

            }
            idkAnymore += 20;
            idkAnymore1 += 20;
        }
        g2.setStroke(new BasicStroke(1));

        g.setColor(Color.black);
        g.drawRect(x1, y1, width, height);

    }
    void tekenbetonMuur(Graphics g, int x1, int y1, int width, int height) {
        g.setColor(Color.darkGray);
        g.fillRect(x1, y1, width, height);

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));

        g.setColor(Color.black);
        for (int y = y1 + 20; y <= height + 20; y += 20) {
            g.drawLine(x1, y, x1 + width, y);
        }

        int x;
        int idkAnymore = 0;
        int idkAnymore1 = 20;

        for (int i = y1; i < height; i += 80) {
            for (x = x1; x <= width; x += 100) {

                g.drawLine(x, y1 + idkAnymore, x, y1 + idkAnymore1);

            }
            idkAnymore += 40;
            idkAnymore1 += 40;

            for (x = x1 + 50; x <= width; x += 60) {

                g.drawLine(x, y1 + idkAnymore, x, y1 + idkAnymore1);

            }
            idkAnymore += 40;
            idkAnymore1 += 40;
        }
        g.setColor(Color.black);
        g.drawRect(x1, y1, width, height);

    }
}
