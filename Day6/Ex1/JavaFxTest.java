package Day6.Ex1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFxTest extends Application{
	
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Pruebalo.fxml"));

    	primaryStage.setTitle("FXML Welcome");
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    }
}
