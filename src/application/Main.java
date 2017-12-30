package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
			
			try {
			
				FXMLLoader firstLoader = new FXMLLoader(getClass().getResource("MyView.fxml"));
				MyViewController first1 = new MyViewController();
				firstLoader.setController(first1);
				Parent root1 = firstLoader.load();
					Scene scene1 = new Scene(root1,600,630);
					scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setScene(scene1);
					primaryStage.setTitle("user1");
					primaryStage.show();						
					FXMLLoader loader2 = new FXMLLoader(getClass().getResource("MyView2.fxml"));					
					loader2.setController(first1);
					Parent root2 = loader2.load();
					Scene scene2 = new Scene(root2, 600, 630);
				        scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				        Stage stage = new Stage();
				        stage.setScene(scene2);
				        stage.setTitle("user2");
				        stage.show();				
					} catch(Exception e) {
					
					e.printStackTrace();
				}
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
		
	}

	

	
}
