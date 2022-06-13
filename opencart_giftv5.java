package selenium;


import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;


public class opencart_giftv5 {

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
		driver.findElement(By.linkText("Gift Certificates")).click();
		driver.findElement(By.name("to_name")).sendKeys("shubhi");
		driver.findElement(By.name("to_email")).sendKeys("shubhi9@gmail.com");
		driver.findElement(By.name("voucher_theme_id")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[8]/div/input[2]")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Continue Shopping")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.name("enquiry")).sendKeys("This is to Change of Address/Phone number");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Wish List")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Edit your account information")).click();
		driver.findElement(By.name("telephone")).clear();
		driver.findElement(By.name("telephone")).sendKeys("6392200435");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
		driver.findElement(By.linkText("View your return requests")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.close();
}
}