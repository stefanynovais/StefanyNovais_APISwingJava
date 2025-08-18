import javax.swing.*;
import java.awt.*;

public class Exercício3 extends JFrame {
    public Exercício3() {
        super("Exercício 3");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

       
        JTextArea areaTexto = new JTextArea(10, 30); //10 linhas e 30 colunas

        areaTexto.setText("Java Swing é usado para interfaces gráficas em Java. " +
                "Com ele podemos criar janelas, botões, menus e vários outros componentes. " +
                "O JTextArea é útil para textos longos, mas sem o JScrollPane " +
                "a rolagem fica limitada e atrapalha a visualização completa. " +
                "Por isso, quando temos bastante conteúdo, é essencial combinar " +
                "o JTextArea com o JScrollPane para facilitar a navegação.");

        //aqui vai definir o tipo de fonte e letra, cor de fundo, tamanho
        areaTexto.setBackground(Color.LIGHT_GRAY);
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 12)); 

        //coloca o jtextarea dentro de um scrollpane
        JScrollPane scroll = new JScrollPane(areaTexto);

        //adiciona o scroll na janela
        add(scroll);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercício3());
    }
}