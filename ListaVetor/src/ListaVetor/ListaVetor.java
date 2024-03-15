package ListaVetor;

public class ListaVetor {

    private Object[] elementos;
    private int tamanho;


    public ListaVetor(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    // Adicionar elemento no início da lista
    public void adicionarInicio(Object elemento) {
        if (tamanho == elementos.length) {
            throw new RuntimeException("Lista cheia!");
        }

        // Desloca os elementos existentes para direita
        for (int i = tamanho; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[0] = elemento;
        tamanho++;
    }

    // Adicionar elemento no fim da lista
    public void adicionarFim(Object elemento) {
        if (tamanho == elementos.length) {
            throw new RuntimeException("Lista cheia!");
        }

        elementos[tamanho++] = elemento;
    }

    // Adicionar elemento em qualquer posição da lista
    public void adicionar(int posicao, Object elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }

        if (tamanho == elementos.length) {
            throw new RuntimeException("Lista cheia!");
        }

        // Desloca os elementos existentes para direita a partir da posição
        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[posicao] = elemento;
        tamanho++;
    }

    // Remover elemento de uma determinada posição da lista
    public void remover(int posicao) {
        if (tamanho == 0) {
            throw new RuntimeException("Lista vazia!");
        }

        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }

        // Desloca os elementos existentes para esquerda a partir da posição
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        tamanho--;
    }

    // Verificar se um determinado elemento existe na lista
    public boolean contem(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }

        return false;
    }

    // Retornar o tamanho da lista
    public int tamanho() {
        return tamanho;
    }

    // Verificar se a lista está cheia
    public boolean estaCheia() {
        return tamanho == elementos.length;
    }

    // Verificar se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Listar todos os elementos da lista
    public void listar() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }

}
