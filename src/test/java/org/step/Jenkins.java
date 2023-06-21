package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Jenkins {
	WebDriver driver;

	@Given("To launch fb login page")
	public void to_launch_fb_login_page() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
	}

	@When("To pass the data to email text box")
	public void to_pass_the_data_to_email_text_box() {
		WebElement em = driver.findElement(By.xpath("//input[@name='email']"));
		em.sendKeys("13gowtham007@gmail.com");
	}

	@When("To pass the data to password text box")
	public void to_pass_the_data_to_password_text_box() {
		WebElement ps = driver.findElement(By.xpath("//input[@type='password']"));
		ps.sendKeys("raviguna");

	}

	@Then("then need to click the login button")
	public void then_need_to_click_the_login_button() {
		WebElement lb = driver.findElement(By.name("login"));
		lb.click();
	}

}
