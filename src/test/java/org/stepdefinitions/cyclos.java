package org.stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cyclos {
WebDriver driver;
	
	@Given("User should lanch the url")
	public void user_should_lanch_the_url() {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("headless");
	    driver=new ChromeDriver(options);
	    driver.get("https://demo.cyclos.org/ui/home");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[text()=' Login ']")).click();
	}

	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String User, String pass) {
		driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys(User);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
	}

	@When("User should click the submit button")
	public void user_should_click_the_submit_button() {
	    
	    driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
	    WebElement drop = driver.findElement(By.xpath("//button[@class='btn btn-icon ml-2']"));
	    drop.click();
	    driver.findElement(By.xpath("//a[text()=' Flores Software ']")).click();
	    driver.findElement(By.xpath("//input[contains(@id,'id')]")).sendKeys("200");
	    //driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
	    driver.findElement(By.xpath("//textarea[contains(@id,'id')]")).sendKeys("Payment done");
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    
	}

	@When("User should enter the value and click confirm button")
	public void user_should_enter_the_value_and_click_confirm_button() {
	    
		driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		driver.close();
	}

	@When("User should click scheduled payment")
	public void user_should_click_scheduled_payment() {
		driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
		driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")).click();
//		driver.findElement(By.xpath("//th[text()='Due date']//parent::thead//following::td//a[text()=' 08/05/2023 ']")).click();
//		driver.findElement(By.xpath("//div[text()='Cancel this scheduled payment']")).click();
//		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		driver.close();
		
	}

	@When("User should click scheduled payments")
	public void user_should_click_scheduled_payments() {
		driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
		driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")).click();
    	//driver.findElement(By.xpath("//th[text()='Amount']//parent::thead//preceding-sibling::th"));
     	driver.close();
	}

	@When("User should click scheduled payment mode")
	public void user_should_click_scheduled_payment_mode() {
		driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
		driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")).click();
		//driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
		//driver.findElement(By.xpath("//th[text()='Due date']//parent::thead//following::div//a[text()='Cyclos software']")).click();
		driver.quit();
	}

	@When("User should click scheduled payment modes")
	public void user_should_click_scheduled_payment_modes() {
		driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
		//driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")).click();
		//driver.findElement(By.xpath("//th[text()='Due date']//parent::thead//following::th[text()='Number']")).click();
		driver.quit();
	}
	
	@When("User should click Member account")
	public void user_should_click_member_account() {
		driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
	   driver.findElement(By.xpath("//div[normalize-space()='Member account']")).click();
	   WebElement findElement = driver.findElement(By.xpath("//th[text()=' Description']"));
	   String text = findElement.getText();
	   System.out.println(text);
	   driver.quit();
	   
	}

	@When("User should click voucher")
	public void user_should_click_voucher() {

		driver.findElement(By.xpath("//div[contains(text(),'My vouchers')]")).click();
		driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Business directory']")).click();
		driver.findElement(By.xpath("//format-field-value[normalize-space()='Natural garden pools']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Make payment']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'id')]")).sendKeys("200");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Confirm']")).click();
		driver.quit();
		
	}


	@When("User should click theme")
	public void user_should_click_theme() {
	driver.findElement(By.xpath("//a[@href='/personal/settings']//div[@class='quick-access-icon']//icon//*[name()='svg']")).click();
	driver.quit();
	}

	@When("User should click banking")
	public void user_should_click_banking() {
	   driver.findElement(By.xpath("//div[text()='Banking']")).click();
	   driver.quit();
	}

	@When("User should click market")
	public void user_should_click_market() {
	    driver.findElement(By.xpath("//div[@class='menu-text'][normalize-space()='Marketplace']")).click();
	    driver.quit();
	}

	@When("User should click information")
	public void user_should_click_information() {
	    driver.findElement(By.xpath("//div[@class='menu-text'][normalize-space()='Information']")).click();
	    driver.quit();
	}

	@When("User should click demo")
	public void user_should_click_demo() {
	    driver.findElement(By.xpath("//div[text()='  Demo user ']")).click();
	    
	}

	@When("User should quit browser")
	public void user_should_quit_browser() {
	 driver.quit();
	}

	@When("User should click setting")
	public void user_should_click_setting() {
		driver.findElement(By.xpath("//span[text()=' (5 references) ']")).click();
	   driver.findElement(By.xpath("//div[normalize-space()='Settings']")).click();
	   driver.findElement(By.xpath("//label[normalize-space()='Dark']")).click();
	   driver.quit();
	}

	@When("User should click contact")
	public void user_should_click_contact() {
	   driver.findElement(By.xpath("//div[text()='Contacts']")).click();
	   driver.findElement(By.xpath("//label[@class='btn btn-icon focusable resultType-list']")).click();
	   driver.quit();
	}

	@When("User should click password")
	public void user_should_click_password() {
	    driver.findElement(By.xpath("//div[normalize-space()='Passwords']")).click();
	    WebElement findElement = driver.findElement(By.xpath("//div[text()=' Manage your passwords ']"));
	    String text = findElement.getText();
	    System.out.println(text);
	    driver.quit();
	}



	
}
