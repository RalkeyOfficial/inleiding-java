package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht1203 extends Applet {
    TextField tekstvak1, tekstvak2, tekstvak3, tekstvak4, tekstvak5;
    Button go;
    String[] array = new String[5];

    public void init() {
        setSize(600,300);

        tekstvak1 = new TextField("", 10);
        tekstvak2 = new TextField("", 10);
        tekstvak3 = new TextField("", 10);
        tekstvak4 = new TextField("", 10);
        tekstvak5 = new TextField("", 10);
        go = new Button("GO!");

        go.addActionListener(new goListener());

        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(tekstvak5);
        add(go);
    }

    public void paint(Graphics g) {
        g.drawString(array[0], 30, 50);
        g.drawString(array[1], 30, 70);
        g.drawString(array[2], 30, 90);
        g.drawString(array[3], 30, 110);
        g.drawString(array[4], 30, 130);

    }

    class goListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            array[0] = tekstvak1.getText();
            array[1] = tekstvak2.getText();
            array[2] = tekstvak3.getText();
            array[3] = tekstvak4.getText();
            array[4] = tekstvak5.getText();

            Arrays.sort(array);

            repaint();
        }
    }
}
