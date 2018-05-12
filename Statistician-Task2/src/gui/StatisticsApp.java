package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import sun.applet.Main;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;


public class StatisticsApp extends Application{

    private Button open; 
    private Button save;
    public StatisticsApp() 
    {
    	open = new Button("open File");
    	save = new Button("save Result");
    }
    
    public Button getOpenButton() {
    	return open;
    }
    
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		
	}

}
