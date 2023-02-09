package ca.georgiancollege.comp1011winter2023morning.workingwithclasses;

public class Week2 {

    public static void main(String[] args) {
        example3();
    }

    static void example3(){
        /*
        SuperPower sp = new SuperPower();
        Weapon weapon = new Weapon();

         */

        Sword sword = new Sword();

        Superman superman = new Superman();
        //Polymorphism
        // Sword is a Weapon
        // Superman has a Superpower

        Weapon weapon = new Sword();

        SuperPower superPower = new Superman();
    }
    static void example1(){
        /*
            inheritance is building a class based on a previously existing class

            super           sub
            parent          child
            base            derived

            all non-private instance methods, class method are inherited as well as default constructor

         */

        SuperHero sh = new SuperHero();

        System.out.println(sh.getName());

        SuperHero sh1 = new SuperHero("Batman", 100, 160d);

        System.out.println(sh);
        System.out.println(sh1);

    }

    static void example2(){

        /*
        Polymorphism:
            abstract class: exact same fetures as concrete (regular) class BUT also has abstract method
                    abstract method: method with no default implementation
                        area of shape
            interface
                list of methods signatures: behaviours that item needs to implement

            2 entities that cannot be instantiated
                1) Uses as inner class
                2) Create a list of requirements that class needs to implement
         */

    }

}
