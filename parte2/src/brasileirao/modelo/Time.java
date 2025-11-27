package brasileirao.modelo;

import java.util.Objects;

public class Time implements Comparable<Time> {
    private String nome;
    private Desempenho desempenho; // Agora usamos a nova classe!

    public Time(String nome) {
        this.nome = nome;
        this.desempenho = new Desempenho();
    }

    public String getNome() { return this.nome; }
    
    // Delegamos as chamadas para a classe Desempenho
    public int getPontos() { return desempenho.getPontos(); }
    public int getVitorias() { return desempenho.getVitorias(); }
    public int getGolsMarcados() { return desempenho.getGolsMarcados(); }
    public int getGolsSofridos() { return desempenho.getGolsSofridos(); }
    public int getSaldoDeGols() { return desempenho.getSaldoDeGols(); }

    // Métodos auxiliares para o ProcessadorPartida usar
    public void adicionarGols(int marcados, int sofridos) {
        desempenho.adicionarGols(marcados, sofridos);
    }

    public void adicionarVitoria() {
        desempenho.adicionarVitoria();
    }

    public void adicionarPontos(int pontos) {
        desempenho.adicionarPontos(pontos);
    }

    // Aqui usamos a próxima classe que vamos criar
    public void registrarPartida(int golsMarcados, int golsSofridos) {
        new ProcessadorPartida(this, golsMarcados, golsSofridos).processar();
    }

    @Override
    public int compareTo(Time outro) {
        return compararPorPontosEVitorias(outro);
    }

    private int compararPorPontosEVitorias(Time outro) {
        if (this.getPontos() != outro.getPontos()) {
            return Integer.compare(outro.getPontos(), this.getPontos());
        }
        if (this.getVitorias() != outro.getVitorias()) {
            return Integer.compare(outro.getVitorias(), this.getVitorias());
        }
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Time other = (Time) obj;
        return Objects.equals(nome, other.nome);
    }
}