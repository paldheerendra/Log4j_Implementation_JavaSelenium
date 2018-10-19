package TestMvn;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	
	
	
	public static void explicitWait(WebDriver driver, WebElement element, int timeout) {
		
		new WebDriverWait (driver, timeout).ignoring(ElementNotVisibleException.class).until(ExpectedConditions.visibilityOf(element));
	
	}

}
