package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class VentanaAltaUpdate extends JFrame {

	private JPanel contentPane;
	private JTextField textISBN;
	private JTextField textTitulo;
	private JTextField textAutor;
	private JTextField textEditorial;
	private JTextField textEdicion;
	private JTextField textAPublicacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAltaUpdate frame = new VentanaAltaUpdate();
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
	public VentanaAltaUpdate() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 445, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblISBN = new JLabel("ISBN");
		lblISBN.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblISBN.setBounds(10, 21, 46, 14);
		contentPane.add(lblISBN);
		
		textISBN = new JTextField();
		textISBN.setBounds(66, 18, 86, 20);
		contentPane.add(textISBN);
		textISBN.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(162, 21, 113, 14);
		contentPane.add(lblTitulo);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(285, 18, 86, 20);
		contentPane.add(textTitulo);
		textTitulo.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(10, 56, 46, 14);
		contentPane.add(lblAutor);
		
		textAutor = new JTextField();
		textAutor.setBounds(66, 53, 86, 20);
		contentPane.add(textAutor);
		textAutor.setColumns(10);
		
		JLabel lblEditorial = new JLabel("Editorial");
		lblEditorial.setBounds(162, 56, 113, 14);
		contentPane.add(lblEditorial);
		
		textEditorial = new JTextField();
		textEditorial.setBounds(285, 53, 86, 20);
		contentPane.add(textEditorial);
		textEditorial.setColumns(10);
		
		JLabel lbltitulo = new JLabel("Alta/Actualizaci\u00F3n");
		lbltitulo.setBounds(10, 0, 94, 14);
		contentPane.add(lbltitulo);
		
		JLabel lblEdicion = new JLabel("Edicion");
		lblEdicion.setBounds(10, 87, 46, 14);
		contentPane.add(lblEdicion);
		
		textEdicion = new JTextField();
		textEdicion.setBounds(66, 84, 86, 20);
		contentPane.add(textEdicion);
		textEdicion.setColumns(10);
		
		JLabel lblAPublicacion = new JLabel("A\u00F1o de Publicaci\u00F3n");
		lblAPublicacion.setBounds(162, 87, 113, 14);
		contentPane.add(lblAPublicacion);
		
		textAPublicacion = new JTextField();
		textAPublicacion.setBounds(285, 84, 86, 20);
		contentPane.add(textAPublicacion);
		textAPublicacion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(285, 115, 89, 23);
		contentPane.add(btnGuardar);
	}

}
