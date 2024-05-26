package entidades;

import java.time.LocalDateTime;

public class Consulta {

    // Atributos
    private String nutricionista; // Nome de Nutricionista
    private String paciente; // Nome de Paciente
    private LocalDateTime dataHora;
    private boolean realizada;

    // Construtores
    public Consulta(){};

    public Consulta(String nutricionista, String paciente, LocalDateTime dataHora, boolean realizada) {
        this.nutricionista = nutricionista;
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.realizada = realizada;
    }

    // Getters e setters
    public String getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(String nutricionista) {
        this.nutricionista = nutricionista;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }
}
