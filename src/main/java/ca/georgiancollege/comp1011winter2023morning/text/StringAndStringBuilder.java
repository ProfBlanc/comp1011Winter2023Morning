package ca.georgiancollege.comp1011winter2023morning.text;

public class StringAndStringBuilder {

    //psvm+tab
    public static void main(String[] args) {
        example1();
    }
    static void example1(){
        /*

            String and StringBuilder

                String is a hybrid data type
                    Technically a reference data type
                    but it behaves like a primitive data type
         */

        //Person p1 = new Person();
        //p1.method(), p1.instanceVariable = new data
        String s1 = "new string";
        int num = 100;

        s1 = "updated value";

        StringBuilder sb = new StringBuilder(); //capacity = 16
        StringBuilder sb1 = new StringBuilder("hello"); // capacity = 16 + 5 = 21;
        sb1.append(12345);
        sb1.append(true);
        sb1.append("abcdefgi");

        sb.append("hello");
        sb.delete(0, sb.length()); // delete all contents
        sb.append("new data");

        sb.insert(1, "ben");
        System.out.println(sb.toString());

        String s2 = new String("hello world");

        System.out.println(sb1.toString());
        System.out.println(sb1.length());
        System.out.println(sb1.capacity()); //automatically increase formula : old capacity + 1, doubled
        /*

            If String is a cup of water

            StringBuilder is a Waterbottle
         */

        sb.capacity(); //capacity is a soft limit. expands.
        //default capacity is either 16 is empty string or length of string + 16


    }
}
