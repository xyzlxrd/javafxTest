package Entidades;
import java.time.LocalDate;

public class Cliente extends Pessoa{
    
    private int idPessoa;
    private String usuario;
    private String senha;

    public Cliente(int idPessoa, String cpf, String cnh, String nome,LocalDate dataNascimento, String telefone, String email, 
    String sexo, Endereco endereco, String usuario, String senha) {

        super(cpf, cnh, nome, dataNascimento, telefone, email, endereco, sexo);
        this.usuario = usuario;
        this.senha = senha;
        this.idPessoa = idPessoa;

    }
    
    public int getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String novoUsuario) {
        this.usuario = novoUsuario;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }

}
