package brasileirao.teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import brasileirao.modelo.Partida;
import brasileirao.modelo.Time;

class PartidaTest {

    @Test
    void testCriarPartida() {
        Time mandante = new Time("Mandante FC");
        Time visitante = new Time("Visitante AC");
        
        Partida partida = new Partida(mandante, visitante);
        
        assertEquals("Mandante FC", partida.getMandante().getNome());
        assertEquals("Visitante AC", partida.getVisitante().getNome());
    }
}