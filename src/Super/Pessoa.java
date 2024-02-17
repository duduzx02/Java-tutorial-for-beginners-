package Super;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String pessoa, int idade) {
        this.nome = pessoa;
        this.idade = idade;
    }

    public String toString(){
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\n";
    }
}
