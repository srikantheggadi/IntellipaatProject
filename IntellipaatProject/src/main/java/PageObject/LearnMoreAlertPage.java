package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnMoreAlertPage {
	WebDriver driver;

	public LearnMoreAlertPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickAlertBox() {
		
	}
	public void clickConfirmationBox() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
	public String getConfirmationmessageText() {
		return driver.switchTo().alert().getText();
	}
	public void clickCancelButton() {
		driver.switchTo().alert().dismiss();
	}
	public void clickOkButton() {
		driver.switchTo().alert().accept();
	}
	public String getConfirmBoxUiText() {
		String valu=driver.findElement(By.cssSelector("#demo")).getText();
	return valu;
	}
}
