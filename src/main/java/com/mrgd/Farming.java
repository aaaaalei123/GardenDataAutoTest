package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Farming {
	public void PageRun() throws Exception {
		WebDriver webDriver = OpenChrome.webDriver;
		Actions actions = new Actions(webDriver);
		// 农事活动
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul[2]/li[1]")).click();
	    Thread.sleep(1500);
	    // 搜索品种
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");
	    Thread.sleep(1500);
	    webDriver.findElement(By.cssSelector("div[data-v-1e9350d5][class='button']")).click();
	    Thread.sleep(1500);
	    
	    // 点击全国
	    webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div/div[2]/span[1]")).click();
	    Thread.sleep(1500);
	    //悬停数量气泡
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 650, 650).perform();
		Thread.sleep(1000);
	    //悬停江西省
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 650, 700).perform();
		Thread.sleep(1000);
	    //点击江西省
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 650, 700).click().perform();
		Thread.sleep(1000);
		
		// 果园施肥情况
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div[1]")), 35, 95).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1012, 287).perform();
		Thread.sleep(700);
		
		for (int i = 0; i < 2; i++) {
			actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1784, 171).click().perform();
			Thread.sleep(700);
			actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1854, 171).click().perform();
			Thread.sleep(700);
		}
		
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1434, 264).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1487, 264).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1535, 264).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1585, 264).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1635, 264).perform();
		Thread.sleep(700);
		
		
		// 果园每月采摘情况
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1036, 482).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1126, 540).perform();
		Thread.sleep(700);
		
		for (int i = 0; i < 2; i++) {
			actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1694, 444).click().perform();
			Thread.sleep(700);
			actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1750, 444).click().perform();
			Thread.sleep(700);
			actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1802, 444).click().perform();
			Thread.sleep(700);
			actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1855, 444).click().perform();
			Thread.sleep(700);
		}
		
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1556, 540).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1606, 540).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1656, 540).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1706, 540).perform();
		Thread.sleep(700);
	
		
		// 其他农事情况
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1091, 752).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1006, 810).perform();
		Thread.sleep(700);
		
		for (int i = 0; i < 2; i++) {
			actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1751, 719).click().perform();
			Thread.sleep(700);
			actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1809, 719).click().perform();
			Thread.sleep(700);
			actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1857, 719).click().perform();
			Thread.sleep(700);
		}
		
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1476, 811).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1533, 811).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1590, 811).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1648, 811).perform();
		Thread.sleep(700);
	
	}
	
}
