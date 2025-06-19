package Entidades;

import java.time.LocalDate;

public class Colaborador extends Pessoa {
    
    private int idColaborador;
    private String matricula;
    private String senha;
    
    public Colaborador(String cpf, String cnh, String nome, LocalDate dataNascimento, String telefone, String email,
    String sexo, Endereco endereco, String matricula, String senha) {
        
        super(cpf, cnh, nome, dataNascimento, telefone, email, endereco, sexo);
        this.matricula = matricula;
        this.senha = senha;   
    }
    
    public int getIdColaborador() {
        return idColaborador;
    }
    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getMatricula () {
        return matricula;
    }
    public void setMatricula (String novaMatricula) {
        this.matricula = novaMatricula;
    }
    
    public String getSenha () {
        return senha;
    }
    public void setSenha (String novaSenha) {
        this.senha = novaSenha;
    }

}
