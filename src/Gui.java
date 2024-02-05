import javax.swing.*;

public class Gui {
    public static void main(String[] args) {

        // Capturando Informações do Usuário;
        String name = JOptionPane.showInputDialog("Digite seu nome: ");
        // Exibindo uma Mensagem com o Nome
        JOptionPane.showMessageDialog(null, "Olá " + name);
        // Capturando a Idade do Usuário
        int age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        // Exibindo a Idade em uma Mensagem
        JOptionPane.showMessageDialog(null, "VocÊ tem " + age + " anos de idade!");
        // Trabalhando com Números Decimais
        double height = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em centímetros: "));
        // Exibindo a altura
        JOptionPane.showMessageDialog(null, "Você tem " + height + " centrímetros de altura.");
    }
}
