package wcl.testexamples.webtesting.selenium.utils;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

import java.util.HashMap;
import java.util.Map;

/**
 * Example of a Factory pattern class for providing options Browser WebDrivers.
 * <p/>
 * The Factory class itself stores options as a private static Map instance; this enables the Factory to
 * centrally hold Options for multiple browsers.  The client code can request the appropriate options via
 * invoking the <<<browser>>options method.
 * <p/>
 * The following browsers are supported:
 * <p/>
 *   Chrome
 * <p/>
 * The Factory class itself is package private - it's only ever used by the BrowserWebDriverFactory hence
 * should not be publicly exposed.  In a similar vein, the key for the options Map is an enum - as it is only ever
 * used within this Factory class, then it can be encapsulated within this class.
 * <p/>
 * This design means the BrowserWebDriverFactory can invoke whichever simple method is required to get the options
 * rather than having any, even tangential, knowledge of the internals of this Factory.
 * <p/>
 * The Factory is also implemented as a Singleton; it's inefficient to maintain numerous instances of the Factory on
 * the same JVM.
 * <p/>
 * Options currently provided are as follows:
 * <p/>
 * - Chrome
 *  - Headless mode
 *  - Set Remote Debugging Port
 */
class OptionsFactory {

    private static final Map<BrowserType, AbstractDriverOptions<?>> OPTION_MAP = new HashMap<>();

    private static final int REMOTE_DEBUGGING_PORT=9221;

    static {
        final var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments(String.format("--remote-debugging-port=%d",REMOTE_DEBUGGING_PORT));
        OPTION_MAP.put(BrowserType.CHROME, chromeOptions);
    }


    private OptionsFactory() {
    }

    public static ChromeOptions chromeOptions() {
        return (ChromeOptions)OPTION_MAP.get(BrowserType.CHROME);
    }

    enum BrowserType {
        CHROME
    }
}
