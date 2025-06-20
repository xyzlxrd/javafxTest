package javafxtest;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextAlignment;

public class FXMLJanelaPrincipal implements Initializable {

    @FXML
    private TilePane tilePaneCarros;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tilePaneCarros.setHgap(15);
        tilePaneCarros.setVgap(15);
        carregarCarros();
    }

    private void carregarCarros() {
        List<Integer> categoriasSelecionadas = Arrays.asList(1, 2, 3);

        List<CarroGetSet> carros = IntegracaoParaCarros.listarPorCategorias(categoriasSelecionadas);

        for (CarroGetSet carro : carros) {
            VBox card = criarCardCarro(carro);
            tilePaneCarros.getChildren().add(card);
        }
    }
    
    private void abrirDetalhesCarro(CarroGetSet carro) {
            System.out.println("Abrindo detalhes para: " + carro.getNomeCarro());
    }
    
    private VBox criarCardCarro(CarroGetSet carro) {
            ImageView imagem = new ImageView();
        String imgPath = "/javafxtest/img/modelo_" + carro.getIdModelo() + ".png";
        imagem.setImage(new Image(getClass().getResourceAsStream(imgPath)));
        imagem.setFitWidth(150);
        imagem.setFitHeight(100);
        imagem.setPreserveRatio(true);
        
        Label titulo = new Label(carro.getNomeCarro());
        titulo.getStyleClass().add("titulo");
        titulo.setWrapText(true);
        titulo.setTextAlignment(TextAlignment.CENTER);

        String subtituloStr = "Cor: " + carro.getCor() + " | Combustível: " + carro.getTipoCombustivel();
        Label subtitulo = new Label(subtituloStr);
        subtitulo.getStyleClass().add("subtitulo");

        Label preco1 = new Label("A partir de");
        preco1.getStyleClass().add("subtitulo");
        Label preco2 = new Label("R$72,80/ Dia");
        preco2.getStyleClass().add("preco");
        Label preco3 = new Label("R$364/ Total");
        preco3.getStyleClass().add("subtotal");

        VBox precoBox = new VBox(5, preco1, preco2, preco3);
        precoBox.getStyleClass().add("preco-box");

        Button verMais = new Button("Ver mais");
        verMais.getStyleClass().add("button-vermais");
        verMais.setOnAction(e -> abrirDetalhesCarro(carro));

        VBox vbox = new VBox(15, titulo, subtitulo, imagem, precoBox, verMais);
        vbox.getStyleClass().add("cardCarro");
        vbox.setAlignment(Pos.CENTER);
        vbox.setPrefWidth(260);
        vbox.setPadding(new Insets(15));

        if (!tilePaneCarros.getStylesheets().contains(getClass().getResource("/javafxtest/arquivosFxml/fxmljanelalogin.css").toExternalForm())) {
            tilePaneCarros.getStylesheets().add(getClass().getResource("/javafxtest/arquivosFxml/fxmljanelalogin.css").toExternalForm());
        }

        return vbox;
    }
}