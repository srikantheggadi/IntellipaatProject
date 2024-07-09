package Utilles;

import org.openqa.selenium.WebDriver;

import PageObject.AmazonHomePageObject;
import PageObject.BabyBenefitsPage;
import PageObject.BabyWishlistpage;
import PageObject.LearnMoreAlertPage;

public class PageObjectManager {
	WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public AmazonHomePageObject getAmazonhomepage() {
		AmazonHomePageObject amahomepage=new AmazonHomePageObject(driver);
		return amahomepage;
	}
	public  BabyBenefitsPage getBabyBenefits() {
		BabyBenefitsPage benefitspage=new BabyBenefitsPage(driver);
		return benefitspage;
	}
	public  BabyWishlistpage getBabyWishlist() {
		BabyWishlistpage  babywishlist= new BabyWishlistpage(driver);
		return babywishlist;
	}
	public LearnMoreAlertPage getLearnMoreAlertPage() {
		LearnMoreAlertPage Learnmorealertpage=new LearnMoreAlertPage(driver);
		return Learnmorealertpage;
	}

}

