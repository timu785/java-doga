package nezet;

import javax.swing.JButton;

public class Nezet extends javax.swing.JFrame {
    public Nezet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lampa1 = new javax.swing.JButton();
        Lampa2 = new javax.swing.JButton();
        Lampa3 = new javax.swing.JButton();
        Lampa4 = new javax.swing.JButton();
        Lampa5 = new javax.swing.JButton();
        Lampa6 = new javax.swing.JButton();
        Lampa7 = new javax.swing.JButton();
        Lampa8 = new javax.swing.JButton();
        Lampa9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIGHT ON!            Kapcsold le az összes lámpát!");
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        Lampa1.setText("1");
        getContentPane().add(Lampa1);

        Lampa2.setText("2");
        getContentPane().add(Lampa2);

        Lampa3.setText("3");
        getContentPane().add(Lampa3);

        Lampa4.setBackground(new java.awt.Color(60, 60, 60));
        Lampa4.setText("4");
        getContentPane().add(Lampa4);

        Lampa5.setBackground(new java.awt.Color(60, 60, 60));
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

        Lampa9.setBackground(new java.awt.Color(60, 60, 60));
        Lampa9.setText("9");
        getContentPane().add(Lampa9);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // getterek helye
    public JButton getLampa1()
    {
        return Lampa1;
    }
    public JButton getLampa2()
    {
        return Lampa2;
    }
    public JButton getLampa3()
    {
        return Lampa3;
    }
    public JButton getLampa4()
    {
        return Lampa4;
    }
    public JButton getLampa5()
    {
        return Lampa5;
    }
    public JButton getLampa6()
    {
        return Lampa6;
    }
    public JButton getLampa7()
    {
        return Lampa7;
    }
    public JButton getLampa8()
    {
        return Lampa8;
    }
    public JButton getLampa9()
    {
        return Lampa9;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lampa1;
    private javax.swing.JButton Lampa2;
    private javax.swing.JButton Lampa3;
    private javax.swing.JButton Lampa4;
    private javax.swing.JButton Lampa5;
    private javax.swing.JButton Lampa6;
    private javax.swing.JButton Lampa7;
    private javax.swing.JButton Lampa8;
    private javax.swing.JButton Lampa9;
    // End of variables declaration//GEN-END:variables
}
