package SobrescritaMetodo;

public class Dog extends Animal{
    @Override // Declarar o @Override Não é Obrigatório, mas é uma bora prática
    public void falar() {
        System.out.println("O cachorro late! *auau* ");
    }
}
