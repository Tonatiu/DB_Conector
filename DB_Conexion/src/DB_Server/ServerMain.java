package DB_Server;

import java.io.IOException;
import java.sql.SQLException;

public class ServerMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException{
        Server serv = new Server();
        new Thread(serv).start();
    }
}
