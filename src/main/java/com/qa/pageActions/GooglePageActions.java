package com.qa.pageActions;

import org.openqa.selenium.By;

import com.qa.BasePage.BasePage;

public class GooglePageActions extends BasePage {

	public void googleSearch() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).click();
		driver.findElement(By.xpath("//*[@name='q']")).clear();
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Gmail.com");
		driver.findElement(By.xpath("//*[@name='q']")).submit();
	}

	public void tearDown() {
		driver.quit();
	}

}
