import java.net.*;

public class UDPClient{
	static int serverport = 8888;
	public static void main(String args[]){
		try{
			//Send to server
			DatagramSocket s = new DatagramSocket();
			InetAddress serveraddress = InetAddress.getByName("localhost");
			String message = "Sample message from client";
			byte[] send = message.getBytes();

			DatagramPacket p = new DatagramPacket(send, send.length, serveraddress, serverport);
			s.send(p);
			
			//Receive from server
			byte[] buffer = new byte[1024];
			p = new DatagramPacket(buffer, buffer.length);
			s.receive(p);
			message = new String(p.getData(), 0, p.getLength());
			System.out.println("Received from server: "+message);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}