package seliniumproject2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class HomepageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/home.html");
		
	//after clicking the amount
		
		
		WebElement Table= driver.findElement(By.id("transactionsTable"));
		WebElement Amount_header=Table.findElement(By.id("amount"));
		Amount_header.click();
		Thread.sleep(2000);
		//chracking amount is clicked or not if clicked true otherwise false
	     boolean isEnbled=	Amount_header.isEnabled();
	     System.out.println("the amount button is sucessfull is cliked"+" "+isEnbled);
	     
		
		List<WebElement> afterfilterprice=driver.findElements(By.cssSelector("#transactionsTable td:nth-child(5)"));
		List<Double>afterfilterPriceList=new ArrayList();
		for(WebElement q:afterfilterprice) {
			  String at =q.getText();
			 at= at.replace(",","");
			 at=at.replace(" ", "");
			 at=at.replace("USD", "");
			
			 
			 afterfilterPriceList.add(Double.valueOf(at));
		
		}

		List<Double> sortedlist=new ArrayList<>(afterfilterPriceList);
	
		 Collections.sort(sortedlist);
		 
		
		boolean shortcheacked=afterfilterPriceList.equals(sortedlist);
		//chaecking the two list equal or not
		

		if(shortcheacked) {
			System.out.print("The list is sorted");
		}
		
		else {
			System.out.print("the list is not sorted");
		}
		
		
		
       
  
		
	}
	
}