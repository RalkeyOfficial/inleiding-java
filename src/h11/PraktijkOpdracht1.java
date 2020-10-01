package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PraktijkOpdracht1 extends Applet {
    TextField tekstvak1;
    Label label;
    Button knop;
    int cijfer, teller;
    int y = 10;

    public void init() {
        setSize(200, 300);

        label = new Label("vul een getal in:");
        tekstvak1 = new TextField("", 10);
        knop = new Button("OK");

        knop.addActionListener(new KnopListener());
        tekstvak1.addActionListener(new KnopListener());

        add(label);
        add(tekstvak1);
        add(knop);
    }

    public void paint(Graphics g) {
        for(teller = 1; teller <= 10; teller++) {
            y += 20;
            g.drawString("" +teller*cijfer, 10, y);
        }
        y = 10;
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer = Integer.parseInt(tekstvak1.getText());
            repaint();
        }
    }
}