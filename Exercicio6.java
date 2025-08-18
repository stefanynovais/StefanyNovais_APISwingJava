import javax.swing.*;
import java.awt.*;

public class Exercicio6 extends JFrame {

    public Exercicio6() {
        setTitle("Exemplo JSplitPane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        //aqui são os componentes 
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Painel Esquerdo"));
        panel1.setBackground(Color.RED);

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Painel Direito"));
        panel2.setBackground(Color.BLUE);

        //Criando o JSplitPane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
        splitPane.setDividerLocation(40); // o setDividerLocation define a posição inicial da divisória
        splitPane.setOneTouchExpandable(true); // adiciona botões para expansão/retração

        add(splitPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Exercicio6::new);
    }
}