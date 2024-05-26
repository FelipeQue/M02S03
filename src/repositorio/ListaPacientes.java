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

    public static Paciente buscarPacienteId(int id){
        return pacientes.get(id);
    }

    public static void alterarPaciente(Paciente pacienteAlteracao, int id){
        Paciente pacienteOriginal = pacientes.get(id);
        pacienteOriginal.setPeso(pacienteAlteracao.getPeso());
        pacienteOriginal.setAltura(pacienteAlteracao.getAltura());
        pacienteOriginal.setPressaoSistolica(pacienteAlteracao.getPressaoSistolica());
        pacienteOriginal.setPressaoDiastolica(pacienteAlteracao.getPressaoDiastolica());
        pacienteOriginal.setFrequenciaCardiaca(pacienteAlteracao.getFrequenciaCardiaca());
        pacienteOriginal.setDietaAlimentar(pacienteAlteracao.getDietaAlimentar());
    }


}
