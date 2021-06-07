package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	//Nome do usu�rio do mysql
	private static final String USERNAME = "root";
	
	//Senha do banco
	private static final String PASSWORD = "";
	
	//Caminho do banco de dados, porta 
	private static final String DATABASE_URL = "jdbc:mysql:localhost:3306/agenda";
	
	/*
	 * Conex�o com o banco de dados
	 */
	public static Connection createConnectionToMySQL() {
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		//Criar a conex�o com o banco de dados
	    Connection conection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	    
	    Connection connection;
		return connection;
	}

	
	public static void main(String[] args) {
		
		//Recuperar uma conex�o com o banco de dados
		Connection con = createConnectionToMySQL();
		
		//Testar se a conex�o � nula
		if(con!=null) {
			System.out.println("Conex�o obtida com sucesso!");
			con.close();
		} 
	}