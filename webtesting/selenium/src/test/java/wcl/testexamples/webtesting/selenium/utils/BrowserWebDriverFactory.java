package wcl.testexamples.webtesting.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Example of a Factory pattern class for retrieving appropriate Browser WebDriver implementations.
 * <p/>
 * This Factory generates the appropriate WebBrowser instance, setting options by requesting the appropriate
 * options instance from the Options Factory.  This extracts the implementation of the options from the WebDriver
 * Factory.
 */
public class BrowserWebDriverFactory {
    private BrowserWebDriverFactory() {
    }

    public static WebDriver chromeWebDriver() {
        return new ChromeDriver(OptionsFactory.chromeOptions());
    }
}


