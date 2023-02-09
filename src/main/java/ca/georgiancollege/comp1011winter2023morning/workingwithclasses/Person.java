package ca.georgiancollege.comp1011winter2023morning.workingwithclasses;

public class Person {

    private String name = "Ben";
    private int age;
    private double height;

    //giving users a pre-selected (drop-down) options to select from
    //enum: list of constants to be used to give user one of X amount of choices
    //enum is reference data type

    //create the list of options
    public enum POSSIBLE_GENDERS {MALE, FEMALE, OTHER};

    //create an instance variable to hold ONE of the possible options
    private POSSIBLE_GENDERS gender = POSSIBLE_GENDERS.FEMALE;
    //getters and setters
    //alt+insert


    public POSSIBLE_GENDERS getGender() {
        return gender;
    }

    public void setGender(POSSIBLE_GENDERS gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        if(name.length() < 3)
            throw new IllegalArgumentException("Name must be at least 3 characters");
        name = name1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 && age <=120)
            this.age = age;
        else
            throw new IllegalArgumentException("Age not within range of 0 and 120");


        if(age < 0 || age > 120)
            throw new IllegalArgumentException("Age not within range of 0 and 120");

        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height >= 10 && height <= 250)
            this.height = height;
        else
            throw new IllegalArgumentException("Height now within range of 10 and 250");
    }

    //alt+insert

    public Person(){}
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(int age, String name){
        this(name, age);
    }

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }
    public Person(String name, double height, int age){
        this(name, age, height);
    }

    //toString: returns a String: summarize object instance variables
    //alt+insert

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o){

        try{
            Person p = (Person)o;
            return name.equals(p.name) && age == p.age && height == p.height && gender.equals(p.gender);
        }
        catch (Exception e){
            return false;
        }
    }
}
