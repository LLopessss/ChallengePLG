package br.com.fiap.beans;

public class Horario {

    private String data;
    private String hora;

    public Horario() {}

    public Horario(String data, String hora) {
        this.data = data;
        this.hora = hora;
    }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    @Override
    public String toString() {
        return data + " às " + hora;
    }
}

