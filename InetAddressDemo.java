import java.net.*;

public class InetAddressDemo
{
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress address=InetAddress.getLocalHost();
		System.out.println(address);
		address=InetAddress.getByName("google.com");
		System.out.println(address);
		InetAddress addre[]=InetAddress.getAllByName("google.com");
		for(int i=0;i<addre.length;i++)
		{
			System.out.println(addre[i]);
		}
	}
}