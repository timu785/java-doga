package kontroller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import model.Model;
import nezet.Nezet;

public class Kontroller {
    private Model model;
    private Nezet nezet;
    
    public Kontroller(Model model, Nezet nezet) {
        this.model = model;
        this.nezet = nezet;
        nezet.setVisible(true);
        this.megjelenit();
        this.lampaGombok();
        this.menuGombok();
    }
    
    public void megjelenit() {
        for (int i = 0; i < model.getLampak().size(); i++) {
            if(model.getLampak().get(i).getFelkapcsolva() == true){
                nezet.felKapcsolX(i);
            }
            else{
                nezet.leKapcsolX(i);
            }
        }
    }
    
    public void lampaGombok() {
        for (int i = 0; i < model.getLampak().size(); i++) {
            int index = i;
            nezet.getLampaX(i).addActionListener((ActionEvent e) -> {
                model.kapcsolX(index);
                megjelenit();
                if(model.nyert()){
                    nezet.nyeresUzenet();
                }
            });
        }
    }
    
    public void menuGombok() {
        nezet.getUj().addActionListener((ActionEvent e) -> {
            System.out.println("uj gomb megnyomva");
            this.model = new Model();
            this.megjelenit();
        });
        
        nezet.getMentes().addActionListener((ActionEvent e) -> {
            System.out.println("mentés gomb megnyomva");
            model.mentes();
        });
        
        nezet.getBetoltes().addActionListener((ActionEvent e) -> {
            System.out.println("betöltés gomb megnyomva");
            model.betoltes();
            this.megjelenit();
        });
    }
}
