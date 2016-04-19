import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class bdConection {
    
    private Connection conexion = null;
    private ResultSet resultado = null;
    private Statement declaracion = null;
    
    public void conexion(){
        if(conexion != null){
            return;
        }
        
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String password = "totitoSQL";
        try{
            Class.forName("org.postgresql.Driver");
            
            conexion = DriverManager.getConnection(url, "postgres", password);
            
            if(conexion != null){
                System.out.println("Conectado a Base de Datos...");
            }
        } catch(Exception e){
            System.out.println("Problemas de conexión");
        }
    }
}
