import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseChrome {

    public static void main (String[] args) {
        //selenium code

        // creating driver object
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // action
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
    }
}
