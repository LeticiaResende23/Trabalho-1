package brasileirao.teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import brasileirao.modelo.Tabela;
import brasileirao.modelo.Time;

import java.util.List;

class TabelaTest {

    @Test
    void testClassificacaoPorPontos() {
        Time timeA = new Time("Time A"); 
        timeA.registrarPartida(1, 0);

        Time timeB = new Time("Time B"); 
        timeB.registrarPartida(2, 0);
        timeB.registrarPartida(3, 1);

        Time timeC = new Time("Time C"); 
        timeC.registrarPartida(1, 1);

        Tabela tabela = new Tabela();
        tabela.adicionarTime(timeA);
        tabela.adicionarTime(timeB); 
        tabela.adicionarTime(timeC); 

        List<Time> classificacao = tabela.getClassificacao();

        assertEquals("Time B", classificacao.get(0).getNome());
        assertEquals("Time A", classificacao.get(1).getNome());
        assertEquals("Time C", classificacao.get(2).getNome());
    }
    
    @Test
    void testDesempatePorVitorias() {
        Time timeA = new Time("Time A (1V)");
        timeA.registrarPartida(1, 0);

        Time timeB = new Time("Time B (3E)");
        timeB.registrarPartida(1, 1);
        timeB.registrarPartida(0, 0);
        timeB.registrarPartida(2, 2);

        Tabela tabela = new Tabela();
        tabela.adicionarTime(timeB); 
        tabela.adicionarTime(timeA); 

        List<Time> classificacao = tabela.getClassificacao();

        assertEquals("Time A (1V)", classificacao.get(0).getNome());
        assertEquals("Time B (3E)", classificacao.get(1).getNome());
    }
}