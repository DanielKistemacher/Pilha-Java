package estruturapilha;

public class Pilha {
    //Atributos
    String[] pilha;
    int topo;
    int elementoRemover;
    
    //Construtor do objeto definindo os valores dos atributos
    public Pilha() {
        this.pilha = new String[4];
        this.topo = this.pilha.length - 1;
        this.elementoRemover = 0;
    }
    
    //Método para inserir o elemento no topo da pilha
    public void inserir(String elemento){
        if (topo == -1){
            System.out.println("Pilha cheia!");
        } else {
            this.pilha[topo] = elemento;
            this.topo--;
            System.out.println("Inseriu o elemento: " + elemento);
        }
    }
    
    //Método para remover o elemento que está no topo da fila
    //Será chamado o método ultimoElemento() para saber qual a posição atual da pilha
    public void remover(){
        int elemento = this.elementoRemover;
        if (elemento == this.pilha.length){
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Removeu o elemento: " + this.pilha[elemento]);
            this.pilha[elemento] = null;
            ultimoElemento();
        }
    }       
    
    //Imprimindo a pilha
    public String[] imprimir(){
        for(int x=0; x<this.pilha.length; x++){
            System.out.println(this.pilha[x]);
        }
        return this.pilha;
    }
    
    //Método que controla o último elemento que está na pilha
    public void ultimoElemento(){
        this.elementoRemover++;
    }
}
