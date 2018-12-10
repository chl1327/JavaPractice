package TkJava.TKU10.P11;

import java.util.Random;

import static print.Print.print;
import static print.Print.println;

interface Games {
    void play();
}

interface GamesFactory {
    Games getGames();
}

class CoinToss implements Games {
    Random rand = new Random();
    public void play() {
        print("Toss Coin: ");
        switch(rand.nextInt(2)) {
            case 0 : println("Heads"); return;
            case 1 : println("Tails"); return;
            default: println("OnEdge"); return;
        }
    }
    public static GamesFactory factory =
            new GamesFactory() {
                public Games getGames() { return new CoinToss(); }
            };
}

class DiceThrow implements Games {
    Random rand = new Random();
    public void play() {
        print("Throw Dice: " + (rand.nextInt(6) + 1));
    }
    public static GamesFactory factory =
            new GamesFactory() {
                public Games getGames() { return new DiceThrow(); }
            };
}

public class Games17 {
    public static void playGame(GamesFactory factory) {
        Games g = factory.getGames();
        g.play();
    }
    public static void main(String [] args) {
        playGame(CoinToss.factory);
        playGame(DiceThrow.factory);
    }
}
