import java.net.*;

public class UDPServer{
	public static void main(String args[]){
		try{
			DatagramSocket s = new DatagramSocket(8888);
			byte[] buffer = new byte[1024];
			while(true){
				DatagramPacket p = new DatagramPacket(buffer, buffer.length);
				s.receive(p);

				String sentmessage = new String(p.getData(), 0, p.getLength());
				System.out.println("Received message: " + sentmessage);

				InetAddress clientaddress = p.getAddress();
				int clientport = p.getPort();
				String message = "Message received";
				byte[] data = message.getBytes();

				DatagramPacket send = new DatagramPacket(data, data.length, clientaddress, clientport);
				s.send(send);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}