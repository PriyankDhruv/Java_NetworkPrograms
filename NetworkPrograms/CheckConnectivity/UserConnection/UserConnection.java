package CheckConnectivity.UserConnection;
// CLASSPATH = "C:\Program Files (x86)\Java\jdk1.6.0_02\bin\NetworkPrograms";
import java.net.*;
import java.util.*;
import CheckConnectivity.ConnectivityException.*;

class UserConnection{
	
	public static void main(String args[]) throws Exception{
		
		System.out.println("Enter Your Host Name :");
		Scanner getHost = new Scanner(System.in);
		String HostMaster = getHost.nextLine();
		
		InetAddress WebShooter = InetAddress.getByName(HostMaster);
		
		System.out.println("Enter the Waiting Time of your System to be Connected : ");
	    Scanner getTime = new Scanner(System.in);
		int ConnectionTime = getTime.nextInt(); 
		
		try{
			
			if(WebShooter.isReachable(ConnectionTime)){
				
		        throw new ConnectivityException(ConnectionTime,HostMaster);
				
			}	
			
	    }catch(ConnectivityException expo){}
			
	}			

}	
		
		