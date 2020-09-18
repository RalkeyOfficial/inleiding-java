package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaktijkOpdracht10 extends Applet {
    TextField tekstvak;
    Label label;
    Label label2;
    String precijfer;
    int cijfer;
    String cijfertext = "";
    String error = "";


    public void init() {
        tekstvak = new TextField("", 5);
        label = new Label("Voer uw cijfer in: ");
        label2 = new Label("(moet tussen 1 - 10 zijn)");

        tekstvak.addActionListener(new textListener());

        add(label);
        add(tekstvak);
        add(label2);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("Uw uitslag is: " + cijfertext, 20, 50);
        g.drawString(error,20,80);
    }

    class textListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            precijfer = tekstvak.getText();

            try {
                cijfer = Integer.parseInt(precijfer);

                switch (cijfer) {
                    case 1:
                        cijfertext = "Slecht";
                        error = "";
                        break;
                    case 2:
                        cijfertext = "Slecht";
                        error = "";
                        break;
                    case 3:
                        cijfertext = "Slecht";
                        error = "";
                        break;
                    case 4:
                        cijfertext = "Onvoldoende";
                        error = "";
                        break;
                    case 5:
                        cijfertext = "Matig";
                        error = "";
                        break;
                    case 6:
                        cijfertext = "Voldoende";
                        error = "";
                        break;
                    case 7:
                        cijfertext = "Voldoende";
                        error = "";
                        break;
                    case 8:
                        cijfertext = "Goed";
                        error = "";
                        break;
                    case 9:
                        cijfertext = "Goed";
                        error = "";
                        break;
                    case 10:
                        cijfertext = "Goed";
                        error = "";
                        break;
                    default:
                        error = "dat is geen nummer tussen 1 - 10";
                        cijfertext = "";
                }

            }
            catch (NumberFormatException i) {
                error = "dat is geen nummer";
                cijfertext = "";
            }

            repaint();
        }
    }
}
