package hellonewpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class newdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver","/home/global/Downloads/browserdriver/chromedriver_linux64/chromedriver");
          
		  ChromeDriver driver = new ChromeDriver();
		  
          driver.get("https://google.com");

	}

}
