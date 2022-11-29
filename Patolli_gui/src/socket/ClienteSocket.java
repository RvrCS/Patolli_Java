package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.in;
import static java.lang.System.out;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import patolli_ui.menu;

public class ClienteSocket {
    
    public static void main(String[] args) {
    Socket serverSocket = null;
    PrintWriter out = null;
    BufferedReader in = null;
        try {
            serverSocket = new Socket("localhost", 4444);
            out = new PrintWriter(serverSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            ClienteHilo hilo = new ClienteHilo(out, in);
            menu.getInstance().setVisible(true);
            hilo.start();
            hilo.join();
        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
