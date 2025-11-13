package main;

import java.awt.Color;
import javax.swing.JButton;
import kontroller.Kontroller;
import model.Model;
import nezet.Nezet;

public class Program {
    
    public static void main(String[] args) {
          
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Model model = new Model();
                
                Nezet nezet = new Nezet();
                
                Kontroller kontroller = new Kontroller(model, nezet);    
                
            }
        });
           
    }
    
}
