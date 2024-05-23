package repositorio;

import entidades.Paciente;

import java.util.ArrayList;

// M02S02 Exercício 02: lista de dados

public class ListaPacientes {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public static void removerPaciente(int id){
        pacientes.remove(id);
    }

    public static void listarPacientes(){
        System.out.println("Id - Nome");
        for (Paciente item : pacientes){
            System.out.println(pacientes.indexOf(item) + " - " + item.nome + ";");
        }
    }
    // Prof colocou o método acima como retornando Lista

    public static Paciente buscarPacienteId(int id){
        return pacientes.get(id);
    }


}
