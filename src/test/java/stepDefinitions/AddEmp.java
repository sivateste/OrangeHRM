package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmp {
	
	WebDriver driver;
	@Given("^user navigate orangehrm url\"([^\"]*)\"$")
	public void user_navigate_orangehrm_url(String url) throws Throwable {
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
	}


	@When("^user logs in as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_logs_in_as_and_password_as(String uname, String pwd) throws Throwable {
		
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	
	}

	@When("^user click pim$")
	public void user_click_pim() throws Throwable {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
	}

	@When("^user enter as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_as_and_and(String fname, String mname, String lname) throws Throwable {
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("middleName")).sendKeys(mname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
	
	}

	@When("^user click save button$")
	public void user_click_save_button() throws Throwable {
		driver.findElement(By.id("btnSave")).click();
	
	}

	@When("^user validate url$")
	public void user_validate_url() throws Throwable {
		  String expected ="empNumber";
		    String actual=driver.getCurrentUrl();
		    if(actual.contains(expected))
		    {
		    	System.out.println("Emp Creation success::"+expected+"     "+actual);
		    }
		    else
		    {
		    	System.out.println("Emp Creation Fail::"+expected+"     "+actual);
		    }
	
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {

	driver.close();
	}


}
