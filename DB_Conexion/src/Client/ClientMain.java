/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.IOException;

/**
 *
 * @author TProdWarrior
 */
public class ClientMain {
    public static void main(String[] args) throws IOException{
        Client_DB client = new Client_DB("192.168.5.100");
        new Thread(client).start();
    }
}
