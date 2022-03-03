package com.codingdojo;

public class Mammal {
    private double levelEnergy;


    //getter and setter
    public double getLevelEnergy() {
        return levelEnergy;
    }
    public void setLevelEnergy(double levelEnergy) {
        this.levelEnergy = levelEnergy;
    }

    //methods
    public void showEnergy() {
        System.out.println("Energy level is: " + levelEnergy);

    }
}