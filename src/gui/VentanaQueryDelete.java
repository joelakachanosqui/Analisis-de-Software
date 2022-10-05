package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class VentanaQueryDelete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaQueryDelete frame = new VentanaQueryDelete();
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
	public VentanaQueryDelete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblISBN = new JLabel("ISBN");
		lblISBN.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblISBN.setBounds(10, 32, 46, 14);
		contentPane.add(lblISBN);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(66, 29, 86, 20);
		contentPane.add(textField);
		
		JLabel lblBajaconsulta = new JLabel("Baja/Consulta");
		lblBajaconsulta.setBounds(10, 11, 94, 14);
		contentPane.add(lblBajaconsulta);
		
		JLabel lblEditorial = new JLabel("Editorial");
		lblEditorial.setBounds(162, 67, 113, 14);
		contentPane.add(lblEditorial);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(285, 64, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(10, 67, 46, 14);
		contentPane.add(lblAutor);
		
		JLabel lblEdicion = new JLabel("Edicion");
		lblEdicion.setBounds(10, 98, 46, 14);
		contentPane.add(lblEdicion);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(66, 95, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(66, 64, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(285, 29, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(285, 95, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblAPublicacion = new JLabel("A\u00F1o de Publicaci\u00F3n");
		lblAPublicacion.setBounds(162, 98, 113, 14);
		contentPane.add(lblAPublicacion);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(162, 32, 113, 14);
		contentPane.add(lblTitulo);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(285, 126, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(186, 126, 89, 23);
		contentPane.add(btnConsultar);
	}
}
