package Utilles;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TextContext {
           WebDriver driver;
    public BrowserBase browserbase;
    public PageObjectManager pageobjectmanager;
    
    
    public TextContext() throws IOException {
    	 browserbase= new BrowserBase();
    	 pageobjectmanager= new PageObjectManager(browserbase.getdriver());
    	 
    }
}
