package practicetest1;

import org.testng.annotations.Test;

public class Practice1test {
	@Test
	public void createcontacttest() {
		System.out.println("create contact");
	}
	@Test
	public void createorg() {
		System.out.println("createorg");
		String URL = System.getProperty("url","http://testenv.com");
		String BROWSER = System.getProperty("browser", "chrome");
		String USERNAME = System.getProperty("username","admin");
		String PASSWORD = System.getProperty("password","admin");
	
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}

	}


