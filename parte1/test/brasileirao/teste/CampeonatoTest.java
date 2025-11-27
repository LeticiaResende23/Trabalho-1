package brasileirao.teste; 

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import brasileirao.modelo.Campeonato;
import brasileirao.modelo.Partida;
import brasileirao.modelo.Time;

import java.util.ArrayList;
import java.util.List;

class CampeonatoTest {

    @Test
    void testGerarPartidasTurnoReturno() {
        Time t1 = new Time("T1");
        Time t2 = new Time("T2");
        Time t3 = new Time("T3");
        Time t4 = new Time("T4");

        List<Time> times = new ArrayList<>();
        times.add(t1);
        times.add(t2);
        times.add(t3);
        times.add(t4);

        Campeonato brasileirao = new Campeonato(times);
        List<Partida> partidas = brasileirao.getPartidas();

        assertEquals(12, partidas.size());

        for (Partida p : partidas) {
            assertNotEquals(p.getMandante(), p.getVisitante(), "Um time não pode jogar contra si mesmo.");
        }

        assertTrue(partidaExiste(partidas, t1, t2), "O jogo T1 x T2 (turno) deve existir.");
        assertTrue(partidaExiste(partidas, t2, t1), "O jogo T2 x T1 (returno) deve existir.");
    }

    private boolean partidaExiste(List<Partida> partidas, Time mandante, Time visitante) {
        for (Partida p : partidas) {
            if (p.getMandante().equals(mandante) && p.getVisitante().equals(visitante)) {
                return true;
            }
        }
        return false;
    }
}