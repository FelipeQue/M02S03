package entidades;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    // Atributos
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private int pressaoSistolica;
    private int pressaoDiastolica;
    private int frequenciaCardiaca;
    private String dietaAlimentar;
    private List<String> atividadesFisicas;

    // M02S03 Exercício 1: Construtores

    // Construtor vazio
    public Paciente(){
        this.atividadesFisicas = new ArrayList<>();
    };

    // Construtor completo:
    public Paciente(String nome, int idade, double peso, double altura, int pressaoSistolica, int pressaoDiastolica, int frequenciaCardiaca, String dietaAlimentar) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.dietaAlimentar = dietaAlimentar;
        this.atividadesFisicas = new ArrayList<>();
    }

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

    // Getters

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getPressaoSistolica() {
        return pressaoSistolica;
    }

    public int getPressaoDiastolica() {
        return pressaoDiastolica;
    }

    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public String getDietaAlimentar() {
        return dietaAlimentar;
    }

    public List<String> getAtividadesFisicas() {
        return atividadesFisicas;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPressaoSistolica(int pressaoSistolica) {
        this.pressaoSistolica = pressaoSistolica;
    }

    public void setPressaoDiastolica(int pressaoDiastolica) {
        this.pressaoDiastolica = pressaoDiastolica;
    }

    public void setFrequenciaCardiaca(int frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public void setDietaAlimentar(String dietaAlimentar) {
        this.dietaAlimentar = dietaAlimentar;
    }

    public void setAtividadesFisicas(List<String> atividadesFisicas) {
        this.atividadesFisicas = atividadesFisicas;
    }
}
