package brasileirao.modelo;

public class ProcessadorPartida {
    private Time time;
    private int golsMarcados;
    private int golsSofridos;

    public ProcessadorPartida(Time time, int golsMarcados, int golsSofridos) {
        this.time = time;
        this.golsMarcados = golsMarcados;
        this.golsSofridos = golsSofridos;
    }

    public void processar() {
        time.adicionarGols(golsMarcados, golsSofridos);
        
        if (golsMarcados > golsSofridos) {
            time.adicionarVitoria();
            time.adicionarPontos(3);
        } else if (golsMarcados == golsSofridos) {
            time.adicionarPontos(1);
        }
    }
}