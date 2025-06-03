package org.base.classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
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

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClas {
	
	public static WebDriver driver;
	
	public static WebDriver lanChromeBro() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver browserLanuch(String bname) {
		if (bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if (bname.equalsIgnoreCase("firebox")) {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();	
		}
		else if (bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}
		return driver;	
	}
	
	public static void browserLaunch2(String bname) {
		switch(bname) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			break;
		default:
			System.out.println("Invalid Browser");
		}

	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void switchToUrl() {
		String windowHandle = driver.getWindowHandle();
		
	}
	
	public static void swithToNewUrl() {
//		String windowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String allPage : windowHandles) {
//			if(!windowHandle.equals(allPage)) {
			driver.switchTo().window(allPage);
//			}
		
		}
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		 driver.manage().window().maximize();
	}
	 
	public static void time(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	
	}
	
	public static void pageScreenshot(String a) throws IOException{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ADMIN\\eclipse-workspace\\org.mvn.base.three\\Screenshot\\"+a+".png");
		FileUtils.copyFile(screenshotAs, dest);
	}
	
//	public static <Workbook> String readExcel(String fileName,String sh,int r,int c) throws IOException {
//		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\org.mvn.base.three\\src\\test\\resources\\Excel\\"+fileName+".xlsx");
//		
//		FileInputStream fd=new FileInputStream(f);
//		Workbook wb=new XSSFWorkbook(fd);
//		Sheet sheet = wb.getSheet(sh);
//		Row row = sheet.getRow(r);
//		Cell cell = row.getCell(c);
//		int cellType = cell.getCellType();
//		String Value=null;
//		if(cellType==1) {
//			 	Value = cell.getStringCellValue();
//			
//		}else {
//			if(DateUtil.isCellDateFormatted(cell)) {
//				Date dValue = cell.getDateCellValue();
//				SimpleDateFormat sd=new SimpleDateFormat("dd-mm-yyyy");
//				Value = sd.format(dValue);
//			}else {
//				double nValue = cell.getNumericCellValue();
//				long ld=(long)nValue;
//				Value = String.valueOf(ld);
//			}
//		}
//		return Value;
//	
//	
//	}
	
	public static void screenshot(String FilePath) throws IOException {
		long Time = System.currentTimeMillis();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest=new File(FilePath+Time);
		FileUtils.copyFile(src, dest);
	}
	
	public static void jsTrue(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);	
	} 
	
	public static void jsFalse(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);

	}
	
	public static void jsSendkeys(String s,WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+s+"')", e);
	}
	
	public static void roEnter() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void roDown() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void roCtrlA() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public static void roBackSpace() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
	}
	public static void roPageDown() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}
	
	public static void roPageUp() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
	}
	
	public static void roTap() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	
	
	public static Alert alertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return alert;
	}
	public static Alert alertDis() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		return alert;
	}
	
	public static void moveToEle(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	
	public static void clickTar(WebElement e) {
		Actions a=new Actions(driver);
		a.click(e).perform();
	}
	 
	public static void selectByIndex(WebElement e,int a) {
		Select s=new Select(e);
		s.selectByIndex(a);
	}
	
	public static void deselectIndex(WebElement e,int a) {
		Select s=new Select(e);
		s.selectByIndex(a);	
	}
	
	public static void sendKeys(WebElement e,String value){
		e.sendKeys(value);
	}
	
	public static void click(WebElement e){
		e.click();
	}
	
	public static String urlCur() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;	
	}
	
	public static String title() {
		String title = driver.getTitle();
		return title;	
	}
	
	public static String text(WebElement e) {
		String text = e.getText();
		return text;
	}
	
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;	
	}
	public static String getText(WebElement e) {
		String attribute = e.getAttribute("innerText");
		return attribute;
		
	}	
	
	public static void jsClick(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}
	
	public static void clearE(WebElement e) {
		e.clear();
	}
	
	public static void doubleClick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e);
		
	}
	
	public static void quit() {
		driver.quit();
	}
	
	
	
}