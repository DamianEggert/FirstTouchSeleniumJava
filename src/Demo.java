import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main (String[] args) {
        //selenium code

        // creating driver object
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebDrivers");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
    }
}
