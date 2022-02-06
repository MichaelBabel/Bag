public class Mochila {
    int pesoAtual;
    int itens;

    // Item item será capaz de avaliar no método abaixo mesmo as subclasses como Chave, Moeda, Balestra e Raro
    boolean cabeNaMochila(Item item) {
        if (pesoAtual + item.peso <= 100) {
            return true;
        }
        else {
            return false;
        }
    }
}
