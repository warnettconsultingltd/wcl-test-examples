package wcl.testexamples.webtesting.selenium.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
 *  - Header elements
 *    - BBC Logo
 *      This is a SVG image contained within a span; the xpath needs to be manipulated to find the svg tag, which is
 *      xml and not HTML; need to check for the local name of the svg tag.
 *
 */
public class BBCNewsHomePage {
    private final String title;
    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[1]/a/span/*[local-name()='svg']")
    WebElement bbcLogo;

    public BBCNewsHomePage(final WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        title = webDriver.getTitle();
    }

    public String getTitle() {
        return title;
    }

    public String getBBCLogo() {
        return bbcLogo.getText();
    }
}
