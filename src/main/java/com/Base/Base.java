package com.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
public static WebDriver wb;
	
	public static  WebDriver commonclass(String s) {
		
		
		
		if(s.equalsIgnoreCase("chrome")) {
			
			wb = new ChromeDriver();			
			wb.manage().window().maximize();
			
		}else if (s.equalsIgnoreCase("edge")) {
			
			
			wb = new EdgeDriver();
			wb.manage().window().maximize();
			
		}else if (s.equalsIgnoreCase("firefox")) {
			
			
			wb = new FirefoxDriver();
			wb.manage().window().maximize();
			
			
		}
		

		return wb;
		
	}
	
	public static void geturl(String s) {
		
		wb.get(s);		
	}
	
	
	
	
	
	public static void screenshot(String s) throws IOException {
		
		
		TakesScreenshot ts = (TakesScreenshot)wb;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\Gopinath\\eclipse-workspace\\MavenProject\\"+s+".png");
		
		FileUtils.copyFile(screenshotAs, f);

	}
	
	
	public static  void dropdown(WebElement w,int i) {
		
		
		Select s = new Select(w);
		s.selectByIndex(i);
		

	}
	
	public static void scroll(int a,int b) {
		
		JavascriptExecutor jb = (JavascriptExecutor)wb;
		
		jb.executeScript("window.scrollBy("+a+","+b+")");
		
	}
	
	
	public static  void rightclick(WebElement f) {
		
		
		Actions a = new Actions(wb);
		
		a.contextClick(f);
		
		a.build().perform();
		
		
	}
	
	
	public static void alertmessage() {
		
		Alert alert = wb.switchTo().alert();
		
		alert.accept();

	}
	
	public static void click(WebElement w) {
		
		w.click();		

	}
	
	public static void wait(int a) {
		
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
				
	}
	
	
	public static void keyboard() throws AWTException {
				
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void windows_handling() {
		
		
		Set<String> windowHandles = wb.getWindowHandles();
		
		ArrayList<String> obj = new ArrayList<>(windowHandles);
		
		wb.switchTo().window(obj.get(1));

	}
	
	public static  void sendkeys(WebElement w,String s) {
		
		w.sendKeys(s);
		

	}
	
	
	

}
