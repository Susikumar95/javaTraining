package com.stepdef;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.pojo.FaceBookPojo;
import com.utils.LibGloabal;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookPageSteps extends LibGloabal {


	@Given("User launch the browser")
	public void user_launch_the_browser() {
		getDriver();
	}

	@Given("User enters the url")
	public void user_enters_the_url() {
		getUrl("https://www.facebook.com/");
	}

	

@When("User enters the username and password")
public void user_enters_the_username_and_password(DataTable table) {
	
	List<String> asList = table.asList();
	String string = asList.get(0);
	String s2 = asList.get(1);
	System.out.println("[password is" + s2);
	
	
	
	List<List<String>> asLists = table.asLists();
	List<String> zerothrow = asLists.get(0);
	String firstColum = zerothrow .get(1);
	
	

	driver.findElement(By.id("email")).sendKeys(firstColum);
	driver.findElement(By.id("pass")).sendKeys("dyjfkgj");    
}


@When("User enters the {string} and {string}")
public void user_enters_the_and(String username, String password) {
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
}

	
//	@When("User Clicks the login button")
//	public void user_Clicks_the_login_button() throws InterruptedException {
//		
//	}
	
	@When("User clicks the Login button")
	public void user_clicks_the_Login_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();    
	}

	@Then("User navigates login failure page")
	public void user_navigates_login_failure_page() {
	 
	}
	

	



}
