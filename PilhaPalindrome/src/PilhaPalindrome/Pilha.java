package PilhaPalindrome;

public class Pilha {

    private Node topo;
  
    public void push(int valor) {
      Node novoNo = new Node(valor);
      novoNo.proximo = topo;
      topo = novoNo;
    }
  
    public int pop() {
      if (isEmpty()) {
        throw new IllegalStateException("Pilha vazia!");
      }
      int valor = topo.valor;
      topo = topo.proximo;
      return valor;
    }
  
    public boolean isEmpty() {
      return topo == null;
    }
  
    private class Node {
      int valor;
      Node proximo;
  
      public Node(int valor) {
        this.valor = valor;
      }
    }
  }
  
