package Vistas;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.List;

public class VistaJuegos extends JPanel {
	private JTextField nombre;
	private JTextField nombre1;
	private JTextField genero;
	private JTextField plataforma;

	/**
	 * Create the panel.
	 */
	public VistaJuegos() {
		this.setBounds(100, 100, 600, 500);
		setLayout(null);
		
		
		etiquetas();
		camposTexto();
		botones();
		comboBox();
		lista();
	}
	
	private void etiquetas(){
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(42, 40, 80, 16);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(269, 40, 80, 16);
		add(lblGenero);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(448, 42, 94, 16);
		add(lblPlataforma);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(432, 136, 72, 16);
		add(lblNombre_1);
		
		JLabel lblGenero_1 = new JLabel("Genero");
		lblGenero_1.setBounds(432, 200, 102, 16);
		add(lblGenero_1);
		
		JLabel lblPlataforma_1 = new JLabel("Plataforma");
		lblPlataforma_1.setBounds(432, 266, 102, 16);
		add(lblPlataforma_1);
	}
	
	private void camposTexto(){
		nombre = new JTextField();
		nombre.setBounds(31, 68, 134, 28);
		add(nombre);
		nombre.setColumns(10);
		
		nombre1 = new JTextField();
		nombre1.setBounds(425, 163, 134, 28);
		add(nombre1);
		nombre1.setColumns(10);
		
		
		
		genero = new JTextField();
		genero.setColumns(10);
		genero.setBounds(425, 227, 134, 28);
		add(genero);
		
		
		
		plataforma = new JTextField();
		plataforma.setBounds(425, 295, 134, 28);
		add(plataforma);
		plataforma.setColumns(10);
	}
	
	private void botones(){
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEditar.setBounds(425, 354, 117, 29);
		add(btnEditar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnGuardar.setBounds(425, 394, 117, 29);
		add(btnGuardar);
	}
	
	private void comboBox(){
		JComboBox comboBoxGenero = new JComboBox();
		comboBoxGenero.setBounds(201, 69, 157, 27);
		add(comboBoxGenero);
		
		JComboBox comboBox_1Plataforma = new JComboBox();
		comboBox_1Plataforma.setBounds(410, 69, 149, 27);
		add(comboBox_1Plataforma);
	}
	
	private void lista(){
		List listaJuegos = new List();
		listaJuegos.setBounds(31, 157, 169, 260);
		listaJuegos.setBackground(Color.WHITE);
		for(int a=0;a<10;a++){
			listaJuegos.add("Juego "+a);
		}
		add(listaJuegos);
	}
}
