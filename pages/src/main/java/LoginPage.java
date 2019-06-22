import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void userName(String user) {

        WebElement userName = driver.findElement(By.xpath("//input[@name='j_username']"));
        userName.sendKeys(user);
    }

    public void password(String password) {

        WebElement passWord = driver.findElement(By.xpath("//input[@name='j_password']"));
        passWord.sendKeys(password);
    }

    public HomePage submit() {
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));

        submit.click();
        return new HomePage(driver);
    }

    public LoginPage login() {
        WebElement login = driver.findElement(By.xpath("//a[@href='/shopieasy/login']"));
        login.click();
        return new LoginPage(driver);
    }

    public HomePage login(String email, String password) {
        userName(email);
        password(password);
        submit();
        return new HomePage(driver);
    }
}
