package com.example.demo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.CreateAccountPage;
import pages.LoginPage;
import pages.MainPage;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest extends BaseTest {

  private WebDriver driver;

  @BeforeEach
  public void setUp() {
    driver = getDriver();
    driver.get("http://automationpractice.com/index.php");
  }

  @Test
  public void test() {
    MainPage mainPage = new MainPage(driver);
    LoginPage loginPage = mainPage.clickUserInfo();
    CreateAccountPage createAccountPage = loginPage
        .setRandomEmail()
        .clickSubmit();
    createAccountPage
        .setGender()
        .setFirstName("Ivan")
        .setLastName("Ivanov");
  }
}
