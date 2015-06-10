package AlertBox;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


/**
 * Created by Seamy on 6/9/2015.
 */
public class AlertBox {


    public static void display(String title, String message){

            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle(title);
            window.setMinWidth(200);

            Label label = new Label(message);

            Button button = new Button("Close the window");
            button.setOnAction(e -> window.close());

            VBox layout = new VBox();
            layout.getChildren().addAll(label, button);

            layout.setAlignment(Pos.CENTER);

            Scene scene = new Scene(layout);

            window.setScene(scene);
            window.showAndWait();









    }

}
