package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("test_taker_interface.fxml"));
        primaryStage.setTitle("Hello World");
        Scene test_taker_interface = new Scene(root);

        primaryStage.setScene(test_taker_interface);
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(500);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
