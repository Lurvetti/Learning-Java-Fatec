import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {
    public static void main(String[] args){
        // Objeto Connection
        Connection conn;

        // Objeto Conexao
        Conexao conexao = new Conexao();

        // Executa o método para abrir uma conexão
        conn = conexao.conectar();

        // Definição da query
        String sql = "Select idDepto, nomeDepto, Local From Departamento";
        try {
            // Criar um objeto para execução de comandos SQL
            Statement comandoSQl = conn.createStatement();
            ResultSet rs = comandoSQl.executeQuery(sql); // Matriz de resultados
            
            while (rs.next()){ // enquanto haverem linhas para serem posicionadas
                System.out.println( rs.getInt("idDepto") + " - " + 
                                    rs.getString("nomeDepto") + " - " +
                                    rs.getString("Local")
                                    
                                    );
            } // o rs.next() posiciona o 'leitor" na primeira linha da matriz-resultado; ou pula a linha
            


        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Executa o metodo para fechar a conexão
        conexao.fecharConexao(conn);
    }
}
