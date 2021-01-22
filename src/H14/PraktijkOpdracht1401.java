package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PraktijkOpdracht1401 extends Applet {

    //game variables
    int deck = 23;



    TextField text;
    Label label;
    Button reset;
    String textfield1 = "", textfield2 = "";
    boolean isGameActive = true;
    int fullDeck = deck;

    public void init() {
        text = new TextField("", 5);
        label = new Label("Enter a number (1, 2 or 3):");
        reset = new Button("Reset game");

        text.addActionListener(new textListener());
        reset.addActionListener(new ResetListener());

        add(label);
        add(text);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString("current amount: " + fullDeck, 140, 50);
        g.drawString(textfield1 + "", 140, 70);
        g.drawString(textfield2 + "", 140, 90);
    }

    class textListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (isGameActive) {
                int currentNum = Integer.parseInt(text.getText());

                if (currentNum < 4 && currentNum > 0) {
                    textfield2 = "";

                    fullDeck -= currentNum;

                    if (fullDeck <= 0){
                        textfield2 = "Bot has won!!";
                        isGameActive = false;
                    } else {
                        bot();
                        text.setText("");
                    }

                } else {
                    textfield2 = "That is not a valid number";
                }

            }

            repaint();

        }
    }

    void bot(){
        int random = new Random().nextInt(3);

        textfield2 = "";

        fullDeck -= (random + 1);

        textfield1 = "Bot took away: " + (random + 1);

        if (fullDeck <= 0){
            textfield2 = "Player has won!!";
            isGameActive = false;
        }

    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent i) {
            textfield1 = "";
            textfield2 = "";
            fullDeck = deck;
            isGameActive = true;

            repaint();
        }
    }

}
