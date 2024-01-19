/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance_pakson;

/**
 *
 * @author divya
 */
public class Inheritance_PakSon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();
        
        Bola bola = new Bola();
        bola.r = 20;
        
        Balok balok = new Balok();
        balok.p = 6;
        balok.l = 3;
        balok.t = 5;
        
        LimasSegitiga LimasSegitiga = new LimasSegitiga();
        LimasSegitiga.a = 6;
        LimasSegitiga.t = 9;
        LimasSegitiga.lSisiTegak = 8;
        LimasSegitiga.tLimas = 10;
                
        Tabung tabung = new Tabung();
        tabung.r = 10;
        tabung.t = 14;
        
        bangunRuang.volume();
        bangunRuang.luasPermukaan();
        
        bola.volume();
        bola.luasPermukaan();
        
        balok.volume();
        balok.luasPermukaan();
        
        LimasSegitiga.volume();
        LimasSegitiga.luasPermukaan();
        
        tabung.volume();
        tabung.luasPermukaan();
        
        
        
    }
    
}
