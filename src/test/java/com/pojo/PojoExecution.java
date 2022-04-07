package com.pojo;

import org.openqa.selenium.WebElement;

import com.utils.LibGloabal;

public class PojoExecution extends LibGloabal {

	public static void main(String[] args) throws InterruptedException {
		getDriver();

		getUrl("https://www.facebook.com/");

		FaceBookPojo f = new FaceBookPojo();
		
		f.getTxtUser().sendKeys("sysuyssy");
		
	}

}
