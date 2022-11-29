
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerHilo extends Thread{
    BufferedReader in = null;
    PrintWriter out = null;
    
    public ServerHilo(PrintWriter out, BufferedReader in) {
		this.in = in;
		this.out = out;
    }

    @Override
    public void run() {
        String inputLine, outputLine;
        ServerProtocol sp = new ServerProtocol();
        outputLine = sp.processInput(null);
        
        try {
            while ((inputLine = in.readLine()) != null) {
                outputLine = sp.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye.")) {
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
