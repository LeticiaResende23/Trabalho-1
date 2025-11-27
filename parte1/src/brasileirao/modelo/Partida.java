package brasileirao.modelo;

public class Partida {

    private Time mandante;
    private Time visitante;

    public Partida(Time mandante, Time visitante) {
        this.mandante = mandante;
        this.visitante = visitante;
    }

    public Time getMandante() {
        return this.mandante;
    }

    public Time getVisitante() {
        return this.visitante;
    }
}