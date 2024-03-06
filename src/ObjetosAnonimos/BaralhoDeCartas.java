package ObjetosAnonimos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BaralhoDeCartas extends JFrame{
    private ArrayList<JLabel> cartas;

    public BaralhoDeCartas(){
        super("Baralho de cartas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        cartas  = new ArrayList<>();
        criarCartas();
        adicionarCartas();
        exibirCartas();
    }

    private void criarCartas(){
        for (int i = 0; i <= 52; i++) {
            cartas.add(new JLabel("Carta " + i));
        }
    }

    private void adicionarCartas(){
        for (JLabel carta: cartas) {
            add(carta);
        }
    }

    private void exibirCartas(){
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BaralhoDeCartas::new);
    }

}
