package week3.day2;

public class MySqlConnection extends JavaConnection {
	
	
	
	public void executeQuery()
	{
		
	}
	@Override
	public void connect() {
		
		System.out.println("connected");
	}
	@Override
	public void disconnect() {
		System.out.println("disconnected");
	}
	
	
	@Override
	public void executeUpdate() {
		System.out.println("executeupdated");
	}


	public static void main(String[] args) {
		
		
		MySqlConnection s1=new MySqlConnection();
		s1.connect();
		s1.disconnect();
		s1.executeQuery();
	}

}
