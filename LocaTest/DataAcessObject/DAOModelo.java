package DataAcessObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Conexao.ConnectorJC;
import Entidades.Modelo;

public class DAOModelo {

    public void cadastrarColaborador(Modelo modelo) {//TESTAR

        String sql = "INSERT INTO Modelo (nome_modelo, fabricante, ano_fabricacao) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = ConnectorJC.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, modelo.getIdModelo());
            ps.setString(2, modelo.getFabricante());
            ps.setInt(3, modelo.getAnoFabricacao().getValue());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int idGerado = rs.getInt(1);
                modelo.setIdModelo(idGerado);
            }

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    } 
}
