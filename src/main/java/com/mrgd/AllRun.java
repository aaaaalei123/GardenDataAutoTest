package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllRun {
public static void main(String[] args) throws Exception {
		// 浏览器
	    Browser.main(args);
		WebDriver webDriver = OpenChrome.webDriver;
		
		Login login = new Login();
		Home home = new Home();
		Monitor monitor = new Monitor();
		Plant plant = new Plant();
		Farming farming = new Farming();
		Warehouse warehouse = new Warehouse();
		Origin origin = new Origin();
		
//		for(int gydp = 0;gydp <= 2; gydp++){
			// 登录
			login.PageRun();
			Thread.sleep(2000);
				
			// 首页
			home.PageRun();
			
			// 智慧源地
			monitor.PageRun();
			
			// 种植分布
			plant.PageRun();
			
			// 农事活动
			farming.PageRun();
 			
			// 产品仓储
			warehouse.PageRun();
			
			// 溯源数据
			origin.PageRun();
			Thread.sleep(1000);
			
			// 清空账号密码框
		    WebElement ele = webDriver.findElement(By.cssSelector("input[data-v-4eb8dfbc][id='name'][type='text']"));
		    ele.clear();
		    Thread.sleep(1000);
		    WebElement ele1 = webDriver.findElement(By.cssSelector("input[data-v-4eb8dfbc][id='password'][type='password']"));
		    ele1.clear();
		    Thread.sleep(1000);
//		}
  }
}
