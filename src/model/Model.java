package model;

import model.LampaModel;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<LampaModel> lampak;
    
    public Model() {
        lampak = new ArrayList<>();
        lampak.add(new LampaModel());
        lampak.add(new LampaModel());
        lampak.add(new LampaModel());
        
        lampak.add(new LampaModel());
        lampak.add(new LampaModel());
        lampak.add(new LampaModel());
        
        lampak.add(new LampaModel());
        lampak.add(new LampaModel());
        lampak.add(new LampaModel());
    }
    
    public List<LampaModel> getLampak() {
        return this.lampak;
    }
    
    public void kapcsolX(int x) {
        lampak.get(x).kapcsol();
    }
}
