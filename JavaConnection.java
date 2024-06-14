package homeassignment;

public class JavaConnection implements IDatabaseConnections{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate");
	}
	
	public void executeUpdateJC() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate");
	}
public static void main(String[] args) {
	JavaConnection jcObj=new JavaConnection();
	jcObj.connect();
	jcObj.executeUpdate();
	jcObj.disconnect();
	
	IDatabaseConnections objIntf=new JavaConnection();
	objIntf.connect();
	objIntf.executeUpdate();
	objIntf.disconnect();
	//JavaConnection method executeUpdateJC not exposed
}
}
