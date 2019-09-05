package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Plant {
	public void PageRun() throws Exception {
		WebDriver webDriver = OpenChrome.webDriver;
		Actions actions = new Actions(webDriver);
		
		// 种植分布
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul/li[3]")).click();
	    Thread.sleep(1500);
	    // 搜索品种
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");
	    Thread.sleep(1000);
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
	    
		// 农作物树龄分布
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]")), 100, 33).perform();
		Thread.sleep(1000);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]")), 100, 54).perform();
		Thread.sleep(1000);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]")), 100, 116).perform();
		Thread.sleep(1000);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]")), 100, 146).perform();
		Thread.sleep(1000);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]")), 100, 160).perform();
		Thread.sleep(1000);
		
		// 品种面积分布
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[1]")), 65, 60).perform();
		Thread.sleep(1000);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[1]")), 50, 75).perform();
		Thread.sleep(1000);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[1]")), 130, 40).perform();
		Thread.sleep(1000);
		
		// 种植面积情况
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]")), 100, 33).perform();
		Thread.sleep(1000);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]")), 100, 64).perform();
		Thread.sleep(1000);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]")), 100, 116).perform();
		Thread.sleep(1000);
		
		// 产品品质分布
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div/div[1]")), 50, 80).perform();
		Thread.sleep(1000);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div/div[1]")), 160, 80).perform();
		Thread.sleep(1000);
	}

}
