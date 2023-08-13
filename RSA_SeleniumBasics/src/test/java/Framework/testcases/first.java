package Framework.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first 
{
	@Test
	public void getProductList() throws InterruptedException
	{
		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//
		driver.get("https://rahulshettyacademy.com/client");
		Thread.sleep(5000);
		driver.findElement(By.id("userEmail")).sendKeys("saidurgareddy4121@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Kartheek@01");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		//
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='products']/div[1]/div[2]/div/div/div/h5/b"));
		
		//
		String cartItems[]= {"ADIDAS ORIGINAL","IPHONE 13 PRO"};
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			System.out.println(text);
			for(int j=0;j<cartItems.length;j++)
			{
				if(text.equalsIgnoreCase(cartItems[j]))
				{
					Thread.sleep(5000);
					driver.findElements(By.xpath("//*[@id='products']/div/div/div/div/div/button[2]")).get(i).click();
					Thread.sleep(5000);
					break;
				}
			}
		}
		driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
		//
		List<WebElement> cartList=driver.findElements(By.xpath("//div[@class='cart']/ul/li/div/div/h3"));
		for(int i=0;i<cartList.size();i++)
		{
			if(cartList.get(i).getText().equalsIgnoreCase(cartItems[i]))
			{
				System.out.println(cartList.get(i).getText() + " is matching");
				//break;
			}
		}
		//
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]")).click();
	}

}
