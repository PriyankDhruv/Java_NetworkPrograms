import java.net.*;
import java.util.*;

class SystemInfo{
	
	public static void main(String args[]) throws Exception{
		
		System.out.println("Enter your Host Name :");
		Scanner getHost = new Scanner(System.in);
		String HostMaster = getHost.nextLine();
		
		InetAddress MySystem = InetAddress.getByName(HostMaster);

		System.out.println("\nREQURIED SYSTEM DETAILS ARE AS FOLLOW : ");
	    System.out.println("System Name    : " + MySystem.getHostName());
		System.out.println("System Address : " + MySystem.getAddress());
		
	}

}	

