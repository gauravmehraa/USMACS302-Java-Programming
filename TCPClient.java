import java.io.*;
import java.net.*;

public class TCPClient{
    static int serverPort = 8888;
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost", serverPort);
            String message = "Sample message from client";
            byte[] send = message.getBytes();
            OutputStream out = s.getOutputStream();
            out.write(send);
            System.out.println("Message sent: " +message);
            s.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
