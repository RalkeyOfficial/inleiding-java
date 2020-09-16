package random;

import java.applet.Applet;
import java.awt.*;
import java.text.DecimalFormat;

public class random1 extends Applet {
    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.drawString("0001101010101010101010101110101001100101010101010100101", 2, 10);
        g.drawString("1010111010010010100101101010011101010010110010100100100", 2, 20);
        g.drawRect(0,0,390,30);
        g.drawOval(2,40,50,50);
        g.drawArc(5,100,80,80,90,240);
        g.drawRoundRect(5,200, 80,80,50,50);
        
        /*
            Color [Name of the Color] = new Color(255, 255, 255, 0);
            RGBA ^^^

            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));
            lijn dikte ^^^

            g.setFont(new Font("times", Font.PLAIN, 30));

            DecimalFormat df = new DecimalFormat();
            g.drawString(df.format(doubleNumber));
            control de hoeveelheid aan nummers na de .

            double = Double.parseDouble(String);
            verandert String naar double
         */
    }
}
