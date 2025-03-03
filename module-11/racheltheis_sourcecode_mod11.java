//Rachel Theis
//Module 11 Assignment - Source Code
//CSD 402
//3.2.25

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExampleAccordionGrid extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Label lbl1 = new Label("Label 1");
        Label lbl2 = new Label("Label 2");

        gridPane.add(button1, 0, 0);
        gridPane.add(button2, 1, 0);
        gridPane.add(labe1, 0, 1);
        gridPane.add(label2, 1, 1);

        Accordion accordion = new Accordion();

        TitledPane pane1 = new TitledPane("Section 1", new Label("Example for section 1"));
        TitledPane pane2 = new TitledPane("Section 2", new Label("Example for section 2"));
        TitledPane pane3 = new TitledPane("Section 3", new Label("Example for section 3"));

        accordion.getPanes().addAll(pane1, pane2, pane3);

        GridPane root = new GridPane();
        root.add(gridPane, 0, 0);
        root.add(accordion, 0, 1);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Example: JavaFX Accordion and gridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
