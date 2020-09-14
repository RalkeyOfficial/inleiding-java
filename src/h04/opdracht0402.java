package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht0402 extends Applet {
    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        //MATRIX EFFECT
        Color green = new Color(0, 255, 0, 80);
        g.setColor(green);
        g.setFont(new Font("times", Font.PLAIN, 30));
        g.drawString("0110101001010101010101010",0,0);
        g.drawString("0101101010010101010101011",0,30);
        g.drawString("0101011010100101100101010",0,60);
        g.drawString("0101010101010101111101010",0,90);
        g.drawString("0101010101101010101010111",0,120);
        g.drawString("0101010111010100101010101",0,150);
        g.drawString("1011001011101010101010100",0,180);
        g.drawString("0110101001010101010101010",0,210);
        g.drawString("0101010110101010111101010",0,240);
        g.drawString("0110101001010101010101010",0,270);
        g.drawString("0110101001010101010101010",0,300);

        //main house shape
        g.setColor(Color.black);
        g.fillRect(20,140,140,140);
        g.setColor(Color.green);
        g.drawRect(20,140,140,140);

        int[] x = new int[3];
        int[] y = new int[3];
        int n;
        x[0]=95; x[1]=160; x[2]=20;
        y[0]=20; y[1]=140; y[2]=140;
        n = 3;

        Polygon p = new Polygon(x, y, n);

        g.setColor(Color.black);
        g.fillPolygon(p);
        g.setColor(Color.green);
        g.drawPolygon(p);

        //door
        g.drawRect(100,220,40,60);
        g.fillOval(125,250,10,10);

        //window
        g.setColor(Color.cyan);
        g.fillRect(40,160,30,30);
        g.setColor(Color.black);
        g.drawLine(55,160,55,190);
        g.drawLine(40,175,70,175);
    }
}
