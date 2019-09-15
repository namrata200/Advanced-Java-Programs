import java.net.*;
import java.io.*;
public class URLDemo
{
	public static void main(String args[]) throws MalformedURLException
	{
		URL hp=new URL("https://www.google.com");
		System.out.println("Port:="+hp.getPort());
		System.out.println("Protocol:="+hp.getProtocol());
		System.out.println("Host:="+hp.getHost());
		System.out.println("File:="+hp.getFile());
		System.out.println("all:="+hp.toExternalForm());
	}
	
}