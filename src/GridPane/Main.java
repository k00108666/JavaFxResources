package GridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;




/**
 * Created by Seamy on 6/10/2015.
 */
public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("GridPane Tutorial");


        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setVgap(8);
        pane.setHgap(10);



        javafx.scene.control.Label nameLabel = new javafx.scene.control.Label("User Name");
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameInput = new TextField("Seamy");
        GridPane.setConstraints(nameInput, 1, 0);

        javafx.scene.control.Label passLabel = new Label();
        GridPane.setConstraints(passLabel, 0, 1);

        TextField passInput = new TextField();
        passInput.setPromptText("**********");
        GridPane.setConstraints(passInput, 0, 2);

        Button button = new Button("Login");
        GridPane.setConstraints(button, 1, 2);

        pane.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, button);

        Scene scene = new Scene(pane, 300, 300);

        window.setScene(scene);



        window.show();
    }


}
