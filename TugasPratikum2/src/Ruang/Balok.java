/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruang;
import bidang.Persegi;

/**
 *
 * @author ASUS
 */
public class Balok extends Persegi implements MenghitungRuang {
    private double height;

    public Balok(double height, double length, double width) {
        super(length, width);
        this.height = height;
    }
    
    @Override
    public double surfaceArea() {
        return 2*(super.area()+super.area(super.getLength(), height)+super.area(super.getWidth(), height));
    }

    @Override
    public double volume() {
        return super.area() * height;
    }
}
    
