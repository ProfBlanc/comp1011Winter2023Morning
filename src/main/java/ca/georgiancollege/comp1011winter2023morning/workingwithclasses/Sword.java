package ca.georgiancollege.comp1011winter2023morning.workingwithclasses;

public class Sword implements Weapon{


    @Override
    public void strike() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String action() {
        return "Slash!";
    }
}
