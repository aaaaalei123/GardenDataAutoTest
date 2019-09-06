package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Origin {
	public void PageRun() throws Exception {
		WebDriver webDriver = OpenChrome.webDriver;
		Actions actions=new Actions(webDriver);         //创建鼠标属性方法
		
		// 溯源数据
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul[2]/li[3]")).click();
	    Thread.sleep(2000);
	    
	    // 北京
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 654, 370).perform();
	    Thread.sleep(1500);
	    // 赣州
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 633, 599).perform();
	    Thread.sleep(1500);
	    // 上海
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 723, 514).perform();
	    Thread.sleep(1500);
	    
	    // 作物主要溯源排行悬停
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1273, 266).perform();
	    Thread.sleep(1000);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1166, 285).perform();
	    Thread.sleep(1000);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1203, 206).perform();
	    Thread.sleep(1000);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1309, 192).perform();
	    Thread.sleep(1000);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1368, 225).perform();
	    Thread.sleep(1000);
	    
	    // 溯源次数统计
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1536, 280).perform();
	    Thread.sleep(1000);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1636, 280).perform();
	    Thread.sleep(1000);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1686, 280).perform();
	    Thread.sleep(1000);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1736, 280).perform();
	    Thread.sleep(1000);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1786, 280).perform();
	    Thread.sleep(1000);
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1836, 280).perform();
	    Thread.sleep(1000);
	    
	    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[3]/div[3]"))).perform();
	    Thread.sleep(1000);
	    
	    //移动到元素element对象的“顶端”与当前窗口的“顶部”对齐
	    ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[3]/div[3]/div[2]/div[1]/div/div[1]/div/ul/li[2]/ul/li[4]")));
	    Thread.sleep(500);
	    ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[3]/div[3]/div[2]/div[1]/div/div[1]/div/ul/li[4]/ul/li[1]")));
	    Thread.sleep(500);
	    ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div[3]/div[3]/div[2]/div[1]/div/div[1]/div/ul/li[4]/ul/li[7]")));
	    Thread.sleep(500);
	    
	    // 搜索
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");;
	    Thread.sleep(1500);
	    webDriver.findElement(By.cssSelector("div[data-v-1e9350d5][class='button']")).click();
	    Thread.sleep(2000);
	    
	    // 退出大屏
	    webDriver.findElement(By.cssSelector("div[data-v-28ef562f][class='logout']")).click();
	    Thread.sleep(2000);
	    
		
		// 刷新页面
	    webDriver.navigate().refresh();
	    Thread.sleep(1500);
	    
	    
	}
	
	

}
