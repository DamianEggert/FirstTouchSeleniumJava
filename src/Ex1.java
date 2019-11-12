import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://edux.pjwstk.edu.pl/");
        driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Login1_UserName']")).sendKeys("12345");
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[contains(text(),'gakko.pjwstk.edu.pl')]")).click();
        driver.findElement(By.xpath("//span[@id='submitButton']")).click();
        driver.manage().window().maximize();
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.close();

    }
}
