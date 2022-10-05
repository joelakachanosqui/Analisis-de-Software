package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class VentanaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2969386564630328442L;
	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaLogin() {
		setTitle("Sistema Libreria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(10, 69, 75, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setBounds(10, 94, 75, 14);
		contentPane.add(lblContraseña);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(95, 66, 225, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(95, 91, 225, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(231, 122, 89, 23);
		contentPane.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaMenu obj = new VentanaMenu();
				obj.setVisible(true);
			}
		});
	}
}
