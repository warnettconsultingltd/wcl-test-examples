package wcl.testexamples.webtesting.selenium.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * An implementation of the Page Object Model pattern.
 * <p/>
 * This model represents the BBC landing page for the <link><a href="https://www.bbc.co.uk/news">BBC News</a></link>
 * page.
 * <p/>
 * The page is set up through the constructor using a supplied WebDriver for the web page.  The following attributes
 * are currently retrieved :
 *  - title
 *    This is stored internally directly from the WebDriver method.  Whilst not strictly necessary - test can get this
 *    direct from the WebDriver, storing it within this Model pattern means all data to be tested will be within a Model
 *    instance.
 */
public class BBCNewsHomePage {
    private final String title;

    public BBCNewsHomePage(final WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        title = webDriver.getTitle();
    }

    public String getTitle() {
        return title;
    }
}
