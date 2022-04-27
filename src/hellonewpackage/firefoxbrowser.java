package hellonewpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.gecko.driver","/home/global/Downloads/browserdriver/geckodriver-v0.30.0-linux64/geckodriver");
          
		  FirefoxDriver driver = new FirefoxDriver();
		  
          driver.get("https://google.com");

	}
}