package main;

import nezet.GUI;

public class Program {
    
    
    public static void main(String[] args) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        
        
    }
    
    
}
