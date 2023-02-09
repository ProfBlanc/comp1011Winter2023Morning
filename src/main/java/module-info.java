module ca.georgiancollege.comp1011winter2023morning {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1011winter2023morning to javafx.fxml;
    exports ca.georgiancollege.comp1011winter2023morning;
    exports ca.georgiancollege.comp1011winter2023morning.grades;
    opens ca.georgiancollege.comp1011winter2023morning.grades to javafx.fxml;
}