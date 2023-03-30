package estruturapilha;

import java.util.Scanner;

public class EstruturaPilha {

    public static void main(String[] args) {
        
        Pilha pilha = new Pilha();
        
        //Será inserido a letra "a" e depois as demais letras.
        //Por fim será removido todos os elementos até a pilha ficar vazia;
        pilha.inserir("a");
        pilha.imprimir();
        pilha.inserir("b");
        pilha.inserir("c");
        pilha.inserir("d");
        pilha.imprimir();
        pilha.remover();
        pilha.remover();
        pilha.remover();
        pilha.imprimir();
        pilha.remover();
        pilha.remover();
        pilha.imprimir();
    }
}

