package javafxtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class JavaFXTest extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/javafxtest/arquivosFxml/FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("LOCAMAX");
        
        Image icone = new Image("/javafxtest/img/carro-icone.png");
        stage.getIcons().add(icone);
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}