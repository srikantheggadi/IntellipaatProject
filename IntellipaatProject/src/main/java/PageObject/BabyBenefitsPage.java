package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyBenefitsPage {
	WebDriver driver;
	public BabyBenefitsPage(WebDriver driver) {
		this.driver=driver;
	}
	public String getBenefitpagetitle() {
		return	driver.findElement(By.xpath("//h1[@id='a-size-extra-large br-ob-title-text']")).getText();
        
	}
}
