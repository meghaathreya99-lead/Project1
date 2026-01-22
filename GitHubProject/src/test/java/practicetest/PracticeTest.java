package practicetest;

import org.testng.annotations.Test;

public class PracticeTest {
@Test
public void createcontacttest() {
	String URL = System.getProperty("url","http://uatenv.com");
	String BROWSER = System.getProperty("browser", "chrome");
	String USERNAME = System.getProperty("username","admin");
	String PASSWORD = System.getProperty("password","admin");
	System.out.println("createcontact");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	
}
@Test
public void createorg() {
	System.out.println("createorg");
}

}
