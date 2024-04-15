package wcl.testexamples.webtesting.selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import wcl.testexamples.webtesting.selenium.helper.BrowserWebDriverFactory;

import static org.junit.jupiter.api.Assertions.*;

public class TitleTests {
    private WebDriver webDriver;

    private static final String URL = "https://www.bbc.co.uk/news";
    private static final String TITLE = "Home - BBC News";

    @BeforeEach
    protected void setupWebDriver() {
        webDriver = BrowserWebDriverFactory.chromeWebDriver();
    }

    @AfterEach
    protected void closeWebDriver() {
        webDriver.quit();
    }

    @Test
    public void whenInvokingBBCHomePage_thenTheTitleIsBBC() {
        webDriver.get(URL);
        assertEquals(TITLE, webDriver.getTitle());
    }
}
