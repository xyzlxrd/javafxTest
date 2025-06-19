package javafxtest;

import java.sql.*;
import java.util.*;

public class IntegracaoParaCarros {
    private static final String url = "jdbc:mysql://localhost:3306/applocadora?useSSL=false&serverTimezone=UTC";
    private static final String usuario = "root";
    private static final String senha = "";

    public static List<CarroGetSet> listarPorCategorias(List<Integer> categoriasSelecionadas) {
        List<CarroGetSet> carros = new ArrayList<>();
        if (categoriasSelecionadas.isEmpty()) return carros;
        
        String placeholders = String.join(",", Collections.nCopies(categoriasSelecionadas.size(), "?"));
        String sql = "SELECT * FROM carro WHERE id_categoria IN (" + placeholders + ")";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            for (int i = 0; i < categoriasSelecionadas.size(); i++) {
                stmt.setInt(i + 1, categoriasSelecionadas.get(i));
            }

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                CarroGetSet carro = new CarroGetSet();
                carro.setIdCarro(rs.getInt("id_carro"));
                carro.setIdCategoria(rs.getInt("id_categoria"));
                carro.setIdModelo(rs.getInt("id_modelo"));
                carro.setPlaca(rs.getString("placa"));
                carro.setQntAssentos(rs.getInt("qnt_assentos"));
                carro.setQntPortas(rs.getInt("qnt_portas"));
                carro.setQuilometragem(rs.getDouble("quilometragem"));
                carro.setTipoCombustivel(rs.getString("tipo_combustivel"));
                carro.setPotenciaMotor(rs.getString("potencia_motor"));
                carro.setCambio(rs.getString("cambio"));
                carro.setCapacidadeTanque(rs.getDouble("capacidade_tanque"));
                carro.setArCondicionado(rs.getBoolean("arCondicionado"));
                carro.setAirbag(rs.getBoolean("airbag"));
                carro.setCor(rs.getString("cor"));
                carro.setDisponibilidade(rs.getBoolean("disponibilidade"));
                carros.add(carro);
            }
        } 
        catch (SQLException e) {
            System.out.println("Erro ao buscar carros: " + e.getMessage());
            e.printStackTrace();
        }
        return carros;
    }
}