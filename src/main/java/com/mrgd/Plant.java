package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Plant {
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = OpenChrome.webDriver;
		// 种植分布
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul/li[3]")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");
	    Thread.sleep(1000);
	    webDriver.findElement(By.cssSelector("div[data-v-1e9350d5][class='button']")).click();
	    Thread.sleep(1500);
	}

}
