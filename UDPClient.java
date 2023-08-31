import java.net.*;

public class UDPClient{
	static int serverport = 8888;
	public static void main(String args[]){
		try{
			DatagramSocket s = new DatagramSocket();
			InetAddress serveraddress = InetAddress.getByName("localhost");
			String message = "Sample message";
			byte[] send = message.getBytes();

			DatagramPacket p = new DatagramPacket(send, send.length, serveraddress, serverport);
			s.send(p);

			byte[] buffer = new byte[1024];
			DatagramPacket receive = new DatagramPacket(buffer, buffer.length);
			s.receive(receive);

			String receivedmessage = new String(receive.getData(), 0, receive.getLength());
			System.out.println("Server Response: " + receivedmessage);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}