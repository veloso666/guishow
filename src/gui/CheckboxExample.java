package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CheckboxExample {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        final JCheckBox checkbox1 = new JCheckBox("Opção 1");
        final JCheckBox checkbox2 = new JCheckBox("Opção 2");
        final JCheckBox checkbox3 = new JCheckBox("Opção 3");

        panel.add(checkbox1);
        panel.add(checkbox2);
        panel.add(checkbox3);

        JButton saveButton = new JButton("Salvar");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedOptions = new StringBuilder();
                if (checkbox1.isSelected()) {
                    selectedOptions.append("Opção 1 selecionada\n");
                }
                if (checkbox2.isSelected()) {
                    selectedOptions.append("Opção 2 selecionada\n");
                }
                if (checkbox3.isSelected()) {
                    selectedOptions.append("Opção 3 selecionada\n");
                }

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\jlvat\\Desktop\\my codes\\opcoes.txt"));
                    writer.write(selectedOptions.toString());
                    writer.close();
                    JOptionPane.showMessageDialog(frame, "Opções salvas com sucesso!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Erro ao salvar as opções.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(saveButton);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}