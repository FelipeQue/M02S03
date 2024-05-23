
import entidades.Paciente;
import repositorio.ListaPacientes;

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



}
