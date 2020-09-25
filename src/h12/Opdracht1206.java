package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1206 extends Applet {
    TextField tekstvak;
    double search;
    double[] array = { 10,10,10,10,20,30,30,69,69,69,50,50,50,50,50,50 };
    boolean found;
    String text;
    String ammtext;
    String numtext;

    public void init() {
        tekstvak = new TextField("", 10);

        tekstvak.addActionListener(new tekstListener());

        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(text, 40, 40);
        g.drawString(ammtext, 40, 60);
        g.drawString(numtext, 40, 80);
    }

    class tekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            search = Double.parseDouble(tekstvak.getText());
            found = false;

            int ammarray = 0;
            int y = 0;
            int teller = 0;
            while (teller < array.length) {
                if (array[teller] == search) {
                    ammarray++;
                    found = true;
                    y = teller;
                }
                teller++;
            }

            if (found == true) {
                text = "Nummer Gevonden!";
                ammtext = "Hoeveelhijd: " + ammarray;
                numtext = "Nummer: " + array[y];
            } else {
                text = "Nummer niet gevonden";
                ammtext = "";
                numtext = "";
            }
            repaint();
        }
    }
}
