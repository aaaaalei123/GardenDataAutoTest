package com.mrgd;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import javax.persistence.Access;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import org.eclipse.jetty.websocket.WebSocketFactory.Acceptor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mrgd {
	public static void main(String[] args) throws InterruptedException {
// 打开浏览器  已封装
		Thread.sleep(3000);   //等待3秒
		//System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","E:/JAVA/chromedriver.exe");   // 谷歌:后边路径修改为谷歌驱动路径
		//WebDriver webDriver = new FirefoxDriver();    火狐
		WebDriver webDriver = new ChromeDriver();
		Actions actions = new Actions(webDriver);
		mrgd qwer = new mrgd();
		webDriver.manage().window().maximize();  //浏览器最大化
		webDriver.manage().deleteAllCookies();   //删除所有缓存
	    Actions action=new Actions(webDriver);         //创建鼠标属性方法
		
		//与浏览器同步非常重要，必须等待浏览器加载完成
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//打开目标地址
		webDriver.get("http://testorchdbs.yufengtek.com/#/login");
		
// 登录 已封装
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/label/input")).sendKeys("admin");
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/label/input")).sendKeys("admin");
		Thread.sleep(2000);
	
		// 获取验证码保存到本地进行验证并提交输入
		// 获取图片
					String code = qwer.CodeClass();	
					// 提交验证码
					webDriver.findElement(By.cssSelector("input#verify")).sendKeys(code);
					webDriver.findElement(By.cssSelector("div[class='submit']")).click();
					Thread.sleep(1000);
					//判断验证码是否正确
					while (true) {
						if (qwer.isContentAppeared(webDriver, "canvas[data-zr-dom-id='zr_0']")) {
							System.out.println("Yes");
							break;
						}else{
							System.out.println("No");
							qwer.setElementValue(webDriver.findElement(By.cssSelector("input#verify")), "");
							String code1 = qwer.CodeClass();	
							webDriver.findElement(By.cssSelector("input#verify")).sendKeys(code1);
							webDriver.findElement(By.cssSelector("div[class='submit']")).click();
						}
					}	
		
// 智慧源地  已封装
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul/li[2]")).click();
	    Thread.sleep(1500);
	    /*
        //轮流点击FM监测数据
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
	    //点击文本框输入果园
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/input")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/input")).sendKeys("赣州市龙岭聚果堂");
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/div")).click();
	    Thread.sleep(1500);
	    
	    // 搜索果园
	    mrgd.setElementValue(webDriver.findElement(By.cssSelector("input[type='text'][placeholder='搜索果园'][class='bg-color']")), "赣县茅店九橙果园");
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/div")).click();
	    */
	    
	    //鼠标悬停在果园窗口
	    // 获取 moveToElement 方法 ，元素定位到想要移上去的元素上 
	    /*
	     * action.moveToElement(webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div[3]/div/span"))).perform();
	    Thread.sleep(2000);
	    action.moveToElement(webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div[3]/div/ul/div/div/div/li[5]"))).perform();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div[3]/div/ul/div/div/div/li[5]")).click();

	    //鼠标悬停在设备窗口
	    action.moveToElement(webDriver.findElement(By.cssSelector("div[class='container']"))).perform();
	    Thread.sleep(2000);
	    action.moveToElement(webDriver.findElement(By.cssSelector("div[class='map-info-item map-info-Acamera'][deviceid='2'][type='camera']"))).perform();
	    webDriver.findElement(By.cssSelector("div[class='map-info-item map-info-Acamera'][deviceid='2'][type='camera']")).click();
	    */
	    
	    
/**	    
 *      //通过xpath获取到滚动条所在元素位置
	    WebElement A = webDriver.findElement(By.xpath(""));
	    
	    //循环点击键盘下键，直到元素可见
	    while(true){
	     actions.sendKeys(A,Keys.DOWN).perform();
	      A：滚动条所在元素位置
	      * Keys.DOWN：点击键盘下键
	      * perform()：确定键盘操作事件，不能省略
	     
	     // 使用try…catch…来判断元素是否可见，可见就进行元素操作并退出循环
	     try {
	      webDriver.findElement(By.xpath(""));
	      break;
	     } catch (Exception e) {
	     }
	    }
**/
	    
	    /*//最 大/小 化 窗口并点击功能 
	    webDriver.findElement(By.cssSelector("div[data-v-1a4295d9][class='zoom iconfont']")).click();
	    Thread.sleep(3000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]")).click();
	    Thread.sleep(3000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]")).click();
	    Thread.sleep(2000);
	    webDriver.findElement(By.cssSelector("div[data-v-1a4295d9][class='zoom iconfont']")).click();
	    Thread.sleep(3000);
	    
	    //点击设备窗口最大化
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div/ul/li[2]")).click();
	    Thread.sleep(4000);
	    webDriver.findElement(By.xpath("html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div[3]/div[1]")).click();
	    Thread.sleep(3000);
	    webDriver.findElement(By.xpath("html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div[3]/div[1]")).click();
	    Thread.sleep(2000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div/ul/li[3]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div[3]/div/div[2]/div/div/ul/li[4]")).click();
	    webDriver.findElement(By.xpath("html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div[3]/div[1]")).click();
	    
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
	    webDriver.findElement(By.cssSelector("div[data-v-2e87178a][title='向右旋转'][class='right']")).click();
	    Thread.sleep(5000);
	    webDriver.findElement(By.cssSelector("div[data-v-2e87178a][title='向右旋转'][class='right']")).click();
	    Thread.sleep(5000);
	    webDriver.findElement(By.xpath("html/body/div/div[3]/div[3]/div/div[2]/div/div[3]/div[3]/div[1]")).click();
	    Thread.sleep(2000);
		*/
	    // 种植分布
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul/li[3]")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");
	    Thread.sleep(1000);
	    webDriver.findElement(By.cssSelector("div[data-v-1e9350d5][class='button']")).click();
	    Thread.sleep(1500);
	    
	    // 农事活动
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul[2]/li[1]")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");
	    Thread.sleep(1500);
	    webDriver.findElement(By.cssSelector("div[data-v-1e9350d5][class='button']")).click();
	    Thread.sleep(1500);
	    
	    // 产品仓储
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul[2]/li[2]")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");
	    Thread.sleep(1500);
	    webDriver.findElement(By.cssSelector("div[data-v-1e9350d5][class='button']")).click();
	    Thread.sleep(1500);
					
	    // 溯源数据
	    webDriver.findElement(By.xpath("/html/body/div/div[2]/ul[2]/li[3]")).click();
	    Thread.sleep(1500);
	    webDriver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/input")).sendKeys("脐橙");;
	    Thread.sleep(1500);
	    webDriver.findElement(By.cssSelector("div[data-v-1e9350d5][class='button']")).click();
	    
	    
	    
	 // 滚动条
	    /*action.sendKeys(Keys.END).perform();//下拉到底部    
	    action.sendKeys(Keys.HOME).perform();//上拉到顶部    
	    action.sendKeys(Keys.PAGE_DOWN).perform();//向下滚动    
	    action.sendKeys(Keys.PAGE_UP).perform();//向上滚动
        */
	    
	}
//已封装
	private String CodeClass() {
		//截取验证码并识别
		CodeVode codeVode = new CodeVode();
		//截取整个屏幕，并将截图保存至文件夹
		codeVode.robotSnapshot("png", "D:\\JOBSoftware\\imageCode\\codeimg1.png");
		//对截图进行裁剪,x,y,width,height,源文件路径,图片裁剪后存放路径
		codeVode.cut(1058, 605, 85, 40, "D:\\JOBSoftware\\imageCode\\codeimg1.png", "D:\\JOBSoftware\\imageCode\\Codes\\codeimg1.png");
		
		//识别验证码图片
		File imageFile = new File("D:\\JOBSoftware\\imageCode\\Codes\\codeimg1.png");
		//调用Tesseract
		ITesseract instance = new Tesseract();
		instance.setDatapath("D:\\tess4j\\tessdata");

		String verifycode = null;
		try {
			verifycode = instance.doOCR(imageFile);
		} catch (TesseractException e1) {
		e1.printStackTrace();
		}
		verifycode = verifycode.replaceAll("[^a-z^A-Z^0-9]", "");//替换大小写及数字
		System.out.println("Verify code is :" + verifycode);
		return verifycode;
	}
	
	public boolean isContentAppeared(WebDriver driver,String content) {
		boolean status = false;
		try {
			driver.findElement(By.cssSelector(content));
			System.out.println(content + " is appeard!");
			status = true;
		} catch (NoSuchElementException e) {
			status = false;
			System.out.println("'" + content + "' doesn't exist!");
		}
		return status;
		
	}
	
	//清空文本框
		public static void setElementValue(WebElement element,String value){
			  element.sendKeys(Keys.chord(Keys.CONTROL, "a"), value);//method1
			 }
	
	
	
	
	
	

}
