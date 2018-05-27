package gui;

import java.io.File;

import dataLoading.JsonLoadData;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import main.Main;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;


public class StatisticsApp extends Application {

    private Button open; 
    public Button save;
    public StatisticsApp() 
    {
    	open = new Button("open File");
    	save = new Button("save Result");
    	open.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent event)
    		{
    			if(event.getSource() == getOpenButton()) {
    				FileChooser fileChooser = new FileChooser();
    				File selectedFile = fileChooser.showOpenDialog(null);
    				System.out.println("i am selecetd now");
    				if(selectedFile != null) {
    					Main.dataLoader = new JsonLoadData(selectedFile.getName());
    				}
    				
    			}
    		}
    	});
    }
    
    public Button getOpenButton() {
    	return open;
    }
    
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		HBox open1 = new HBox(10);
		open1.getChildren().add(open);
		HBox save1 = new HBox(10);
		save1.getChildren().add(save);
		
		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(open1, save1);
		Scene scene = new Scene(vbox, 800,600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
