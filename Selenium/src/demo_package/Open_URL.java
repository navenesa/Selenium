package demo_package;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Open_URL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12179\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Application Launched");
	}

}
