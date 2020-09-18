package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1005 extends Applet {
    TextField tekstvak;
    Label label;
    String preammcijfer;
    double numcijfer;
    int ammcijfer = 3;
    double cijfer[] = new double[ammcijfer];

    int timer = 0;
    int timer2 = 1;

    double eindcijfer;

    public void init() {
        tekstvak = new TextField("", 5);
        label = new Label("voer in hoeveel cijfers u hebt: ");

        tekstvak.addActionListener(new textListener());

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("uw eind cijfer is: " + eindcijfer, 20, 40);
    }

    class textListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            for (int a = 0; a < ammcijfer; a++){

                try {
                    if (timer < 1) {
                        preammcijfer = tekstvak.getText();
                        ammcijfer = Integer.parseInt(preammcijfer);

                        label = new Label("voer cijfer nummer " + timer2 + " in: ");
                        repaint();

                        timer++;
                        timer2++;
                    } else {
                        tekstvak.addActionListener(new textListener());

                        preammcijfer = tekstvak.getText();
                        numcijfer = Double.parseDouble(preammcijfer);

                        System.out.println("tot hier werkt ie");
                        cijfer[a-1] = numcijfer;

                        
                        label = new Label("voer cijfer nummer " + timer2 + " in: ");
                        repaint();

                        timer2++;

                        if (a == ammcijfer) {
                            for (int o = 0; o < ammcijfer; o++) {
                                eindcijfer =+ cijfer[o];

                                if (o == ammcijfer) {
                                    eindcijfer /= ammcijfer;
                                    repaint();
                                }

                            }

                        }

                    }

                }
                catch (NumberFormatException i) {
                    System.out.println("ERROR!");
                }
            }

        }
    }
}
