package modell;

import java.util.Random;

public class LampaModell {
    private boolean felkapcsolva;
    private int sorszam;
    private final static Random rnd = new Random();
    
    public class LampaModell() {
        this.felkapcsolva = rnd.nextInt(0, 1) == 0;
    }
    
    
}
