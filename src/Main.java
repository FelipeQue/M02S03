
import entidades.*;
import repositorio.ListaConsultas;
import repositorio.ListaFuncionaries;
import repositorio.ListaNutricionistas;
import repositorio.ListaPacientes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        System.out.println();

        while (true) {
            System.out.println();
            System.out.println("""
                    O que deseja fazer?
                    1 - Cadastrar paciente.
                    2 - Listar pacientes.
                    3 - Alterar informações de paciente.
                    4 - Mostrar informações de paciente.
                    5 - Registrar atividade física para paciente.
                    6 - Remover paciente.
                    7 - Cadastro de pessoa funcionária.
                    8 - Cadastro de nutricionista.
                    9 - Criar consulta.
                    10 - Listar pessoas funcionárias.
                    11 - Listar consultas.
                    12 - Realizar consulta.
                    13 - Encerrar programa.""");
            System.out.print("> ");
            opcao = Integer.parseInt(scanner.next());

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("Cadastrar paciente.");
                    telaCadastrarPaciente(scanner);
                    continue;
                case 2:
                    System.out.println();
                    System.out.println("Lista de pacientes.");
                    telaListarPacientes();
                    continue;
                case 3:
                    System.out.println();
                    System.out.println("Alterar informações de paciente.");
                    telaAlterarPaciente(scanner);
                    continue;
                case 4:
                    System.out.println();
                    System.out.println("Mostrar informações de paciente.");
                    telaExibirPaciente(scanner);
                    continue;
                case 5:
                    System.out.println();
                    System.out.println("Registrar atividade física para paciente.");
                    telaRegistrarAtividade(scanner);
                    continue;
                case 6:
                    System.out.println();
                    System.out.println("Remover paciente.");
                    telaRemoverPaciente(scanner);
                    continue;
                case 7:
                    System.out.println();
                    System.out.println("Cadastro de pessoa funcionária.");
                    telaCadastrarFuncionarie(scanner);
                    continue;
                case 8:
                    System.out.println();
                    System.out.println("Cadastro de nutricionista.");
                    telaCadastrarNutricionista(scanner);
                    continue;
                case 9:
                    System.out.println();
                    System.out.println("Criar consulta.");
                    telaCriarConsulta(scanner);
                    continue;
                case 10:
                    System.out.println();
                    System.out.println("Listar pessoas funcionárias.");
                    telaListarFuncionaries();
                    continue;
                case 11:
                    System.out.println();
                    System.out.println("Listar consultas.");
                    telaListarConsultas();
                    continue;
                case 12:
                    System.out.println();
                    System.out.println("Realizar consulta.");
                    telaRealizarConsulta(scanner);
                    continue;
                case 13:
                    System.out.println("Você escolheu SAIR.");
                    break;
                default:
                    continue;
            }
            break; // Este é o break referente ao while;
        }
        scanner.close();
    }

    private static void telaCadastrarPaciente(Scanner scanner){
        Paciente paciente = new Paciente();
        System.out.println("Insira os dados de paciente:");
        scanner.nextLine();
        System.out.print("Nome: ");
        paciente.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        paciente.setIdade(Integer.parseInt(scanner.next()));
        System.out.print("Peso: ");
        paciente.setPeso(Double.parseDouble(scanner.next()));
        System.out.print("Altura: ");
        paciente.setAltura(Double.parseDouble(scanner.next()));
        System.out.print("Pressão sistólica: ");
        paciente.setPressaoSistolica(Integer.parseInt(scanner.next()));
        System.out.print("Pressão diastólica: ");
        paciente.setPressaoDiastolica(Integer.parseInt(scanner.next()));
        System.out.print("Frequência cardíaca: ");
        paciente.setFrequenciaCardiaca(Integer.parseInt(scanner.next()));
        System.out.print("Tipo de dieta alimentar: ");
        paciente.setDietaAlimentar(scanner.next());

        ListaPacientes.adicionarPaciente(paciente);
        System.out.println("Paciente cadastrade com sucesso.");
    }

    private static void telaListarPacientes(){
        System.out.println();
        System.out.println("Id - Nome");
        ArrayList<Paciente> pacientes = ListaPacientes.listarPacientes();
        for (Paciente item : pacientes){
            System.out.println(pacientes.indexOf(item) + " - " + item.getNome() + ";");
        }
    }


    private static void telaAlterarPaciente(Scanner scanner) {
        System.out.println("Qual o id da pessoa paciente que você deseja editar?");
        System.out.println("> ");

        Paciente paciente = ListaPacientes.buscarPacienteId(Integer.parseInt(scanner.next()));

        System.out.println("Atualize as informações:");
        System.out.print("Peso: ");
        paciente.setPeso(Double.parseDouble(scanner.next()));
        System.out.print("Altura: ");
        paciente.setAltura(Double.parseDouble(scanner.next()));
        System.out.print("Pressão sistólica: ");
        paciente.setPressaoSistolica(Integer.parseInt(scanner.next()));
        System.out.print("Pressão diastólica: ");
        paciente.setPressaoDiastolica(Integer.parseInt(scanner.next()));
        System.out.print("Frequência cardíaca: ");
        paciente.setFrequenciaCardiaca(Integer.parseInt(scanner.next()));
        System.out.print("Dieta alimentar: ");
        paciente.setDietaAlimentar(scanner.next());

        System.out.println("Informações atualizadas.");
        paciente.monitorar();
    }

    private static void telaExibirPaciente(Scanner scanner) {
        System.out.println("Qual o id da pessoa paciente que você deseja consultar?");
        System.out.print("> ");

        Paciente paciente = ListaPacientes.buscarPacienteId(Integer.parseInt(scanner.next()));
        paciente.monitorar();
    }

    private static void telaRegistrarAtividade(Scanner scanner) {
        System.out.println("Qual o id da pessoa paciente que realizou a atividade?");
        System.out.print("> ");
        Paciente paciente = ListaPacientes.buscarPacienteId(Integer.parseInt(scanner.next()));
        // Consumir a quebra de linha pendente após o próximo inteiro:
        scanner.nextLine();
        System.out.println("Qual a atividade física que foi realizada?");
        System.out.print("> ");
        String atividade = scanner.nextLine();
        paciente.registrarAtividade(atividade);
    }

    private static void telaRemoverPaciente(Scanner scanner) {
        System.out.println("Qual o id do registro de paciente a ser removido?");
        System.out.print("> ");
        ListaPacientes.removerPaciente(Integer.parseInt(scanner.next()));
        System.out.print("Registro de paciente removido com sucesso!");
    }

    private static void telaCadastrarFuncionarie(Scanner scanner){
        Funcionarie funcionarie = new Funcionarie();
        System.out.println("Insira os dados da pessoa funcionária:");
        scanner.nextLine(); // Todas as linhas de comando assim são para "consumir" scans pendentes.
        System.out.print("Nome: ");
        funcionarie.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        funcionarie.setIdade(Integer.parseInt(scanner.next()));
        scanner.nextLine();
        Endereco endereco = new Endereco();
        System.out.print("Logradouro: ");
        endereco.setLogradouro(scanner.nextLine());
        System.out.print("Estado: ");
        endereco.setEstado(scanner.nextLine());
        System.out.print("Cidade: ");
        endereco.setCidade(scanner.nextLine());
        System.out.print("Número: ");
        endereco.setNumero(scanner.next());
        scanner.nextLine();
        System.out.print("Complemento: ");
        endereco.setComplemento(scanner.nextLine());
        System.out.print("CEP: ");
        endereco.setCep(scanner.next());

        funcionarie.setEndereco(endereco);
        ListaFuncionaries.adicionarFuncionarie(funcionarie);
        System.out.println("Pessoa funcionária cadastrada com sucesso.");
    }

    private static void telaCadastrarNutricionista(Scanner scanner){
        Nutricionista nutricionista = new Nutricionista();
        System.out.println("Insira os dados da pessoa nutricionista:");
        scanner.nextLine();
        System.out.print("Nome: ");
        nutricionista.setNome(scanner.nextLine());

        // Para o sistema, vamos considerar que o nutricionista deve ter um nome não duplicado; adicione uma validação para isso.

        System.out.print("Idade: ");
        nutricionista.setIdade(Integer.parseInt(scanner.next()));
        scanner.nextLine();
        Endereco endereco = new Endereco();
        System.out.print("Logradouro: ");
        endereco.setLogradouro(scanner.nextLine());
        System.out.print("Estado: ");
        endereco.setEstado(scanner.nextLine());
        System.out.print("Cidade: ");
        endereco.setCidade(scanner.nextLine());
        System.out.print("Número: ");
        endereco.setNumero(scanner.next());
        scanner.nextLine();
        System.out.print("Complemento: ");
        endereco.setComplemento(scanner.nextLine());
        System.out.print("CEP: ");
        endereco.setCep(scanner.next());

        nutricionista.setEndereco(endereco);

        System.out.print("Tempo de experiência: ");
        nutricionista.setTempoExperiencia(Integer.parseInt(scanner.next()));
        scanner.nextLine();
        nutricionista.setConsultas(0); // Como estamos cadastrando a pessoa nutricionista agora, vou inicializar esse atributo como zero.

        System.out.print("Certificações: ");
        nutricionista.setCertificacoes(List.of(scanner.nextLine()));

        ListaNutricionistas.adicionarNutricionista(nutricionista);
        ListaFuncionaries.adicionarFuncionarie(nutricionista);
        System.out.println("Pessoa nutricionista cadastrada com sucesso.");

    }

    private static void telaCriarConsulta(Scanner scanner){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Insira a informações da consulta:");
        Consulta consulta = new Consulta();
        scanner.nextLine();
        System.out.print("Nome da pessoa nutricionista: ");
        String nomeNutricionista = scanner.nextLine();
        Nutricionista nutricionistaExiste = ListaNutricionistas.buscarNutricionistaNome(nomeNutricionista);

        if (nutricionistaExiste == null) {
            System.out.println("Não existe nutricionista com este nome nos nossos registros.");
            return; // Aqui eu encerro o método se não for encontrado o nome.
        }
        consulta.setNutricionista(nomeNutricionista);

        System.out.print("Nome da pessoa paciente: ");
        String nomePaciente = scanner.nextLine();
        // Aqui experimentei buscar de outra forma, sem um método específico de busca por nomes na classe ListaPacientes
        List<Paciente> pacientes = ListaPacientes.listarPacientes();
        Paciente pacienteExiste = pacientes.stream().filter(paciente -> paciente.getNome().equals(nomePaciente)).findFirst().orElse(null);;
        if (pacienteExiste == null) {
            System.out.println("Não existe paciente com este nome nos nossos registros.");
            return; // Aqui eu encerro o método se não for encontrado o nome.
        }
        consulta.setPaciente(nomePaciente);

        System.out.print("Data e horário no formato DD/MM/AAAA HH:MM");
        consulta.setDataHora(LocalDateTime.parse(scanner.nextLine(), formatter));

        consulta.setRealizada(false);

        ListaConsultas.adicionarConsulta(consulta);
        System.out.println("Consulta adicionada com sucesso!");

    }

    private static void telaListarFuncionaries(){
        System.out.println();
        System.out.println("Id - Nome");
        List<Funcionarie> funcionaries = ListaFuncionaries.listarFuncionaries();
        for (Funcionarie item : funcionaries){
            System.out.println(funcionaries.indexOf(item) + " - " + item.getNome() + ";");
        }
    }

    private static void telaListarConsultas(){
        System.out.println();
        System.out.println("Data e horário - Nutricionista - Paciente");
        List<Consulta> consultas = ListaConsultas.listarConsultas();
        for (Consulta item : consultas){
            System.out.println(item.getDataHora() + " - " + item.getNutricionista() + " - " + item.getPaciente());
            if (item.isRealizada()) {
                System.out.println("Consulta realizada: SIM.");
            } else {
                System.out.println("Consulta realizada: NÃO.");
            }
        }
    }

    private static void telaRealizarConsulta(Scanner scanner){
        System.out.println("Qual o id da consulta que você deseja realizar?");
        System.out.println("> ");
        Consulta consulta = ListaConsultas.buscarConsultaId(Integer.parseInt(scanner.next()));
        consulta.setRealizada(true);
        System.out.println("Consulta realizada!");
    }







}
