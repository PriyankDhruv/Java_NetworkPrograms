package NetworkData.Socket;
import java.io.*;
import java.util.*;
import java.net.*;
import CheckConnectivity.ConnectivityException.*;

class TextBrowser extends Exception{
	
	public static void main(String args[]) throws UnknownHostException,IOException{
		
		System.out.println("Enter the URL :");
		Scanner InputWeb = new Scanner(System.in);
		String Web = InputWeb.nextLine();
		
		InetAddress getWeb = InetAddress.getByName(Web);
		int Delay = 1500;
		try{
			
			if(getWeb.isReachable(Delay)){
		
		        throw new ConnectivityException(Delay, Web);
				
			}

		}catch(ConnectivityException ce){}	
		
		Socket Connection = new Socket(Web, 80);
		
		OutputStream x = Connection.getOutputStream();
		x.write("GET / HTTP/1.1 \r\n\r\n".getBytes());
		
		InputStream y = Connection.getInputStream();
		
		int z;
		String Content = new String();
		while((z = y.read()) != -1){
			
			Content = Content + (char)z;
					
		}
		System.out.println(Content);

		y.close();
		
	}

}	
		
		