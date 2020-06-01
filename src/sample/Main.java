package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World Application");
        primaryStage.setWidth(300);
        primaryStage.setHeight(275);



        Label helloWorldLabel = new Label("Hello world!");
        helloWorldLabel.setAlignment(Pos.CENTER);
        Scene primaryScene = new Scene(helloWorldLabel);
        primaryStage.setScene(primaryScene);

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/mainScene.fxml"));
        Controller controller = loader.getController();
        loader.setController(new Controller());

        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

