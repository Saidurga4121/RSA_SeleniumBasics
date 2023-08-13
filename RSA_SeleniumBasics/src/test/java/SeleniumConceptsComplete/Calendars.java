package SeleniumConceptsComplete;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendars 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003KT8744\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver = new ChromeDriver();
        //
        driver.get("https://www.path2usa.com/travel-companions");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String str = formatter.format(date);
        System.out.println(str);
	}

}
