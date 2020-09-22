package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht1 extends Applet {
    TextField tekstvak;
    int teller;
    int teller2 = 0;
    int awn[] = new int[10];
    int multi;
    int x;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\
    //                                                      \\
    // massive failure. rekenen is niet mijn sterkste punt  \\
    //                                                      \\
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\

    public void init() {
        tekstvak = new TextField("", 3);

        tekstvak.addActionListener(new textListener());

        add(tekstvak);
    }

    public void paint(Graphics g) {
        multi = 0;
        for (x = 5; x < 55; x += 10) {
            g.drawString(teller + " x " + multi + " = " + awn[teller2], 5, x);
            teller2++;
        }
    }

    class textListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            teller = Integer.parseInt(tekstvak.getText());

            for (int i = 0; i < 10; i++){
                awn[i] = teller * multi;
                multi++;
            }

            x = 5;

        }
    }
}
