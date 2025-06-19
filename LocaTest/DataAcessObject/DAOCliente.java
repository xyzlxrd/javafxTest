package DataAcessObject;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Conexao.ConnectorJC;
import Entidades.Cliente;

public class DAOCliente {

    public void cadastrarCliente(Cliente cliente) {

        String sql = "INSERT INTO Cliente (id_pessoa, usuario, senha) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = ConnectorJC.getConexao().prepareStatement(sql);

            ps.setInt(1, cliente.getIdPessoa());
            ps.setString(2, cliente.getUsuario());
            ps.setString(3, cliente.getSenha());

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    } 
}
