package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	    public static WebDriver driver;  //global variable
	
	   public static WebDriver browserLaunch() {    //local variable
		   WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
		   return driver;
      }
	  
	   public static void maxBrowser() {
       driver.manage().window().maximize();
	}
	   
	   public static void loadUrl(String username) {
		   driver.get(username);
		   	}
	      public static void closeTheBrowser() {
	    	  driver.close();
		}
	      public static void passTxt(WebElement element,String txt) {
	    	  element.sendKeys(txt);
		}
	      public static void BtnClick(WebElement element) {
	    	  element.click();
		}
	public static String PageTitle() {
		String t=driver.getTitle();
		System.out.println(t);
		return t;
	}
	public static void pageUrl() {
		String y=driver.getCurrentUrl();
		System.out.println(y);
	}
	public static void dragAndDropThePage(WebElement from,WebElement to) {
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).perform();;
	}
	

}
