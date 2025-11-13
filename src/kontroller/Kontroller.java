package kontroller;

import modell.Modell;
import nezet.Nezet;

public class Kontroller {
    private Modell modell;
    private Nezet nezet;
    
    public Kontroller(Modell modell, Nezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        nezet.setVisible(true);
    }
}
