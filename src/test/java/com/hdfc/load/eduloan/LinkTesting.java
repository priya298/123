package com.hdfc.load.eduloan;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hdfc.load.eduloan.NewWeekEnd2.BasePage;

public class LinkTesting extends BasePage
{
	
  
  @BeforeMethod
  @Parameters("browser")
  public void vishnu(String browser) throws Exception
  {
	  browserLaunch(browser, getData("flipkartUrl"));
  }
  
  @Test
  public void linkTesting()
  {
	  driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("books");
  }
  

  @AfterMethod
  public void priya() 
  {
	  
  }

}
