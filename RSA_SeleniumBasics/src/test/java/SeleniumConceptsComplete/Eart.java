package SeleniumConceptsComplete;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Eart 
{
	static WebDriver driver;
	static List<WebElement> name;
	static List<WebElement> productName;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//
		addItems();	
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		WebElement cartItems=driver.findElement(By.xpath("(//ul[@class='cart-items'])[1]"));
		List<WebElement> allOptions = cartItems.findElements(By.tagName("li"));
		//
		for (int i = 1; i <=allOptions.size(); i++) {
			name=driver.findElements(By.xpath("//p[@class='product-name']"));
			System.out.println(name.get(i).getText());
//			WebElement price=driver.findElement(By.xpath("(//p[@class='product-price'])["+i+"]"));
//		    System.out.println(price.getText());
		}
		System.out.println(name.get(0)+" iam the name");
		System.out.println("*****************************************");
		//
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//
		Thread.sleep(5000);
		List<WebElement> productCartTables= driver.findElements(By.xpath("//table[@id='productCartTables']/tbody/tr"));
		for(int i=0;i<productCartTables.size();i++)
		{
			productName=driver.findElements(By.xpath("//table[@id='productCartTables']/tbody/tr/td/p[@class='product-name']"));
			System.out.println(productName.get(i).getText());
			//
			if(name.get(i).getText().equals(productCartTables.get(i).getText()))
			{
				System.out.println(name);
				System.out.println(productCartTables);
			}
			else
			{
				System.out.println("iam sorry");
			}
		}
		
		
	}
	
	
	
	
	public static void addItems() throws InterruptedException
	{
		String expResult[]= {"Brocolli","Mushroom","Pumpkin","Water Melon"};
		//
		List<WebElement> list=driver.findElements(By.xpath("//h4[@class='product-name']"));
		//
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			String result=text.split("-")[0].trim();
			// converting array to arraylist 
			List arraylist=Arrays.asList(expResult);
			// list.contains("sai");
			if(arraylist.contains(result))
			{
				Thread.sleep(5000);
      			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}	
		}
		
//		for(int i=0;i<list.size();i++)
//		{
//			String text=list.get(i).getText();
//			// trim is used to remove unneccesary white spaces.
//			String splitValue=text.split("-")[0].trim();
//			for(int j=0;j<=3;j++)
//			{
//				if(splitValue.equals(expResult[j]))
//				{
//					Thread.sleep(5000);
//					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				}
//			}
//		}
	}
}
