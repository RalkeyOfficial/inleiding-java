package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1002 extends Applet {
    TextField tekstvak;
    Label label;
    String pregetal;
    String error = "";
    double getal;
    double lastgetal;
    double smalllastgetal;
    int timer = 1;

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
        g.drawString("uw kleinste getal tot nu toe is:" + smalllastgetal, 20, 70);
        g.drawString(error,20,100);
    }

    class tekstlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pregetal = tekstvak.getText();

            //try een string naar double veranderen. als dat niet kan ga naar catch
            try {
                getal = Double.parseDouble(pregetal);
                error = "";

                //checker voor als getal grooter is dan vorige
                if (getal > lastgetal) {
                    lastgetal = getal;

                    //dit doet precies 1 keer de kleinste getal preseten. anders werkt de kleinste getal counter niet!
                    if (timer == 1) {
                        smalllastgetal = getal;
                        timer++;
                    }

                }
                //checker voor kleinste getal
                if (getal < smalllastgetal) {
                    smalllastgetal = getal;
                }

                repaint();

            }
            //catch errors dat veroorzaak worden door tekst
            catch (NumberFormatException i) {
                error = "dat is geen getal!";
                repaint();
            }

        }
    }
}
