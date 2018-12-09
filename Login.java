package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

	
	//Image image = new Image(ClassLoader.getSystemResourceAsStream(Login_64x.png));
	//ImageView imageView = new ImageView(image);
	//HBox hBox = new HBox(30, imageView, lblMsg);
	
	private PasswordField passField = new PasswordField();
	private Button loginBtnType = new Button("Login");
	private Button cancelBtnType = new Button("Cancel");
	private ComboBox<String> cbxUsers = new ComboBox<String>();
	private Label welcomeMsg = new Label("Logowanie do systemu SYTLEman");
	//private HBox environmentChoose = new HBox();
	//private HBox userName = new HBox();
	//private HBox password = new HBox(passField);
	//private HBox buttons = new HBox(loginBtnType, cancelBtnType);
		
	
	@Override
	public void start(Stage primaryStage) {

		
		BorderPane border = new BorderPane();
		HBox hbox = buttonsBox();
		border.setTop(hbox);
		
		HBox pswdBox = passwordBox();
		border.setLeft(pswdBox);

		HBox userBox = userBox();
		border.setCenter(userBox);
		
		HBox wlcmBox = welcomeBox();
		border.setRight(wlcmBox);
		
				
		Scene scene = new Scene(border);		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Logowanie");
		primaryStage.centerOnScreen();
		primaryStage.show();
		
		
	}
	
	public HBox buttonsBox() {
	    HBox hbox = new HBox();
	    hbox.setPadding(new Insets(15, 12, 15, 12));
	    hbox.setSpacing(10);

	    loginBtnType.setPrefSize(100, 20);

	    cancelBtnType.setPrefSize(100, 20);
	    
	    hbox.getChildren().addAll(loginBtnType, cancelBtnType);

	    return hbox;
	}
	
	public HBox passwordBox() {
	    HBox pswdBox = new HBox();
	    pswdBox.setPadding(new Insets(15, 12, 15, 12));
	    pswdBox.setSpacing(10);

	    passField.setPrefSize(100, 20);

	    
	    pswdBox.getChildren().addAll(passField);

	    return pswdBox;
	}
	
	public HBox userBox() {
	    HBox userBox = new HBox();
	    userBox.setPadding(new Insets(15, 12, 15, 12));
	    userBox.setSpacing(10);

	    cbxUsers.setPrefSize(100, 20);

	    
	    userBox.getChildren().addAll(cbxUsers);

	    return userBox;
	}
	public HBox welcomeBox() {
	    HBox wlcmBox = new HBox();
	    wlcmBox.setPadding(new Insets(15, 12, 15, 12));
	    wlcmBox.setSpacing(10);

	    welcomeMsg.setPrefSize(100, 20);

	    
	    wlcmBox.getChildren().addAll(welcomeMsg);

	    return wlcmBox;
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
