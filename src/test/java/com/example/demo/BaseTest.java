package com.example.demo;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

  private static WebDriver driver;

  @BeforeAll
  public static void beforeAll() {
    System.setProperty("webdriver.chrome.driver", "/Users/kirill.simonovich/Downloads/chromedriver");
    System.setProperty("headless", "false"); // You can set this property elsewhere
    String headless = System.getProperty("headless");
    ChromeDriverManager.chromedriver();
    if("true".equals(headless)) {
      ChromeOptions chromeOptions = new ChromeOptions();
      chromeOptions.addArguments("--headless");
      driver = new ChromeDriver(chromeOptions);
    } else {
      driver = new ChromeDriver();
    }
  }

  @AfterAll
  public static void afterAll() {
    if(null != driver) {
      driver.close();
      driver.quit();
    }
  }

  public WebDriver getDriver() {
    return driver;
  }
}
