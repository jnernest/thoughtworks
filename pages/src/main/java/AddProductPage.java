import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProductPage extends BasePage {


    public AddProductPage(WebDriver driver) {
        super(driver);
    }

    public void productName(String product) {
        WebElement productName = driver.findElement(By.id("productName"));
        productName.clear();
        productName.sendKeys(product);
    }

    public void productDescription(String description) {
        WebElement productDescription = driver.findElement(By.id("productDescription"));
        productDescription.clear();
        productDescription.sendKeys(description);
    }

    public void productCategory(String category) {
        driver.findElement(By.xpath("//input[@name='productCategory' and @value='" + category + "']"));
    }

    public void productManufacturer(String manufacturer) {
        WebElement productManufacturer = driver.findElement(By.id("productManufacturer"));
        productManufacturer.clear();
        productManufacturer.sendKeys(manufacturer);
    }

    public void unitStock(String unit) {
        WebElement unitStock = driver.findElement(By.id("unitStock"));
        unitStock.clear();
        unitStock.sendKeys(unit);
    }

    public void productPrice(String price) {
        WebElement productPrice = driver.findElement(By.id("productPrice"));
        productPrice.clear();
        productPrice.sendKeys(price);
    }

    public void uploadImg(String imgurl) {
        WebElement uploadElement = driver.findElement(By.id("productImage"));
        uploadElement.sendKeys(imgurl);
    }

    public HomePage submit() {
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));

        submit.click();
        return new HomePage(driver);
    }

}