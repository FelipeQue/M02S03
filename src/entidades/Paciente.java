package entidades;

import java.util.ArrayList;
import java.util.List;

// M02S02 Exercício 01: criar classe Paciente
public class Paciente {

    // Atributos
    public String nome;
    public int idade;
    public double peso;
    public double altura;
    public int pressaoSistolica;
    public int pressaoDiastolica;
    public int frequenciaCardiaca;
    public String dietaAlimentar;
    public List<String> atividadesFisicas = new ArrayList<>();

    // M02S02 Exercício 03: criar métodos

    // Métodos
    public double calcularImc() {
        return this.peso / (this.altura * this.altura);
    }

    public void monitorar() {
        // Retorna as informações do paciente em um padrão de exibição e também deve mostrar o IMC.
        System.out.println("Informações de paciente:\n" +
                "Nome: " + this.nome + "\n" +
                "Idade: " + this.idade + "\n" +
                "Peso: " + this.peso + "\n" +
                "Altura: " + this.altura + "\n" +
                "Pressão arterial: " + this.pressaoSistolica + " por " + this.pressaoDiastolica + "\n" +
                "Frequência cardíaca: " + this.frequenciaCardiaca + " bpm." + "\n" +
                "Dieta alimentar: " + this.dietaAlimentar + "\n" +
                "Atividades físicas: " + this.atividadesFisicas + "\n" +
                "IMC: " + this.calcularImc());
    }

    public void registrarAtividade(String novaAtividade) {
        // Funcionalidade para registrar as atividades físicas realizadas pelos usuários, como corrida, caminhada, ciclismo, etc.
        this.atividadesFisicas.add(novaAtividade);
    }


}
