package Entidades;

public class Categoria {//Criação do Objeto "Categoria" com seus respectivos atributos aos quais foram definidos no database
    
    private String nomeCategoria;
    private double valorDiaria;

    public Categoria(String nomeCategoria, double valorDiaria) {
        this.nomeCategoria = nomeCategoria;
        this.valorDiaria = valorDiaria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }
    public void setNomeCategoria(String novoNomeCategoria) {
        this.nomeCategoria = novoNomeCategoria;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(double novoValorDiaria) {
        this.valorDiaria = novoValorDiaria;
    }
}
