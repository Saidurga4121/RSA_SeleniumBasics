package SeleniumConceptsComplete;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait 
{
	static WebDriver driver;
	
     public static void main(String[] args)
     {
    	//  WebDriverWait wait = new WebDriverWait(driver,30);
    	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
//    	 WebDriver driver= new ChromeDriver();
//    	
//    	 FluentWait wait = new FluentWait(driver);
//    	 
//    	 wait.withTimeout(5000, TimeUnit.MILLISECONDS);
//    	 
//    	 wait.pollingEvery(250, TimeUnit.MILLISECONDS);
//    	 
//    	 wait.ignoring(NoSuchElementException.class)
////    	 //
//    	 WebElement foo=wait.until(new Function<WebDriver, WebElement>() 
//    	 {
//    		 public WebElement applyy(WebDriver driver) {
//    		 return driver.findElement(By.id("foo"));
//    		 }
//    	 });
//     
     
     }
     
     // explicit wait can be achived in 2 ways
     // 1) webdriver wait  --gives the exception ---element not interactable exception
     // 2) fluent wait-------gives the exception----ElementNotVisibleException
     
     // webdriver wait :the WebDriver is directed to wait until a certain condition occurs 
                      // before proceeding with executing the code.
     
     // fluent wait finds the webelement repeatedly at regular interval of times until the timeout
     // or till the object gets found
     // Fluent Wait commands are most useful when interacting with web elements that can take longer durations to load. 
     // This is something that often occurs in Ajax applications
}
