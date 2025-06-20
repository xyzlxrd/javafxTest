package javafxtest;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLJanelaRegistroController implements Initializable {
    @FXML
    private TextField textNome;
    @FXML
    private TextField numCEP;
    @FXML
    private TextField textRua;
    @FXML
    private TextField numCPF;
    @FXML
    private TextField textEstado;
    @FXML
    private TextField numNumeroResid;
    @FXML
    private TextField selectPais;
    @FXML
    private TextField textBairro;
    @FXML
    private TextField numTelefone;
    @FXML
    private TextField numCNH;
    @FXML
    private TextField textCidade;
    @FXML
    private DatePicker numNascimento;
    
    @FXML
    public void botaoRegistro(ActionEvent event) throws IOException {
        String nome = textNome.getText();
        String cpf = numCPF.getText();
        String telefone = numTelefone.getText();
        String cidade = textCidade.getText();
        String cep = numCEP.getText();
        String rua = textRua.getText();
        String numero = numNumeroResid.getText();
        String bairro = textBairro.getText();
        String estado = textEstado.getText();
        String pais = selectPais.getText();
        String cnh = numCNH.getText();
        String nascimento = numNascimento.getValue().toString();

        int idPessoa = IntegracaoBancoDados.registroUsuario(
            nome, cpf, telefone, cep, cidade, rua, numero, bairro, nascimento, estado, pais, cnh
        );
        if (idPessoa != 0) {
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/javafxtest/arquivosFxml/FXMLJanelaRegistro2.fxml"));
            Parent root = loader.load();
            FXMLJanelaRegistro2 controller2 = loader.getController();
            controller2.setIdPessoa(idPessoa);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
        } else {
            System.out.println("Erro ao registrar etapa 1.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}