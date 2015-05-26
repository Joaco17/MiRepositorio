package Controller;

import java.util.ArrayList;

import Modelo.ModeloUsuario;
import Modelo.Usuario;

public class UsuarioController {

	private ModeloUsuario mu;
	
	public UsuarioController() {
		// TODO Auto-generated constructor stub
		mu = new ModeloUsuario();
	}
	
	public ArrayList<Usuario> loadUsuarios(){
		return mu.load();
	}

}
