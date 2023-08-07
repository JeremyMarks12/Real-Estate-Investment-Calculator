package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SearchSceneController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private String fileName;
	
	@FXML
	private TextField file;
	
	public SearchSceneController() {
		
	}
	
	// This method is for the search bar. It stores user input into the fileName instance variable.
	public void getFile() {
		fileName = file.getText();
		}
	
	// This method is connected to the import button on the GUI. It reads the file and outputs it to the console. 
	@FXML 
	public void readFile(ActionEvent event) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// This method allows the user to switch back to the calculator. 
	@FXML
	public void previousPage(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
		root = loader.load();
		SceneController sceneController = loader.getController();
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	

}
