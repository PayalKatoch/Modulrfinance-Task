package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	
    @Given("^User is on login page$")
    public void user_is_on_login_page() {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get("https://secure-sandbox.modulrfinance.com/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
    }

    @When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enters_username_something_and_password_something(String strArg1, String strArg2) {
    	
    	driver.findElement(By.id("username-inp")).sendKeys(strArg1);
    	driver.findElement(By.id("password-inp")).sendKeys(strArg2);
       
    }
    
    @And("^User clicks on Signin button$")
    public void user_clicks_on_login_button() {
    	
        driver.findElement(By.id("signInSubmitButton")).click();
    	
    }
    
    
    @Then("^User landed on Home page \"([^\"]*)\"$")
    public void user_landed_on_home_page_something(String strArg1)  {
    	
         strArg1 = driver.getCurrentUrl();
    	
        System.out.println("Home Page url ::" + strArg1);
    	Assert.assertEquals("https://secure-sandbox.modulrfinance.com/", strArg1);
   
    }
}

