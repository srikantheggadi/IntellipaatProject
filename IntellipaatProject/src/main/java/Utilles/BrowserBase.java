package Utilles;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserBase {
	public WebDriver driver;
	public WebDriver getdriver() throws IOException {

		        if(driver == null) {
		            File file = new File("src/main/resources/Configaration/frameworkconfig.properties");
		            FileInputStream fis = new FileInputStream(file);
		            Properties pro = new Properties();
		            pro.load(fis);
		            switch (pro.getProperty("browser").toLowerCase()) {
		                case "edge":
		                	WebDriverManager.edgedriver().setup();
		                    driver = new EdgeDriver();
		                    break;
		                case "chrome":
		                	WebDriverManager.chromedriver().setup();
		                    driver = new ChromeDriver();
		                    break;
		                case "safari":
		                	 if (System.getProperty("os.name").toLowerCase().contains("windows")) {
		                         driver = new SafariDriver();
		                     } else {
		                         throw new InvalidArgumentException("Safari is only supported on Mac OS.");
		                     }
		                     break;
		                 default:
		                     throw new InvalidArgumentException("Enter valid browser");
//		                    driver = new SafariDriver();
//		                    break;
//		                default:
//		                    throw new InvalidArgumentException("enter valid browser");
		            }

		            driver.get(pro.getProperty("environment"));
		        }

		        return driver;
		    }
		}
