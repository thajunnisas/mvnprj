package org.testing;
import org.test.*;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {

	public static void main(String[] args) throws IOException{

		browserLaunch();
		maxBrowser();
		loadUrl("https://www.facebook.com/");
		
		LoginPojoClasses l=new LoginPojoClasses();
		
		WebElement username= driver.findElement(By.id("email"));
		passTxt(username,"greens123@gmail.com");
		
		WebElement pass=driver.findElement(By.name("pass"));
		passTxt(pass,"787897874");
		
		driver.navigate().refresh();//my dom also refresh
		passTxt(l.getTxtUser(), "selenium");
		passTxt(l.getTxtPass(), "4656898799");
		//BtnClick(l.getBtnLogin());
		
		driver.navigate().refresh();//my dom also refresh
		passTxt(l.getTxtUser(), "framework");
		passTxt(l.getTxtPass(), "56869896799");
		BtnClick(l.getFindbysbtnLogin());
		
		WebElement btnlogin=driver.findElement(By.name("login"));
		BtnClick(btnlogin);
		
		PageTitle();
		//System.out.println(u);
		pageUrl();
		loadUrl("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source=driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement de    =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		dragAndDropThePage(source,de);
		
		
		
		
		
	

		
	}	
}

