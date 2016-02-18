package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client_DB implements Runnable{
    private Socket client;
    private int port = 3035;
    private DataInputStream Input;
    private DataOutputStream Output;
    private boolean active = true;
    
    public Client_DB(String Server_IP) throws UnknownHostException, IOException{
        this.client = new Socket(InetAddress.getByName(Server_IP), port);
        this.Input = new DataInputStream(this.client.getInputStream());
        this.Output = new DataOutputStream(this.client.getOutputStream());
    }

    @Override
    public void run() {
        String responce;
        System.out.println("Client ready in port: " + this.port);
        while(this.active){
            try {
                responce = this.Input.readUTF();
                System.out.println(responce);
                this.active = false;
            } catch (IOException ex) {
                Logger.getLogger(Client_DB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            this.client.close();
        } catch (IOException ex) {
            Logger.getLogger(Client_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
