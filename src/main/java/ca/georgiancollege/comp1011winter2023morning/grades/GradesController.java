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

    void test(){
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
    void onClick(ActionEvent event) {

        String scoreValue = score.getText();
        try{
            int grade = Integer.parseInt(scoreValue);

            if(grade < 0 || grade > 100)
                throw new Exception("Invalid Grade");

            StringBuilder calculatedLetter = new StringBuilder(2);

            if(grade >=80 && grade <=100 )
                calculatedLetter.append("A");
            else if (grade >=70 && grade <= 79)
                calculatedLetter.append("B");
            else if (grade >=60 && grade <= 69)
                calculatedLetter.append("C");
            else if (grade >=50 && grade <= 59)
                calculatedLetter.append("D");
            else
                calculatedLetter.append("F");


            letter.setText(calculatedLetter.toString());
        }
        catch (Exception e){
            letter.setText("N/A");
        }

    }

    @FXML
    void initialize(){

            score.setText("");
            letter.setText("");
    }

}
