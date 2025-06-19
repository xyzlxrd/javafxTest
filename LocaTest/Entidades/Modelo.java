package Entidades;

public class Modelo {

private String nomeModelo;
private String fabricante;
private int anoFabricacao;
    
    public Modelo(String nomeModelo, String fabricante, int anoFabricacao) {
        this.nomeModelo = nomeModelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return nomeModelo;
    }
    public void setModelo(String newModelo) {
        this.nomeModelo = newModelo;
    }
    
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String newFabricante) {
        this.fabricante = newFabricante;
    }
    
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int newAnoFabricacao) {
        this.anoFabricacao = newAnoFabricacao;
    }
}
