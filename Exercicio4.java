import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class Exercicio4 extends JFrame {
    public Exercicio4() {
        super("Exercício 4");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT, 15, 20));

        //adiciona o jlabel à tela
        JLabel labelData = new JLabel("Data de Nascimento:");
        add(labelData);


        // o try e o catch, em java, fazem parte do tratatamento de exceções. Ou seja, toda vez que o código possui alguma parte que pode dar erro em tempo de execução, é recomendável que vc utilize o try e o catch.
        try { //código que pode dar erro
            //cria um MaskFormatter; O MaskFormatter define a máscara de entrada (dois dígitos, barra, dóis dígitos, barra e quatro dígitos)
            MaskFormatter formato = new MaskFormatter("##/##/####");
            formato.setPlaceholderCharacter('_'); //faz com que os espaços em branco apareça como "_" até que o usuário digite algum número

            // Campo formatado
            JFormattedTextField campoData = new JFormattedTextField(formato);
            campoData.setColumns(10);

            add(campoData);

        } catch (ParseException e) { //código caso dê o erro
            e.printStackTrace(); //imprime o erro no console
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercicio4());
    }
}