package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import model.LampaModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {
    private List<LampaModel> lampak;
    
    public Model() {
        lampak = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            lampak.add(new LampaModel());
        }
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
    
    public void mentes() {
        System.out.println("model mentes...");
        String tartalom = "";
        for (int i = 0; i < this.lampak.size()-1; i++) {
            tartalom += String.valueOf(this.lampak.get(i).getFelkapcsolva()) + "#";
        }
        tartalom += String.valueOf(this.lampak.get(this.lampak.size()-1).getFelkapcsolva());
        System.out.println(tartalom);
        
        Path filePath = Path.of("adat.txt");

        try {
            Files.writeString(filePath, tartalom);
            System.out.println("Fájl sikeresen mentve!");
        } catch (IOException e) {
            System.out.println("Fájl mentés sikertelen!");
        }
    }
    
    public void betoltes() {
        System.out.println("model betoltes...");
        Path filePath = Path.of("adat.txt");
        String tartalom = "asd";
        
        try {
            tartalom = Files.readString(filePath);
        } catch (IOException e) {
            System.out.println("Fájl beolvasás sikertelen!");
        }
        
        System.out.println(tartalom);
        
        String[] darabok = tartalom.split("#");
        ArrayList<String> darabok2 = new ArrayList<>(Arrays.asList(darabok));
        System.out.println(darabok2);
        
        lampak = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            lampak.add(new LampaModel(Boolean.parseBoolean(darabok2.get(i))));
        }
        
    }
}
