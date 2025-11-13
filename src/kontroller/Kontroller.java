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
    }
    
    public void megjelenit() {
        for (int i = 0; i < model.getLampak().size(); i++) {
            if(model.getLampak().get(i).getFelkapcsolva() == true){
                nezet.getLampaX(i).setBackground(Color.GREEN);
            }
            else{
                nezet.getLampaX(i).setBackground(Color.GRAY);
            }
        }
    }
    
    public void lampaGombok() {
        nezet.getLampa1().addActionListener((ActionEvent e) -> {
            System.out.println("1 megnyomva");
        });
    }
}
