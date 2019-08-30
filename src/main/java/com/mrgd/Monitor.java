package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Monitor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = OpenChrome.webDriver;
		Actions action=new Actions(webDriver);         //创建鼠标属性方法
		Thread.sleep(2000);
		// 智慧源地
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul/li[2]")).click();
	    Thread.sleep(1500);
	    
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
	    // 点击文本框输入果园
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/input")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/input")).sendKeys("赣州市龙岭聚果堂");
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/div")).click();
	    Thread.sleep(1500);
	    
	    // 搜索果园
	    Login.setElementValue(webDriver.findElement(By.cssSelector("input[type='text'][placeholder='搜索果园'][class='bg-color']")), "赣县茅店九橙果园");
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/div")).click();
	    
	    
	    // 鼠标悬停在果园窗口
	    // 获取 moveToElement 方法 ，元素定位到想要移上去的元素上 
	    action.moveToElement(webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div[3]/div/span"))).perform();
	    Thread.sleep(2000);
	    action.moveToElement(webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div[3]/div/ul/div/div/div/li[5]"))).perform();
	    /*Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div[3]/div/ul/div/div/div/li[5]")).click();*/

	    // 鼠标悬停在设备窗口
	    action.moveToElement(webDriver.findElement(By.cssSelector("div[class='container']"))).perform();
	    Thread.sleep(2000);
	    action.moveToElement(webDriver.findElement(By.cssSelector("div[class='map-info-item map-info-Acamera'][deviceid='2'][type='camera']"))).perform();
	    
//	    webDriver.findElement(By.cssSelector("div[class='map-info-item map-info-Acamera'][deviceid='2'][type='camera']")).click();
	    
	    // 最 大/小 化 窗口并点击功能 
	    webDriver.findElement(By.cssSelector("div[data-v-1a4295d9][class='zoom iconfont']")).click();
	    Thread.sleep(3000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]")).click();
	    Thread.sleep(3000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]")).click();
	    Thread.sleep(2000);
	    webDriver.findElement(By.cssSelector("div[data-v-1a4295d9][class='zoom iconfont']")).click();
	    Thread.sleep(3000);
	    
	    // 点击AI摄像头设备窗口最大化
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div/ul/li[2]")).click();
	    Thread.sleep(4000);  // 等待摄像头加载完成
	    webDriver.findElement(By.xpath("html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div[3]/div[1]")).click();
	    Thread.sleep(3000);  // 最大化
	    webDriver.findElement(By.xpath("html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div[3]/div[1]")).click();
	    Thread.sleep(3000);  // 最小化
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div/ul/li[3]")).click();
	    Thread.sleep(1000);  // 点击枪机
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div/ul/li[4]")).click();
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
	    

	}

}
