package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Home {
	public static void main(String[] args) throws InterruptedException {
		WebDriver webdriver = OpenChrome.webDriver;
		Actions actions = new Actions(webdriver);
		
		Thread.sleep(1500);
		//溯源排行悬停
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[1]/div[2]/div[1]/div/div")), 200, 110).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[1]/div[2]/div[1]/div/div")), 220, 60).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[1]/div[2]/div[1]/div/div")), 350, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[1]/div[2]/div[1]/div/div")), 320, 100).perform();
		
		//库存比较悬停
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[1]")), 350, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[1]")), 330, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[1]")), 310, 60).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div[2]/div[1]/div/div[1]")), 290, 70).perform();
		
		//施肥用量统计悬停点击
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 300, 20).perform();
		
		for (int i = 0; i < 2; i++) {
			Thread.sleep(1000);
			actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 300, 20).click().perform();
			Thread.sleep(1000);
			actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 330, 20).click().perform();
			Thread.sleep(1000);
			actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 390, 20).click().perform();
		}
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 50, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 100, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 150, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 200, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 250, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 350, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 400, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]")), 430, 50).perform(); 
		
		//品种采摘量排行悬停
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div/div[1]")), 400, 60).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div/div[1]")), 300, 60).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div/div[1]")), 300, 100).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div/div[1]")), 300, 130).perform();
		
		//植作物出入库总量悬停
		for (int i = 0; i < 2; i++) {
			Thread.sleep(1000);
			actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 345, 20).perform();
			Thread.sleep(1000);
			actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 345, 20).click().perform();
			Thread.sleep(1000);
			actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 430, 20).perform();
			Thread.sleep(1000);
			actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 430, 20).click().perform();
		}
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 55, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 100, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 150, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 200, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 250, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 350, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 400, 50).perform();
		Thread.sleep(1000);
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div[1]")), 430, 50).perform(); 

		Thread.sleep(2000);
		// 全国
		webdriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		// 气泡悬停
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']")), 1090, 500).perform();
		Thread.sleep(2000);
		// 点击江西省
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']")), 1090, 600).click().perform();
		Thread.sleep(2000);
		// 点击赣州市
		actions.moveToElement(webdriver.findElement(By.xpath("//*[@id='app']")), 900, 550).click().perform();
		Thread.sleep(2000);
	 
	}

}
