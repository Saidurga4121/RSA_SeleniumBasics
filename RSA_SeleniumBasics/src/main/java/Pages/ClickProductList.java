package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickProductList 
{
	@FindBy(xpath="//*[@id='products']/div[1]/div[2]/div/div/div/h5/b")
	List<WebElement> productList;
	
	public void getList()
	{
		for(int i=0;i<productList.size();i++)
		{
			String text=productList.get(i).getText();
			System.out.println(text);
		}
	}
	
	

}
