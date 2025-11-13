package modell;

import modell.LampaModell;
import java.util.ArrayList;
import java.util.List;

public class Modell {
    private List<LampaModell> lampak;
    
    public Modell() {
        lampak = new ArrayList<>();
        lampak.add(new LampaModell());
        lampak.add(new LampaModell());
        lampak.add(new LampaModell());
        
        lampak.add(new LampaModell());
        lampak.add(new LampaModell());
        lampak.add(new LampaModell());
        
        lampak.add(new LampaModell());
        lampak.add(new LampaModell());
        lampak.add(new LampaModell());
    }
    
    public List<LampaModell> getLampak() {
        return this.lampak;
    }
    
    public void kapcsolX(int x) {
        lampak.get(x).kapcsol();
    }
}
