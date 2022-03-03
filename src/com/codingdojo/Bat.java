package com.codingdojo;

public class Bat extends Mammal {

  public Bat() {
    super();
    setLevelEnergy(300);
  }

  //For the fly() method, prints the sound of a bat taking off and decreases its energy by 50.
  public void fly() {
    double Levelenergy = getLevelEnergy();
    System.out.println("I'm a bat and I'm flying!");
    Levelenergy -= 50;
    setLevelEnergy(Levelenergy);
    showEnergy();
  }
  //For the eatHumans() method, prints the sound of when the bat.... Well, never mind, it just increases its energy by 25.
  public void eatHumans() {
    double Levelenergy = getLevelEnergy();
    System.out.println("Yum, I just ate a human!");
    Levelenergy += 25;
    setLevelEnergy(Levelenergy);
    showEnergy();
  }

  // For the attackVillage() method, print the sound of a burning village and decrease its energy by 100.
  public void attackVillage() {
    double Levelenergy = getLevelEnergy();
    System.out.println("I am attacking a village!");
    Levelenergy -= 100;
    setLevelEnergy(Levelenergy);
    showEnergy();
  }
}
