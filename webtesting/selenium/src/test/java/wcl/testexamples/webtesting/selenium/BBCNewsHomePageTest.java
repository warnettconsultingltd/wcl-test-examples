package wcl.testexamples.webtesting.selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import wcl.testexamples.webtesting.selenium.models.BBCNewsHomePage;
import wcl.testexamples.webtesting.selenium.utils.BrowserWebDriverFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test checks for the following elements on the BBC News Home page:
 * - page title.
 * - BBC Logo - testing for the existence of the logo.
 */
public class BBCNewsHomePageTest {
    private static WebDriver webDriver;

    private static final String URL = "https://www.bbc.co.uk/news";
    private static final String TITLE = "Home - BBC News";

    private static BBCNewsHomePage homePage;

    @BeforeAll
    protected static void setupWebDriver() {
        webDriver = BrowserWebDriverFactory.chromeWebDriver();
        webDriver.get(URL);
    }

    @BeforeEach
    protected void setupTestPage() {
        homePage = new BBCNewsHomePage(webDriver);
    }
    @AfterAll
    protected static void closeWebDriver() {
        webDriver.quit();
    }

    @Test
    public void whenInvokingBBCHomePage_thenTheTitleIsBBC() {
        assertEquals(TITLE, homePage.getTitle());
    }

    @Test
    public void whenInvokingBBCHomePage_thenBBCLogoIsPresent() {
        assertNotNull(homePage.getBBCLogo());
    }
}
