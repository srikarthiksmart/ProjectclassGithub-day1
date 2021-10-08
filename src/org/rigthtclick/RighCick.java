package org.rigthtclick;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RighCick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Success\\eclipse-workspace\\day26 rightclik\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		WebElement signin = driver.findElement(By.xpath("//a[@data-action='sign in']"));
		Actions rightclick = new Actions(driver);
		rightclick.contextClick(signin).perform();
		System.out.println("print done");
	}

}
