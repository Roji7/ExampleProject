package exampleproject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MBONewcustomerorder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://stg.masterbo.in/admin");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.name("username"));
		UN.sendKeys("roji");
		WebElement PW = driver.findElement(By.name("password"));
		PW.sendKeys("testing");
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary']"));
		Login.click();
		WebElement Menu = driver.findElement(By.id("button-menu"));
		Menu.click();
		WebElement Customer = driver.findElement(By.id("customer"));
		Customer.click();
		WebElement NewCustomer = driver.findElement(By.xpath("//*[@id=\"customer\"]/ul/li[1]/a"));
		NewCustomer.click();
		// To click the dropdown
		WebElement Select = driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div/div[1]/div[1]/div/div[1]"));
        Select.click();
     // To select IDM
		WebElement SelectStoredropdown = driver.findElement(By.xpath("//*[@class='dropdown__menu_item' and @data-value='1']"));
		SelectStoredropdown.click();
        WebElement SelectStore = driver.findElement(By.id("select_store"));
		SelectStore.click();
		Thread.sleep(20000);
		// To click the productdropdown
		WebElement Selectdropdown = driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[1]/div[1]/div/div[1]"));
		Selectdropdown.click();
		//Thread.sleep(100000);
//		WebElement SelectProduct = driver.findElement(By.id("select_product"));
//		 Select dropdown = new Select(SelectProduct);
//		 dropdown.selectByValue("2001");
		 // To select Product
		WebElement Selectproduct = driver.findElement(By.xpath("(//*[text()='Acarbose 50mg (Both)'])[2]"));
		Selectproduct.click();
//		WebElement element = driver.findElement(By.xpath("(//*[text()='Acarbose 50mg (Both)'])[1]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    WebElement Selectproductbtn = driver.findElement(By.id("select_product_btn"));
		Selectproductbtn.click();
		Thread.sleep(1000);
		 WebElement Addtocart = driver.findElement(By.xpath("(//*[@class='fa fa-cart-plus'][1])[4]"));
		 Addtocart.click();
		 WebElement AddDiscount = driver.findElement(By.id("discount_select"));
		 Select dropdown2 = new Select(AddDiscount);
		 dropdown2.selectByValue("24362");   
		 WebElement FirstName = driver.findElement(By.id("register-firstname"));
		 FirstName.sendKeys("Roji");
		 WebElement LastName = driver.findElement(By.id("input-lastname"));
		 LastName.sendKeys("Test");
		 WebElement Email = driver.findElement(By.id("input-email"));
		 Email.sendKeys("rojitest81@gmail.com");
		 WebElement Gender = driver.findElement(By.id("input-gender"));
		 Select dropdown1 = new Select(Gender);
		 dropdown1.selectByValue("1");
		 WebElement DOB = driver.findElement(By.id("input-dob"));
		 //DOB.sendKeys("1990-11-20");
		 String newDOBValue = "1990-11-20";
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].value = arguments[1];", DOB, newDOBValue);
		 WebElement Countrycode = driver.findElement(By.id("input-country_code"));
		 Select Telecode = new Select(Countrycode);
		 Telecode.selectByValue("+7");
		 WebElement PhoneNo = driver.findElement(By.id("input-telephone"));
		 PhoneNo.sendKeys("7252570102");
		 WebElement Address = driver.findElement(By.id("input-address-1"));
		 Address.sendKeys("Test1");
		 WebElement City = driver.findElement(By.id("input-city"));
		 City.sendKeys("Test11");
		 WebElement PostCode = driver.findElement(By.id("input-postcode"));
		 PostCode.sendKeys("98765");
		 WebElement Country = driver.findElement(By.id("input-country"));
		 Select Countryselect = new Select(Country);
		 Countryselect.selectByValue("223");
		 Thread.sleep(1000);
		 WebElement State = driver.findElement(By.id("input-zone"));
		 Select Stateselect = new Select(State );
		 Stateselect.selectByValue("3614");
		 WebElement ContinueBtn = driver.findElement(By.id("register-btn"));
		 ContinueBtn.click();
		 Thread.sleep(5000);
		 WebElement AddDummyData = driver.findElement(By.id("cc_dummy_btn"));
		 AddDummyData.click();
		 WebElement SharedOrderNo = driver.findElement(By.id("shared_order_no"));
		 SharedOrderNo.click();
		 WebElement CreateOrdreBtn = driver.findElement(By.id("create-order-btn"));
		 CreateOrdreBtn.click();
		 Thread.sleep(40000);
//		 WebDriverWait wait = new WebDriverWait(driver, 20);
//		 wait.until(ExpectedConditions.alertIsPresent());
		 Alert alert=driver.switchTo().alert();
		 String alertText = alert.getText();
		 System.out.println("Alert text: " + alertText);
		 alert.accept();
		}

}

