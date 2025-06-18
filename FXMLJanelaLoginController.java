package javafxtest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLJanelaLoginController implements Initializable {
    @FXML
    private TextField textUsername;
    @FXML
    private PasswordField textPassword;
    @FXML
    private Text textId;

    @FXML
    public void botaoLogin(ActionEvent event) {
        String user = textUsername.getText();
        String pass = textPassword.getText();

        boolean logado = IntegracaoBancoDados.verificarLogin(user, pass);

        if (logado) {
            Stage stage = (Stage) textUsername.getScene().getWindow();
            stage.close();

        } else {
            textId.setText("Credenciais erradas. Tente novamente!");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}