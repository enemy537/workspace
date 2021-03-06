package app;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application {		
	@Override
	public void start(Stage primatyStage) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,800,600);
		
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Escolha o caminho");
		
		File file = fileChooser.showOpenDialog(primatyStage);
		System.out.println(file.toString());
		primatyStage.setScene(scene);
		primatyStage.show();
	}
	public static void main(String[] args){
		launch(args);
	}

}
