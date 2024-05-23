
import entidades.Paciente;
import repositorio.ListaPacientes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // M02S02 Exercício 04: Telas do console
        Scanner scanner = new Scanner(System.in);

        // Solução do Vinicius para aceitar mais de uma palavra no string:
        Scanner sc = new Scanner(System.in).useDelimiter(";|\\R");


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
                    7 - Encerrar programa.""");
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
                    System.out.println("Você escolheu SAIR.");
                    break;
                default:
                    continue;
            }
            break; // Este é o break referente ao while;
        }
        scanner.close();
    }

    // M02S02 Exercício 05: Cadastro de paciente
    private static void telaCadastrarPaciente(Scanner scanner){
        Paciente paciente = new Paciente();
        System.out.println("Insira os dados de paciente:");

        System.out.print("Nome: ");
        paciente.nome = scanner.next();

        System.out.print("Idade: ");
        paciente.idade = Integer.parseInt(scanner.next());

        System.out.print("Peso: ");
        paciente.peso = Double.parseDouble(scanner.next());

        System.out.print("Altura: ");
        paciente.altura = Double.parseDouble(scanner.next());

        System.out.print("Pressão sistólica: ");
        paciente.pressaoSistolica = Integer.parseInt(scanner.next());

        System.out.print("Pressão diastólica: ");
        paciente.pressaoDiastolica = Integer.parseInt(scanner.next());

        System.out.print("Frequência cardíaca: ");
        paciente.frequenciaCardiaca = Integer.parseInt(scanner.next());

        System.out.print("Tipo de dieta alimentar: ");
        paciente.dietaAlimentar = scanner.next();

        ListaPacientes.adicionarPaciente(paciente);
    }

    // M02S02 Exercício 06: Listar pacientes
    private static void telaListarPacientes() {
        ListaPacientes.listarPacientes();
    }

    // Como lá na classe ListaPacientes, o prof colocou o método como retornando a Lista (preferível pra funcionar mais como banco de dados)
    // Aqui neste método é onde fica o loop para printar (ver no github da fullstack).



    // M02S02 Exercício 07: Alterar pacientes
    private static void telaAlterarPaciente(Scanner scanner) {
        System.out.println("Qual o id da pessoa paciente que você deseja editar?");
        System.out.println("> ");

        Paciente paciente = ListaPacientes.buscarPacienteId(Integer.parseInt(scanner.next()));

        System.out.println("Atualize as informações:");
        System.out.print("Peso: ");
        paciente.peso = Double.parseDouble(scanner.next());
        System.out.print("Altura: ");
        paciente.altura = Double.parseDouble(scanner.next());
        System.out.print("Pressão sistólica: ");
        paciente.pressaoSistolica = Integer.parseInt(scanner.next());
        System.out.print("Pressão diastólica: ");
        paciente.pressaoDiastolica = Integer.parseInt(scanner.next());
        System.out.print("Frequência cardíaca: ");
        paciente.frequenciaCardiaca = Integer.parseInt(scanner.next());
        System.out.print("Dieta alimentar: ");
        paciente.dietaAlimentar = scanner.next();

        System.out.println("Informações atualizadas.");
        paciente.monitorar();
    }

    // M02S02 Exercício 08: Exibir informações de paciente
    private static void telaExibirPaciente(Scanner scanner) {
        System.out.println("Qual o id da pessoa paciente que você deseja consultar?");
        System.out.print("> ");

        Paciente paciente = ListaPacientes.buscarPacienteId(Integer.parseInt(scanner.next()));
        paciente.monitorar();
    }

    // M02S02 Exercício 09: Registrar atividade física
    private static void telaRegistrarAtividade(Scanner scanner) {
        System.out.println("Qual o id da pessoa paciente que realizou a atividade?");
        System.out.print("> ");
        Paciente paciente = ListaPacientes.buscarPacienteId(Integer.parseInt(scanner.next()));

        // Consumir a quebra de linha pendente após o próximo inteiro:
        scanner.nextLine();
        // (Por que isso? Porque quero que seja possível colocar uma atividade com espaços.
        // Utilizar apenas next() estava dando erro ao tentar digitar algo como "aula de yoga".
        // Assim, recorri ao nextLine(), mas foi preciso acrescentar essa linha acima, pois o próximo
        // nextLine() estava consumindo a quebra de linha pendente após a leitura do inteiro,
        // resultando em uma entrada vazia para a atividade física.)

        System.out.println("Qual a atividade física que foi realizada?");
        System.out.print("> ");
        String atividade = scanner.nextLine();
        paciente.registrarAtividade(atividade);
    }

    // M02S02 Exercício 10: Remover paciente
    private static void telaRemoverPaciente(Scanner scanner) {
        System.out.println("Qual o id do registro de paciente a ser removido?");
        System.out.print("> ");
        ListaPacientes.removerPaciente(Integer.parseInt(scanner.next()));
        System.out.print("Registro de paciente removido com sucesso!");
    }



}
