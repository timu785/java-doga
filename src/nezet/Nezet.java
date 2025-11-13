package nezet;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Nezet extends javax.swing.JFrame {
    public Nezet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lampa0 = new javax.swing.JButton();
        Lampa1 = new javax.swing.JButton();
        Lampa2 = new javax.swing.JButton();
        Lampa3 = new javax.swing.JButton();
        Lampa4 = new javax.swing.JButton();
        Lampa5 = new javax.swing.JButton();
        Lampa6 = new javax.swing.JButton();
        Lampa7 = new javax.swing.JButton();
        Lampa8 = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItemUj = new javax.swing.JMenuItem();
        jMenuItemMentes = new javax.swing.JMenuItem();
        jMenuItemBetoltes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("LIGHT ON!            Kapcsold le az összes lámpát!");
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        Lampa0.setText("0");
        getContentPane().add(Lampa0);

        Lampa1.setText("1");
        getContentPane().add(Lampa1);

        Lampa2.setText("2");
        getContentPane().add(Lampa2);

        Lampa3.setBackground(new java.awt.Color(60, 60, 60));
        Lampa3.setText("3");
        getContentPane().add(Lampa3);

        Lampa4.setBackground(new java.awt.Color(60, 60, 60));
        Lampa4.setText("4");
        getContentPane().add(Lampa4);

        Lampa5.setBackground(new java.awt.Color(204, 0, 153));
        Lampa5.setText("5");
        getContentPane().add(Lampa5);

        Lampa6.setBackground(new java.awt.Color(60, 60, 60));
        Lampa6.setText("6");
        getContentPane().add(Lampa6);

        Lampa7.setBackground(new java.awt.Color(60, 60, 60));
        Lampa7.setText("7");
        getContentPane().add(Lampa7);

        Lampa8.setBackground(new java.awt.Color(60, 60, 60));
        Lampa8.setText("8");
        getContentPane().add(Lampa8);

        jMenu.setText("Menu");

        jMenuItemUj.setText("Új");
        jMenu.add(jMenuItemUj);

        jMenuItemMentes.setText("Mentés");
        jMenu.add(jMenuItemMentes);

        jMenuItemBetoltes.setText("Betöltés");
        jMenu.add(jMenuItemBetoltes);

        jMenuBar.add(jMenu);

        setJMenuBar(jMenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int valasz = JOptionPane.showConfirmDialog(
            null,
            "Biztosan ki akarsz lépni?",
            "Kilépés megerősítése",
            JOptionPane.YES_NO_OPTION
        );

        if (valasz == JOptionPane.YES_OPTION) {
            System.out.println("Kilépés...");
            System.exit(0);
        } else {
            System.out.println("Mégsem lépünk ki.");
        }
    }//GEN-LAST:event_formWindowClosing

    public void nyeresUzenet() {
        JOptionPane.showMessageDialog(null, "Ön nyert!");
    }
    
    public JMenuItem getUj(){
        return jMenuItemUj;
    }
    
    public JMenuItem getMentes(){
        return jMenuItemMentes;
    }
    
    public JMenuItem getBetoltes(){
        return jMenuItemBetoltes;
    }
    
    public JButton getLampaX(int x){
        if (x == 0) { return Lampa0; }
        else if (x == 1) { return Lampa1; }
        else if (x == 2) { return Lampa2; }
        else if (x == 3) { return Lampa3; }
        else if (x == 4) { return Lampa4; }
        else if (x == 5) { return Lampa5; }
        else if (x == 6) { return Lampa6; }
        else if (x == 7) { return Lampa7; }
        else if (x == 8) { return Lampa8; }
        else return new JButton();
    }    
    
    public void felKapcsolX(int x){
        if (x == 0) { Lampa0.setBackground(Color.WHITE); }
        else if (x == 1) { Lampa1.setBackground(Color.WHITE); }
        else if (x == 2) { Lampa2.setBackground(Color.WHITE); }
        else if (x == 3) { Lampa3.setBackground(Color.WHITE); }
        else if (x == 4) { Lampa4.setBackground(Color.WHITE); }
        else if (x == 5) { Lampa5.setBackground(Color.WHITE); }
        else if (x == 6) { Lampa6.setBackground(Color.WHITE); }
        else if (x == 7) { Lampa7.setBackground(Color.WHITE); }
        else if (x == 8) { Lampa8.setBackground(Color.WHITE); }
    }
    
    public void leKapcsolX(int x){
        if (x == 0) { Lampa0.setBackground(Color.GRAY); }
        else if (x == 1) { Lampa1.setBackground(Color.GRAY); }
        else if (x == 2) { Lampa2.setBackground(Color.GRAY); }
        else if (x == 3) { Lampa3.setBackground(Color.GRAY); }
        else if (x == 4) { Lampa4.setBackground(Color.GRAY); }
        else if (x == 5) { Lampa5.setBackground(Color.GRAY); }
        else if (x == 6) { Lampa6.setBackground(Color.GRAY); }
        else if (x == 7) { Lampa7.setBackground(Color.GRAY); }
        else if (x == 8) { Lampa8.setBackground(Color.GRAY); }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lampa0;
    private javax.swing.JButton Lampa1;
    private javax.swing.JButton Lampa2;
    private javax.swing.JButton Lampa3;
    private javax.swing.JButton Lampa4;
    private javax.swing.JButton Lampa5;
    private javax.swing.JButton Lampa6;
    private javax.swing.JButton Lampa7;
    private javax.swing.JButton Lampa8;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemBetoltes;
    private javax.swing.JMenuItem jMenuItemMentes;
    private javax.swing.JMenuItem jMenuItemUj;
    // End of variables declaration//GEN-END:variables
}
