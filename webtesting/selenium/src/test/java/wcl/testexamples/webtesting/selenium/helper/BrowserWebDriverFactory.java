package wcl.testexamples.webtesting.selenium.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWebDriverFactory {
    private BrowserWebDriverFactory() {
    }

    public static WebDriver chromeWebDriver() {
        return new ChromeDriver(OptionsFactory.chromeOptions());
    }
}


