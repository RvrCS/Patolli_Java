package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteHilo extends Thread {

    PrintWriter out = null;
    BufferedReader in = null;

    public ClienteHilo(PrintWriter out, BufferedReader in) {
        this.in = in;
        this.out = out;
    }

    @Override
    public void run() {
        try {
            String fromServer;
            String fromUser;
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            while ((fromServer = in.readLine()) != null) {
                System.out.println("Server: " + fromServer);
                if (fromServer.equals("Bye.")) {
                    break;
                }

                fromUser = stdIn.readLine();
                if (fromUser != null) {
                    System.out.println("Client: " + fromUser);
                    out.println(fromUser);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ClienteHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
