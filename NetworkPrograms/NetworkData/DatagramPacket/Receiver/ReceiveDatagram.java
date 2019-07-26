package DatagramPacket.Receiver;
import java.net.*;
import java.net.DatagramPacket;
import java.io.*;
import java.util.*;
import NetworkData.DatagramPacket.Sender.*;

public class ReceiveDatagram extends Exception{
	
	public static void main(String args[]) throws IOException{
		
		byte[] ReceiveData = new byte[1024];
		DatagramSocket y = new DatagramSocket(9000);
		
		System.out.println("Enter Destination Location Of your File :");
		Scanner DestX = new Scanner(System.in);
		String DestinationFile = DestX.nextLine();
		
		FileWriter WriteData = new FileWriter(DestinationFile);
		BufferedWriter Buffer = new BufferedWriter(WriteData);
			
		DatagramPacket Dp = new DatagramPacket(ReceiveData, ReceiveData.length);
	    y.receive(Dp);
			
		String str = new String(new String(Dp.getData(), 0, Dp.getLength()));
		char[] Arr = str.toCharArray();
		for(int i=0; i<Arr.length; i++){
			
			while(Arr[i] != -1){
				
				Buffer.write(Arr[i]);
				break;
			    
			}
			
	    }

		Buffer.close();
		
	}

}	

			