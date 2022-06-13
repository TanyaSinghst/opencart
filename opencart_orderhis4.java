package selenium;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class opencart_orderhis4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		FileInputStream f1 = new FileInputStream("D:\\opencart.xls");
		Workbook w = Workbook.getWorkbook(f1);
		Sheet s = w.getSheet(0);
		String email= s.getCell(2, 1).getContents();
		String pass= s.getCell(4, 1).getContents();
	
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a")).click();
		driver.findElement(By.linkText("iPhone")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();
		driver.findElement(By.name("quantity[878564]")).clear();
		driver.findElement(By.name("quantity[878564]")).sendKeys("2");
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Order History")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
}
}
