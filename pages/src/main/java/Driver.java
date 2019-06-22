import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jabez\\Downloads\\chromedriver_win32\\chromedriver.exe");

        return new ChromeDriver();
    }
}
