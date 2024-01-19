/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_pakson;

/**
 *
 * @author divya
 */
public class Bola extends BangunRuang {
    
    @Override
    double volume(){
        double volume = 4/3 * Math.PI * r*r*r;
        System.out.println("Volume bola adalah : " + volume);  
        return volume;
    }
    
    @Override
    double luasPermukaan(){
        double luasPermukaan = 4 * Math.PI * r*r;
        System.out.println("Luas permukaan bola adalah : " +luasPermukaan);
        return luasPermukaan;   
    }
    
    double r;
    
}
