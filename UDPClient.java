import java.net.*;

public class UDPClient{
	static int serverport = 8888;
	public static void main(String args[]){
		try{
			DatagramSocket s = new DatagramSocket();
			InetAddress serveraddress = InetAddress.getByName("localhost");
			String message = "Sample message from client";
			byte[] send = message.getBytes();

			DatagramPacket p = new DatagramPacket(send, send.length, serveraddress, serverport);
			s.send(p);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}