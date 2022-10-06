package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class VentanaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu frame = new VentanaMenu();
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
	public VentanaMenu() {
		setTitle("Sistema Libreria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDarAlta = new JButton("Altas");
		btnDarAlta.setBounds(10, 48, 119, 23);
		contentPane.add(btnDarAlta);
		
		JButton btnActualizacion = new JButton("Actualizar registro");
		btnActualizacion.setBounds(10, 82, 119, 23);
		contentPane.add(btnActualizacion);
		
		JButton btnBaja = new JButton("Dar de Baja");
		btnBaja.setBounds(10, 116, 119, 23);
		contentPane.add(btnBaja);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(10, 152, 119, 23);
		contentPane.add(btnConsultar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(330, 11, 89, 23);
		contentPane.add(btnSalir);
		
		btnDarAlta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaAltaUpdate obj = new VentanaAltaUpdate();
				obj.setVisible(true);
				
			}
		});
		btnActualizacion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaAltaUpdate obj = new VentanaAltaUpdate();
				obj.setVisible(true);
				
			}
		});
		btnBaja.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaQueryDelete obj = new VentanaQueryDelete("D");
				obj.setVisible(true);
				
			}
		});
		
		btnConsultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaQueryDelete obj = new VentanaQueryDelete("Q");
				obj.setVisible(true);
				
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
}
