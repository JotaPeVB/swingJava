import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static java.awt.Font.BOLD;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Meu primeiro JFRAME");

        frame.setSize(400, 300);
        int op = JFrame.EXIT_ON_CLOSE;
        frame.setDefaultCloseOperation(op);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        String msg = "Olá mundo";
        int pos = JLabel.CENTER;
        JLabel label = new JLabel(msg, pos);
        var font = new Font("Arial", BOLD, 24);
        label.setFont(font);
        frame.add(label);

        JTextField textField = new JTextField(20);
        ActionListener listener = event -> {
            String text = "Text: " + textField.getText();
            System.out.println(text);
        };
        textField.addActionListener(listener);
        frame.add(label);

        JPanel panel = new JPanel();

        panel.add(label);
        panel.add(textField);

        frame.add(panel);

        JButton button = new JButton("Clique aqui");
        String showMsg = "Salvo!";

        ActionListener buttonListener= e -> JOptionPane.showMessageDialog(null,showMsg);
        button.addActionListener(buttonListener);

        panel.add(button);
    }
}