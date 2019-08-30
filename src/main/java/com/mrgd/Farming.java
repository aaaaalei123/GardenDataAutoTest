package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Farming {
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = OpenChrome.webDriver;
		// 农事活动
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul[2]/li[1]")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");
	    Thread.sleep(1500);
	    webDriver.findElement(By.cssSelector("div[data-v-1e9350d5][class='button']")).click();
	    Thread.sleep(1500);
	}

}
