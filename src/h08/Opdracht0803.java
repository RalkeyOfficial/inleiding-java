package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Opdracht0803 extends Applet {
    String prijs1;
    double prijs2;
    double eindprijs;
    DecimalFormat df = new DecimalFormat("#.00");
    Label label;
    TextField tekstvak;
    Button knop;

    public void init() {
        label = new Label("voeg de prijs zonder BTW toe");
        tekstvak = new TextField("", 20);
        knop = new Button("Ok");

        tekstvak.addActionListener(new okButtonListener());
        knop.addActionListener(new okButtonListener());

        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Uw prijs met 21% BTW is: " + df.format(eindprijs), 20,50);
    }

    class okButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            prijs1 = tekstvak.getText();
            prijs2 = Double.parseDouble(prijs1);
            eindprijs = prijs2 / 100 * 121;
            repaint();
        }
    }
}
