package ca.georgiancollege.comp1011winter2023morning.workingwithclasses;

public class PersonRunner {

    //psvm+tab

    public static void main(String[] args) {
        example3();
    }
    static void example1(){
        Person p1 = new Person();
        Person p2 = new Person("Ben", 100, 135.5);

        Person[] people = {p1,p2};
    }
    static void example2(){

        Person p1 = new Person();
        p1.setGender( Person.POSSIBLE_GENDERS.FEMALE  );

        System.out.println(p1.getGender());

    }

    static void example3(){
        //get a summary of a Person object
        Person p1 = new Person("Ben", 18, 150d);
        System.out.println(p1);

        Person p2 = new Person("Ben", 18, 150d);

        Person p3 = p1;

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

    }

}
