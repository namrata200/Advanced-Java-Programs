import java.net.*;

class InetAddressDemo1
{
	public static void main(String args[]) throws UnknownHostException 
	{
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);
		Address = InetAddress.getByName("google.com");
		System.out.println(Address);
		InetAddress SW[] = InetAddress.getAllByName("www.facebook.com");
		for (int i=0; i<SW.length; i++)
		System.out.println(SW[i]);
	}
}