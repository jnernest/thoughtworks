import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductListPage extends BasePage {

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public void checkProductAvailable(String product_name, String product_price, String product_unitStock, String product_description, String product_manufacturer) {
        int totalProducts = driver.findElements(By.xpath("//table[@id='productList']//tr")).size();

        boolean productAvailable = false;
        for (int i = 1; i <= totalProducts; i++) {
            String tempProduct_name = driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[4]")).getText();
            if (product_name.equals(tempProduct_name)) {
                driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[5]")).click();
                Assert.assertEquals(driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[5]")).getText(), product_price);
                Assert.assertEquals(driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[6]")).getText(), product_unitStock);
                Assert.assertEquals(driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[7]")).getText(), product_description);
                Assert.assertEquals(driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[8]")).getText(), product_manufacturer);
                productAvailable = true;
                break;
            }
        }
        Assert.assertTrue(productAvailable);
    }

    public void checkProductAvailableSingleXpath(String product_name, String product_price, String product_unitStock, String product_description, String product_manufacturer) {
        int totalProducts = driver.findElements(By.xpath("//table[@id='productList']//tr")).size();

        boolean productAvailable = false;
        for (int i = 1; i <= totalProducts; i++) {
            String tempProduct_name = driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[4]")).getText();
            if (product_name.equals(tempProduct_name)) {
                driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[5]")).click();
                Assert.assertEquals(driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[5]")).getText(), product_price);
                Assert.assertEquals(driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[6]")).getText(), product_unitStock);
                Assert.assertEquals(driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[7]")).getText(), product_description);
                Assert.assertEquals(driver.findElement(By.xpath("//table[@id='productList']//tr[" + i + "]//td[8]")).getText(), product_manufacturer);
                productAvailable = true;
                break;
            }
        }
        Assert.assertTrue(productAvailable);
    }
}