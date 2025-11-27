package brasileirao.teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import brasileirao.modelo.Time;

class TimeTest {

    @Test
    void testCriarTimeComNome() {
        Time time = new Time("Flamengo");
        assertEquals("Flamengo", time.getNome());
    }
    
    @Test
    void testTimeIniciaComZeroPontosEVitorias() {
        Time time = new Time("Vasco");
        assertEquals(0, time.getPontos());
        assertEquals(0, time.getVitorias());
    }

    @Test
    void testTimeIniciaComZeroGols() {
        Time time = new Time("Botafogo");
        assertEquals(0, time.getGolsMarcados());
        assertEquals(0, time.getGolsSofridos());
        assertEquals(0, time.getSaldoDeGols());
    }

    @Test
    void testRegistrarVitoria() {
        Time time = new Time("Palmeiras");
        time.registrarPartida(2, 0);

        assertEquals(3, time.getPontos());
        assertEquals(1, time.getVitorias());
        assertEquals(2, time.getGolsMarcados());
        assertEquals(0, time.getGolsSofridos());
        assertEquals(2, time.getSaldoDeGols());
    }

    @Test
    void testRegistrarEmpate() {
        Time time = new Time("Corinthians");
        time.registrarPartida(1, 1); 

        assertEquals(1, time.getPontos());
        assertEquals(0, time.getVitorias());
        assertEquals(1, time.getGolsMarcados());
        assertEquals(1, time.getGolsSofridos());
        assertEquals(0, time.getSaldoDeGols());
    }

    @Test
    void testRegistrarDerrota() {
        Time time = new Time("São Paulo");
        time.registrarPartida(0, 3); 

        assertEquals(0, time.getPontos());
        assertEquals(0, time.getVitorias());
        assertEquals(0, time.getGolsMarcados());
        assertEquals(3, time.getGolsSofridos());
        assertEquals(-3, time.getSaldoDeGols());
    }
}