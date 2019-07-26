package DatagramPacket.Sender;
import java.net.*;
import java.io.*;
import java.util.*;
import CheckConnectivity.ConnectivityException.*;

public class SendDatagram extends Exception{
	
	public static void main(String args[]) throws IOException,ConnectivityException{
		
		byte[] Data = new byte[1024];
		DatagramSocket x = new DatagramSocket();
		
		System.out.println("Enter the IP Address of Your System:");
		Scanner Input = new Scanner(System.in);
		String Ultron = Input.nextLine();
		InetAddress Ip = InetAddress.getByName(Ultron);
		
		System.out.println("Enter Source Location of your File :");
		Scanner SrcX = new Scanner(System.in);
		String SourceFile = SrcX.nextLine();
		FileInputStream file = new FileInputStream(SourceFile);
		
		int ReadFile  = 0;
		while((ReadFile = file.read(Data)) != -1){
			
			x.send(new DatagramPacket(Data, Data.length, Ip, 9000));
			
		}
		
		System.out.println("File is Successfully Launched at Port No: 9000 from " + Ultron + ".");

	}

}	
				
				
		