package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Warehouse {
	public void PageRun() throws Exception {
		WebDriver webDriver = OpenChrome.webDriver;
		Actions actions=new Actions(webDriver);         //创建鼠标属性方法
		
		// 产品仓储
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul[2]/li[2]")).click();
	    Thread.sleep(1500);
	    
	    // 搜索
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");
	    Thread.sleep(1500);
	    webDriver.findElement(By.cssSelector("div[data-v-1e9350d5][class='button']")).click();
	    Thread.sleep(1500);
	  
	    // 作物分布情况点击 
	    // 气泡悬停
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 374, 667).click().perform();
	    Thread.sleep(2000);
	    // 吉安
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 364, 537).click().perform();
	    Thread.sleep(2000);
	    // 南昌
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 483, 328).click().perform();
	    Thread.sleep(2000);
	    // 上饶
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 666, 340).click().perform();
	    Thread.sleep(2000);
	    // 赣州
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 409, 740).click().perform();
	    Thread.sleep(1500);
	    
	    // 今年入库 悬停
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1007, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1055, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1105, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1155, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1205, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1255, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1305, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1355, 557).perform();
	    Thread.sleep(500);
	    
	    // 今年出库 悬停
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1530, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1580, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1630, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1680, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1730, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1780, 557).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1830, 557).perform();
	    Thread.sleep(500);
	    
	    // 种植作物历史入库对比悬停
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1010, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1060, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1110, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1160, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1210, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1260, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1310, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1360, 835).perform();
	    Thread.sleep(500);
	    
	    // 种植作物历史出库对比悬停
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1482, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1532, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1582, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1632, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1682, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1732, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1782, 835).perform();
	    Thread.sleep(500);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1832, 835).perform();
	    Thread.sleep(700);
	    
	    for(int zwck=0;zwck<2;zwck++){
		    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[5]/div[2]/div[1]/div[1]")), 345, 20).perform();
		    Thread.sleep(700);
		    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[5]/div[2]/div[1]/div[1]")), 345, 20).click().perform();
		    Thread.sleep(700);
		    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[5]/div[2]/div[1]/div[1]")), 430, 20).perform();
		    Thread.sleep(700);
		    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[5]/div[2]/div[1]/div[1]")), 430, 20).click().perform();
		    Thread.sleep(700);
	    }
	}
	
}
