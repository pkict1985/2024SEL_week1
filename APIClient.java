package homeassignment;

public class APIClient {
	public void sendRequest(String endpoint) {
		// TODO Auto-generated method stub
     System.out.println(endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, String requestStatus) {
		// TODO Auto-generated method stub
		System.out.println(endpoint + " "+ requestBody+ " " + requestStatus);
	}
	
	public static void main(String[] args) {
		//Method overloading
		APIClient objAPIClient= new APIClient();
		objAPIClient.sendRequest("lead");
		objAPIClient.sendRequest("lead", "name: pk; id:5", "200");
		
	}
}

	


