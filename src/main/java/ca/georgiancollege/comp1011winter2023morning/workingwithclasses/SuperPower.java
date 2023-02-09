package ca.georgiancollege.comp1011winter2023morning.workingwithclasses;

public abstract class SuperPower {


    private double strength;
    private double meannessLevel;
    private double caringLevel;
    private String name = "Power";

    public abstract int implementationOfSuperPower();

    public SuperPower(){}

    public SuperPower(double strength, double meannessLevel, double caringLevel, String name) {
        this.strength = strength;
        this.meannessLevel = meannessLevel;
        this.caringLevel = caringLevel;
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getMeannessLevel() {
        return meannessLevel;
    }

    public void setMeannessLevel(double meannessLevel) {
        this.meannessLevel = meannessLevel;
    }

    public double getCaringLevel() {
        return caringLevel;
    }

    public void setCaringLevel(double caringLevel) {
        this.caringLevel = caringLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
