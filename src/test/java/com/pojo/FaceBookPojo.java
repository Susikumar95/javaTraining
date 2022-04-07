package com.pojo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.LibGloabal;

public class FaceBookPojo extends LibGloabal {
	WebDriver driver;

	public FaceBookPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtUser;

	@FindBy(id="id")
	private WebElement txtpass;

	@FindBy(id="login")
	private WebElement btnLogIn;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;

	}

	
}
