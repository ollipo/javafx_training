package fi.utu.tech.gui.javafx.assignment6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp6 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Baker's percentages");

        // Creating the important fields
        TextField flourAmountField = new TextField();
        TextField waterPercentageField = new TextField();
        Label waterAmountLabel = new Label();
        TextField yeastPercentageField = new TextField();
        Label yeastAmountLabel = new Label();
        Label doughTotalAmountLabel = new Label();

        // Just adding stuff to grid. Nothing of interest here
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        grid.add(new Label("Flour:"), 0, 0);
        grid.add(flourAmountField, 1, 0);
        grid.add(new Label("g"), 2, 0);
        
        grid.add(new Label("Water:"), 0, 1);
        grid.add(waterPercentageField, 1, 1);
        grid.add(new Label("%"), 2, 1);
        grid.add(waterAmountLabel, 3, 1);
        grid.add(new Label("g"), 4, 1);

        grid.add(new Label("Yeast:"), 0, 2);
        grid.add(yeastPercentageField, 1, 2);
        grid.add(new Label("%"), 2, 2);
        grid.add(yeastAmountLabel, 3, 2);
        grid.add(new Label("g"), 4, 2);

        grid.add(new Label("Dough total:"), 0, 3);
        grid.add(doughTotalAmountLabel, 1, 3);
        grid.add(new Label("g"), 2, 3);
        // Okay, layout creation stops here

        // And of course set the scene and show the stage as always
        stage.setScene(new Scene(grid, 500, 400));
        stage.show();
    }

}
