package DB_Server;

import DB_Manager.DB_Manager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server implements Runnable{
    private final ServerSocket server;
    private final int port = 3035;
    private DataInputStream Input;
    private DataOutputStream Output;
    private Socket client;
    private boolean active = true;
    private final DB_Manager manager;
    private String result;
    
    public Server() throws IOException, ClassNotFoundException, SQLException{
        this.server = new ServerSocket(port);
        this.manager = new DB_Manager();
    }
    
    public void getClientStreams() throws IOException{
        this.Input = new DataInputStream(this.client.getInputStream());
        this.Output = new DataOutputStream(this.client.getOutputStream());
    }

    @Override
    public void run() {
        System.out.println("Server running");
        while(this.active){
            try {
                this.client = this.server.accept();
                this.getClientStreams();
                this.result = this.manager.getTable();
                this.Output.writeUTF(result);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
