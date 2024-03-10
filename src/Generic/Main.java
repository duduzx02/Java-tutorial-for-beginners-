package Generic;

public class Main {
    public static void main(String[] args) {

        Caixa<Integer> caixaDeInteiros = new Caixa<>();
        caixaDeInteiros.adicionar(10);

        int valor = caixaDeInteiros.obterConteudo();
        System.out.println("Valor na caixa: " + valor);

        Caixa<String> caixaDeStrings = new Caixa<>();
        caixaDeStrings.adicionar("Olá, mundo!");

        String mensagem = caixaDeStrings.obterConteudo();
        System.out.println("Mensgagem na caixa: " + mensagem);


    }
}
