import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AddProductPage addProduct() {
        WebElement addProduct = driver.findElement(By.linkText("Add Product"));
        addProduct.click();
        return new AddProductPage(driver);
    }

    public ProductListPage productList() {
        WebElement productList = driver.findElement(By.linkText("Product List"));
        productList.click();
        return new ProductListPage(driver);
    }

    public LoginPage login() {
        WebElement login = driver.findElement(By.xpath("//a[@href='/shopieasy/login']"));
        login.click();
        return new LoginPage(driver);
    }

    public LoginPage logout() {
        driver.findElement(By.xpath("//a[@href='/shopieasy/logout']")).click();
        return new LoginPage(driver);
    }

    public HomePage login(String email, String password) {
        new LoginPage(driver).login(email, password);
        return new HomePage(driver);
    }
}
