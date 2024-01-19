/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_pakson;

/**
 *
 * @author divya
 */
public class Balok extends BangunRuang {
    double p;
    double l;
    double t;
    
    @Override
    double volume(){
        double volume = p * l * t;
        System.out.println("Volume balok adalah : " + volume);  
        return volume;
    }
    
    @Override
    double luasPermukaan(){
    double luasPermukaan = 2 * p * l * t;
        System.out.println("Luas permukaan balok adalah : " + luasPermukaan);
        return luasPermukaan;
    }
}

