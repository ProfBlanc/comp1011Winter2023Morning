package ca.georgiancollege.comp1011winter2023morning.grades;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GradesController {

    @FXML
    private TextField score;

    @FXML
    private Label letter;

    @FXML
    void onClick(ActionEvent event) {

        //on click, swap values for letter and grade

        String originalGrade, originalLetter;

        //GET the string value for letter and grade
        originalGrade = score.getText();
        originalLetter = letter.getText();

        //SET the values to opposite fields (to complete swap)
        score.setText(originalLetter);
        letter.setText(originalGrade);



    }

    @FXML
    void initialize(){

            score.setText("");
            letter.setText("");
    }

}
