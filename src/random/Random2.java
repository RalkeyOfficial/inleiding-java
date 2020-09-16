package random;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Random2 extends Applet {
    Button stupidfy;
    String text;
    Color background;
    Color box;

    public void init() {
        text = "";

        background = new Color(192, 174, 198);
        box = new Color(0,0,0);

        stupidfy = new Button("Stupidfy");

        buttonchecker kn = new buttonchecker();
        stupidfy.addActionListener(kn);

        add(stupidfy);
    }

    public void paint(Graphics g) {
        setBackground(background);

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(5));
        g.setColor(box);
        g.drawRect(20,40, 60,80);

        g.drawString(text, 20, 140);
    }

    class buttonchecker implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            background = new Color(30, 56, 134);
            box = new Color(224, 239, 7);
            text = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!!";
            repaint();
        }
    }
}
