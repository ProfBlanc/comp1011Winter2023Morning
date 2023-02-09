package ca.georgiancollege.comp1011winter2023morning.workingwithclasses;

public class SuperHero extends Person {

    public boolean wearsGlasses, hasCape;
    protected String superpower = "";


    public SuperHero(String name, int age, double height, boolean wearsGlasses, boolean hasCape, String superpower) {
        super(name, age, height);
        this.wearsGlasses = wearsGlasses;
        this.hasCape = hasCape;
        this.superpower = superpower;
    }

    public SuperHero(boolean wearsGlasses, boolean hasCape, String superpower) {
        this.wearsGlasses = wearsGlasses;
        this.hasCape = hasCape;
        this.superpower = superpower;
    }

    //only name and superpower
    public SuperHero(String name, String superpower){
        //super(name, 0, 0d);
        setName(name);
        this.superpower = superpower;
    }

    public SuperHero() {
    }

    public SuperHero(String name, int age, double height) {
        super(name, age, height);
    }

    public SuperHero(String name, int age) {
        super(name, age);
    }

    public SuperHero(int age, String name) {
        super(age, name);
    }

    public SuperHero(String name, double height) {
        super(name, height);
    }

    public SuperHero(String name, double height, int age) {
        super(name, height, age);
    }

    @Override
    public String toString(){
        return super.toString() + String.format("Superpower =  %s hasCape = %s, wearsGlasses = %s",superpower, hasCape, wearsGlasses);
    }
}
