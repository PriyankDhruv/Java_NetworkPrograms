package CheckConnectivity.ConnectivityException;
// CLASSPATH = "C:\Program Files (x86)\Java\jdk1.6.0_02\bin\NetworkPrograms";
import java.net.*;

public class ConnectivityException extends Exception{
	
	int ConnectionDelay;
	public ConnectivityException(int ConnectionDelay, String HostName){

	    int ThresholdTime = 2000; 
		if(ConnectionDelay <= ThresholdTime){
			
			System.out.println("\nYou are Connected Successfully !!");
			
		}else{

		    System.out.println("\nYou are not Connected !! Please, Check your Network Connection.");
			
		}

	}

}	
		
		