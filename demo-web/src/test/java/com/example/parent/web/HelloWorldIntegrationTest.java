package com.example.parent.web;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HelloWorldIntegrationTest {
  @Test
  public void testHelloWorldIndexPage() {

    // Optional, if not specified, WebDriver will search your path for
    // chromedriver.

    // System.setProperty("webdriver.chrome.driver", //
    // App.class.getResource("/").getPath() + "/chromedriver.exe");
    // ChromeOptions chrome = new ChromeOptions();
    // chrome.addArguments("--headless");
    // chrome.addArguments("--disable-gpu");
    // chrome.addArguments("--window-size=1200x600");
    // WebDriver driver = new ChromeDriver(chrome);

    WebDriver driver = new HtmlUnitDriver();

    // WebDriver driver = new SafariDriver();//use safari
    // WebDriver driver = new InternetExplorerDriver();//use IE
    // WebDriver driver = new FirefoxDriver();//use fireforx

    driver.get("http://localhost:8080/helloworld.html");
    System.out.println(driver.getPageSource());
    WebElement element = driver.findElement(By.tagName("h2"));
    MatcherAssert.assertThat("", element.getText(),
        CoreMatchers.is(CoreMatchers.equalTo("Hello World!")));
  }
}
