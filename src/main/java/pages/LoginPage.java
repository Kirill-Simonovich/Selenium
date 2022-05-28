package pages;

import base.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

  @FindBy(css = "#email_create")
  WebElement email;

  @FindBy(css = "#SubmitCreate")
  WebElement submitCreate;

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public LoginPage setRandomEmail() {
    email.sendKeys(RandomStringUtils.randomAlphabetic(5) + "@gmail.com");
    return this;
  }

  public CreateAccountPage clickSubmit() {
    submitCreate.click();
    return new CreateAccountPage(driver);
  }
}
