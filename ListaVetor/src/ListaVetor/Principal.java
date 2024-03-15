package ListaVetor;

public class Principal {

    public static void main(String[] args) {

        // Cria a lista de estudantes
        ListaVetor listaEstudantes = new ListaVetor(5);

        // Cria e adiciona alguns estudantes à lista
        Estudante estudante1 = new Estudante("Rodrigo Faro", 12345);
        listaEstudantes.adicionarInicio(estudante1);

        Estudante estudante2 = new Estudante("Luciono Hulk", 54321);
        listaEstudantes.adicionarFim(estudante2);

        Estudante estudante3 = new Estudante("Fatima Bernades", 98765);
        listaEstudantes.adicionar(1, estudante3);

        // Mostra o tamanho da lista
        System.out.println("Tamanho da lista: " + listaEstudantes.tamanho());

        // Verifica se um estudante está na lista
        if (listaEstudantes.contem(estudante2)) {
            System.out.println("Estudante " + estudante2.getNome() + " encontrado!");
        }

        // Remove um estudante da lista
        listaEstudantes.remover(1);

        // Lista todos os estudantes
        System.out.println("Lista de estudantes:");
        listaEstudantes.listar();
    }
}


