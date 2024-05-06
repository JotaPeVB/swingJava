package GerenciamentoVeiculos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.awt.Font.BOLD;

public class Principal {
    private static List<Veiculos> listaVeiculos = new ArrayList<>();
    private static Scanner leitura = new Scanner(System.in);

    private static void adicionarLista(Veiculos veiculos) {
        listaVeiculos.add(veiculos);
    }

    private static void editarLista(int index, Veiculos veiculos) {
        listaVeiculos.set(index, veiculos);
    }

    private void removerDaLista(int index) {
        listaVeiculos.remove(index);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Gerenciamento de Veiculos");
        frame.setSize(400, 600);
        int op = JFrame.EXIT_ON_CLOSE;
        frame.setDefaultCloseOperation(op);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel panel2 = new JPanel(new FlowLayout());
        JPanel panelMoto = new JPanel(new GridBagLayout());
        JPanel panelCarro = new JPanel(new GridBagLayout());

        String[] options = {"Selecione", "Carro", "Moto", "Caminhão"};
        JComboBox<String> veiculos1 = new JComboBox<>(options);

        panel2.add(veiculos1, posicionar(4, 10));
        frame.add(panel2, BorderLayout.SOUTH);

        veiculos1.addActionListener(e -> {
            frame.remove(panelCarro);
            frame.remove(panelMoto);
            frame.repaint();
            if (veiculos1.getSelectedItem().equals("Carro")) {
                String msg = "Marca";
                int pos = JLabel.CENTER;
                JLabel label = new JLabel(msg, pos);

                JLabel label2 = new JLabel("Modelo",JLabel.CENTER);
                JLabel label3 = new JLabel("Ano", JLabel.CENTER);
                JLabel label4 = new JLabel("TipoCombustivel", JLabel.CENTER);


                JTextField textField = new JTextField(20);
                JTextField textField1 = new JTextField(20);
                JTextField textField2 = new JTextField(20);
                JTextField textField3 = new JTextField(20);

                JButton button = new JButton("Confirmar");
                String showMsg = "Informações salvas com sucesso";
                JButton button1 = new JButton("Listar");
                String showMsg1 = "Os dados serão listados em uma nova janela";

                ActionListener buttonListener = event -> {
                    String marca = textField.getText();
                    System.out.println(marca);
                    String modelo = textField1.getText();
                    System.out.println(modelo);
                    Integer ano = Integer.valueOf(textField2.getText());
                    System.out.println(ano);
                    String tipoCombustivel = textField3.getText();
                    Carro veiculos = new Carro(marca, modelo, ano, tipoCombustivel);
                    Principal.adicionarLista(veiculos);
                    JOptionPane.showMessageDialog(null, showMsg);
                    textField.setText("");
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");

                };
                button.addActionListener(buttonListener);

                ActionListener buttonListener1 = event -> {
                    JFrame frame2 = new JFrame("Gerenciamento de Veiculos");
                    frame2.setSize(400, 300);
                    frame2.setLocationRelativeTo(null);
                    frame2.setVisible(true);

                    String[] nomeColunas = {"Indice", "Marca", "Modelo", "Ano", "Tipo Combustivel", "Cilindradas", "Peso Total"};
                    String[][] veiculos = new String[listaVeiculos.size()][];
                    int i = 0;
                    for (Veiculos veiculo: listaVeiculos) {
                        veiculos[i] = new String[]{String.valueOf(i), veiculo.getMarca(), veiculo.getModelo(), String.valueOf(veiculo.getAno())};
                        i++;
                    }
                    JPanel panel1 = new JPanel();
                    var model = new DefaultTableModel(veiculos, nomeColunas);
                    JTable table = new JTable(model);
                    JScrollPane scrollPane = new JScrollPane(table);
                    panel1.add(scrollPane, BorderLayout.CENTER);

                    frame2.add(panel1);
                    frame2.setVisible(true);
                };
                button1.addActionListener(buttonListener1);


                panelCarro.add(label, posicionar(0, 0));
                panelCarro.add(textField, posicionar(1, 0));
                panelCarro.add(label2, posicionar(0, 1));
                panelCarro.add(textField1, posicionar(1, 1));
                panelCarro.add(label3, posicionar(0, 2));
                panelCarro.add(textField2, posicionar(1,2));
                panelCarro.add(label4, posicionar(0, 3));
                panelCarro.add(textField3, posicionar(1,3));
                panelCarro.add(button1, posicionar(2,4));
                panelCarro.add(button, posicionar(3, 4));
                frame.add(panelCarro);

            } else if (veiculos1.getSelectedItem().equals("Moto")) {
                String msg = "Marca";
                int pos = JLabel.CENTER;
                JLabel label = new JLabel(msg, pos);

                JLabel label2 = new JLabel("Modelo",JLabel.CENTER);
                JLabel label3 = new JLabel("Ano", JLabel.CENTER);
                JLabel label4 = new JLabel("Cilindradas", JLabel.CENTER);


                JTextField textField = new JTextField(20);
                JTextField textField1 = new JTextField(20);
                JTextField textField2 = new JTextField(20);
                JTextField textField3 = new JTextField(20);

                JButton button = new JButton("Confirmar");
                String showMsg = "Informações salvas com sucesso";
                JButton button1 = new JButton("Listar");
                String showMsg1 = "Os dados serão listados em uma nova janela";

                ActionListener buttonListener = event -> {
                    String marca = textField.getText();
                    System.out.println(marca);
                    String modelo = textField1.getText();
                    System.out.println(modelo);
                    Integer ano = Integer.valueOf(textField2.getText());
                    System.out.println(ano);
                    String cilindradas = textField3.getText();
                    Moto veiculos = new Moto(marca, modelo, ano, cilindradas);
                    Principal.adicionarLista(veiculos);
                    JOptionPane.showMessageDialog(null, showMsg);
                    textField.setText("");
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");

                };
                button.addActionListener(buttonListener);

                ActionListener buttonListener1 = event -> {
                    JFrame frame2 = new JFrame("Gerenciamento de Veiculos");
                    frame2.setSize(400, 300);
//                    int op1 = JFrame.EXIT_ON_CLOSE;
//                    frame2.setDefaultCloseOperation(op1);
                    frame2.setLocationRelativeTo(null);
                    frame2.setVisible(true);

                    String[] nomeColunas = {"Indice", "Marca", "Modelo", "Ano", "Tipo Combustivel", "Cilindradas", "Peso Total"};
                    String[][] veiculos = new String[listaVeiculos.size()][];
                    int i = 0;
                    for (Veiculos veiculo: listaVeiculos) {
                        veiculos[i] = new String[]{String.valueOf(i), veiculo.getMarca(), veiculo.getModelo(), String.valueOf(veiculo.getAno())};
                        i++;
                    }
                    JPanel panel1 = new JPanel();
                    var model = new DefaultTableModel(veiculos, nomeColunas);
                    JTable table = new JTable(model);
                    JScrollPane scrollPane = new JScrollPane(table);
                    panel1.add(scrollPane, BorderLayout.CENTER);

                    frame2.add(panel1);
                    frame2.setVisible(true);
                };
                button1.addActionListener(buttonListener1);


                panelMoto.add(label, posicionar(0, 0));
                panelMoto.add(textField, posicionar(1, 0));
                panelMoto.add(label2, posicionar(0, 1));
                panelMoto.add(textField1, posicionar(1, 1));
                panelMoto.add(label3, posicionar(0, 2));
                panelMoto.add(textField2, posicionar(1,2));
                panelMoto.add(label4, posicionar(0, 3));
                panelMoto.add(textField3, posicionar(1,3));
                panelMoto.add(button1, posicionar(2,4));
                panelMoto.add(button, posicionar(3, 4));
                frame.add(panelMoto);
            }
        });
    }
    static GridBagConstraints posicionar(int x, int y) {
        var cts = new GridBagConstraints();
        cts.gridx = x;
        cts.gridy = y;
        cts.insets = new Insets(10, 10, 10, 10);
        return cts;
    }


}


