import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://eprawko.eu/#0");
        driver.findElement(By.xpath("//*[@id='main-container']/header/div/div/div/section/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\'signin-email\']")).sendKeys("login");
        driver.findElement(By.xpath("//*[@id=\'signin-password\']")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\'login-action\']")).click();
    }
}
