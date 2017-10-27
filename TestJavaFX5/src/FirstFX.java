

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class FirstFX extends Application {
    
	Label label1;
	Button button1;
	int i=1;
	public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception{
    	stage.setTitle("My First Stage Title");
    	label1 = new Label("My first Label");
    	VBox root = new VBox();
    	
    	Scene scene = new Scene(root, 400, 800);
    	stage.setScene(scene);
    	
    	button1 = new Button("My first button");
    	button1.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                System.out.println("Hello World!!!");
                label1.setText("Try"+i);
                i++;
            }
        });
    	
    	root.getChildren().addAll(label1,button1);
    	stage.show();
    }
}