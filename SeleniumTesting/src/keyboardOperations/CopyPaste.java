package keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		String Drive="F:\\Acclaration\\Workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Drive);
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement FirstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		FirstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		 Thread.sleep(3000);
		FirstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"c"));
		WebElement LasttName= driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		 LasttName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
//	   SeleniumUtility s1=new SeleniumUtility();
//		WebDriver driver=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
//		//identify first name input field
//		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
//		//type first name as admin and use ctrl+a
//		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));//type admin and select all
//		//in first name field use ctrl+c
//		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));//copy the content
//		//in last name field use ctrl+v
//		driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
//					.sendKeys(Keys.chord(Keys.CONTROL,"v"));//paste the first name in the last name field
	}

}
