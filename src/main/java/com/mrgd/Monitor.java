package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Monitor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = OpenChrome.webDriver;
		Actions actions = new Actions(webDriver);         //创建鼠标属性方法
		Thread.sleep(2000);
		// 智慧源地
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul/li[2]")).click();
	    Thread.sleep(2000);
	    
        // 轮流点击FM监测数据
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[2]/ul/li[4]/span")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[2]/ul/li[3]/span")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[2]/ul/li[2]/span")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[2]/ul/li[1]/span")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[3]/div[2]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[2]/ul/li[5]/span")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[2]/ul/li[6]/span")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[2]/ul/li[7]/span")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[2]/ul/li[8]/span")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[3]/div[1]")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/ul/li[2]")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/ul/li[1]")).click();
	    Thread.sleep(1500);
	    
	     //设备数据悬停
	     webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/div[2]/div[2]/ul/li[1]/span")).click();
	     Thread.sleep(1500);
	     actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div/div[2]")), 50, 367).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div/div[2]")), 102, 367).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div/div[2]")), 172, 367).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div/div[2]")), 237, 367).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div/div[2]")), 302, 367).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div/div[2]")), 367, 367).perform();
	     Thread.sleep(1000);
	     actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[1]/div[2]/div/div[2]")), 432, 367).perform();
	     Thread.sleep(1000);
	    
	    // 点击文本框输入果园
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/input")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/input")).sendKeys("赣州市龙岭聚果堂");
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/div")).click();
	    Thread.sleep(1500);
	    
	    // 鼠标悬停区域设备按钮
	    actions.moveToElement(webDriver.findElement(By.cssSelector("div[class='container']"))).perform();
	    Thread.sleep(2000);
	    //点击查看区域设备的FM1
	    actions.moveToElement(webDriver.findElement(By.cssSelector("div[class='map-info-item map-info-fm1']"))).click().perform();
	    Thread.sleep(2000);
	    //点击选择果园下拉框
	    webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div/div/div[1]/div[3]/div[1]/span")).click();
	    Thread.sleep(2000);

	    // 全景设备操作
	    webDriver.findElement(By.cssSelector("div[data-v-1a4295d9][class='zoom iconfont']")).click();
	    Thread.sleep(3000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]")).click();
	    Thread.sleep(3000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]")).click();
	    Thread.sleep(2000);
	    webDriver.findElement(By.cssSelector("div[data-v-1a4295d9][class='zoom iconfont']")).click();
	    Thread.sleep(3000);
	    
	    // 枪机摄像头操作
	    actions.moveToElement(webDriver.findElement(By.cssSelector("div[class='container']"))).perform();
	    Thread.sleep(2000);
	    webDriver.findElement(By.cssSelector("div[class='map-info-item map-info-Acamera']")).click();
	    Thread.sleep(4000);  // 等待摄像头加载完成
	    webDriver.findElement(By.xpath("html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div[3]/div[1]")).click();
	    Thread.sleep(3000);  // 最大化
	    webDriver.findElement(By.xpath("html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div[3]/div[1]")).click();
	    Thread.sleep(3000);  // 最小化
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div/ul/li[3]")).click();
	    Thread.sleep(1000);  // 点击枪机
	    
	    // 球机操作
	    webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[2]/div/div/div[1]/div[3]/div[1]/span")).click();
	    Thread.sleep(1000); 
	    actions.moveToElement(webDriver.findElement(By.cssSelector("div[class='container']"))).perform();
	    Thread.sleep(2000);
	    webDriver.findElement(By.cssSelector("div[class='map-info-item map-info-Bcamera']")).click();
	    Thread.sleep(1000);  // 点击球机
	    webDriver.findElement(By.xpath("html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div[3]/div[1]")).click();
	    Thread.sleep(1500);  // 球机窗口 最大化
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
	    Thread.sleep(2000);
	   
	    
	    // 农事活动悬停点击
	    for (int i = 0; i < 2; i++) {
		    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 250, 20).click().perform();
		    Thread.sleep(1000);
		    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 290, 20).click().perform();
		    Thread.sleep(1000);
		    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 350, 20).click().perform();
		    Thread.sleep(1000);
		    actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 400, 20).click().perform();
		    Thread.sleep(1000);
	    }
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 55, 50).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 100, 50).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 150, 50).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 200, 50).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 250, 50).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 350, 50).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 400, 50).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]")), 430, 50).perform(); 
		Thread.sleep(700);
		
		//园区种植分布情况鼠标悬停
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div/div[1]")), 145, 60).perform();
		Thread.sleep(1500);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']/div[3]/div[3]/div[3]/div[2]/div[1]/div/div[1]")), 95, 41).perform();
		Thread.sleep(1500);
	}

}
