package fi.utu.tech.gui.javafx.assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Getting the reference to "class object of this class"
        var resourceRoot = getClass();
        // The fxml filename that is in resources folder
        var form = "PartyMode.fxml";

        // Give the FXML resource to the FXMLLoader
        var loader = new FXMLLoader(resourceRoot.getResource(form));

        // Load and parse the FXML into an Java object (Parent)
        Parent root = loader.load();

        // This is just the usual: Setting scene, showing stage
        stage.setTitle("PartyMode");
        var scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
}
