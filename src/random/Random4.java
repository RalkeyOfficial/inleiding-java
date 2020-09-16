package random;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Random4 extends Applet {
    TextField tekstvak;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("OK");
        knop.addActionListener(new knoplistener());
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {

    }

    class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("nu is het iets anders :)");
            repaint();
        }
    }
}
