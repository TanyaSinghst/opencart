package selenium;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class opencart_tc3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
		driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[2]/a/img")).click();	
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();	
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();

		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input-postcode\"]")).sendKeys("632253");
		driver.findElement(By.xpath("//*[@id=\"button-quote\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input-coupon\"]")).sendKeys("OPENCART40");
		driver.findElement(By.xpath("//*[@id=\"button-coupon\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("tanya");
		driver.findElement(By.name("lastname")).sendKeys("singh");
		driver.findElement(By.name("company")).sendKeys("Samsung");
		driver.findElement(By.name("address_1")).sendKeys("538/137, triveni");
		driver.findElement(By.name("address_2")).sendKeys("sitapur road");
		driver.findElement(By.name("city")).sendKeys("lko");
		driver.findElement(By.name("postcode")).sendKeys("226020");
		driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
