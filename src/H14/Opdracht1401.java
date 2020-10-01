package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1401 extends Applet {
    Button randomize;
    double randomKaarten, randomNummer;
    int choice1, choice2 = 0;
    String[] kaarten = { "Harten", "Schoppen", "Ruiten", "Klaver" };
    String[] nummer = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer", "aas" };

    public void init() {
        randomize = new Button("Randomize");

        randomize.addActionListener(new getButtonState());

        add(randomize);
    }

    public void paint(Graphics g) {
       g.drawString(kaarten[choice1] + " " + nummer[choice2], 50, 50);
    }

    class getButtonState implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            randomKaarten = Math.random();
            randomNummer = Math.random();

            choice1 = (int)(randomKaarten * kaarten.length + 0);
            choice2 = (int)(randomKaarten * nummer.length + 0);
            System.out.println(">> debug: " + choice1);
            System.out.println(">> debug: " + choice2);
            System.out.println("<*>------------------------<*>");
            repaint();

        }
    }

}
