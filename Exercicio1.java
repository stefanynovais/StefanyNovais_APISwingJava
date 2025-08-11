import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Exercicio1 extends JFrame {
    public Exercicio1() {
        super("Painel de Controle");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Cria o Painel
        JPanel painel = new JPanel();

        // Define a cor de fundo do painel
        painel.setBackground(Color.BLUE);

        // Define uma borda com um título para o painel
        Border borda = BorderFactory.createTitledBorder("Painel de Controle");
        painel.setBorder(borda);

        // Cria um botão
        JButton botao = new JButton("Clique Aqui!");

        // Define a cor do botão
        botao.setBackground(Color.YELLOW);

        // Adiciona o botão ao painel
        painel.add(botao);

        // Adiciona o painel à janela
        add(painel);

        setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercicio1());
    }
}