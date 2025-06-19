package javafxtest;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class FXMLJanelaPrincipal implements Initializable {

    @FXML private ToggleButton btnHatch;
    @FXML private ToggleButton btnSedan;
    @FXML private ToggleButton btnSUV;
    @FXML private ToggleButton btnPickup;
    @FXML private Button btnFiltrar;
    @FXML private TilePane tilePaneCarros;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnFiltrar.setOnAction(e -> filtrarCarros());
    }

    private void filtrarCarros() {
        List<Integer> categoriasSelecionadas = new ArrayList<>();
        if (btnHatch.isSelected()) categoriasSelecionadas.add(1);
        if (btnSedan.isSelected()) categoriasSelecionadas.add(2);
        if (btnSUV.isSelected()) categoriasSelecionadas.add(3);
        if (btnPickup.isSelected()) categoriasSelecionadas.add(4);
        List<CarroGetSet> carros = IntegracaoParaCarros.listarPorCategorias(categoriasSelecionadas);
        mostrarCarros(carros);
    }

    private void mostrarCarros(List<CarroGetSet> carros) {
        tilePaneCarros.getChildren().clear();
        for (CarroGetSet carro : carros) {
            VBox card = criarCardCarro(carro);
            tilePaneCarros.getChildren().add(card);
        }
    }

    private VBox criarCardCarro(CarroGetSet carro) {
        VBox box = new VBox(5);
        box.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 10; -fx-border-color: #ccc; -fx-border-radius: 5;");

        String caminhoImagem = "/imagens/carros/modelo_" + carro.getIdModelo() + ".png";

        ImageView img = new ImageView();
        InputStream is = getClass().getResourceAsStream(caminhoImagem);
        if(is != null) {
            img.setImage(new Image(is));
        } 
        else{
            System.out.println("Imagem não encontrada: " + caminhoImagem);
        }
        img.setFitWidth(120);
        img.setPreserveRatio(true);

        Label placa = new Label("Placa: " + carro.getPlaca());
        Label assentos = new Label("Assentos: " + carro.getQntAssentos());
        Label portas = new Label("Portas: " + carro.getQntPortas());
        Label cor = new Label("Cor: " + carro.getCor());
        Label disponivel = new Label(carro.isDisponibilidade() ? "Disponivel" : "Indisponivel");

        Button btnMais = new Button("Ver mais");

        box.getChildren().addAll(img, placa, assentos, portas, cor, disponivel, btnMais);
        return box;
    }
}