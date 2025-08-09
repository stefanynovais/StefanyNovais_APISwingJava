import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroUsuario {
    public static void main(String[] args) {
        // Criação do frame (janela)
        JFrame frame = new JFrame("Cadastro de Usuário");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Rótulos
        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelIdade = new JLabel("Idade: ");
        JLabel labelEmail = new JLabel("Email: ");
        JLabel labelSexo = new JLabel("Sexo: ");

        // Campos de texto
        JTextField campoNome = new JTextField(20);
        JTextField campoIdade = new JTextField(2);
        JTextField campoEmail = new JTextField(30);

        // Radio Button para seleção de sexo

        // 1. primeiro passo é criar os objetos do botão
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");

        // 2. segundo passo é criar o objeto "botão" para agruparmos a seleção
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(masculino);
        grupoSexo.add(feminino);

        // 3. terceiro passo é criar um painel que agrupe esses componentes
        JPanel painelSexo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelSexo.add(masculino);
        painelSexo.add(feminino);

        // Botões
        JButton botaoCadastrar = new JButton("Cadastrar");
        JButton botaoLimpar = new JButton("Limpar");

        // Ação dos Botões
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText().trim(); // aqui usamos esse "trim" para evitar os espaços extras
                                                          // digitados pelo usuário
                String idade = campoIdade.getText().trim();
                String email = campoEmail.getText().trim();

                // matches é um método é uma ferramenta para verificar seu uma string está de
                // acordo com um padrão regular, chamado de 'regex'.
                if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                    JOptionPane.showMessageDialog(frame, "Digite um e-mail válido, por favor!", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    return; // impede que o código faça o cadastro mesmo com o email inválido
                }

                // aqui a gente usa um operador ternário como uma estrutrua condicional, ele lê:
                // se o botão masculino estiver selecionado, sexo recebe a string "Masculino".
                // Se nenhum dos dois tiver selecionado, a string aparecerá vazia.
                String sexo = masculino.isSelected() ? "Masculino" : feminino.isSelected() ? "Feminino" : "";

                // aqui valida, de forma simples, se todos os campos foram preeenchidos
                if (nome.isEmpty() || idade.isEmpty() || email.isEmpty() || sexo.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Você precisa preencher todos os campos!", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuário Cadastrado: \n" + "Nome: " + nome + "\n" + "Idade: "
                            + idade + "\n" + "Email: " + email + "\n" + "Sexo: " + sexo);
                }
            }
        });

        // Aqui usamos o método de "setar" os campos, pois para limpá-los, queremos que
        // a string fique vazia, tanto visualmente como internamente.
        botaoLimpar.addActionListener(e -> {
            campoNome.setText("");
            campoIdade.setText("");
            campoEmail.setText("");
            grupoSexo.clearSelection();
        });

        // Adicionando componentes ao frame
        frame.add(labelNome);
        frame.add(campoNome);
        frame.add(labelIdade);
        frame.add(campoIdade);
        frame.add(labelEmail);
        frame.add(campoEmail);
        frame.add(painelSexo);
        frame.add(botaoCadastrar);
        frame.add(botaoLimpar);

        // Exibir a janela
        frame.setVisible(true);
    }
}