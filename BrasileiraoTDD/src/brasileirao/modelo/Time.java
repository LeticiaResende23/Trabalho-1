package brasileirao.modelo;

import java.util.Objects;

public class Time implements Comparable<Time> {
    private String nome;
    private int pontos;
    private int vitorias;
    private int golsMarcados;
    private int golsSofridos;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.vitorias = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }

    public String getNome() { return this.nome; }
    public int getPontos() { return this.pontos; }
    public int getVitorias() { return this.vitorias; }
    public int getGolsMarcados() { return this.golsMarcados; }
    public int getGolsSofridos() { return this.golsSofridos; }

    public int getSaldoDeGols() {
        return this.golsMarcados - this.golsSofridos;
    }

    @Override
    public int compareTo(Time outro) {
        return compararPorPontosEVitorias(outro);
    }

    private int compararPorPontosEVitorias(Time outro) {
        // 1. Critério: Pontos (descrescente)
        if (this.getPontos() != outro.getPontos()) {
            return Integer.compare(outro.getPontos(), this.getPontos());
        }

        // 2. Critério (Desempate): Vitórias (descrescente)
        if (this.getVitorias() != outro.getVitorias()) {
            return Integer.compare(outro.getVitorias(), this.getVitorias());
        }

        // 3. Se empatar em tudo
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Time other = (Time) obj;
        return Objects.equals(nome, other.nome);
    }

    public void registrarPartida(int golsMarcados, int golsSofridos) {
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;

        if (golsMarcados > golsSofridos) { // Vitória
            this.pontos += 3;
            this.vitorias += 1;
        } else if (golsMarcados == golsSofridos) { // Empate
            this.pontos += 1;
        }
    }
}
