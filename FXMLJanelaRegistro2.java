package javafxtest;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class FXMLJanelaRegistro2 {
    @FXML
    private TextField textUsername;
    @FXML
    private PasswordField textPassword;
    @FXML
    private TextField textEmail;
    private int idPessoa;
    
    public void setIdPessoa(int id) {
        this.idPessoa = id;
    }
    
    @FXML
    private void botaoRegistro(ActionEvent event) throws IOException {
        System.out.println("Botão Finalizar Cadastro clicado!");
    }

    public void botaoFinalizarRegistro(ActionEvent event) {
        String username = textUsername.getText();
        String password = textPassword.getText();
        String email = textEmail.getText();
        boolean sucesso = IntegracaoBancoDados.registroDeLogin(
            idPessoa, username, password, email
        );
        
        if (sucesso) {
            System.out.println("Conta criada com sucesso!");
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close(); 
        } 
        else {
            System.out.println("Erro ao criar conta.");
        }
    }   
}