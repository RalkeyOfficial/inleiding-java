package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1205 extends Applet {
    TextField tekstvak;
    boolean gevonden;
    double[] getal = { 100,200,300,500,600,69,420,42069,69420 };
    double search;
    int index;
    String text1 = "";
    String indextext = "";
    String nummertext = "";

    public void init() {
        gevonden = false;
        tekstvak = new TextField("", 10);

        tekstvak.addActionListener(new textListener());

        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(text1, 20,20);
        g.drawString(indextext, 20, 40);
        g.drawString(nummertext, 20, 60);

    }

    class textListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            search = Double.parseDouble(tekstvak.getText());

            int teller = 0;
            while (teller < getal.length) {
                if (getal[teller] == search) {
                    gevonden = true;
                    index = teller;
                    break;
                } else {
                    gevonden = false;
                }
                teller++;

            }

            if (gevonden == true) {
                text1 = "Nummer gevonden!";
                indextext = "Index is: " + index;
                nummertext = "Nummer is: " + getal[teller];
            } else {
                text1 = "Nummer niet gevonden";
                indextext = "";
                nummertext = "";
            }
            repaint();
        }
    }
}