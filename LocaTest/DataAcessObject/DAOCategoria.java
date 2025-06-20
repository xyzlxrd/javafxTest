package DataAcessObject;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Conexao.ConnectorJC;
import Entidades.Categoria;

public class DAOCategoria {
   
    public void cadastrarCategoria (Categoria categoria) {//TESTAR


        String sql = "INSERT INTO Categoria(nome_categoria, valor_diaria) VALUES (?, ?)";

        PreparedStatement ps = null;

        try {
            ps = ConnectorJC.getConexao().prepareStatement(sql);

            ps.setString(1, categoria.getNomeCategoria());
            ps.setDouble(2, categoria.getValorDiaria());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
