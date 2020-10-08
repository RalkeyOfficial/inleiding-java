package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1003 extends Applet {
    TextField tekstvak;
    Label label;
    String premaandnumb = "";
    int maandnumb;
    String maandnaam = "";
    int maanddagen;
    String error1 = "";

    public void init() {
        setSize(450, 150);

        setFont(new Font("Arial", Font.PLAIN, 15));
        label = new Label("voer in een nummer van een maand tussen 1 - 12: ");
        tekstvak = new TextField("", 2);

        tekstvak.addActionListener(new tekstlistener());

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.PLAIN, 15));
        g.drawString("de naam van de maand is '" + maandnaam + "'", 0, 50);
        g.drawString("de hoeveelheid aan dagen in de maand is: " + maanddagen, 0, 70);
        g.drawString(error1, 20, 100);
    }

    class tekstlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            premaandnumb = tekstvak.getText();

            try {
                maandnumb = Integer.parseInt(premaandnumb);

                switch (maandnumb) {
                    case 1:
                        maandnaam = "Januari";
                        maanddagen = 31;
                        error1 = "";
                        break;
                    case 2:
                        maandnaam = "Februari";
                        maanddagen = 28;
                        error1 = "";
                        break;
                    case 3:
                        maandnaam = "Maart";
                        maanddagen = 31;
                        error1 = "";
                        break;
                    case 4:
                        maandnaam = "April";
                        maanddagen = 30;
                        error1 = "";
                        break;
                    case 5:
                        maandnaam = "Mei";
                        maanddagen = 31;
                        error1 = "";
                        break;
                    case 6:
                        maandnaam = "Juni";
                        maanddagen = 30;
                        error1 = "";
                        break;
                    case 7:
                        maandnaam = "Juli";
                        maanddagen = 31;
                        error1 = "";
                        break;
                    case 8:
                        maandnaam = "Augustus";
                        maanddagen = 31;
                        error1 = "";
                        break;
                    case 9:
                        maandnaam = "September";
                        maanddagen = 30;
                        error1 = "";
                        break;
                    case 10:
                        maandnaam = "Oktober";
                        maanddagen = 31;
                        error1 = "";
                        break;
                    case 11:
                        maandnaam = "November";
                        maanddagen = 30;
                        error1 = "";
                        break;
                    case 12:
                        maandnaam = "December";
                        maanddagen = 31;
                        error1 = "";
                        break;
                    default:
                        error1 = "ERROR: dat is geen nummer tussen 1 en 12";
                }

                repaint();
            }
            catch (NumberFormatException i) {
                error1 = "ERROR: dat is geen nummer";
                repaint();
            }

        }
    }
}
