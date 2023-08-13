package SeleniumConceptsComplete;

import java.awt.Window;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables 
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//
		JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//div[@class='tableFixHead']"));	
        // js.executeScript("arguments[0].scrollIntoView();", Element);
        // to scroll down in a window
        js.executeScript("window.scrollBy(0,500)");
        // to scroll inside a component or table
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        //
        
//        List<WebElement> list1=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
//        for(int i=0;i<list1.size();i++)
//        {
//        	System.out.println(list1.get(i).getText());
//        }
        
        List<WebElement> rows=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr"));
        
//        for(int j=1;j<=tr.size();j++)
//        {
//        	WebElement list=driver.findElement(By.xpath("//div[@class='tableFixHead']/table/tbody/tr["+j+"]/td[1]"));
//            System.out.println(list.getText());
//        }
        
        int sum = 0;
        for(int j=0;j<rows.size();j++)
        {
        	List<WebElement> list=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
            String text=list.get(j).getText();
            int value=Integer.parseInt(text);
            sum=sum+value;
         }
        System.out.println(sum);
        
        String text=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
        int expResult=Integer.parseInt(text);
        if(expResult==sum)
        {
        	System.out.println("iam equal");
        }
	}
}
