package day4.testFxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainFxml extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmloader = new FXMLLoader(this.getClass().getResource("/fxml/MainWindow.fxml"));
        Pane pane = fxmloader.load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ranodm Titile");
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
