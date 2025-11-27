package brasileirao.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tabela {
    private List<Time> times;

    public Tabela() {
        this.times = new ArrayList<>();
    }

    public void adicionarTime(Time time) {
        this.times.add(time);
    }

    public List<Time> getClassificacao() {
        Collections.sort(this.times); 
        return this.times;
    }
}