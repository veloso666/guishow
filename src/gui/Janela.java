package gui;
import java.awt.Desktop.Action;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela {
	private String x = "Teste";

	

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;

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
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(54, 8, 258, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
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
				cliente.setCurso(x);
				JOptionPane.showMessageDialog(null, cliente.salvar());
			}
		});
	
		btnCadastrar.setBounds(171, 184, 105, 31);
		frame.getContentPane().add(btnCadastrar);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_2.setBounds(10, 92, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(54, 89, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("JAVA");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		chckbxNewCheckBox.setBounds(10, 135, 61, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					x = "Java";
				}				
			}
		});
		
		final JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PHP");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		chckbxNewCheckBox_1.setBounds(73, 135, 58, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_1.isSelected()) {
					x = "PHP";
				}				
			}
		});
		
		final JCheckBox chckbxNewCheckBox_2 = new JCheckBox("C#");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		chckbxNewCheckBox_2.setBounds(133, 135, 51, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_2.isSelected()) {
					x = "C#";
				}				
			}
		});
		
		
		
		
	}
}