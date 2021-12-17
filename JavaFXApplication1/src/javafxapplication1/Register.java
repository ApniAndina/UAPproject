package javafxapplication1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Register extends Application  {
    private StackPane root = new StackPane();
    private Stage stage;

    @Override
    public void init() {
        Button button = new Button("OPEN");
        VBox vBox = new VBox();

        vBox.setSpacing(8);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.getChildren().addAll(
                new Label("First Name"),
                new TextField(),
                new Label("Last Name"),
                new TextField(),
                new Label("E-Mail Address"),
                new TextField(),
                new Label("Contact No"),
                new TextField(),
                new Label("Password"),
                new PasswordField(),
                new Label("Confirm Password"),
                new PasswordField(),
                new Button("REGISTER"));
        root.getChildren().addAll(vBox);

        button.setOnAction(actionEvent-> {
            if(stage!=null){
                stage.requestFocus();
                return;
            }
            stage = new Stage();
            StackPane stackPane = new StackPane();
            stage.setScene(new Scene(stackPane, 200,200));
            stage.show();
        });
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root,400,600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Registration Example JavaFX");
        primaryStage.setAlwaysOnTop(true);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
