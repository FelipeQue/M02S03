package repositorio;

import entidades.Paciente;
import java.util.ArrayList;

public class ListaPacientes {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public static void removerPaciente(int id){
        pacientes.remove(id);
    }

    public static ArrayList<Paciente> listarPacientes(){
        return pacientes;
    }
    // Prof colocou o método acima como retornando Lista - MUDAR AQUI TAMBEM PARA FICAR MAIS REALISTA.

    public static Paciente buscarPacienteId(int id){
        return pacientes.get(id);
    }


}
