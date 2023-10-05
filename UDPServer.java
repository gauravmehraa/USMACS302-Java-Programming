import java.net.*;

public class UDPServer{
	public static void main(String args[]){
		try{
			DatagramSocket s = new DatagramSocket(8888);
			byte[] buffer = new byte[1024];
			while(true){
				DatagramPacket p = new DatagramPacket(buffer, buffer.length);
				s.receive(p);

				String message = new String(p.getData(), 0, p.getLength());
				System.out.println("Received message: " +message);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}