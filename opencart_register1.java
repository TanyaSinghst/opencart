package selenium;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class opencart_register1 {
@Test
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");

		//registering account on opencart
				driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")).click();
				driver.findElement(By.linkText("Register")).click();
				Thread.sleep(4000);
			FileInputStream f1 = new FileInputStream("D:\\opencart.xls");
			Workbook w = Workbook.getWorkbook(f1);
			Sheet s = w.getSheet(0);
		String firstname=s.getCell(0, 1).getContents();
		String lastname= s.getCell(1, 1).getContents();
		String email= s.getCell(2, 1).getContents();
		String tele= s.getCell(3, 1).getContents();
		String pass= s.getCell(4, 1).getContents();
		String cpass= s.getCell(5, 1).getContents();
		
			driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys(firstname);
				driver.findElement(By.name("lastname")).sendKeys(lastname);
				driver.findElement(By.name("email")).sendKeys(email);
				driver.findElement(By.name("telephone")).sendKeys(tele);
				driver.findElement(By.name("password")).sendKeys(pass);
				driver.findElement(By.name("confirm")).sendKeys(cpass);
				driver.findElement(By.name("agree")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
				Thread.sleep(3000);
				//sending enquiry 
				driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/i")).click();
				driver.findElement(By.name("enquiry")).sendKeys("This is to Change of Address/Phone number");
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[3]/p/a[1]")).click();
				driver.findElement(By.name("text")).sendKeys("This is an excellent product and very affordable");
				WebElement radio=driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[4]/div/input[4]"));
				radio.click();
				driver.findElement(By.xpath("//*[@id=\"button-review\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]/i")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/i")).click();
				driver.findElement(By.name("EUR")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/i")).click();
				driver.findElement(By.name("GBP")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/i")).click();
				driver.findElement(By.name("USD")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/button/i")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a/i")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Continue")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")).click();
				driver.findElement(By.linkText("Logout")).click();
				driver.close();

		}

}
