package AlertBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Seamy on 6/9/2015.
 */
public class Main extends Application {


    Stage window;
    Scene scene;








    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

        Button button1 = new Button("Click me");
        button1.setOnAction(e -> {
           boolean result = ConfirmBox.display("Title of window", "Are you sure you want to save the file?");

            System.out.println(result);

        });








        StackPane layout = new StackPane();
        layout.getChildren().addAll(button1);

        scene = new Scene(layout, 300, 350);

        window.setScene(scene);
        window.setTitle("Here is my title");
        window.show();




    }

}
