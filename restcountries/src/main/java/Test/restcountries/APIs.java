package Test.restcountries;

import java.io.IOException;

import org.json.JSONObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class APIs 
{
	
    public static Object countryName;
    public static Object countryalpha2Code;

	public static void getName(String CapCity) {
		
			try {
				OkHttpClient client = new OkHttpClient();

				Request request = new Request.Builder()
						  .url("http://restcountries.eu/rest/v2/capital/"+CapCity+"")
						  .get()
						  .addHeader("cache-control", "no-cache")
						  .addHeader("Postman-Token", "01265e60-3193-4156-a9de-d7f1ebf459f0")
						  .build();

				Response response = client.newCall(request).execute();
				String strBody1 = response.body().string();
				String strBody2 = strBody1.substring(1).substring(0, strBody1.substring(1).length() - 1);
				
				JSONObject jsonBody = new JSONObject(strBody2); 
				countryName = jsonBody.get("name");
			
			} catch (IOException e) {
				System.err.println("Getting the country name has encountered an error");
				e.printStackTrace();
			}		
	}
	
	public static void getAlpha2Code(String CapCity) {
		
		try {
			OkHttpClient client = new OkHttpClient();

			Request request = new Request.Builder()
					  .url("http://restcountries.eu/rest/v2/capital/"+CapCity+"")
					  .get()
					  .addHeader("cache-control", "no-cache")
					  .addHeader("Postman-Token", "01265e60-3193-4156-a9de-d7f1ebf459f0")
					  .build();

			Response response = client.newCall(request).execute();
			String strBody1 = response.body().string();
			String strBody2 = strBody1.substring(1).substring(0, strBody1.substring(1).length() - 1);
			
			JSONObject jsonBody = new JSONObject(strBody2); 
			countryalpha2Code = jsonBody.get("alpha2Code");
		
		} catch (IOException e) {
			System.err.println("Getting the country code has encountered an error");
			e.printStackTrace();
		}		
}

}
