package Entidades;

public class Carro {
    
    public enum TipoCombustivel {
        Gasolina,
        Etanol,
        Diesel,
        Híbrido,
        Flex,
        Elétrico
    }

    public enum PotenciaMotor {
        Motor_1_0,
        Motor_1_3,
        Motor_1_4,
        Motor_1_5,
        Motor_1_6,
        Motor_1_8,
        Motor_2_0,
        Motor_2_0up
    }

    public enum Cambio {
        Manual,
        Automático,
        CVT
    }

    public enum Disponibilidade {
        Disponível,
        Alugado,
        Em_manutenção
    }

    private String placa;
    private int qntAssentos;
    private int qntPortas;
    private int quilometragem;
    private TipoCombustivel tipoCombustivel;
    private PotenciaMotor potenciaMotor;
    private Cambio cambio;
    private int capacidadeTanque;
    private boolean arCondicionado;
    private boolean airbag;
    private String cor;
    private Disponibilidade disponibilidade;

}
