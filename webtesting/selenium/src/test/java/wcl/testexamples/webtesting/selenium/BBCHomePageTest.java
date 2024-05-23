package wcl.testexamples.webtesting.selenium;

import org.junit.jupiter.api.*;
import wcl.testexamples.webtesting.selenium.models.BBCHomePage;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test checks for the following elements on the BBC News Home page:
 * - page title.
 * - BBC Logo - testing for the existence of the logo.
 * - Each header link; these will be expanded upon, as successful link traversal by default shows existence.
 *   - Home
 *   - News
 *   - Sport
 *   - Weather
 *   - iPlayer
 *   - Sounds
 *   - BiteSize
 *   - More
 *   - Search
 */
public class BBCHomePageTest extends TestBase {
    private static final String URL = "https://www.bbc.co.uk/";
    private static final String TITLE = "BBC - Home";

    private static BBCHomePage homePage;

    @BeforeEach
    protected void setupTestPage() {
        homePage = new BBCHomePage(getWebDriver());
        getPage(URL);
    }

    @Test
    public void whenInvokingBBCHomePage_thenTheTitleIsBBC() {
        assertEquals(TITLE, homePage.getTitle());
    }

    @Test
    public void whenInvokingBBCHomePage_thenBBCLogoIsPresent() {
        assertNotNull(homePage.getBBCLogo());
    }

    @Test
    public void whenInvokingBBCHomePage_thenSignInIsPresent() {
        assertNotNull(homePage.getSignIn());
    }

    @Test
    public void whenInvokingBBCHomePage_thenNotificationsIsPresent() {
        assertNotNull(homePage.getNotifications());
    }

    @Test
    public void whenInvokingBBCHomePage_thenHomeLinkIsPresent() {
        assertNotNull(homePage.getHomeLink());
    }

    @Test
    public void whenInvokingBBCHomePage_thenNewsLinkIsPresent() {
        assertNotNull(homePage.getNewsLink());
    }

    @Test
    public void whenInvokingBBCHomePage_thenSportLinkIsPresent() {
        assertNotNull(homePage.getSportLink());
    }

    @Test
    public void whenInvokingBBCHomePage_thenWeatherLinkIsPresent() {
        assertNotNull(homePage.getWeatherLink());
    }

    @Test
    public void whenInvokingBBCHomePage_theniPlayerLinkIsPresent() {
        assertNotNull(homePage.getiPlayerLink());
    }

    @Test
    public void whenInvokingBBCHomePage_thenSoundsLinkIsPresent() {
        assertNotNull(homePage.getSoundsLink());
    }

    @Test
    public void whenInvokingBBCHomePage_thenBiteSizeLinkIsPresent() {
        assertNotNull(homePage.getBiteSizeLink());
    }

    @Test
    public void whenInvokingBBCHomePage_thenMoreLinkIsPresent() {
        assertNotNull(homePage.getMoreLink());
    }

    @Test
    public void whenInvokingBBCHomePage_thenSearchLinkIsPresent() {
        assertNotNull(homePage.getSearchLink());
    }
}
