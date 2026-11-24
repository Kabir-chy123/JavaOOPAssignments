package assignment6_1.view;

import assignment6_1.controller.DictionaryController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    private DictionaryController controller;

    public void init() {
        controller = new DictionaryController();
    }

    public void start(Stage stage) {

        Label text = new Label("Enter a word:");
        TextField wordField = new TextField();
        Button searchButton = new Button("Search");
        Label result = new Label();

        FlowPane pane = new FlowPane();

        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        pane.getChildren().add(text);
        pane.getChildren().add(wordField);
        pane.getChildren().add(searchButton);
        pane.getChildren().add(result);

        searchButton.setOnAction(event -> {
            String word = wordField.getText();
            String meaning = controller.search(word);
            result.setText(meaning);
        });

        Scene scene = new Scene(pane, 400, 150);

        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}