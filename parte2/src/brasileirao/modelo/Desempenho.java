package brasileirao.modelo;

public class Desempenho {
    private int pontos;
    private int vitorias;
    private int golsMarcados;
    private int golsSofridos;

    public Desempenho() {
        this.pontos = 0;
        this.vitorias = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }

    public void adicionarGols(int marcados, int sofridos) {
        this.golsMarcados += marcados;
        this.golsSofridos += sofridos;
    }

    public void adicionarVitoria() {
        this.vitorias++;
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public int getPontos() { return pontos; }
    public int getVitorias() { return vitorias; }
    public int getGolsMarcados() { return golsMarcados; }
    public int getGolsSofridos() { return golsSofridos; }
    
    public int getSaldoDeGols() {
        return this.golsMarcados - this.golsSofridos;
    }
}