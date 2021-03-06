package testing.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class MessagePage extends BasePage {

	public MessagePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		// TODO Auto-generated constructor stub
	}

	public static By msgGroupLocator=By.cssSelector("div.form-group"),
			errorMsgLocator=By.cssSelector("div.error-message"),
			pwdMsgLocator=By.cssSelector("div.password-confirmation"),
			signInMsgLocator=By.cssSelector("div.signin-desc"),
			successMsgLocator=By.cssSelector("div.success-message");
	
	@FindBys(@FindBy(css="#header-menu-country-bt"))
	private List<WebElement> countryLink;
	
	@FindBys(@FindBy(css="#header-menu-language-bt"))
	private List<WebElement> localeLink;
	
	public String getErrorMessage() {
		return errorMsgLocator.toString();
	}
	
	public String getSuccessMessage() {
		return successMsgLocator.toString();
	}
	
	public String getPasswordMessage() {
		return pwdMsgLocator.toString();
	}
	

	public boolean VerifyCountryNotDisplayed() {
		try{
			return countryLink.size() == 0;
		}catch(Exception e) {
			return false;
		}
	}
	

	public boolean VerifyLanguageNotDisplayed() {
		try{
			return localeLink.size() == 0;
		}catch(Exception e) {
			return false;
		}
	}
}
