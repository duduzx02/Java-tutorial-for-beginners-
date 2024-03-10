package Generic;

public class Caixa<T> {
    private T conteudo;

    public void adicionar(T item){
        this.conteudo = item;
    }

    public T obterConteudo(){
        return this.conteudo;
    }

}
