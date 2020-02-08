package Day6.Ex1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Arial", FontWeight.BOLD, 20)); //Tahoma
        grid.add(scenetitle, 0, 0, 3, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        //userTextField.setPrefColumnCount(10);
        //userTextField.setPrefWidth(30);
        grid.add(userTextField, 1, 1);

        Label userID = new Label("User ID:");
        grid.add(userID, 0, 2);
        
        TextField pwUsrID = new TextField();
        grid.add(pwUsrID, 1, 2);
        
        Label pw = new Label("Password:");
        grid.add(pw, 0, 3);
        grid.setGridLinesVisible(false) ;

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 3);

        Button btn1 = new Button("Sign in");
        Button btn2 = new Button("Sign Out");
        HBox hbBox = new HBox(10);
        hbBox.setAlignment(Pos.BOTTOM_RIGHT);
        hbBox.getChildren().add(btn1);
        hbBox.getChildren().add(btn2);
        grid.add(hbBox, 1, 4);

        //"final" prevents modification by the handler
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
		btn1.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        	   actiontarget.setFill(Color.FIREBRICK);
        	   actiontarget.setText("Sign in button pressed");
        	}
        });
    	btn2.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        public void handle(ActionEvent e) {
        actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setText("Sign Out button pressed");
        }
    	});
        //Scene scene = new Scene(grid, 300, 200);
        Scene scene = new Scene(grid);
//        Scene scene = new Scene(grid, 300, 275);
//        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("Login.css").toExternalForm());
        primaryStage.show();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}