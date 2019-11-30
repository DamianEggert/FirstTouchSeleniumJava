import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoScroll9gag {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://9gag.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".button_button--lgX0P.intro_acceptAll--23PPA")).click();

        for(int i=0;i<2;i++) {
            js.executeScript("window.scrollBy(0,1)", "");
            i--;
        }

    }
}

