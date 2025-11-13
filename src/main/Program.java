package main;

import java.awt.Color;
import javax.swing.JButton;
import nezet.Nezet;

public class Program {
    
    public static void main(String[] args) {
          
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Nezet nezet = new Nezet();
                nezet.setVisible(true);
                
                JButton lampa1 = nezet.getLampa1();
                lampa1.setBackground(Color.yellow);
                
                JButton lampa2 = nezet.getLampa2();
                lampa2.setBackground(Color.DARK_GRAY);
                
            }
        });
           
    }
    
}
