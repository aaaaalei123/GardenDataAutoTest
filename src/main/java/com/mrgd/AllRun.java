package com.mrgd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllRun {
public static void main(String[] args) throws Exception {
		// 浏览器
	    Browser.main(args);
		WebDriver webDriver = OpenChrome.webDriver;
	
//		for(int gydp = 0;gydp <= 2; gydp++){
			
			// 登录
			Login.main(args);
			Thread.sleep(2000);
				
			// 首页
			Home.main(args);
			
			// 智慧源地
/*			Monitor.main(args);
			
			// 种植分布
			Plant.main(args);
			
			// 农事活动
			Farming.main(args);
			
			// 产品仓储
			Warehouse.main(args);
			
			// 溯源数据
			Origin.main(args);
			Thread.sleep(1000);
			
			// 清空账号密码框
		    WebElement ele = webDriver.findElement(By.cssSelector("input[data-v-4eb8dfbc][id='name'][type='text']"));
		    ele.clear();
		    Thread.sleep(1000);
		    WebElement ele1 = webDriver.findElement(By.cssSelector("input[data-v-4eb8dfbc][id='password'][type='password']"));
		    ele1.clear();
		    Thread.sleep(1000);*/
//		}
		
  }
}
