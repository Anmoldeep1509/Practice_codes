//UDPClient - receives and displays messages sent from the server
import java.net.*;
class UDPClient
{
public static DatagramSocket mySocket;
public static byte myBuffer[]=new byte[2000];
public static void clientMethod() throws Exception
{
while(true)
{
DatagramPacket dataPacket=new
DatagramPacket(myBuffer,myBuffer.length);
mySocket.receive(dataPacket);
System.out.println("Message Recieved :");
System.out.println(new
String(dataPacket.getData(),0,dataPacket.getLength()));
}
}
public static void main(String args[]) throws Exception
{
System.out.println("You need to press CTRL+C in order to quit");
mySocket=new DatagramSocket(777);
clientMethod();
}
}