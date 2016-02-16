package DB_Manager;

import db_conexion.conector.DB_Conector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Manager {
    private DB_Conector sqlConnector;
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private String result = "";
    
    public DB_Manager() throws ClassNotFoundException, SQLException{
        this.sqlConnector = new DB_Conector();
        this.conexion = this.sqlConnector.getConexion();
    }
    
    public String getTable() throws SQLException{
        String Query = "select * from autopartes";
        this.st = this.conexion.createStatement();
        this.rs = st.executeQuery(Query);
        
        while(rs.next()){
            this.result += "ID: " + rs.getInt("id") + "\n";
            this.result += "Nombre: " + rs.getNString("Nombre") + "\n";
            this.result += "Modelo: " + rs.getNString("Modelo") + "\n";
            this.result += "Fabricante: " + rs.getNString("Fabricante") + "\n";
            this.result += "Precio: " + rs.getFloat("Precio") + "\n";
            this.result += "Cantidad: " + rs.getInt("Cantidad") + "\n\n";
        }
        
        return this.result;
    }
}
