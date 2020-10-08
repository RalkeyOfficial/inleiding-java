package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht0601 extends Applet {
    int maingraphwidth = 300;

    double money = 120;
    int people = 4;
    String[] peoplenames = new String[4];
    double endmoney1;
    String moneytext;

    public void init() {
        peoplenames[0] = "Thijn";
        peoplenames[1] = "Jan";
        peoplenames[2] = "Ali";
        peoplenames[3] = "Jeannette";

        endmoney1 = money / people;
        moneytext = "$" + endmoney1;

        System.out.println("debug: " + money % people);

        if (money % people == 0) {
            moneytext = "$" + endmoney1 + "0";
        } else {
            moneytext = "$" + endmoney1;
        }

    }

    public void paint(Graphics g) {
        //list main
        g.drawRect(10,10,maingraphwidth,50);
            //horizontal
        g.drawLine(10,30,maingraphwidth+10,30);
            //vertical
        g.drawLine(60,10,60,60);
        g.drawLine(120,10,120,60);
        g.drawLine(180,10,180,60);
        g.drawLine(240,10,240,60);



        //names
        g.drawString("Names:",15,25);
        g.drawString(peoplenames[0], 65,25);
        g.drawString(peoplenames[1], 125,25);
        g.drawString(peoplenames[2], 185,25);
        g.drawString(peoplenames[3], 245,25);

        //money
        g.drawString("Money", 15, 50);
        g.drawString(moneytext, 65,50);
        g.drawString(moneytext, 125,50);
        g.drawString(moneytext, 185,50);
        g.drawString(moneytext, 245,50);

    }
}
