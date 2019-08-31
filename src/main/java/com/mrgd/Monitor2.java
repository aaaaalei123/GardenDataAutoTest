package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Monitor2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = OpenChrome.webDriver;
		Actions action=new Actions(webDriver);
		// 智慧源地
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul/li[2]")).click();
	    Thread.sleep(1500);
	    
    
	    /*// 悬停在果园列表
	    action.moveToElement(webDriver.findElement(By.cssSelector("div[class='orchardTitle'"))).perform();
	    Thread.sleep(1500);
	    // 赣州市龙岭聚果堂
	    webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div/div/div[1]/div[3]/div[1]/ul/div/div[1]/div/li[4]")).click();
	    Thread.sleep(3000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[3]/div[5]/div[1]")).click();
	    Thread.sleep(3000);
	    webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]")).click();
	    Thread.sleep(3000);
	    // 点击球机按钮
	    webDriver.findElement(By.cssSelector("div[data-v-2e87178a][title='向上旋转'][class='top']")).click();
	    Thread.sleep(5000);
	    webDriver.findElement(By.cssSelector("div[data-v-2e87178a][title='向下旋转'][class='bottom']")).click();
	    Thread.sleep(5000);
	    webDriver.findElement(By.cssSelector("div[data-v-2e87178a][title='向左旋转'][class='left']")).click();
	    Thread.sleep(5000);
	    webDriver.findElement(By.cssSelector("div[data-v-2e87178a][title='向右旋转'][class='right']")).click();
	    Thread.sleep(5000);
	    webDriver.findElement(By.cssSelector("div[data-v-2e87178a][title='放大'][class='zoom-in']")).click();
	    Thread.sleep(5000);
	    webDriver.findElement(By.cssSelector("div[data-v-2e87178a][title='缩小'][class='zoom-out']")).click();
	    Thread.sleep(5000);
	    webDriver.findElement(By.xpath("html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div[3]/div[1]")).click();
	    Thread.sleep(2000);*/
	  
	  
	}

}
