package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePageObject {
	WebDriver driver;
	public AmazonHomePageObject(WebDriver driver) {
		this.driver=driver;
	}
	public void selectValueFromDropdown(int index) {
		WebElement  dropdownElement= driver.findElement(By.id("searchDropdownBox"));
		Select select=new Select(dropdownElement);
		select.deselectByIndex(index);

	}
	public void enterproduct(String productName) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
	}
	public void Searchicon() {
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
	}
	public void babywishlist() throws InterruptedException {
		WebElement element =driver.findElement(By.id("nav-link-accountList"));
		Actions action=new Actions(driver);
		action.clickAndHold().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Baby Wishlist")).click();
	}

}
