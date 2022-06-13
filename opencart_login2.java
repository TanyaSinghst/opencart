package selenium;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class opencart_login2 {

	public static void main(String[] args) throws Exception {

	
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
		Thread.sleep(2000);
		WebElement m=driver.findElement(By.name("search"));
		m.sendKeys("tablets");
		m.sendKeys(Keys.RETURN);
		Select se=new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/select")));
		se.selectByValue("28");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
		driver.findElement(By.linkText("Phones & PDAs")).click();
		Select sort=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		sort.selectByValue("http://localhost/shop/index.php?route=product/category&path=24&sort=p.price&order=DESC");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Product Compare (0)")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody[1]/tr[1]/td[2]/a/strong")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Order History")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div/div/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
		driver.findElement(By.linkText("Specials")).click();
		driver.findElement(By.xpath("//*[@id=\"list-view\"]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Logout")).click();		

		Thread.sleep(4000);

		driver.close();

		
	}

}
