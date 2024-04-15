package wcl.testexamples.webtesting.selenium.helper;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

import java.util.HashMap;
import java.util.Map;

class OptionsFactory {

    private static Map<BrowserType, AbstractDriverOptions> OPTION_MAP = new HashMap<>();

    private static int REMOTE_DEBUGGING_PORT=9221;

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
        CHROME;
    }
}
