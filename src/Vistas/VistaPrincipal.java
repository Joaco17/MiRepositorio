package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import Controller.UsuarioController;
import Modelo.ModeloUsuario;
import Modelo.Usuario;

public class VistaPrincipal extends JPanel {
	
	private JPasswordField passwordField;
	private Ventana ventana;
	private UsuarioController uc;
	private ModeloUsuario mu = new ModeloUsuario();
	
	/**
	 * Create the panel.
	 */
	public VistaPrincipal(Ventana v) {
		this.setBounds(100, 100, 600, 500);
		setLayout(null);
		this.ventana = v;
		uc = new UsuarioController();
		
		etiquetas();
		comboBox();
		camposTexto();
		botones();
	}
	
	private void etiquetas(){
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/Img/user.png")));
		lblNewLabel.setBounds(71, 36, 153, 158);
		add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(71, 241, 90, 16);
		add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(71, 308, 90, 16);
		add(lblPassword);
	}

	private void comboBox(){
		//mu.load();
		JComboBox<Usuario> comboBox = new JComboBox(uc.loadUsuarios().toArray());
		comboBox.setBounds(71, 269, 185, 27);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add(comboBox);
	}
	
	private void camposTexto(){
		passwordField = new JPasswordField();
		passwordField.setBounds(71, 336, 185, 28);
		add(passwordField);
	}
	
	private void botones(){
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setBounds(71, 387, 186, 29);
		add(btnLogin);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnRegistrarse.setBounds(71, 427, 186, 29);
		add(btnRegistrarse);
		
		JButton btnJuegos = new JButton("Juegos");
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
				layout.show(ventana.getContentPane(), "Juegos");
			}
		});
		btnJuegos.setBounds(380, 36, 161, 29);
		add(btnJuegos);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPerfil.setBounds(380, 94, 161, 29);
		add(btnPerfil);
	}
}
