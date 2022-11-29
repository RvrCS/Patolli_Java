
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerSocket{
    
    public static void main(String[] args) {
        
        try {
            java.net.ServerSocket serverSocket = null;
            serverSocket = new java.net.ServerSocket(4444);
            System.out.println("estoy después de crear el socket");
            Socket clientSocket = null;
            while (true) {                
                clientSocket = serverSocket.accept();
                System.out.println("Jugador aceptado");
                PrintWriter out = null;
                BufferedReader in = null;
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(
						clientSocket.getInputStream()));
                ServerHilo hilo = new ServerHilo(out, in);
		hilo.start();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ServerSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
