import java.io.*;
import java.net.*;

public class TCPServer{
    static int serverPort = 8888;
    public static void main(String args[]){
        try{
            ServerSocket s = new ServerSocket(serverPort);
            System.out.println("Waiting for connection");
            while(true){
                Socket c = s.accept();
                byte[] buffer = new byte[1024];
                InputStream in = c.getInputStream();
                int bytes;
                while((bytes = in.read(buffer)) != -1){
                    String message = new String(buffer, 0, bytes);
                    System.out.println("Received message: " +message);
                }
                in.close();
                c.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
