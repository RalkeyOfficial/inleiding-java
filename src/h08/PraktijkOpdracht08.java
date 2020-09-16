package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht08 extends Applet {
    TextField numb1;
    TextField numb2;
    String tel1;
    String tel2;
    double val1;
    double val2;
    double eindnumb;
    Button plus;
    Button minus;
    Button times;
    Button slash;

    public void init() {
        setSize(400,100);

        numb1 = new TextField("", 10);
        numb2 = new TextField("", 10);
        plus = new Button("+");
        minus = new Button("-");
        times = new Button("x");
        slash = new Button("/");

        plus.addActionListener(new plusButton());
        minus.addActionListener(new minusButton());
        times.addActionListener(new timesButton());
        slash.addActionListener(new slashButton());

        add(numb1);
        add(numb2);
        add(plus);
        add(minus);
        add(times);
        add(slash);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("Awnser: " + eindnumb, 50, 60);
    }

    class plusButton implements ActionListener {
        public void actionPerformed(ActionEvent e){
            tel1 = numb1.getText();
            tel2 = numb2.getText();
            val1 = Double.parseDouble(tel1);
            val2 = Double.parseDouble(tel2);
            eindnumb = val1 + val2;
            repaint();
        }
    }
    class minusButton implements ActionListener {
        public void actionPerformed(ActionEvent e){
            tel1 = numb1.getText();
            tel2 = numb2.getText();
            val1 = Double.parseDouble(tel1);
            val2 = Double.parseDouble(tel2);
            eindnumb = val1 - val2;
            repaint();
        }
    }
    class timesButton implements ActionListener {
        public void actionPerformed(ActionEvent e){
            tel1 = numb1.getText();
            tel2 = numb2.getText();
            val1 = Double.parseDouble(tel1);
            val2 = Double.parseDouble(tel2);
            eindnumb = val1 * val2;
            repaint();
        }
    }
    class slashButton implements ActionListener {
        public void actionPerformed(ActionEvent e){
            tel1 = numb1.getText();
            tel2 = numb2.getText();
            val1 = Double.parseDouble(tel1);
            val2 = Double.parseDouble(tel2);
            eindnumb = val1 / val2;
            repaint();
        }
    }

}
