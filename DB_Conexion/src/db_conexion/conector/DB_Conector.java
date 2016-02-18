package db_conexion.conector;
import java.sql.*;

public class DB_Conector{
    //Atributos de la clase
    private final Connection toSQL;
    private final String server = "jdbc:mysql://localhost/AutopartesTona";
    private final String user = "root";
    private final String passwd = "123456";
    private final String driver = "com.mysql.jdbc.Driver";
    
    public DB_Conector() throws ClassNotFoundException, SQLException{
        Class.forName(this.driver);
        this.toSQL = DriverManager.getConnection(this.server, this.user, this.passwd);
    }
    
    public Connection getConexion(){
        return this.toSQL;
    }
}
