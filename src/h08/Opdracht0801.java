package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht0801 extends Applet {
    TextField tekst;
    Label label;
    Button ok;
    Button reset;
    String t;

    public void init() {
        label = new Label("Type iets in: ");
        tekst = new TextField("",30);
        ok = new Button("Go!");
        reset = new Button("Reset");

        tekst.addActionListener(new okKnopListener());
        ok.addActionListener(new okKnopListener());
        reset.addActionListener(new resetKnopListener());

        add(label);
        add(tekst);
        add(ok);
        add(reset);

    }

    public void paint(Graphics g) {
        g.drawString(t, 20, 60);
    }

    class okKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t = tekst.getText();
            repaint();
        }
    }

    class resetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t = "";
            tekst.setText("");
            repaint();
        }
    }
}
