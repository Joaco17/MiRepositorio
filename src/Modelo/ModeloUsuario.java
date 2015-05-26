package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Controller.UsuarioController;

public class ModeloUsuario {
	
	public ModeloUsuario() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Usuario> load(){
		MySql conexion = MySql.getInstance();
		ResultSet resultado = conexion.query("SELECT * FROM usuario;");
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		try{
			while(resultado.next()){
				Usuario usuario = new Usuario();
				usuario.setId((int) resultado.getObject("id"));
				usuario.setNombre((String) resultado.getObject("nombre"));
				usuario.setPassword((String) resultado.getObject("pass"));
				usuario.setUsuario((String) resultado.getObject("usuario"));
				usuarios.add(usuario);
			}
		}
		catch(SQLException errorLoadUsuario){
			errorLoadUsuario.printStackTrace();
		}
		return usuarios;
	}
	
	public void save(){
		
	}

}
