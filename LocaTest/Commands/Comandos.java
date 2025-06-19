package Commands;

public class Comandos {
    
        /*
        try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataDevolucao = LocalDate.parse(dataDevolucaoStr, formatter);
            } catch (DateTimeParseException exception) {
        System.out.println("Data de Devolucao Inválida. Siga a formatação (dd/MM/yyyy).");
        this.dataDevolucao = null;
        }*/

        /*
        try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.horaDevolucao = LocalTime.parse(horaDevolucaoStr, formatter);
            } catch (DateTimeParseException exception) {
        System.out.println("Data de Devolucao Inválida. Siga a formatação (HH:mm:ss).");
        this.horaDevolucao = null;
        }
        */

/*     public enum FormaDePagamento {
        CDC("Cartão de Crédito"),
        CD("Cartão Débito"),
        PIX("Pix"),
        TRF("Transferência"),
        BLT("Boleto");

        private final String dscString;
        FormaDePagamento(String descricaoString) {
            this.dscString = descricaoString;
        }

        public String getFormaPagamento() {
            return dscString;
        }
    }*/

    /*public static FormaDePagamento formaPagamento(String metodoPagamento) {
        for (FormaDePagamento metodo : FormaDePagamento.values()) {
            if (metodo.getFormaPagamento().equalsIgnoreCase(metodoPagamento)) {
                return metodo;
            }
        }
        return null;
    }*/

/*   
    Categoria cat = new Categoria(null, 0);

    cat.setNomeCategoria("TesteN2");
    cat.setValorDiaria(999);

    new DAOCategoria().cadastrarCategoria(cat);
*/


/*    Endereco end = new Endereco(0, null, null, null, null, null, null, null);

    end.setIdCliente(0);
    end.setCep("12345678900");
    end.setPais("Brasil");
    end.setEstado("MG");
    end.setCidade("Cidade X");
    end.setBairro("Bairro X");
    end.setRua("Rua X");
    end.setNumero("123");

    new DAOEndereco().cadastrarEndereco(end);
*/

/*
    Pessoa pessoa = new Pessoa(null, null, null, null, null, null, null, null)

    System.out.print("CPF: ");
    String cpf = scanner.nextLine();

    System.out.print("CNH: ");
    String cnh = scanner.nextLine();

    System.out.print("NOME: ");
    String nome = scanner.nextLine();

    System.out.print("DATA NASCIMENTO (yyyy-MM-dd): ");
    String dataString = scanner.nextLine();
    LocalDate dataNascimento = LocalDate.parse(dataString);

    System.out.print("TELEFONE: ");
    String telefone = scanner.nextLine();

    System.out.print("E-MAIL: ");
    String email = scanner.nextLine();

    System.out.print("SEXO: ");
    String sexo = scanner.nextLine();

    pessoa.setCpf(cpf);
    pessoa.setCNH(cnh);
    pessoa.setNome(nome);
    pessoa.setNascimento(dataNascimento);
    pessoa.setTelefone(telefone);
    pessoa.setEmail(email);
    pessoa.setSexo(sexo);

    new DAOPessoa().cadastrarPessoa(pessoa);
*/

/*
        public void getDados(){       
        System.out.println("CPF: "+cpf+" | NOME: "+nome+" | SEXO: "+sexo);
        System.out.println("NOME: "+nome);
        System.out.println("SEXO: "+sexo);
        System.out.println("DATA DE NASCIMENTO: "+dataNascimento);
        System.out.println("CNH: "+cnh);
        System.out.println("TELEFONE: "+telefone);
        System.out.println("E-MAIL: "+email);
    }
 */

}
