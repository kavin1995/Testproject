package org.stepdefinitions;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo {
	WebDriver driver;



	@Given("User should launch the browser")
	public void user_should_launch_the_browser() {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    driver=new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();

	}
	@When("User should write {string} and {string}")
	public void user_should_write_and(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	   
	}
	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		 driver.findElement(By.id("login-button")).click();
	}
	@Then("User should verify success message after login")
	public void user_should_verify_success_message_after_login() {
	   WebElement txt = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
	   String text = txt.getText();
	   Assert.assertEquals("verify the success message","Swag Labs", text);
	  
	}


	@Then("User should quit the browser")
	public void user_should_quit_the_browser() {
		 driver.quit();
	}

	@Then("User should click the product")
	public void user_should_click_the_product() {
	   driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).click();
	   driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	   driver.close();
	   
	}


	@Then("User should click the Add to cart button")
	public void user_should_click_the_add_to_cart_button() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.id("first-name")).sendKeys("praveen");
		driver.findElement(By.id("last-name")).sendKeys("kumar");
		driver.findElement(By.id("postal-code")).sendKeys("600096");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		driver.close();
	}

/////////////////////////////////////////////
	@Then("User should click the filter button")
	public void user_should_click_the_filter_button() {
	   WebElement sel = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	   Select select = new Select(sel);
	   select.selectByIndex(1);
	   driver.findElement(By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']")).click();
	   driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.id("first-name")).sendKeys("masi");
		driver.findElement(By.id("last-name")).sendKeys("k");
		driver.findElement(By.id("postal-code")).sendKeys("600099");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		driver.close();
	}



	@Then("User should use dynamic path")
	public void user_should_use_dynamic_path() {
	    driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']//parent::a//preceding::div//button[text()='Add to cart']")).click();
	    driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//parent::div//following::a/div[text()='Sauce Labs Fleece Jacket']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.id("first-name")).sendKeys("sam");
		driver.findElement(By.id("last-name")).sendKeys("kannan");
		driver.findElement(By.id("postal-code")).sendKeys("600099");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();	
		driver.close();
	}



	@Then("User should click logout")
	public void user_should_click_logout() {
	    driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
	    driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.close();
	}


	@Then("User should all Add to Cart")
	public void user_should_all_add_to_cart() {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		//driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
		//driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
//		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
//		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
//		driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
//		driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
//		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
//		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
	    driver.close();
	}



	@Then("User should click all cart")
	public void user_should_click_all_cart() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.id("first-name")).sendKeys("masi");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("kumar");
		driver.findElement(By.id("postal-code")).sendKeys("600099");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		WebElement err = driver.findElement(By.xpath("//h3[text()='Error: Last Name is required']"));
		String string = err.getText();
		Assert.assertEquals("verify the success message","Error: Last Name is required", string);
	    driver.close();
	}


//Error: Last Name is required

@Then("User should click cart")
public void user_should_click_cart() {
   
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	driver.quit();
	
}


@Then("User should click carts")
public void user_should_click_carts() {
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	driver.quit();
}

@Then("User should click cart to contiune")
public void user_should_click_cart_to_contiune() {
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
	driver.quit();
    
}

@Then("User should click cart button")
public void user_should_click_cart_button() {
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	driver.findElement(By.id("first-name")).sendKeys("sam");
	driver.findElement(By.id("last-name")).sendKeys("R");
	driver.findElement(By.id("postal-code")).sendKeys("600099");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//button[@id='finish']")).click();
	driver.close();
   
}




@Then("User should about")
public void user_should_about() {
    driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
    driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();
    driver.quit();
}

@Then("User should click request")
public void user_should_click_request() {
	   driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	    driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();
	   // driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	    driver.quit();
}


}
