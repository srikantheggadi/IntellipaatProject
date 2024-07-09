package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyWishlistpage {
	WebDriver driver;
	public BabyWishlistpage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickBenefit() {
		driver.findElement(By.xpath("//*[normalize-space(text())='Benefits']")).click();
	}
}
