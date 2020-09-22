package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1005 extends Applet {
    TextField tekstvak;
    Label label;
    Button reset;
    String error;
    int aantal;
    double totaal;
    double gemiddelde;

    public void init() {
        aantal = 0;
        totaal = 0;
        gemiddelde = 0;

        setSize(260,150);
        tekstvak = new TextField("",5);
        label = new Label("voer uw cijfers in:");
        reset = new Button("reset");

        tekstvak.addActionListener(new textListener());
        reset.addActionListener(new resetListener());

        add(label);
        add(tekstvak);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString("uw gemiddelde cijfer is: " + gemiddelde, 20, 50);
        g.drawString(error,20,70);
    }

    class textListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            try {
                aantal++;
                totaal += Double.parseDouble(tekstvak.getText());
                gemiddelde = totaal / aantal;

                System.out.println("aantal is: " + aantal);
                System.out.println("totaal is: " + totaal);
                System.out.println("gemiddelde is: " + gemiddelde);

                tekstvak.setText("");
                error = "";
            }
            catch (NumberFormatException i) {
                error = "hey hey hey. dat is geen nummer";
                tekstvak.setText("");
            }
            repaint();

        }
    }

    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal = 0;
            totaal = 0;
            gemiddelde = 0;
            tekstvak.setText("");
            error = "";
            repaint();
        }
    }

}
