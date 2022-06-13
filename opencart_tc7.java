package selenium;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class opencart_tc7 {

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
		driver.findElement(By.linkText("Phones & PDAs")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("jack");
		driver.findElement(By.name("lastname")).sendKeys("reacher");
		driver.findElement(By.name("company")).sendKeys("Samsung");
		driver.findElement(By.name("address_1")).sendKeys("3,main cross road");
		driver.findElement(By.name("address_2")).sendKeys("utha state");
		driver.findElement(By.name("city")).sendKeys("utha");
		driver.findElement(By.name("postcode")).sendKeys("945342");
		driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
