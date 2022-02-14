package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author William
 */
public class JavaFXHelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Button
        Button btnHelloWorld = new Button("Hello World");
        btnHelloWorld.setOnAction((actionEvent) -> {
            // Alert Dialog
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hello World!");
            alert.setContentText("Hello World");
            alert.show();
        });

        // Container
        StackPane container = new StackPane();
        container.getChildren().add(btnHelloWorld);

        // Stage properties
        stage.setTitle("Hello World");
        stage.setScene(new Scene(container, 300, 300, Color.ALICEBLUE));
        stage.show();
    }
}