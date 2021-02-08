package fi.utu.tech.gui.javafx.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

public class GeneratorController {

    @FXML
    private PasswordField passwdInputField;

    @FXML
    private TextArea md5sumField;

    @FXML
    private Button generateHashBtn;

    @FXML
    void generateHashPressed(ActionEvent event) {
        try {
            md5sumField.setText(MD5Sum.calculateMD5Sum(passwdInputField.getText()));
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, e.toString());
            alert.showAndWait();
        }

    }
}
