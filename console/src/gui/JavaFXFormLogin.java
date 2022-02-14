package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author William
 */
public class JavaFXFormLogin extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Container
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Welcome
        Text textWelcome = new Text("Welcome");
        textWelcome.setFont(Font.font("Tahoma", FontPosture.REGULAR, 20));
        grid.add(textWelcome, 0, 0, 2, 1);

        /// Username
        Label lblUsername = new Label("Username:");
        TextField txtUsername = new TextField();
        grid.add(lblUsername, 0, 1);
        grid.add(txtUsername, 1, 1);

        // Password
        Label lblPassword = new Label("Password:");
        PasswordField pwdPassword = new PasswordField();
        grid.add(lblPassword, 0, 2);
        grid.add(pwdPassword, 1, 2);

        // Message / Button
        Text txtMessage = new Text();
        Button btnLogin = new Button("Log in");
        btnLogin.setOnAction((event) -> {
            txtMessage.setText("Button 'Log in' has been pressed");
            txtMessage.setFill(Color.RED);
        });

        // Box
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(btnLogin);

        grid.add(hbox, 1, 4);
        grid.add(txtMessage, 1, 6);

        // Stage properties
        stage.setTitle("Login Form");
        stage.setScene(new Scene(grid, 500, 500));
        stage.show();
    }
}
