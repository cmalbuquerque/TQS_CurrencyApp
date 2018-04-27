/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqs.homework.currencyapi;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author carolina albuquerque
 */

public class SeleniumTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSelenium() throws Exception {
    driver.get("http://localhost:8080/CurrencyAPI/");
    driver.findElement(By.name("j_idt5:j_idt8")).click();
    driver.findElement(By.name("j_idt5:j_idt8")).clear();
    driver.findElement(By.name("j_idt5:j_idt8")).sendKeys("1.0");
    driver.findElement(By.id("j_idt5:curreciesFrom")).click();
    new Select(driver.findElement(By.id("j_idt5:curreciesFrom"))).selectByVisibleText("EUR");
    driver.findElement(By.id("j_idt5:curreciesFrom")).click();
    new Select(driver.findElement(By.id("j_idt5:curreciesTo"))).selectByVisibleText("USD");
    driver.findElement(By.id("j_idt5:curreciesTo")).click();
    driver.findElement(By.name("j_idt5:j_idt14")).click();
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
