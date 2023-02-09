package ca.georgiancollege.comp1011winter2023morning.filemanipulation;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class SDL {

    /*
            Student Directory Listing
            Add Student
            Modify Student
            Delete Student
            View Student
            View Students
            Exit

     */

    public static void main(String[] args) {
        new SDL();

    }
    private ArrayList<String> list = new ArrayList<String>();
    private Scanner input = new Scanner(System.in);
    private Path path;
    private final String DIR_SEP = File.separator;
    private final String extension = ".txt";
    private BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public SDL(){
        prepProgram();
        System.out.println("Welcome to Student Directory Listing");
        while(true){
            System.out.println("Menu is Below, Choose 1 of the available options");
            System.out.printf("1)Add Student%n2)Modify Student%n3)Delete Student%n" +
                    "4)View Student%n5)View Students%n6)Exit%nYour option is: ");


            try{
                int option = input.nextInt();

                if(option == 6)
                    break;
                if(option < 1 || option > 6)
                    throw new IllegalArgumentException("Select an option between 1-6");

                switch (option){

                    case 1:
                        addStudent();
                        break;
                    case 2:
                        modifyStudent();
                        break;
                    case 3:
                        deleteStudent();
                        break;
                    case 4:
                        viewStudent();
                        break;
                    case 5:
                        viewStudents();
                        break;
                    case 6:
                        break;
                }
            }
            catch (IOException e){
                System.err.println("IO Error occurred: " + e);
                break;
            }
            catch (Exception e){
                System.out.println("General Error occurred: " + e.getMessage());
                break;
            }
        }

    }
    private void viewStudent() throws IOException{

        System.out.println("You will view a single a student");
        System.out.println("Enter student #");

    }
    private void viewStudents(){
        System.out.println("Here are the list of students");

    }
    private void addStudent(String studentID, String firstName, String lastName) throws IOException{

        Path newFile = path.resolve(studentID + extension);

        if(!checkIfStudentFileExists(studentID))
            Files.createFile(newFile);

        Files.writeString(newFile, String.format("%s%n%s", firstName, lastName));
    }
    private String extensionChecker(String studentID){

        return null;
    }
    private boolean isValidStudentID(String studentID){

        try{
            int sid = Integer.parseInt(studentID);
            return studentID.length() == 9;
        }
        catch (Exception e){
            return false;
        }
    }
    private boolean isValidName(String name){
        return name.length() >= 2;
    }
    private void addStudent() throws IOException{
        System.out.println("Enter Student ID");
        String studentID = reader.readLine();
        if(!isValidStudentID(studentID)){
            throw new IllegalArgumentException("Student ID is invalid");
        }
        else if(checkIfStudentFileExists(studentID)){
            throw new IllegalArgumentException("Student ID of " + studentID + " already exists!");
        }
        System.out.println("Enter firstname");
        String firstName = reader.readLine();
        System.out.println("Enter lastname");
        String lastName = reader.readLine();

        addStudent(studentID, firstName, lastName);

    }
    private boolean checkIfStudentFileExists(String studentID){

        //studentID = 123456789
        //transform into file
        String filename = studentID + extension;
        Path filePath = path.resolve(filename) ;
        return Files.exists(filePath);

    }
    private void modifyStudent() throws IOException{

        System.out.println("You will modify a student");
        System.out.println("Enter student #");
        String studentID = reader.readLine();

        if(isValidStudentID(studentID) && !checkIfStudentFileExists(studentID)){
            throw new IOException("Invalid student or cCould not find student");
        }

        System.out.println("Enter first name");
        String firstName = reader.readLine();

        System.out.println("Enter last name");
        String lastName = reader.readLine();


        addStudent(studentID, firstName, lastName);

    }
    private void deleteStudent() throws IOException{
        System.out.println("You will delete a student");
        System.out.println("Enter student #");
        String studentID = reader.readLine();

        if(isValidStudentID(studentID) && !checkIfStudentFileExists(studentID)){
            throw new IOException("Invalid student ID and/or student file does not exists");
        }

        Files.delete(path.resolve(studentID+extension));


    }
    private void prepProgram() {

        //Ensure Directory Exists
        Path rootPath = Paths.get("./src/main/java/ca/georgiancollege/comp1011winter2023morning/filemanipulation");
        path = rootPath.resolve("SDL");
        try {
            if (!path.toFile().exists()) {
                Files.createDirectory(path);

            }
            //get all files from directory above
            String[] files = path.toFile().list();

            for (String currentFile : files) {
                list.add(currentFile);
            }

        }
        catch (Exception e){
            System.err.println(e);
        }
    }



}

