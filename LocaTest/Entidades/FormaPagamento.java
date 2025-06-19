package Entidades;

import java.util.Optional;

public class FormaPagamento { 

    public enum FormaDePagamento {
        CREDITO("Cartão de Crédito","CREDITO"),
        DEBITO("Cartão Débito","DEBITO"),
        PIX("Pix","PIX"),
        TRANSFERENCIA("Transferência","TRANSFERENCIA"),
        BOLETO("Boleto","BOLETO");

        //Armazena a descrição formatada
        private final String dscString;

        //Usado para busca
        private final String codigoInterno;

        //Construtor para inicializar a descrição de cada constante do enum
        FormaDePagamento(String dscString, String codigoInterno) {
            this.dscString = dscString;
            this.codigoInterno = codigoInterno;
        }

        public String getFormaPagamento() {
            return dscString;
        }

        public String getCodigoInterno() {
            return codigoInterno;
        }

    // Método estático para buscar a FormaDePagamento pelo código interno
    public static Optional<FormaDePagamento> getByCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            return Optional.empty();
        }
        for (FormaDePagamento forma : FormaDePagamento.values()) {
            if (forma.codigoInterno.equalsIgnoreCase(codigo.trim())) {
                return Optional.of(forma);
            }
        }
        return Optional.empty();
    }

    }

    /*public static FormaDePagamento formaPagamento(String metodoPagamento) {
        for (FormaDePagamento metodo : FormaDePagamento.values()) {
            if (metodo.getFormaPagamento().equalsIgnoreCase(metodoPagamento)) {
                return metodo;
            }
        }
        return null;
    }*/

}
