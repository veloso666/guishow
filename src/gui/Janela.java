package gui;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Janela {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(54, 8, 258, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setBounds(10, 51, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(54, 48, 258, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("DialogInput",Font.BOLD,12));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setNome(textField.getText());
				cliente.setEmail(textField_1.getText());
				cliente.setIdade(Integer.parseInt(textField_2.getText()));
			//	cliente.setCurso();
				JOptionPane.showMessageDialog(null, cliente.salvar());
			}
		});
		btnCadastrar.setBounds(171, 184, 105, 31);
		frame.getContentPane().add(btnCadastrar);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setBounds(10, 92, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(54, 89, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		  JPanel panel = new JPanel();
	        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

	        final JCheckBox checkbox1 = new JCheckBox("Opção 1");
	        final JCheckBox checkbox2 = new JCheckBox("Opção 2");
	        final JCheckBox checkbox3 = new JCheckBox("Opção 3");

	        panel.add(checkbox1);
	        panel.add(checkbox2);
	        panel.add(checkbox3);
	        btnCadastrar.addActionListener(new ActionListener() {
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
	}
}