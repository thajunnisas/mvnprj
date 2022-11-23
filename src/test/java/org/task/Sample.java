package org.task;


import org.junit.Assert;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.test.LoginPojoClasses;
import org.testing.BaseClass;

//import junit.framework.Assert;

public class Sample extends BaseClass{
	
	@BeforeClass
		public static void preCondition() {
		browserLaunch();
		maxBrowser();
	}
	
	@Test
	public void tc1() {
		loadUrl("https://www.facebook.com/");
		String t=PageTitle();
		LoginPojoClasses l=new LoginPojoClasses();
		//Assert.assertTrue("check ur title of the tc1:",t.contains("Facebook"));
		Assert.assertEquals("check ur title", "Facebook-log in or sign up", "Facebook");
		passTxt(l.getTxtUser(), "java");
		//Assert.assertTrue(false);
		passTxt(l.getTxtPass(), "75847875843");
		
		
	}
	@Before
	public void startDate() {
		Date d=new Date();
		System.out.println(d);
	}
	
	
	@Test
	public void tc2() {
		loadUrl("https://www.facebook.com/");
		String t=PageTitle();
		LoginPojoClasses l=new LoginPojoClasses();
		Assert.assertTrue("check ur title of the tc2:",t.contains("facebook"));

		passTxt(l.getTxtUser(), "python");
		//Assert.assertTrue(false);
		passTxt(l.getTxtPass(), "8758464643");

	}
	
	
	@After
	public void endDate() {
		Date d=new Date();
		System.out.println(d);
	}
	
	@Before
	public void bef() {
		System.out.println("starting time......");
	}
	@AfterClass
		public static void postCondition() {
		System.out.println("***close the browser***");
	}
		
	@Ignore
	@Test
	public void tc5() {
			loadUrl("https://www.facebook.com/");
			String t=PageTitle();
			LoginPojoClasses l=new LoginPojoClasses();
			passTxt(l.getTxtUser(), "selenium");
			//Assert.assertTrue(true);
			passTxt(l.getTxtPass(), "8758464643");
	}
}
