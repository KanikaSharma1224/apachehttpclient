package apachehttpclient.get;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class GetRequestUsingHttpClient {
	public static void main(String[] args) {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet getRequest = new HttpGet("Http://www.youtube.com");
		try {
			CloseableHttpResponse response = client.execute(getRequest);
			if (response != null) {
				System.out.println(response.getStatusLine().getStatusCode());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
