import java.util.*;

public class Jogador {
    private Carta[] mao;
    private int indiceMao;

    public Jogador() {
        mao = new Carta[3];
        this.indiceMao = 0;
    }

    public void recebeCarta(Carta c) {
        mao[this.indiceMao] = c;
        this.indiceMao++;
        System.out.println(mao[this.indiceMao-1]);
    }

}