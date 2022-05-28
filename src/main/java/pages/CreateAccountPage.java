package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {

  @FindBy(id = "id_gender1")
  WebElement gender;

  @FindBy(id = "customer_firstname")
  WebElement firstName;

  @FindBy(id = "customer_lastname")
  WebElement lastName;

  public CreateAccountPage(WebDriver driver) {
    super(driver);
  }

  public CreateAccountPage setGender() {
    gender.click();
    return this;
  }

  public CreateAccountPage setFirstName(String name) {
    firstName.sendKeys(name);
    return this;
  }

  public CreateAccountPage setLastName(String lastname) {
    lastName.sendKeys(lastname);
    return this;
  }
}
