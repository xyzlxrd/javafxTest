package javafxtest;

public class CarroGetSet {
    private int idCarro;
    private int idCategoria;
    private int idModelo;
    private String nome_carro;
    private String placa;
    private int qntAssentos;
    private int qntPortas;
    private double quilometragem;
    private String tipoCombustivel;
    private String potenciaMotor;
    private String cambio;
    private double capacidadeTanque;
    private boolean arCondicionado;
    private boolean airbag;
    private String cor;
    private String disponibilidade;
    

    public int getIdCarro() { return idCarro; }
    public void setIdCarro(int idCarro) { this.idCarro = idCarro; }

    public int getIdCategoria() { return idCategoria; }
    public void setIdCategoria(int idCategoria) { this.idCategoria = idCategoria; }

    public int getIdModelo() { return idModelo; }
    public void setIdModelo(int idModelo) { this.idModelo = idModelo; }

    public String getNomeCarro() { return nome_carro; }
    public void setNomeCarro(String nome_carro) { this.nome_carro = nome_carro; }
    
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public int getQntAssentos() { return qntAssentos; }
    public void setQntAssentos(int qntAssentos) { this.qntAssentos = qntAssentos; }

    public int getQntPortas() { return qntPortas; }
    public void setQntPortas(int qntPortas) { this.qntPortas = qntPortas; }

    public double getQuilometragem() { return quilometragem; }
    public void setQuilometragem(double quilometragem) { this.quilometragem = quilometragem; }

    public String getTipoCombustivel() { return tipoCombustivel; }
    public void setTipoCombustivel(String tipoCombustivel) { this.tipoCombustivel = tipoCombustivel; }

    public String getPotenciaMotor() { return potenciaMotor; }
    public void setPotenciaMotor(String potenciaMotor) { this.potenciaMotor = potenciaMotor; }

    public String getCambio() { return cambio; }
    public void setCambio(String cambio) { this.cambio = cambio; }

    public double getCapacidadeTanque() { return capacidadeTanque; }
    public void setCapacidadeTanque(double capacidadeTanque) { this.capacidadeTanque = capacidadeTanque; }

    public boolean isArCondicionado() { return arCondicionado; }
    public void setArCondicionado(boolean arCondicionado) { this.arCondicionado = arCondicionado; }

    public boolean isAirbag() { return airbag; }
    public void setAirbag(boolean airbag) { this.airbag = airbag; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public String getDisponibilidade() { return disponibilidade; }
    public void setDisponibilidade(String disponibilidade) { this.disponibilidade = disponibilidade; }
}