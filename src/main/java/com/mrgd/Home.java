package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	public static void main(String[] args) throws InterruptedException {
		WebDriver webDriver = OpenChrome.webDriver;
		Thread.sleep(1500);
		// 全国
		webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/span")).click();
		Thread.sleep(1500); 
	}

}
