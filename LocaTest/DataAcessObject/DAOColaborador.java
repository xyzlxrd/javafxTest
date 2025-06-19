package DataAcessObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexao.ConnectorJC;
import Entidades.Colaborador;

public class DAOColaborador {

    public void cadastrarColaborador(Colaborador colaborador) {

        String sql = "INSERT INTO Colaborador (id_pessoa, matricula, senha) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = ConnectorJC.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, colaborador.getIdPessoa());
            ps.setString(2, colaborador.getMatricula());
            ps.setString(3, colaborador.getSenha());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int idGerado = rs.getInt(1);
                colaborador.setIdColaborador(idGerado);
            }

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    } 
}
