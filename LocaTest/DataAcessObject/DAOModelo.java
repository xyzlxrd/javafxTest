package DataAcessObject;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.ConnectorJC;
import Entidades.Modelo;

public class DAOModelo {
    
    public void cadastrarModelo (Modelo modelo) {

        String sql = "INSERT INTO Modelo(nome_modelo, fabricante, ano_fabricacao) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

    }

}
