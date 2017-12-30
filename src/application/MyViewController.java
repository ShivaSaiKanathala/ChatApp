package application;


import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;



public class MyViewController implements Initializable{	
	
	
//    @FXML	
//    ComboBox<Object> color = new ComboBox<Object>(); 
    @FXML	
    ComboBox<Object> color1 = new ComboBox<Object>(); 
    @FXML	
    ComboBox<Object> color2 = new ComboBox<Object>(); 
    @FXML
	AnchorPane root = new AnchorPane();
    @FXML
   	AnchorPane root1 = new AnchorPane();
    @FXML
   	AnchorPane root2 = new AnchorPane();
    @FXML
    ComboBox<Object> font1 = new ComboBox<Object>();
    @FXML
    ComboBox<Object> font2 = new ComboBox<Object>();
    @FXML
    TextArea text = new TextArea();
    @FXML
    Text t = new Text();
    @FXML
    TextArea text1 = new TextArea("Enter your message here...");
    @FXML
     TextArea text2 = new TextArea("Enter your message here...");
    @FXML
    ComboBox<Object> text_color1= new ComboBox<Object>();
    @FXML
    ComboBox<Object> text_color2= new ComboBox<Object>();
    @FXML
    Button send1 = new Button("Send");
    @FXML
    Button send2 = new Button("Send");
    @FXML
	Button clear1 = new Button("Clear");
    @FXML
   	Button clear2 = new Button("Clear");
    @FXML
    VBox flow = new VBox();
    @FXML
    TextArea newtext = new TextArea();
    @FXML
    TextFlow textflow1 = new TextFlow();
    @FXML
    TextFlow textflow2 = new TextFlow();
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
   
    	
    	root1.setStyle("-fx-background-color: pink;");
    	root2.setStyle("-fx-background-color: black;");
    	/*font1.getSelectionModel().select(1);
    	font2.getSelectionModel().select(1);
    	textflow1.setStyle("-fx-background-color: white;");
    	textflow2.setStyle("-fx-background-color: white;");*/
    	
    	
		
	}
   
  
    @FXML
	final public void sendfunc1() {
    	
    	
    	int index1 = color1.getSelectionModel().getSelectedIndex();
    	if(index1 == 0) {
    		root1.setStyle("-fx-background-color: black;");
    	}else if(index1 == 1) {
    		root1.setStyle("-fx-background-color: silver;");
    	}else if(index1 == 2) {
    		root1.setStyle("-fx-background-color: grey;");
    	}else if(index1 == 3) {
    		root1.setStyle("-fx-background-color: pink;");
    	}else if(index1 == 4) {
    		root1.setStyle("-fx-background-color: white;");
    	}else if(index1 == 5) {
    		root1.setStyle("-fx-background-color: gold;");
    	}else if(index1 == 6) {
    		root1.setStyle("-fx-background-color: blue;");
    	}else if(index1 == 7) {
    		root1.setStyle("-fx-background-color: yellow;");
    	}else if(index1 == 8) {
    		root1.setStyle("-fx-background-color: red;");
    	}else if(index1 == 9) {
    		root1.setStyle("-fx-background-color: green;");
    	}else {
    		root1.setStyle("-fx-background-color: pink;");
    	}	
	 }
    @FXML
    public void sendfunc2(){
    	int index2 = color2.getSelectionModel().getSelectedIndex();
    	if(index2 == 0) {
    		root2.setStyle("-fx-background-color: black;");
    	}else if(index2 == 1) {
    		root2.setStyle("-fx-background-color: silver;");
    	}else if(index2 == 2) {
    		root2.setStyle("-fx-background-color: grey;");
    	}else if(index2 == 3) {
    		root2.setStyle("-fx-background-color: pink;");
    	}else if(index2 == 4) {
    		root2.setStyle("-fx-background-color: white;");
    	}else if(index2 == 5) {
    		root2.setStyle("-fx-background-color: gold;");
    	}else if(index2 == 6) {
    		root2.setStyle("-fx-background-color: blue;");
    	}else if(index2 == 7) {
    		root2.setStyle("-fx-background-color: yellow;");
    	}else if(index2 == 8) {
    		root2.setStyle("-fx-background-color: red;");
    	}else if(index2 == 9) {
    		root2.setStyle("-fx-background-color: green;");
    	}else {
    		root2.setStyle("-fx-background-color: Black;");
    	}	
    	    	
    }
    @FXML
    public void setfont1() {
    	//text1.getStyleClass().add("block");
    	
    	int index3 = font1.getSelectionModel().getSelectedIndex();	
    	if(index3 == 0 || index3 == 1 ||index3 == 2 ||index3 == 3 ||index3 == 4 ||index3 == 5)
		
			text1.setStyle("-fx-font-size: "+font1.getValue()+"pt;" + "-fx-text-fill :" +text_color1.getValue() );
		
		}
    
    @FXML
    public void setfont2() {
    	
    	//text2.getStyleClass().add("block");
    	int index4 = font2.getSelectionModel().getSelectedIndex();			
		if(index4 == 0 || index4 == 1 ||index4 == 2 ||index4 == 3 ||index4 == 4 ||index4 == 5)
		
			text2.setStyle("-fx-font-size: "+font2.getValue()+"pt;" + "-fx-text-fill :" +text_color2.getValue());
	       
		}
    @FXML
    public void settextcolor1() {
    	//text1.getStyleClass().add("block");
    	//text1.setStyle("-fx-font-size :"+ font1.getValue()+"pt;");
    	int index5 = text_color1.getSelectionModel().getSelectedIndex();		
    	if(index5 == 0 || index5 == 1 ||index5 == 2 ||index5 == 3 ||index5 == 4 ||index5 == 5||index5 == 6 ||index5 == 7 ||index5 == 8 )
		
			text1.setStyle("-fx-font-size :"+ font1.getValue()+"pt;"+"-fx-text-fill :"+text_color1.getValue());
		}
    @FXML
    public void settextcolor2() {
    	
    	int index6 = text_color2.getSelectionModel().getSelectedIndex();		
    	if(index6 == 0 || index6 == 1 ||index6 == 2 ||index6 == 3 ||index6 == 4 ||index6 == 5||index6 == 6 ||index6 == 7 ||index6 == 8 )
		
			text2.setStyle("-fx-font-size :"+ font2.getValue()+"pt;"+"-fx-text-fill :"+text_color2.getValue());
			
    }
  @FXML
  public void send1() {

			if (text1.getText()!= null)
			
			append1(LocalTime.now()+ "\n");
			append1("user1 :" +text1.getText());
			//append1(text1.getText());				
			append1("\n");
			
			refreshData1();
	  
	 
	  
  }
	
  @FXML
  public void send2() {
	  flow.getStyleClass().add("flow");
	  if (text2.getText()!= null)
			
			append2(LocalTime.now()+ "\n");
			append2("user2 :"+text2.getText());
			//append2(text2.getText());				
			append2("\n");
			
			refreshData2();
  }
  
  
 @FXML
public void clear1() {
	 text1.clear();
}
 @FXML
 public void clear2() {
	 
	 text1.clear();
}
 

  
	@FXML
	public synchronized void append1(String text) {

		Text t1 = new Text(text);
		Text t2 = new Text(text);
		if(text.contains("user1 :")) {
		t1.setStyle("-fx-font-size :"+ font1.getValue()+"pt;"+"-fx-fill :"+text_color1.getValue());
	    t2.setStyle("-fx-font-size :"+ font1.getValue()+"pt;"+"-fx-fill :"+text_color1.getValue());
	   


	    
	    textflow1.getChildren().add(t1);
		
		textflow2.getChildren().add(t2);
		}
		else {
			textflow1.getChildren().add(t1);
			
			textflow2.getChildren().add(t2);
		}
		System.out.println(font1.getValue());	
	}
	@FXML
	public synchronized void append2(String text) {

		Text t1 = new Text(text);
		Text t2 = new Text(text);
		
		
		if(text.contains("user2 :")) {	
			t2.setStyle("-fx-font-size :"+ font2.getValue()+"pt;"+"-fx-fill :"+text_color2.getValue());
	    t1.setStyle("-fx-font-size :"+ font2.getValue()+"pt;"+"-fx-fill :"+text_color2.getValue());
	
	    textflow1.getChildren().add(t1);
		
		textflow2.getChildren().add(t2);
		}
		else {
			textflow1.getChildren().add(t1);
			
			textflow2.getChildren().add(t2);
		}
		

		
	}
	@FXML
	private void refreshData1() {
		// TODO Auto-generated method stub
		text1.clear();
		//text2.clear();
	}
	
	@FXML
	private void refreshData2() {
		// TODO Auto-generated method stub
		text2.clear();
		//text2.clear();
	}

	
	
	

}
