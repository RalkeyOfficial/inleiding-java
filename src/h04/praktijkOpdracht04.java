package h04;

import java.applet.Applet;
import java.awt.*;

public class praktijkOpdracht04 extends Applet {
    public void init() {
        setSize(600,400);
    }

    public void paint(Graphics g) {
        //line
        g.drawLine(20,20,170,20);
        g.drawString("lijn",85,35);

        //rect
        g.drawRect(20,50,150,100);
        g.drawString("rechthoek", 70, 165);

        //filled rect with ovaal
        g.setColor(Color.magenta);
        g.fillRect(190,50,150,100);
        g.setColor(Color.black);
        g.drawOval(190,50,150,100);
        g.drawString("gevulde rechthoek met ovaal", 190, 165);

        //taartpunt met ovaal
        g.setColor(Color.magenta);
        g.fillArc(360, 50, 150,100, 0, 35);
        g.setColor(Color.black);
        g.drawOval(360,50,150,100);
        g.drawString("Taartpunt met ovaal", 380,165);

        //afgeronde rechthoek
        g.drawRoundRect(20,200,150,100,30,30);
        g.drawString("afgeronde rechthoek", 40, 315);

        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(190,200,150,100);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal", 220,315);

        //circle
        g.drawOval(380,200,100,100);
        g.drawString("cirkel", 415,315);
    }
}
