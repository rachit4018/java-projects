import java.io.*;
import java.net.*;
class datagramclient 
{
	public static void main(String[] args)throws Exception {

		DatagramSocket ds=new DatagramSocket();
		String str="Bhosdiwale chacha";
		InetAddress ip=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		ds.send(dp);
		ds.close();
		
	}
}