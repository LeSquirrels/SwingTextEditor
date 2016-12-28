package john.TextEditor.net.client;

public class Client 
{
	com.jmr.wrapper.client.Client client;
	public Client(String ip, int port, boolean connect)
	{
		client = new com.jmr.wrapper.client.Client(ip, port, port);
		client.setListener(new ClientListener());
		if(connect)
			client.connect();
	}
	public void send(Object o)
	{
		client.getServerConnection().sendTcp(o);
	}
	public void connect()
	{
		client.connect();
	}
	public void stop()
	{
		client.close();
	}
	public boolean isConnected()
	{
		return client.isConnected();
	}
}
