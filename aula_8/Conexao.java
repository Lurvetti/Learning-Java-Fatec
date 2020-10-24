import java.sql.*;

public class Conexao {
	public Connection conectar (){
		try	{
				
			// Conexão SQLite
			Connection conn;
			Class.forName("org.sqlite.JDBC"); // verifica se o driver está disponível na aplicação
			System.out.println("Driver JDBC encontrado!");
			String pathBD = System.getProperty("user.dir").replace("\\", "/");			
			String bdUrl = "jdbc:sqlite:"+pathBD+"/aula_8/bd/ALPOO.db";
			System.out.println(bdUrl);
			conn = DriverManager.getConnection(bdUrl); 

			System.out.println("Conexao realizada com sucesso! Nome da Conexao: " + conn);
			return conn;
		}	
		catch(ClassNotFoundException ex){
			System.out.println("Driver JDBC não encontrado!  "+ex); 
			System.exit(0); 
			return null;
		}
		catch(SQLException ex){
			System.out.println("Problemas na conexão com a fonte de dados   ");
			return null;
		}
	}

	public void fecharConexao (Connection conn){
		try {
			conn.close();
			System.out.println("Conexão "+ conn + "  fechada com sucesso.");
		}
		catch(SQLException ex) {
			System.out.println("Problemas na conexao com a fonte de dados   "+ ex);
		}
	}

}
