package ca.georgiancollege.comp1011winter2023morning;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class StringAndStringBuilderController {

    @FXML
    private TextField contentST,argumentST,resultST,contentSB,argumentSB,resultSB;

    @FXML
    private ComboBox<String> methodST,methodSB;

    @FXML
    void onSubmitSB(ActionEvent event) {

    }

    void versionSimple(){

        String content = contentST.getText();
        String method = methodST.getSelectionModel().getSelectedItem();
        String argument = argumentST.getText();

        if(method.equals("length")){
            resultST.setText(  content.length() +""   );
        }
        else if(method.equals("startsWith")){

            if(argument.contains(",")){

                //multiple args
                String[] args = argument.split(",");
                resultST.setText(content.startsWith(args[0], Integer.parseInt(args[1])) + "");
            }
            else{

                resultST.setText(content.startsWith(argument) + "");
            }


        }
        else if(method.equals("substring")){
            resultST.setText(content.substring( Integer.parseInt(argument) ) );
        }

    }
    @FXML
    void onSubmitST(ActionEvent event) {


        //code the rest of this method so that when user inputs "Hello", "length"=> result = 5
        versionSimple();
    }


    void generateCBSTOptions(){

        ArrayList<String> options = new ArrayList<>();
        options.add("length");
        options.add("startsWith");
        options.add("substring");
        /*
            <select>
                <options>

             </select>
        <combobox>
            <items>

        </combobox>
         */
        methodST.getItems().addAll(options);

        //GET a value for a combobox
        //use SelectionModel
        methodST.getSelectionModel().selectFirst();

    }

    @FXML
    void initialize(){

        generateCBSTOptions();
    }

}
