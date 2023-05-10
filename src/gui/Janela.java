package gui;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setNome(textField.getText());
				cliente.setEmail(textField_1.getText());
				cliente.setIdade(Integer.parseInt(textField_2.getText()));
				JOptionPane.showMessageDialog(null, cliente.salvar());
			}
		});
		btnCadastrar.setBounds(171, 184, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setBounds(10, 92, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(54, 89, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("JAVA");
		chckbxNewCheckBox.setBounds(10, 135, 51, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PHP");
		chckbxNewCheckBox_1.setBounds(63, 135, 46, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("C#");
		chckbxNewCheckBox_2.setBounds(111, 135, 41, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
	}
}