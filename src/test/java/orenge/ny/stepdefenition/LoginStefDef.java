package orenge.ny.stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStefDef {

	WebDriver driver;

	@Given("User is able to open any browser")
	public void user_is_able_to_open_any_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Given("User is able to enter the URL")
	public void user_is_able_to_enter_the_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@When("User is able to enter the user name")
	public void user_is_able_to_enter_the_user_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

	}

	@When("User is able to enter the password")
	public void user_is_able_to_enter_the_password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

	}

	@When("User is able to click on log in BTN")
	public void user_is_able_to_click_on_log_in_btn() {
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
	}

}