import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Mochila mochila = new Mochila();

        Item chave1 = new Chave();
        chave1.peso = 15;
        Item chave2 = new Chave();
        chave2.peso = 4;
        Item balestra1 = new Balestra();
        balestra1.peso = 48;
        Item raro1 = new Raro();
        raro1.peso = 5;

        Item[] itensAchados = {chave1, chave2, balestra1, raro1};

        for(int i = 0; i < itensAchados.length; i++) {
            if (mochila.cabeNaMochila(itensAchados[i])) {
                mochila.pesoAtual += itensAchados[i].peso;
                mochila.itens++;
            }
        }

        System.out.println(mochila.pesoAtual);
        System.out.println(mochila.itens);
    }
}