package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Farming {
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = OpenChrome.webDriver;
		Actions actions = new Actions(webDriver);
		// 农事活动
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul[2]/li[1]")).click();
	    Thread.sleep(1500);
	    // 搜索品种
/*	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");
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
		Thread.sleep(1000);*/
		
		// 果园施肥情况
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div[1]")), 35, 95).perform();
		Thread.sleep(1000);

		
		
		
	}

}
