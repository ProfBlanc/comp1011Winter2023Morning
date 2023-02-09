package ca.georgiancollege.comp1011winter2023morning.workingwithclasses;

public class Superman extends SuperPower{

    @Override
    public int implementationOfSuperPower() {
        return 0;
    }

    public Superman() {
    }

    public Superman(double strength, double meannessLevel, double caringLevel, String name) {
        super(strength, meannessLevel, caringLevel, name);
    }
}
