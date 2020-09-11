package h05;

import java.applet.Applet;
import java.awt.*;

public class opdracht0501 extends Applet {
    public void init() {
        setSize(600,400);
    }

    public void paint(Graphics g) {
        Color Magenta = new Color(255,0,255,255);
        int width = 150;
        int height = 100;

        //line
        g.drawLine(20,20,170,20);
        g.drawString("lijn",85,35);

        //rect
        g.drawRect(20,50,width,height);
        g.drawString("rechthoek", 70, 165);

        //filled rect with ovaal
        g.setColor(Magenta);
        g.fillRect(190,50,width,height);
        g.setColor(Color.black);
        g.drawOval(190,50,width,height);
        g.drawString("gevulde rechthoek met ovaal", 190, 165);

        //taartpunt met ovaal
        g.setColor(Magenta);
        g.fillArc(360, 50, width,height, 0, 35);
        g.setColor(Color.black);
        g.drawOval(360,50,width,height);
        g.drawString("Taartpunt met ovaal", 380,165);

        //afgeronde rechthoek
        g.drawRoundRect(20,200,width,height,30,30);
        g.drawString("afgeronde rechthoek", 40, 315);

        //gevulde ovaal
        g.setColor(Magenta);
        g.fillOval(190,200,width,height);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal", 220,315);

        //circle
        g.drawOval(380,200,height,height);
        g.drawString("cirkel", 415,315);
    }
}
