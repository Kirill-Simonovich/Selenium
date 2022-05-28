package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

  @FindBy(css = ".header_user_info")
  WebElement userInfo;

  public MainPage(WebDriver driver) {
    super(driver);
  }

  public LoginPage clickUserInfo() {
    userInfo.click();
    return new LoginPage(driver);
  }

}
