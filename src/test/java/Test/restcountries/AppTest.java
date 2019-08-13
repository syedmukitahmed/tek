package Test.restcountries;

import org.testng.annotations.Test;

public class AppTest 
{
	
	@Test (priority = 1)
	public void getCountryOfDhaka() {
		
		String cityToCheck = "dhaka";
		APIs.getName(cityToCheck);
		System.out.println(cityToCheck+" belongs to "+APIs.countryName);
	}
	
	@Test (priority = 2)
	public void getCodeOfBangladesh() {
		
		String cityToCheck = "dhaka";
		
		APIs.getAlpha2Code(cityToCheck);
		System.out.println("alpha2Code of "+APIs.countryName+" is "+APIs.countryalpha2Code);
	}
	
	
	@Test (priority = 3)
	public void getCountryOfLondon() {
		
		String cityToCheck = "london";
		APIs.getName(cityToCheck);
		System.out.println(cityToCheck+" belongs to "+APIs.countryName);
	}
	
	
	@Test (priority = 4)
	public void getCodeOfUK() {
		
		String cityToCheck = "London";
		
		APIs.getAlpha2Code(cityToCheck);
		System.out.println("alpha2Code of "+APIs.countryName+" is "+APIs.countryalpha2Code);
	}
	
	
	@Test (priority = 5)
	public void testNgtvTC() {
		
		String cityToCheck = "Lopdop";
		
		APIs.getAlpha2Code(cityToCheck);
		System.out.println("alpha2Code of "+APIs.countryName+" is "+APIs.countryalpha2Code);
	}
	
	
}
