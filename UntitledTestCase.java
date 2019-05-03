package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.sokoso.ng/");
    driver.findElement(By.linkText("Search for Properties")).click();
    driver.findElement(By.linkText("Show Filters")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='What property are you looking for?'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select and option:'])[1]/following::button[1]")).click();
    driver.findElement(By.id("q")).click();
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys("2 Bedrooms");
    driver.findElement(By.id("bedrooms")).clear();
    driver.findElement(By.id("bedrooms")).sendKeys("1");
    driver.findElement(By.id("bedrooms")).click();
    driver.findElement(By.id("bedrooms")).click();
    driver.findElement(By.id("bedrooms")).click();
    driver.findElement(By.id("bedrooms")).clear();
    driver.findElement(By.id("bedrooms")).sendKeys("3");
    driver.findElement(By.id("bathrooms")).clear();
    driver.findElement(By.id("bathrooms")).sendKeys("1");
    driver.findElement(By.id("bathrooms")).click();
    driver.findElement(By.id("bathrooms")).clear();
    driver.findElement(By.id("bathrooms")).sendKeys("2");
    driver.findElement(By.id("bathrooms")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Rent'])[2]/following::span[1]")).click();
    driver.findElement(By.linkText("2")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign Up For Free Properties Alerts'])[1]/following::h4[1]")).click();
    driver.findElement(By.linkText("3")).click();
    driver.findElement(By.linkText("4")).click();
    driver.findElement(By.linkText("5")).click();
    driver.findElement(By.linkText("6")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
