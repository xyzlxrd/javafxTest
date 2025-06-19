package Entidades;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import DataAcessObject.DAOEndereco;
import DataAcessObject.DAOPessoa;

public class App {
    
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("CPF: ");
    String cpf = scanner.nextLine();

    System.out.print("CNH: ");
    String cnh = scanner.nextLine();

    System.out.print("NOME: ");
    String nome = scanner.nextLine();

    System.out.print("DATA DE NASCIMENTO: ");
    String dataNascimento = scanner.nextLine();

    System.out.print("TELEFONE: ");
    String telefone = scanner.nextLine();

    System.out.print("EMAIL: ");
    String email = scanner.nextLine();

    System.out.print("SEXO (M/F): ");
    String sexo = scanner.nextLine();



    System.out.print("CEP: ");
    String cep = scanner.nextLine();

    System.out.print("PAÍS: ");
    String pais = scanner.nextLine();

    System.out.print("ESTADO: ");
    String estado = scanner.nextLine();

    System.out.print("CIDADE: ");
    String cidade = scanner.nextLine();

    System.out.print("BAIRRO: ");
    String bairro = scanner.nextLine();

    System.out.print("RUA: ");
    String rua = scanner.nextLine();

    System.out.print("NÚMERO: ");
    String numero = scanner.nextLine();

    Endereco endereco = new Endereco(null, null, null, null, null, null, null);
    Pessoa pessoa = new Pessoa(null, null, null, null, null, null, null, null);

    endereco.setCep(cep);
    endereco.setPais(pais);
    endereco.setEstado(estado);
    endereco.setCidade(cidade);
    endereco.setBairro(bairro);
    endereco.setRua(rua);
    endereco.setNumero(numero);

    pessoa.setCpf(cpf);
    pessoa.setCNH(cnh);
    pessoa.setNome(nome);
    pessoa.setNascimento(dataNascimento);
    pessoa.setTelefone(telefone);
    pessoa.setEmail(email);
    pessoa.setSexo(sexo);

    System.out.println("DADOS DA PESSOA GERADA");
    pessoa.getDados();
    endereco.getEnderecoCompleto();

    new DAOPessoa().cadastrarPessoa(pessoa);

    endereco.setIdPessoa(pessoa.getIdPessoa());

    new DAOEndereco().cadastrarEndereco(endereco);
    



































    /*
    Aluguel aluguel = new Aluguel(null, null, null, null, 0, null);

    String respostaUsuario = null;
    String respostaHoraUsuario = null;

        System.out.print("A Data da Retirada do Veículo foi marcada? (Y/N): ");
        respostaUsuario = scanner.nextLine();

        if (respostaUsuario.equalsIgnoreCase("Y")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataMarcada;

            while (true) {
                System.out.print("Digite a data marcada (dd/MM/yyyy): ");
                dataMarcada = scanner.nextLine();

                try {
                    LocalDate dataConvertida = LocalDate.parse(dataMarcada, formatter);

                    if (dataConvertida.isBefore(LocalDate.now())) {
                        System.out.println("Data de Retirada Inválida (data no passado). Tente novamente.");
                    } else {
                        break;
                    }
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de data inválido. Use o padrão dd/MM/yyyy.");
                }
            }
            aluguel.setDataRetirada(dataMarcada);
        }
            
    System.out.print("Data de Devolução: ");
    String dataDevolucao = scanner.nextLine();

    System.out.print("A Hora da Retirada do Veículo foi marcada? (Y/N): ");
    respostaHoraUsuario = scanner.nextLine();

        if (respostaHoraUsuario.equalsIgnoreCase("Y")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            String horaMarcada;

            while (true) {
                System.out.print("Digite a Hora marcada (HH:mm): ");
                horaMarcada = scanner.nextLine();

                try {
                    LocalTime horaConvertida = LocalTime.parse(horaMarcada, formatter);

                    if (horaConvertida.isBefore(LocalTime.now())) {
                        System.out.println("Data de Retirada Inválida (data no passado). Tente novamente.");
                    } else {
                        break;
                    }
                } catch (DateTimeParseException e) {
                    System.out.println("Formato inválido. Use o padrão HH:mm.");
                }
            }
            aluguel.setHoraRetirada(horaMarcada);
        }

    System.out.print("Hora de Devolucão: ");
    String horaDevolucao = scanner.nextLine();

    System.out.print("Valor da Contratação: ");
    double valorContratacao = scanner.nextDouble();

    System.out.println("Digite a forma de Pagamento");
    System.out.println("1) Cartão de Crédito");
    System.out.println("2) Cartão Débito");
    System.out.println("3) PIX");
    System.out.println("4) Transferência");
    System.out.println("5) Boleto");
    System.out.print("Opção: ");
    int opcaoPagamento = scanner.nextInt();

    String formaDePagamento = null;

    switch (opcaoPagamento) {
        case 1:
            formaDePagamento = "Cartão de Crédito";
        break;

        case 2:
            formaDePagamento = "Cartão Débito";
        break;

        case 3:
            formaDePagamento = "Pix";
        break;

        case 4:
            formaDePagamento = "Transferência";
        break;

        case 5:
            formaDePagamento = "Boleto";
        break;

        default:
            System.out.println("Opção Inválida.");
        break;
    }

    aluguel.setDataDevolucao(dataDevolucao);
    aluguel.setHoraDevolucao(horaDevolucao);
    aluguel.setValorContrato(valorContratacao);
    aluguel.setFormaPagamento(formaDePagamento);

    System.out.println("INFORMAÇÕES DO ALUGUEL:");
    System.out.println("Data de Retirada: "+(aluguel.getDataRetirada()));
    System.out.println("Data de Devolução: "+(aluguel.getDataDevolucao()));
    System.out.println("Hora de Retirada: "+(aluguel.getHoraRetirada()));
    System.out.println("Hora de Devolução: "+(aluguel.getHoraDevolucao()));
    System.out.println("Valor do Contrato: "+(aluguel.getValorContrato()));
    System.out.println("Forma de Pagamento: "+(aluguel.getFormaPagamento()));
    scanner.close();
    */
    }
}
