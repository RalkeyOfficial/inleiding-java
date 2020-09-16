package random;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Random3 extends Applet {
    TextField tekst;
    Label label;
    String s;

    public void init() {
        tekst = new TextField("", 20);
        label = new Label("type iets in het text vakje " + "en klik op Enter");
        tekst.addActionListener(new textfieldListener());
        add(label);
        add(tekst);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString(s,20,100);
    }

    class textfieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s = tekst.getText();
            repaint();
        }
    }
}
