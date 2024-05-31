package CRM.automation.CRM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class CRMLogin {
	private WebDriver driver;
	JavascriptExecutor js;
	public void sleepThread() throws InterruptedException {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void setUp() throws TransformerException, InterruptedException {
		String filepath = new java.io.File("").getAbsolutePath() + "/src/resource/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filepath);
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    options.addArguments("--whitelisted-ips=''");
		options.setExperimentalOption("useAutomationExtension", false);
	    driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		String username = "vas92dodig.setup";
		String pwd = "Welcome%40123";
		String crm = "va-vm-250.tscti.local:80/";
		String URL = "http://" + username + ":" + pwd + "@" + crm;
		//((HasAuthentication) driver).register(UsernameAndPassword.of("username", "pass"));
		  driver.get(URL);
		//driver.get("http://va-vm-250.tscti.local:80/");
		//driver.get("http://"+username+":"+pwd+"@va-vm-250.tscti.local/");
		sleepThread();
	    
	try {
	  Thread.sleep(5000);
	} catch (InterruptedException e) {
	  e.printStackTrace();
	}

	
	
	
	}

	@AfterMethod
	public void tearDown() {

		try {
			driver.quit();
		} catch (Exception e) {

		}
	}

	@Test
	public void crmLoginTest() throws Exception {
		System.out.println("Login successful");
	}

	
}
