package com.mrgd;
import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public static void main(String[] args) throws Exception {
		WebDriver webDriver = OpenChrome.webDriver;
		Login qwer = new Login();
		
		// 登录 
		Thread.sleep(1000);
		webDriver.findElement(By.cssSelector("input[data-v-4eb8dfbc][id='name'][type='text']")).sendKeys("admin");
//		Thread.sleep(1000);
//	    webDriver.findElement(By.cssSelector("i[data-v-4eb8dfbc][class='iconfont']")).click();
	    Thread.sleep(1000);
		webDriver.findElement(By.cssSelector("input[data-v-4eb8dfbc][id='password'][type='password']")).sendKeys("admin");
		Thread.sleep(1000);

		// 获取验证码保存到本地进行验证并提交输入
		// 获取图片
		String code = qwer.CodeClass();	
		// 提交验证码
		webDriver.findElement(By.cssSelector("input#verify")).sendKeys(code);
		Thread.sleep(1000);
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
	}
	
	private String CodeClass() {
		//截取验证码并识别
		CodeVode codeVode = new CodeVode();
		//截取整个屏幕，并将截图保存至文件夹
		codeVode.robotSnapshot("png", "D:\\JOBSoftware\\imageCode\\codeimg1.png");
		//对截图进行裁剪,x,y,width,height,源文件路径,图片裁剪后存放路径
		codeVode.cut(1058, 605, 85, 40, "D:\\JOBSoftware\\imageCode\\codeimg1.png", "D:\\JOBSoftware\\imageCode\\Codes\\codeimg1.png");
		
		//识别验证码图片
		File imageFile = new File("D:\\JOBSoftware\\imageCode\\Codes\\codeimg1.png");
		//调用 Tesseract
		ITesseract instance = new Tesseract();
		instance.setDatapath("D:\\JOBSoftware\\tess4j\\tessdata");

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
