package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ventana extends JFrame {

	private VistaPrincipal vp;
	private VistaJuegos vj;
	
	public Ventana() {
		setTitle("Proyecto6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 550);
		this.getContentPane().setLayout(new CardLayout(0, 0));
	
		//DECLARACION DE TODOS MIS JPANELS
		vp = new VistaPrincipal(this);
		vj = new VistaJuegos();
		
		//AÑADIDO DE PANELES AL CARDLAYOUT
		this.getContentPane().add("Principal", vp);
		this.getContentPane().add("Juegos", vj);
	
		menu();
	}
	
	private void menu(){
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		mntmPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) getContentPane().getLayout();
				layout.show(getContentPane(), "Principal");
			}
		});
		mnPrincipal.add(mntmPrincipal);
		
		JMenu mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		mntmJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) getContentPane().getLayout();
				layout.show(getContentPane(), "Juegos");
			}
		});
		mnJuegos.add(mntmJuegos);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mnPerfil.add(mntmPerfil);
	}

}
