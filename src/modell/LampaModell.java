package modell;

import java.util.Random;

public class LampaModell {
    private boolean felkapcsolva;
    private final static Random rnd = new Random();
    
    public LampaModell() {
        this.felkapcsolva = rnd.nextInt(2) == 0;
    }
    
    public void kapcsol() {
        this.felkapcsolva = !this.felkapcsolva;
    }
    
    public boolean getFelkapcsolva() {
        return this.felkapcsolva;
    }
}
