package brasileirao.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {

    private List<Time> times;
    private List<Partida> partidas;

    /**
     * Construtor do Campeonato.
     * Recebe a lista de times participantes.
     */
    public Campeonato(List<Time> times) {
        this.times = times;
        this.partidas = new ArrayList<>();
        gerarPartidas();
    }

    /**
     * Gera a lista completa de partidas (turno e returno)
     * N x (N-1) partidas.
     */
    private void gerarPartidas() {
        for (Time mandante : this.times) {
            for (Time visitante : this.times) {

                if (mandante.equals(visitante)) {
                    continue; // Time não joga contra si mesmo
                }
                
                this.partidas.add(new Partida(mandante, visitante));
            }
        }
    }

    /**
     * Retorna a lista de todas as partidas geradas.
     */
    public List<Partida> getPartidas() {
        return this.partidas;
    }
}