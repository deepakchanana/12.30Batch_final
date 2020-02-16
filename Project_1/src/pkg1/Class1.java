package pkg1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1
{
  public static void main(String[] args) 
  {
	  System.out.println("changes");
	System.out.println("I have done the changes in this file");
	System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Desktop/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
    driver.manage().window().maximize();  // method chaining
   
    WebElement element=driver.findElement(By.cssSelector("input.inputtext.login_form_input_box"));
    element.sendKeys("lastnamedeepak");
  }
	
}
