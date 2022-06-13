package selenium;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class opencart_amt6 {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		FileInputStream f1 = new FileInputStream("D:\\opencart.xls");
		Workbook w = Workbook.getWorkbook(f1);
		Sheet s = w.getSheet(0);
		String email= s.getCell(2, 1).getContents();
		String pass= s.getCell(4, 1).getContents();
	
			driver.findElement(By.name("email")).sendKeys(email);
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("search")).sendKeys("Canon");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")).click();
		Select se=new Select(driver.findElement(By.xpath("//*[@id=\"input-option226\"]")));
		se.selectByValue("15");
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Continue Shopping")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	
}
}