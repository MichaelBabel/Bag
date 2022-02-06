public class Mochila {
    int pesoAtual;
    int itens;

    boolean cabeNaMochila(Item item) {
        if (pesoAtual + item.peso <= 100) {
            return true;
        }
        else {
            return false;
        }
    }
}
