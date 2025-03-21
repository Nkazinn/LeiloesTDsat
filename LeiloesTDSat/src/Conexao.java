import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Duwann
 */
public class Conexao {
    public String url = "jdbc:mysql://localhost:3306/uc11?useSSL=false"; //Nome da base de dados
    public String user = "Duwann"; //nome do usuário do MySQL
    public String password = "31"; //senha do MySQL 
    Connection con ;
    
    
    public Connection conectar() {
        try {
            con = DriverManager.getConnection(url,user,password);
            return con;
            
      } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    } 
    
    public void desconectar(){
        try {
            con.close();
      } catch (SQLException e) {}
   }
}
