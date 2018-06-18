/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;

import java.util.Random;

/**
 *
 * @author davibq
 */
public class Car {
    private Engine engine;
    private Wheels wheels;
    private double position = 0;
    private String brand;
    private String wheels_brand;
    
    
    public Car(String brand, int horsepower, String wheels_brand, int size) {
        wheels = new Wheels(wheels_brand, size);
        engine = new Engine(brand, horsepower);
        this.brand = brand;
        this.wheels_brand = wheels_brand;
    }
    
    public double move() {
        Random rnd = new Random();
        float factor = rnd.nextFloat();
        double wheelsFactor = wheels.getFactor();
        double movement = Math.floor(factor * engine.getHorsepower() * wheelsFactor);
        position += movement;
        
        return position;
    }
    
    public double getPosition() {
        return position;
    }
    
    public String getBrand() {
        return brand;
    }
}
