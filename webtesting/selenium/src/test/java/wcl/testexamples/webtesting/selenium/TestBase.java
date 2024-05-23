package wcl.testexamples.webtesting.selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import wcl.testexamples.webtesting.selenium.utils.BrowserWebDriverFactory;

/**
 * An abstract class wrapping and abstracting WebDriver functionality, to be inherited by test classes.
 */
public abstract class TestBase {
    private static WebDriver webDriver;
    protected void getPage(final String url) {
        webDriver.get(url);
    }


    protected WebDriver getWebDriver() {
        return webDriver;
    }

    @BeforeAll
    protected static void setupWebDriver() {
        webDriver = BrowserWebDriverFactory.chromeWebDriver();
    }

    @AfterAll
    protected static void closeWebDriver() {
        webDriver.quit();
    }
}
