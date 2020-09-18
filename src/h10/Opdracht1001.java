package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1001 extends Applet {
    TextField tekstvak;
    Label label;
    String pregetal;
    String error = "";
    double getal;
    double lastgetal;

    public void init() {
        tekstvak = new TextField("", 10);
        label = new Label("voer een getal in: ");

        tekstvak.addActionListener(new tekstlistener());

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("uw hoogste getal is tot nu toe: " + lastgetal, 20,50);
        g.drawString(error,20,80);
    }

    class tekstlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pregetal = tekstvak.getText();

            try {
                getal = Double.parseDouble(pregetal);
                error = "";

                if (getal > lastgetal) {
                    lastgetal = getal;
                }

                repaint();

            } catch (NumberFormatException i) {
                error = "dat is geen getal!";
                repaint();
            }

        }
    }
}
