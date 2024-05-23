package wcl.testexamples.webtesting.selenium.models;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

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
public class BBCHomePage implements PageObjectModel {
    private final String title;
    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[1]/a/span/*[local-name()='svg']")
    WebElement bbcLogo;

    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[2]/ul[1]/li[1]/a/span[2]")
    WebElement signIn;

    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[2]/ul[1]/li[2]/a/span/*[local-name()='svg']")
    WebElement notifications;

    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[2]/ul[2]/li[1]/a")
    WebElement homeLink;
    
    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[2]/ul[2]/li[2]/a")
    WebElement newsLink;
    
    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[2]/ul[2]/li[3]/a")
    WebElement sportLink;

    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[2]/ul[2]/li[4]/a")
    WebElement weatherLink;
    
    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[2]/ul[2]/li[5]/a")
    WebElement iPlayerLink;
    
    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[2]/ul[2]/li[6]/a")
    WebElement soundsLink;
    
    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[2]/ul[2]/li[7]/a")
    WebElement biteSizeLink;
    
    @FindBy(xpath="//*[@id=\"more-menu-button\"]/a")
    WebElement moreLink;
    
    @FindBy(xpath="//*[@id=\"chameleon-global-navigation\"]/div[3]/div[2]/a")
    WebElement searchLink;

    public BBCHomePage(final WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        title = webDriver.getTitle();
    }

    public String getTitle() {
        return title;
    }

    public String getBBCLogo() {
        return bbcLogo.getText();
    }

    public String getSignIn() { return signIn.getText();}

    public String getNotifications() { return notifications.getText();}

    public String getHomeLink() { return homeLink.getText();}

    public String getNewsLink() { return newsLink.getText();}

    public String getSportLink() { return sportLink.getText();}

    public String getWeatherLink() { return weatherLink.getText();}

    public String getiPlayerLink() { return iPlayerLink.getText();}

    public String getSoundsLink() { return soundsLink.getText();}

    public String getBiteSizeLink() { return biteSizeLink.getText();}

    public String getMoreLink() { return moreLink.getText();}

    public String getSearchLink() { return searchLink.getText();}
}
