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
        if(x == 0) {
            lampak.get(0).kapcsol();
            lampak.get(1).kapcsol();
            lampak.get(3).kapcsol();
        }
        if(x == 2) {
            lampak.get(1).kapcsol();
            lampak.get(2).kapcsol();
            lampak.get(5).kapcsol();
        }
        if(x == 6) {
            lampak.get(3).kapcsol();
            lampak.get(6).kapcsol();
            lampak.get(7).kapcsol();
        }
        if(x == 8) {
            lampak.get(5).kapcsol();
            lampak.get(7).kapcsol();
            lampak.get(8).kapcsol();
        }
        
        if(x == 1) {
            lampak.get(0).kapcsol();
            lampak.get(1).kapcsol();
            lampak.get(2).kapcsol();
            lampak.get(4).kapcsol();
        }
        if(x == 3) {
            lampak.get(0).kapcsol();
            lampak.get(3).kapcsol();
            lampak.get(4).kapcsol();
            lampak.get(6).kapcsol();
        }
        if(x == 5) {
            lampak.get(2).kapcsol();
            lampak.get(4).kapcsol();
            lampak.get(5).kapcsol();
            lampak.get(8).kapcsol();
        }
        if(x == 7) {
            lampak.get(4).kapcsol();
            lampak.get(6).kapcsol();
            lampak.get(7).kapcsol();
            lampak.get(8).kapcsol();
        }
        
        if(x == 4) {
            lampak.get(1).kapcsol();
            lampak.get(3).kapcsol();
            lampak.get(4).kapcsol();
            lampak.get(5).kapcsol();
            lampak.get(7).kapcsol();
        }
        
    }
    
    public boolean nyert() {
        boolean nyert = true;
        for (int i = 0; i < lampak.size(); i++) {
            if(lampak.get(i).getFelkapcsolva() == true) {
                nyert = false;
            }
        }
        return nyert;
    }
}
