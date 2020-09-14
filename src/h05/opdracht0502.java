package h05;

import java.applet.Applet;
import java.awt.*;

public class opdracht0502 extends Applet {
    int ValerieWeight = 40;
    int JeroenWeight = 100;
    int HansWeight = 80;

    int GraphHeight = 140;

    int NameHeight = GraphHeight + 50;
    int BoxHeight = GraphHeight + 35;
    int InfoHeight = GraphHeight + 80;

    String text;

    public void init() {
        setSize(600,400);
    }

    public void paint(Graphics g) {
        //people graph
        g.setColor(Color.red);
        g.fillRect(50,10,35,ValerieWeight);

        g.setColor(Color.green);
        g.fillRect(175,10,35,JeroenWeight);

        g.setColor(Color.blue);
        g.fillRect(300,10,30,HansWeight);
        g.setColor(Color.black);

        //main graph
        g.drawRect(10,10,350,GraphHeight);
        g.drawString("20", 370,35);
        g.drawLine(15,30,355,30);

        g.drawString("40", 370, 55);
        g.drawLine(15,50,355,50);

        g.drawString("60", 370, 75);
        g.drawLine(15,70,355,70);

        g.drawString("80", 370, 95);
        g.drawLine(15,90,355,90);

        g.drawString("100", 370, 115);
        g.drawLine(15,110,355,110);

        g.drawString("120", 370, 135);
        g.drawLine(15,130,355,130);

        //people
        g.drawString("Valerie", 50, NameHeight);
        g.setColor(Color.red);
        g.drawRect(45,BoxHeight, 45,20);
        g.setColor(Color.black);

        g.drawString("jeroen", 175, NameHeight);
        g.setColor(Color.green);
        g.drawRect(170,BoxHeight, 45,20);
        g.setColor(Color.black);

        g.drawString("hans", 300, NameHeight);
        g.setColor(Color.blue);
        g.drawRect(295,BoxHeight, 40,20);

        //info
        g.setColor(Color.black);
        g.drawString("Weight in KG",30,InfoHeight);

        if (ValerieWeight > JeroenWeight && ValerieWeight > HansWeight){
            text = "Valerie is the heaviest";
        }
        else if (JeroenWeight > ValerieWeight && JeroenWeight > HansWeight) {
            text = "Jeroen is the heaviest";
        }
        else if (HansWeight > ValerieWeight && HansWeight > JeroenWeight) {
            text = "Hans is the heaviest";
        }

        g.drawString(text, 30,InfoHeight+15);
    }
}
