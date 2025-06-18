package javafxtest;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    public void buttonLogin(ActionEvent event) throws IOException {
        FXMLLoader newLoader = new FXMLLoader(getClass().getResource("/javafxtest/arquivosFxml/FXMLJanelaLogin.fxml"));
        Parent root1 = (Parent) newLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Login");
        
        Image icone = new Image("/javafxtest/img/carro-icone.png");
        stage.getIcons().add(icone);
    }
    
    @FXML
    public void buttonRegister(ActionEvent event) throws IOException{
        FXMLLoader newLoader = new FXMLLoader(getClass().getResource("/javafxtest/arquivosFxml/FXMLJanelaRegistro.fxml"));
        Parent root1 = (Parent) newLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
        stage.setTitle("Registro 1/2");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
