import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Exercicio7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 7");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Brasil", "Argentina", "Chile"}); //criando um jcombo com itens
        comboBox.setSelectedItem("Argentina"); // define o item "Argentina" selecionado por padrão 
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String pais = (String) e.getItem(); //retorna um objeto como string 
                    System.out.println("País selecionado: " + pais);
                }
            }
        });

        //adicionando o jcombo ao frame
        frame.add(comboBox);
        frame.setVisible(true);
    }
}