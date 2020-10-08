package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1303 extends Applet {
    Button brick, betton, clear;

    public void init() {
        setSize(1000, 900);

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
            tekenBrickMuur(getGraphics(), 50, 100, 400, 400);
        }
    }

    class buttonListenerBetton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekenbetonMuur(getGraphics(), 550, 100, 400, 400);
        }
    }

    class buttonListenerClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getGraphics().setColor(Color.white);
            getGraphics().fillRect(0,100,1000,700);
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

        //for loop horizontal lines
        for (int y = y1 + 20; y <= height + 80; y += 20) {
            g.drawLine(x1, y, x1 + width, y);
        }

        //start of vertical lines
        //int initializer
        int x;
        int vert1 = 0;
        int vert2 = 20;

        //whole for loop
        for (int i = y1; i < height + 80; i += 40) {

            //for loop row 1
            for (x = x1; x <= width + 60; x += 60) {

                g.drawLine(x, y1 + vert1, x, y1 + vert2);

            }

            //Y goes down
            vert1 += 20;
            vert2 += 20;

            //for loop row 2
            for (x = x1 + 30; x <= width + 60; x += 60) {

                g.drawLine(x, y1 + vert1, x, y1 + vert2);

            }

            //Y goes down
            vert1 += 20;
            vert2 += 20;
        }
        g2.setStroke(new BasicStroke(1));

        g.setColor(Color.black);
        g.drawRect(x1, y1, width, height);
        g.setColor(Color.white);

    }
    void tekenbetonMuur(Graphics g, int x1, int y1, int width, int height) {
        g.setColor(Color.gray);
        g.fillRect(x1, y1, width, height);

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));

        g.setColor(Color.black);
        for (int y = y1 + 40; y <= height + 80; y += 40) {
            g.drawLine(x1, y, x1 + width, y);
        }

        int x;
        int idkAnymore = 0;
        int idkAnymore1 = 40;

        for (int i = y1; i < height + 80; i += 80) {
            for (x = x1; x <= width; x += 40) {

                g.drawLine(x, y1 + idkAnymore, x, y1 + idkAnymore1);

            }
            idkAnymore += 40;
            idkAnymore1 += 40;

            for (x = x1 + 80; x <= width; x += 40) {

                g.drawLine(x, y1 + idkAnymore, x, y1 + idkAnymore1);

            }
            idkAnymore += 40;
            idkAnymore1 += 40;
        }
        g.setColor(Color.black);
        g.drawRect(x1, y1, width, height);

        g.setColor(Color.white);
    }
}
