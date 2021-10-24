package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("Hello World!");

		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
		root.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(new Scene(root, 1500, 1000));
		primaryStage.show();
	}
}

