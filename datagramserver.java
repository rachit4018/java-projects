import java .io.*;
import java.net.*;
class datagramserver
{
	public static void main(String[] args)throws Exception {

	DatagramSocket ds=new DatagramSocket(3000);
	byte [] buf=new byte[512];
	DatagramPacket dp=new DatagramPacket(buf,512);		
	ds.receive(dp);
	String str=new String(dp.getData());
	System.out.println(str);
	ds.close();		
	}
}