package PilhaPalindrome;

public class Principal {
    public static void main(String[] args) {
      Pilha pilhaOriginal = new Pilha();
      Pilha pilhaAuxiliar = new Pilha();
      Pilha pilhaSaida = new Pilha();
  
      String palavra = "radar";
  
      // Armazena a palavra em duas pilhas
      for (char caracter : palavra.toCharArray()) {
        pilhaOriginal.push(caracter);
        pilhaAuxiliar.push(caracter);
      }
  
      // Desempilha a pilha auxiliar e armazena na pilha de saída (invertida)
      while (!pilhaAuxiliar.isEmpty()) {
        pilhaSaida.push(pilhaAuxiliar.pop());
      }
  
      // Compara as pilhas original e de saída
      boolean isPalindromo = true;
      while (!pilhaOriginal.isEmpty() && !pilhaSaida.isEmpty()) {
        if (pilhaOriginal.pop() != pilhaSaida.pop()) {
          isPalindromo = false;
          break;
        }
      }
  
      if (isPalindromo) {
        System.out.println("A palavra '" + palavra + "' é um palíndromo");
      } else {
        System.out.println("A palavra '" + palavra + "' não é um palíndromo");
      }
    }
  }