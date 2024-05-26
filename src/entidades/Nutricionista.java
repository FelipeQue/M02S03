package entidades;

import java.util.List;

public class Nutricionista extends Funcionarie{
    // Atributos
    private List<String> certificacoes;
    private int consultas; // Número de consultas
    private int tempoExperiencia; // Tempo de experiência em anos completos

    //Construtores
    public Nutricionista() {
    }

    public Nutricionista(String nome, int idade, Endereco endereco, List<String> certificacoes, int consultas, int tempoExperiencia) {
        super(nome, idade, endereco);
        this.certificacoes = certificacoes;
        this.consultas = consultas;
        this.tempoExperiencia = tempoExperiencia;
    }

    // Métodos
    public void adicionaExperiencia(){
        this.tempoExperiencia += 1;
    }

    public void adicionaCertificacao(String certificacao){
        this.certificacoes.add(certificacao);
    }

    // Getters e setters
    public List<String> getCertificacoes() {
        return certificacoes;
    }

    public void setCertificacoes(List<String> certificacoes) {
        this.certificacoes = certificacoes;
    }

    public int getConsultas() {
        return consultas;
    }

    public void setConsultas(int consultas) {
        this.consultas = consultas;
    }

    public int getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }
}
