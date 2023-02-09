package ca.georgiancollege.comp1011winter2023morning.filemanipulation;

import java.io.*;
import java.nio.file.*;

public class Basics {

    public static void main(String[] args) {
        /*
            two packages
                IO
                NIO

            Classes
                Path
                    related to file and/or dir location
                    where things are
                    an objects
                File
                    an object or either a file or direct (instance)

                Paths
                    a class that has static methods with path methods

                Files
                    a class that has static methods to operate on files and directories

            Steps to File Manipulation

            1) Determine a Path
                a) Paths class to specify a location
                b) Path object to store that location
            2) Create an object to manipulate ONE particular directory or file
                By using Files or File class

            3) Use File or Files methods to enact action of file or directory

         */
        try {
            //createDirectory();
            //viewFiles();
            readAndWriteAndDeleteFile();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
    static Path rootPath = Paths.get("./src/main/java/ca/georgiancollege/comp1011winter2023morning/filemanipulation");
    static void createDirectory() throws Exception{

        System.out.println(Files.exists(rootPath));

        //create a file or directory
        Path newPath = rootPath.resolve("newDir"); //an file extension diff bt creating file and dir


        Files.createDirectory(newPath);

    }
    static void viewFiles() throws Exception{

        File file = rootPath.toFile();
        String[] fileNames = file.list();

        for(String currentFile : fileNames){
            System.out.println(currentFile);
        }
    }

    static void readAndWriteAndDeleteFile() throws Exception{
        /*
                1) create a new file named test.txt by appending test.txt to the end of rootPath
                2) Create the new file using static method of a class
                3) transform new path to an instance of an object (File) (not needed but for practice)
                4) use Files class to write string content to the new path
                5) Files class to then read the file content of new path
                6) search either File or Files to delete the text.txt content
         */
        Path newFile = rootPath.resolve("test.txt");
        Files.createFile(newFile);
        File file = newFile.toFile();
        Files.writeString(newFile, "Hello World", StandardOpenOption.APPEND);
        String content = Files.readString(newFile);
        System.out.println("File content is " + content);
        Files.delete(newFile);
    }
}
