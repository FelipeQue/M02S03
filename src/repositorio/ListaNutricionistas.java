package repositorio;

import entidades.Nutricionista;

import java.util.ArrayList;
import java.util.List;

public class ListaNutricionistas {

    private static List<Nutricionista> nutricionistas;

    static {
        nutricionistas = new ArrayList<>();
    }

    public static List<Nutricionista> listarNutricionistas(){
        return nutricionistas;
    }

    public static Nutricionista buscarNutricionistaId(int id){
        return nutricionistas.get(id);
    }

    public static Nutricionista buscarNutricionistaNome(String nome){
        return (Nutricionista) nutricionistas.stream()
                .filter(n -> n.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }

    public static void adicionarNutricionista(Nutricionista nutricionista) {
        nutricionistas.add(nutricionista);
    }

    public static void removerNutricionista(int id){
        nutricionistas.remove(id);
    }

    public static void alterarNutricionista(Nutricionista nutricionistaAlterade, int id) {
        Nutricionista nutricionistaOriginal = nutricionistas.get(id);
        nutricionistaOriginal.setConsultas(nutricionistaAlterade.getConsultas());
        nutricionistaOriginal.setTempoExperiencia(nutricionistaAlterade.getTempoExperiencia());
        nutricionistaOriginal.setCertificacoes(nutricionistaAlterade.getCertificacoes());
        nutricionistaOriginal.setEndereco(nutricionistaAlterade.getEndereco());
        nutricionistaOriginal.setNome(nutricionistaAlterade.getNome());
        nutricionistaOriginal.setIdade(nutricionistaAlterade.getIdade());
        nutricionistaOriginal.setSalario(nutricionistaAlterade.getSalario());
    }

}
