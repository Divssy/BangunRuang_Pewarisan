/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_pakson;

/**
 *
 * @author divya
 */
public class LimasSegitiga extends BangunRuang {
    double a;
    double t;
    double tLimas,lSisiTegak;
    
    @Override
    double volume(){
    double volume = 1/3 * (1/2*a*tLimas)*t;
    System.out.println("Volume Limas segitiga adalah : " + volume);  
        return volume;
    }
    @Override
    double luasPermukaan(){
        double luasPermukaan = (1/2*a*t)+ (3*lSisiTegak);
        System.out.println("Luas permukaan Limas segitiga : " + luasPermukaan);
        return luasPermukaan;
    }
    }
    
