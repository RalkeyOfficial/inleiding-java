package H14;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class opdracht1402 extends Applet {

    String[] deck;
    String[] kleuren = {"harten", "schoppen", "klaver", "ruiten"};
    String[] kaarten = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer", "aas"};
    String[] deckspeller1, deckspeller2, deckspeller3, deckspeller4;
    int y = 20;
    int x = 10;

    public void init() {


        deck = new String[52];
        deckspeller1 = new String[13];
        deckspeller2 = new String[13];
        deckspeller3 = new String[13];
        deckspeller4 = new String[13];

        int deckteller = 0;
        for (int i = 0; i < kleuren.length; i++){
            for (int j = 0; j < kaarten.length; j++){
                deck[deckteller] = kleuren[i] + " " + kaarten[j];
                deckteller++;
            }
        }

        for (int i = 0; i < deckspeller1.length; i++) {
            deckspeller1[i] = deelKaart();
            deckspeller2[i] = deelKaart();
            deckspeller3[i] = deelKaart();
            deckspeller4[i] = deelKaart();
        }

    }

    public void paint(Graphics g) {
        for (int j = 0; j < deckspeller1.length; j++) {
            g.drawString(deckspeller1[j], x, y);
            y += 15;
        }
        x += 100;
        y = 20;
        for (int j = 0; j < deckspeller1.length; j++) {
            g.drawString(deckspeller2[j], x, y);
            y += 15;
        }
        x += 100;
        y = 20;
        for (int j = 0; j < deckspeller1.length; j++) {
            g.drawString(deckspeller3[j], x, y);
            y += 15;
        }
        x += 100;
        y = 20;
        for (int j = 0; j < deckspeller1.length; j++) {
            g.drawString(deckspeller4[j], x, y);
            y += 15;
        }
        x += 100;
        y = 20;

    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];

        int hulpindex = 0;

        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }

        deck = hulpLijst;

        return kaart;
    }
}
