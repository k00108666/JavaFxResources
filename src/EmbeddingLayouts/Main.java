package EmbeddingLayouts;

/**
 * Created by Seamy on 6/10/2015.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston - JavaFX");



        HBox topMenu = new HBox();
        Button  button1 = new Button("File");
        Button button2 = new Button("Edit");
        Button button3 = new Button("View");

        topMenu.getChildren().addAll(button1, button2, button3);

        VBox leftMenu = new VBox();
        Button  button4 = new Button("File");
        Button button5 = new Button("Edit");
        Button button6 = new Button("View");

        leftMenu.getChildren().addAll(button4, button5, button6);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);



        Scene scene = new Scene(borderPane, 300, 250);

        window.setScene(scene);
        window.show();
    }


}
