package com.mrgd;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Origin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = OpenChrome.webDriver;
		Actions action=new Actions(webDriver);         //创建鼠标属性方法
		// 溯源数据
	    /*webDriver.findElement(By.xpath("/html/body/div/div[2]/ul[2]/li[3]")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");;
	    Thread.sleep(1500);
	    webDriver.findElement(By.cssSelector("div[data-v-1e9350d5][class='button']")).click();
	    Thread.sleep(2000);*/
	    
	    // 退出大屏
	    webDriver.findElement(By.cssSelector("div[data-v-28ef562f][class='logout']")).click();
	    Thread.sleep(2000);
		/*
		 * // 刷新页面
	    webDriver.navigate().refresh();
	    Thread.sleep(1500);
	    */
	}
    

}
