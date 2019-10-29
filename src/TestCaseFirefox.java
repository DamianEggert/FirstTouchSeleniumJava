import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCaseFirefox {

    public static void main (String[] args) {
        //selenium code

        // creating driver object
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\WebDrivers\\Firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // action
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
    }
}
