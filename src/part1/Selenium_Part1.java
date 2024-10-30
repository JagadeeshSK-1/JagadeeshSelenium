package part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Part1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
Thread.sleep(3000);
driver.manage().window().maximize();
driver.navigate().refresh();
//driver.navigate().forward();
//driver.navigate().back();
//driver.manage().window().maximize();

	}

}
