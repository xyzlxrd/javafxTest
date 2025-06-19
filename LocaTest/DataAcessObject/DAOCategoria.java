package DataAcessObject;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Conexao.ConnectorJC;
import Entidades.Categoria;

public class DAOCategoria {//Data Acess Object, uma classe que possui métodos que fazem a conexão com o banco de dados
   
    public void cadastrarCategoria (Categoria categoria) {//Método de Inserção de Dados

        //Comando SQL que insere dados na respectiva tabela no Banco, no caso abaixo, a tabela "Categoria"
        //As interrogações (?) entre parenteses após o "VALUES representam os valores que serão enviados por parâmetros

        String sql = "INSERT INTO Categoria(nome_categoria, valor_diaria) VALUES (?, ?)";

        //Permite pré-compilar uma instrução SQL e executá-la várias vezes com diferentes parâmetros
        PreparedStatement ps = null;

        try {//Chama a Classe e o Método de Conexão responsável pela conexão, bem como o uso do método ps(sql) para efetuar a inserção dos dados
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
