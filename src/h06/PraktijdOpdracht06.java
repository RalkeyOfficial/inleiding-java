package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijdOpdracht06 extends Applet {
    int amm_ppl = 3;
    double[] cijfers = new double[amm_ppl];
    double preeindcijfer;
    double eindcijfer1;
    double eindcijfer2;
    int geheel;

    public void init() {
        cijfers[0] = 5.9;
        cijfers[1] = 6.3;
        cijfers[2] = 6.9;

        preeindcijfer = cijfers[0] + cijfers[1] + cijfers[2];
        eindcijfer1 = preeindcijfer / amm_ppl;

        System.out.println("Debug: " + eindcijfer1);

        eindcijfer1 *= 10;
        geheel = (int) eindcijfer1;

        System.out.println("Debug: " + geheel);

        eindcijfer2 = geheel;
        eindcijfer2 /= 10;

        System.out.println("Debug: " + eindcijfer2);
    }

    public void paint(Graphics g) {
        g.drawString(eindcijfer2 + " is de gemiddelde", 10, 10);
    }
}
