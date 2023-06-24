package seliniumproject2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
public class Login_Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput=driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("log-in"));
        System.out.print(loginButton);
        usernameInput.sendKeys("soumya");
        passwordInput.sendKeys("123456");
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);
        String at=   driver.getTitle();
        String et="Demo App";
        if(at.equals(et)) {
        	System.out.print("sucessfully log in");
        }
        else {
        	System.out.print("not sucessfull");
        }
		
	}

}
