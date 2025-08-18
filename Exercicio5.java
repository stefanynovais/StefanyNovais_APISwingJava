import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio5 extends JFrame {
    public Exercicio5() {
        super("Exercício 5");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

        // painel para os radiobuttons
        JPanel painelGenero = new JPanel();
        painelGenero.setLayout(new GridLayout(3, 1));

        // botões de seleção
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");
        JRadioButton outro = new JRadioButton("Outro");

        // grupo para garantir apenas uma seleção de cada item
        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(masculino);
        grupoGenero.add(feminino);
        grupoGenero.add(outro);

        // adiciona ao painel
        painelGenero.add(masculino);
        painelGenero.add(feminino);
        painelGenero.add(outro);

        add(painelGenero);

        // label do resultado
        JLabel resultado = new JLabel("Selecione uma opção acima.");
        add(resultado);

        // botão de confirmar
        JButton botaoConfirmar = new JButton("Confirmar");
        add(botaoConfirmar);

        // lógica do botão para que exiba a opção selecionada; o método isSelect verifica se o radiobutton está marcado
        botaoConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (masculino.isSelected()) {
                    resultado.setText("Selecionado: Masculino");
                } else if (feminino.isSelected()) {
                    resultado.setText("Selecionado: Feminino");
                } else if (outro.isSelected()) {
                    resultado.setText("Selecionado: Outro");
                } else {
                    resultado.setText("Nenhuma opção selecionada.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercicio5());
    }
}
