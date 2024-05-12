package wcl.testexamples.webtesting.selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import wcl.testexamples.webtesting.selenium.models.BBCNewsHomePage;
import wcl.testexamples.webtesting.selenium.utils.BrowserWebDriverFactory;

import static org.junit.jupiter.api.Assertions.*;

public class TitleTests {
    private WebDriver webDriver;

    private static final String URL = "https://www.bbc.co.uk/news";
    private static final String TITLE = "Home - BBC News";

    private BBCNewsHomePage homePage;

    @BeforeEach
    protected  void setupWebDriver() {
        webDriver = BrowserWebDriverFactory.chromeWebDriver();
        webDriver.get(URL);
        homePage = new BBCNewsHomePage(webDriver);
    }

    @AfterEach
    protected void closeWebDriver() {
        webDriver.quit();
    }

    @Test
    public void whenInvokingBBCHomePage_thenTheTitleIsBBC() {
        assertEquals(TITLE, homePage.getTitle());
    }
}
