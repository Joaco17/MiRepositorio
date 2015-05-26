package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {
	
	private Connection conexion;
	//-----------------------------------
	private String CONTROLADOR_MYSQL="com.mysql.jdbc.Driver";
	private String server="localhost";
	private String bbdd="gamedb";
	private String user="root";
	private String pass="";
	//-----------------------------------
	private static MySql instance = null;
	
	public MySql() {
		// TODO Auto-generated constructor stub
		try{
			Class.forName(CONTROLADOR_MYSQL).newInstance();
			System.out.println("CONTROLADOR CARGADO CON EXITO");
		}
		catch(Exception errorCargaControlador){
			errorCargaControlador.printStackTrace();
			System.out.println("ERROR CARGA CONTROLADOR");
		}
		
		try{
			conexion = DriverManager.getConnection("jdbc:mysql://"+server+"/"+bbdd+"?"+"user="+user+"&password="+pass);
			System.out.println("CONEXION REALIZADA CON EXITO");
		}
		catch(SQLException errorConexion){
			errorConexion.printStackTrace();
			System.out.println("ERROR DE CONEXION");
		}
	}
	
	public static MySql getInstance() {
		if(instance==null){
			//CREAR INSTANCIA DE CONEXION
			instance = new MySql();
		}
		return instance;
	}

	//METODO PARA PODER REALIZAR SELECTS EN LA BBDD
	public ResultSet query(String query){
		
		Statement st;
		ResultSet rs = null;

		try{
			st = conexion.createStatement();
			try{
				rs = st.executeQuery(query);
			}
			catch(SQLException errorConsulta){
				errorConsulta.printStackTrace();
			}
		}
		catch(SQLException e1) {
			e1.printStackTrace();
		}	
		return rs;										
	}
	
	//METODO PARA REALIZAR INSERTS, UPDATES Y DELETES EN LA BBDD
	public int modifyQuery(String update){
		
		Statement stmt;
		int rs = 0;
		try{
		stmt = conexion.createStatement();		
			try{
				rs = stmt.executeUpdate(update);
			}
			catch(SQLException e){
				
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return rs;
	}

}
