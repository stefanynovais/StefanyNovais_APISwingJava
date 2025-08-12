import java.awt.Color;
import javax.swing.*;
import java.awt.FlowLayout;

public class Exercicio2 extends JFrame {
    public Exercicio2() {
        super("Exercício 2");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Cria o JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Aba 1
        JPanel painel1 = new JPanel();
        painel1.add(new JLabel("Bem-vindo às Configurações!"));
        tabbedPane.addTab("Configurações", painel1);

        // Aba 2
        JPanel painel2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));
        painel2.setBackground(Color.BLUE);
       
        JLabel labelNome = new JLabel("Digite aqui seu nome: ");
        labelNome.setForeground(Color.WHITE);
        painel2.add(labelNome);

        JTextField campoNome = new JTextField(20);
        painel2.add(campoNome);

        Icon icon2 = UIManager.getIcon("OptionPane.informationIcon");

        tabbedPane.addTab("Perfil", icon2, painel2);

         // Aba 3
        JPanel painel3 = new JPanel();
        JLabel labelAjuda = new JLabel("Digite suas dúvidas aqui: ");
        JTextArea textArea = new JTextArea(5, 25);
        JScrollPane scrollPane = new JScrollPane(textArea);
        tabbedPane.addTab("Ajuda", painel3);

        painel3.add(labelAjuda);
        painel3.add(scrollPane);

        // Adiciona o tabbedPane na janela
        add(tabbedPane);

        setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercicio2());
    }
}