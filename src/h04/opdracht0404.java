package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht0404 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        //people graph
        g.setColor(Color.red);
        g.fillRect(50,170,35,40);

        g.setColor(Color.green);
        g.fillRect(175,50,35,160);

        g.setColor(Color.blue);
        g.fillRect(300,90,30,120);
        g.setColor(Color.black);

        //main graph
        g.drawRect(10,10,350,200);
        g.drawString("120", 370,15);
        g.drawLine(15,50,355,50);
        g.drawString("100", 370, 55);
        g.drawLine(15,90,355,90);
        g.drawString("80", 370, 95);
        g.drawLine(15,130,355,130);
        g.drawString("60", 370, 135);
        g.drawLine(15,170,355,170);
        g.drawString("40", 370, 175);
        g.drawString("20", 370, 215);

        //people
        g.drawString("Valerie", 50, 240);
        g.setColor(Color.red);
        g.drawRect(45,225, 45,20);
        g.setColor(Color.black);

        g.drawString("jeroen", 175, 240);
        g.setColor(Color.green);
        g.drawRect(170,225, 45,20);
        g.setColor(Color.black);

        g.drawString("hans", 300, 240);
        g.setColor(Color.blue);
        g.drawRect(295,225, 40,20);

        //info
        g.setColor(Color.black);
        g.drawString("Weight in KG",30,270);
    }
}
