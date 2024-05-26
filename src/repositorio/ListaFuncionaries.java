package repositorio;

import entidades.Funcionarie;

import java.util.ArrayList;
import java.util.List;

public class ListaFuncionaries {

    private static List<Funcionarie> funcionaries;

    static {
        funcionaries = new ArrayList<>();
    }

    public static List<Funcionarie> listarFuncionaries(){
        return funcionaries;
    }

    public static Funcionarie buscarFuncionarieId(int id){
        return funcionaries.get(id);
    }

    public static void adicionarFuncionarie(Funcionarie Funcionarie) {
        funcionaries.add(Funcionarie);
    }

    public static void removerFuncionarie(int id){
        funcionaries.remove(id);
    }

    public static void alterarFuncionarie(Funcionarie funcionarieAlterade, int id) {
        Funcionarie funcionarieOriginal = funcionaries.get(id);
        funcionarieOriginal.setEndereco(funcionarieAlterade.getEndereco());
        funcionarieOriginal.setNome(funcionarieAlterade.getNome());
        funcionarieOriginal.setIdade(funcionarieAlterade.getIdade());
        funcionarieOriginal.setSalario(funcionarieAlterade.getSalario());
    }
    
    
}
