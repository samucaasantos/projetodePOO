package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static classes.PontodeParada.exibirTotalPontosDeParada;
import static classes.Rota.calcularDemandaRota;
import static classes.Rota.exibirTotalRotas;


public class Aplicacao {

     static ArrayList<Aluno> alunos = new ArrayList<>();
     static ArrayList<Motorista> motoristas = new ArrayList<>();
     static ArrayList<Contrato> contratos = new ArrayList<>();
     static ArrayList<Escola> escolas = new ArrayList<>();
     static ArrayList<Veiculo> veiculos = new ArrayList<>();
     static ArrayList<Fornecedor> fornecedores = new ArrayList<>();
     static ArrayList<PontodeParada> pontosDeParada = new ArrayList<>();
     static ArrayList<ArrayList<PontodeParada>> rotas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar aluno");
            System.out.println("2. Criar motorista");
            System.out.println("3. Criar contrato");
            System.out.println("4. Criar escola");
            System.out.println("5. Criar veículo");
            System.out.println("6. Criar ponto de parada");
            System.out.println("7. Criar nova rota");
            System.out.println("8. Criar fornecedor");
            System.out.println("9. Exibir informações detalhadas de um aluno, motorista, escola ou fornecedor");
            System.out.println("10. Exibir tipo da pessoa (Aluno, Motorista, Escola ou Fornecedor)");
            System.out.println("11. Calcular demanda de uma rota específica");
            System.out.println("12. Exibir o número total de rotas criadas");
            System.out.println("13. Exibir o número total de pontos de parada criados");
            System.out.println("14. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    criarAluno(scanner);
                    break;
                case 2:
                    criarMotorista(scanner);
                    break;
                case 3:
                    criarContrato(scanner);
                    break;
                case 4:
                    criarEscola(scanner);
                    break;
                case 5:
                    criarVeiculo(scanner);
                    break;
                case 6:
                    criarPontoDeParada(scanner);
                    break;
                case 7:
                    criarNovaRota(scanner);
                    break;
                case 8:
                    criarFornecedor(scanner);
                    break;
                case 9:
                   exibirInformacoes(scanner);
                    break;
                case 10:
                    qualTipo(scanner);
                    break;
                case 11:
                    calcularDemandaRota(scanner);
                    break;
                case 12:
                    exibirTotalRotas();
                    break;
                case 13:
                    exibirTotalPontosDeParada();
                    break;
                case 14:
                    running = false;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void criarAluno(Scanner scanner) {
        System.out.print("Nome Oficial: ");
        String nomeOficial = scanner.nextLine();

        System.out.println("CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Rua:");
        String rua = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Número:");
        Integer numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Complemento: ");
        String complemento = scanner.nextLine();

        System.out.println("Bairro:");
        String bairro = scanner.nextLine();

        System.out.println("Telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Nome da mãe:");
        String mae = scanner.nextLine();

        System.out.println("Nome do pai:");
        String pai = scanner.nextLine();

        System.out.println("Naturalidade: ");
        String naturalidade = scanner.nextLine();


        scanner.nextLine();

        System.out.println("Data de nascimento(digite o ano, tecle enter, digite o mês, tecle enter e digite a data) ");
        int ano = scanner.nextInt();
        int mes = scanner.nextInt();
        int dia  = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Matricula:");
        Integer matricula = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Serie:");
        String serie = scanner.nextLine();

        System.out.println("Deseja associar uma escola e um ponto de parada ao aluno?(Sim/Não)");
        String resposta = scanner.nextLine();

        scanner.nextLine();

        if (resposta.equals("Sim")) {
            System.out.println("Selecione uma das escolas disponíveis(de 0 a " + (escolas.size()-1) + "): ");
            int escolaSelecionada = scanner.nextInt();
            System.out.println("Selecione um dos pontos de parada disponíveis(de 0 a " + (pontosDeParada.size()-1) + "):");
            int pontoSelecionado = scanner.nextInt();

            Aluno aluno = new Aluno(nomeOficial,cpf, new Endereco(rua, numero, complemento, bairro), telefone, nome, mae, pai, naturalidade,new Date(ano, mes, dia), matricula, serie, escolas.get(escolaSelecionada), pontosDeParada.get(pontoSelecionado));
            alunos.add(aluno);
            System.out.println("Aluno criado com sucesso.");
        }

        if (resposta.equals("Não")) {
            Aluno aluno = new Aluno(nomeOficial,cpf, new Endereco(rua, numero, complemento, bairro), telefone, nome, mae, pai, naturalidade,new Date(ano, mes, dia), matricula, serie);
            alunos.add(aluno);
            System.out.println("Aluno criado com sucesso.");
        }else {
            System.out.println("Resposta inválida, tente novamente");
        }
    }

    private static void criarMotorista(Scanner scanner) {
        System.out.print("Nome Oficial: ");
        String nomeOficial = scanner.nextLine();

        System.out.println("CPF:");
        String cpfCnpj = scanner.nextLine();

        System.out.println("Rua:");
        String rua = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Número:");
        Integer numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Complemento: ");
        String complemento = scanner.nextLine();

        System.out.println("Bairro:");
        String bairro = scanner.nextLine();

        System.out.println("Telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Nome da mãe:");
        String mae = scanner.nextLine();

        System.out.println("Nome do pai:");
        String pai = scanner.nextLine();

        System.out.println("Naturalidade:");
        String naturalidade = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Data de nascimento(digite o ano, tecle enter, digite o mês, tecle enter e digite a data): ");
        int ano = scanner.nextInt();
        int mes = scanner.nextInt();
        int dia  = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Número da Habilitação:");
        String numHabilitacao = scanner.nextLine();

        System.out.println("Categoria da Habilitação:");
        String catHabilitacao = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Tipo(0 para servidor e 1 para terceirizado):");
        Integer tipo = scanner.nextInt();

        if (tipo == 0) {
            Motorista motorista = new Motorista(nomeOficial, cpfCnpj, new Endereco(rua, numero, complemento, bairro), telefone, nome, mae, pai, naturalidade, new Date(ano, mes, dia), numHabilitacao, catHabilitacao);
            motoristas.add(motorista);
            System.out.println("Motorista criado com sucesso.");
        }

        else if (tipo == 1) {
            System.out.println("Quantos contratos serão associados ao motorista?");
            int totalContratos = scanner.nextInt();
            ArrayList<Contrato> contratosMotorista = new ArrayList<>();
            if (totalContratos > contratos.size()) {
                System.out.println("Não há tantos contratos disponíveis, tente novamente");
            }else {
                for (int i = 0; i < totalContratos; i++) {
                    System.out.println("Selecione um dos contratos disponíveis(de 0 a " + (contratos.size() - 1) + "):");
                    int contratoSelecionado = scanner.nextInt();
                    contratosMotorista.add(contratos.get(contratoSelecionado));
                }
                Motorista motorista = new Motorista(nomeOficial, cpfCnpj, new Endereco(rua, numero, complemento, bairro), telefone, nome, mae, pai, naturalidade, new Date(ano, mes, dia), numHabilitacao, catHabilitacao, contratosMotorista);
                motoristas.add(motorista);
                System.out.println("Motorista criado com sucesso.");
            }
        }
        else {
            System.out.println("Tipo inválido, tente novamente");
        }
    }

    private static void criarContrato(Scanner scanner) {
        System.out.print("Número do contrato: ");
        int numContrato = scanner.nextInt();

        System.out.println("Data de inicio do contrato(digite o ano, tecle enter, digite o mês, tecle enter e digite a data):");
        int anoInicio = scanner.nextInt();
        int mesInicio = scanner.nextInt();
        int diaInicio = scanner.nextInt();

        System.out.println("Data de fim do contrato(digite o ano, tecle enter, digite o mês, tecle enter e digite a data):");
        int anoFim = scanner.nextInt();
        int mesFim = scanner.nextInt();
        int diaFim = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Valor:");
        Double valor = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Deseja associar esse contrato a uma lista de veículos e a uma lista de motoristas?(Sim/Não)");
        String resp = scanner.nextLine();

        if (resp.equals("Não")) {
            Contrato contrato = new Contrato(numContrato, new Date(anoInicio, mesInicio, diaInicio), new Date(anoFim, mesFim, diaFim), valor);
            System.out.println("Deseja adicionar um fornecedor ao contrato?(Sim/Não)");
            String resp2 = scanner.nextLine();
            scanner.nextLine();
            if (resp2.equals("Não")) {
                contratos.add(contrato);
                System.out.println("Contrato criado com sucesso.");
            }
            if (resp2.equals("Sim")) {
                System.out.println("Selecione um dos fornecedores disponíveis(de 0 a" + (fornecedores.size() - 1) + "):");
                int fornecedorSelecionado = scanner.nextInt();
                contrato.adicionaFornecedor(fornecedores.get(fornecedorSelecionado));
                contratos.add(contrato);
                System.out.println("Contrato criado com sucesso.");
            }
        }
        if (resp.equals("Sim")) {
            System.out.println("Quantos motoristas serão associados ao contrato?");
            int totalMotoristas = scanner.nextInt();
            ArrayList<Motorista> motoristasContrato = new ArrayList<>();
            if (totalMotoristas > motoristas.size()){
                System.out.println("Não há tantos motoristas disponíveis, tente novamente");
            }else {
                for (int i = 0; i < totalMotoristas; i++) {
                    System.out.println("Selecione um dos motoristas disponíveis(de 0 a" + (motoristas.size() - 1) + "):");
                    int motoristaSelecionado = scanner.nextInt();
                    motoristasContrato.add(motoristas.get(motoristaSelecionado));
                }
            }

            System.out.println("Quantos veículos serão associados ao contrato?");
            int totalVeiculos = scanner.nextInt();
            ArrayList<Veiculo> veiculosContrato = new ArrayList<>();
            if (totalVeiculos > veiculos.size()){
                System.out.println("Não há tantos veículos disponíveis, tente novamente");
            }else {
                for (int i = 0; i < totalVeiculos; i++) {
                    System.out.println("Selecione um dos veículos disponíveis(de 0 a " + (veiculos.size() - 1) + "):");
                    int veiculoSelecionado = scanner.nextInt();
                    veiculosContrato.add(veiculos.get(veiculoSelecionado));
                }
            }
            Contrato contrato = new Contrato(numContrato, new Date(anoInicio, mesInicio, diaInicio), new Date(anoFim, mesFim, diaFim), valor, veiculosContrato, motoristasContrato);
            System.out.println("Deseja adicionar um fornecedor ao contrato?(Sim/Não)");
            String resp3 = scanner.nextLine();
            scanner.nextLine();
            if (resp3.equals("Não")) {
                contratos.add(contrato);
                System.out.println("Contrato criado com sucesso.");
            }
            if (resp3.equals("Sim")) {
                System.out.println("Selecione um dos fornecedores disponíveis(de 0 a" + (fornecedores.size() - 1) + "):");
                int fornecedorSelecionado = scanner.nextInt();
                contrato.adicionaFornecedor(fornecedores.get(fornecedorSelecionado));
                contratos.add(contrato);
                System.out.println("Contrato criado com sucesso.");
            }

        }
    }

    private static void criarEscola(Scanner scanner) {
        System.out.print("Nome da escola: ");
        String nomeOficial = scanner.nextLine();

        System.out.println("CNPJ:");
        String cnpj = scanner.nextLine();

        System.out.println("Rua:");
        String rua = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Número:");
        Integer numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Complemento:");
        String complemento = scanner.nextLine();

        System.out.println("Bairro");
        String bairro = scanner.nextLine();

        System.out.println("Telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Nome Fantasia:");
        String nomeFantasia = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Número de funcionários");
        int numFuncionarios = scanner.nextInt();

        System.out.println("Quantos alunos serão associados a escola?");
        int totalAlunos = scanner.nextInt();
        ArrayList<Aluno> alunosEscola = new ArrayList<>();
        if (totalAlunos > alunos.size()) {
            System.out.println("Não há tantos alunos disponíveis, tente novamente");
        }else {
            for (int i = 0; i < totalAlunos; i++) {
                System.out.println("Selecione um dos alunos disponíveis(de 0 a " + (alunos.size()-1) + "):" );
                int alunoSelecionado = scanner.nextInt();
                alunosEscola.add(alunos.get(alunoSelecionado));
            }
            Escola escola = new Escola(nomeOficial, cnpj, new Endereco(rua, numero, complemento, bairro), telefone, nomeFantasia, numFuncionarios, alunosEscola);
            escolas.add(escola);
            System.out.println("Escola criada com sucesso.");
        }
    }

    private static void criarVeiculo(Scanner scanner) {
        System.out.print("Placa do veículo: ");
        String placa = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Ano:");
        Integer ano = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Modelo:");
        String modelo = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Capacidade:");
        Integer capacidade = scanner.nextInt();

        System.out.println("Tipo:");
        Integer tipo = scanner.nextInt();

        if (tipo == 0) {
            Veiculo veiculo = new Veiculo(placa, ano, modelo, capacidade);
            veiculos.add(veiculo);
            System.out.println("Veículo criado com sucesso.");
        }

        else if (tipo == 1) {
            System.out.println("Selecione um dos contratos disponíveis para associar ao veículo(de 0 a " + (contratos.size()-1) + "):");
            int Res = scanner.nextInt();
            Veiculo veiculo = new Veiculo(placa, ano, modelo, capacidade, contratos.get(Res));
            veiculos.add(veiculo);
            System.out.println("Veículo criado com sucesso.");
        }
        else {
            System.out.println("Tipo inválido, tente novamente");
        }
    }

    private static void criarPontoDeParada(Scanner scanner) {
        System.out.print("Nome do ponto de parada: ");
        String nomePonto = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Latidude:");
        double latitude = scanner.nextDouble();

        System.out.println("Longitude:");
        double longitude = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Quantos alunos serão associados a esse ponto de parada?");
        int totalAlunos = scanner.nextInt();
        ArrayList<Aluno> alunosPonto = new ArrayList<>();
        if (totalAlunos > alunos.size()){
            System.out.println("Não há alunos o suficiente, tente novamente");
        }
        else {
            for (int i = 0; i < totalAlunos; i++) {
                System.out.println("Selecione um dos alunos disponíveis(de 0 a " + (alunos.size() - 1) + "):");
                int alunoSelecionado = scanner.nextInt();
                alunosPonto.add(alunos.get(alunoSelecionado));
            }
            PontodeParada pontoDeParada = new PontodeParada(nomePonto, latitude, longitude, alunosPonto);
            pontosDeParada.add(pontoDeParada);
            System.out.println("Ponto de parada criado com sucesso.");
        }

    }

    private static void criarNovaRota(Scanner scanner) {
        ArrayList<PontodeParada> rota = new ArrayList<>();
        Rota novaRota = new Rota(rota);
        boolean adicionarMaisPontos = true;

        while (adicionarMaisPontos) {
            System.out.print("Digite o nome do ponto de parada a ser adicionado (ou 'sair' para finalizar): ");
            String nomePonto = scanner.nextLine();

            if (nomePonto.equalsIgnoreCase("sair")) {
                adicionarMaisPontos = false;
            } else {
                boolean pontoEncontrado = false;
                for (PontodeParada ponto : pontosDeParada) {
                    if (ponto.getNome().equalsIgnoreCase(nomePonto)) {
                        rota.add(ponto);
                        pontoEncontrado = true;
                        break;
                    }
                }
                if (!pontoEncontrado) {
                    System.out.println("Ponto de parada não encontrado.");
                }
            }
        }

        if (!rota.isEmpty()) {
            rotas.add(rota);
            System.out.println("Rota criada com sucesso.");
        } else {
            System.out.println("Nenhum ponto de parada adicionado. Rota não criada.");
        }
    }

    private static void criarFornecedor(Scanner scanner) {
        System.out.print("Nome do Fornecedor: ");
        String nomeOficial = scanner.nextLine();

        System.out.println("CNPJ:");
        String cnpj = scanner.nextLine();

        System.out.println("Rua:");
        String rua = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Número:");
        Integer numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Complemento:");
        String complemento = scanner.nextLine();

        System.out.println("Bairro");
        String bairro = scanner.nextLine();

        System.out.println("Telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Nome Fantasia:");
        String nomeFantasia = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Número de funcionários");
        int numFuncionarios = scanner.nextInt();

        System.out.println("Quantos contratos serão associados ao Fornecedor?");
        int totalContratos = scanner.nextInt();
        ArrayList<Contrato> contratosFornecedor = new ArrayList<>();
        if (totalContratos > contratos.size()) {
            System.out.println("Não há tantos contratos disponíveis, tente novamente");
        }else {
            for (int i = 0; i < totalContratos; i++) {
                System.out.println("Selecione um dos contratos disponíveis(de 0 a " + (contratos.size()-1) + "):" );
                int contratoSelecionado = scanner.nextInt();
                contratosFornecedor.add(contratos.get(contratoSelecionado));
            }
            Fornecedor fornecedor = new Fornecedor(nomeOficial, cnpj, new Endereco(rua, numero, complemento, bairro), telefone, nomeFantasia, numFuncionarios, contratosFornecedor);
            fornecedores.add(fornecedor);
            System.out.println("Fornecedor criado com sucesso.");
        }
    }

    private static void exibirInformacoes(Scanner scanner) {
        System.out.println("De qual classe você deseja saber informações?(Aluno, Motorista, Escola ou Fornecedor");
        String classe = scanner.nextLine();

        scanner.nextLine();

        if (classe.equals("Aluno")){
            System.out.println("Selecione um dos alunos disponíveis(de 0 a " + (alunos.size()-1) + "):" );
            int alunoSelecionado = scanner.nextInt();
            alunos.get(alunoSelecionado).apresentarDados();
        }
        if (classe.equals("Motorista")){
            System.out.println("Selecione um dos motoristas disponíveis(de 0 a " + (motoristas.size()-1) + "):" );
            int motoristaSelecionado = scanner.nextInt();
            motoristas.get(motoristaSelecionado).apresentarDados();
        }
        if (classe.equals("Escola")){
            System.out.println("Selecione uma das escolas disponíveis(de 0 a " + (escolas.size()-1) + "):" );
            int escolaSelecionada = scanner.nextInt();
            escolas.get(escolaSelecionada).apresentarDados();
        }
        if (classe.equals("Fornecedor")){
            System.out.println("Selecione um dos fornecedores disponíveis(de 0 a " + (alunos.size()-1) + "):" );
            int alunoSelecionado = scanner.nextInt();
            alunos.get(alunoSelecionado).apresentarDados();
        }
        else {
            System.out.println("Classe inválida ou não existente");
        }
    }

    private static void qualTipo(Scanner scanner) {
        System.out.println("De qual pessoa você deseja saber o tipo?(Aluno, Motorista, Escola ou Fornecedor");
        String classe = scanner.nextLine();

        scanner.nextLine();

        if (classe.equals("Aluno")){
            System.out.println("Selecione um dos alunos disponíveis(de 0 a " + (alunos.size()-1) + "):" );
            int alunoSelecionado = scanner.nextInt();
            alunos.get(alunoSelecionado).verificarTipo();
        }
        if (classe.equals("Motorista")){
            System.out.println("Selecione um dos motoristas disponíveis(de 0 a " + (motoristas.size()-1) + "):" );
            int motoristaSelecionado = scanner.nextInt();
            motoristas.get(motoristaSelecionado).verificarTipo();
        }
        if (classe.equals("Escola")){
            System.out.println("Selecione uma das escolas disponíveis(de 0 a " + (escolas.size()-1) + "):" );
            int escolaSelecionada = scanner.nextInt();
            escolas.get(escolaSelecionada).verificarTipo();
        }
        if (classe.equals("Fornecedor")){
            System.out.println("Selecione um dos fornecedores disponíveis(de 0 a " + (alunos.size()-1) + "):" );
            int alunoSelecionado = scanner.nextInt();
            alunos.get(alunoSelecionado).verificarTipo();
        }
        else {
            System.out.println("Essa classe não existe ou não é uma pessoa");
        }
    }


}
