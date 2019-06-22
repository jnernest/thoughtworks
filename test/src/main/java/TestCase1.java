import org.openqa.selenium.WebDriver;

import java.util.Random;

public class TestCase1 extends Driver {
    private WebDriver driver = getDriver();
    private String product_Name, product_Description, product_Manufacturer, product_Price, product_UnitStock;

    private void openURl() {
        driver.navigate().to("http://10.134.124.160:8080/shopieasy/");
    }

    private void  TestCaseOne() {
        //login as admin
        HomePage homePage = new HomePage(driver).login().login("admin1@shopping.com", "admin");

        //Add product
        AddProductPage addProductPage = homePage.addProduct();

        //add details of product
        product_Name = "Test_Product_Name_Nathaniel" + new Random().nextInt(1000) + 100;
        addProductPage.productName(product_Name);

        product_Description = "Test_Product_Description_Nathaniel" + new Random().nextInt(50);
        addProductPage.productDescription(product_Description);

        addProductPage.productCategory("Windows");

        product_Manufacturer = "Test_Product_Manufacturer_Nathaniel" + new Random().nextInt(50);
        addProductPage.productManufacturer(product_Manufacturer);

        product_Price = new Random().nextInt(1000) + 100 + ".0";
        addProductPage.productPrice(product_Price);

        product_UnitStock = new Random().nextInt(100 - 10) + "";
        addProductPage.unitStock(product_UnitStock);

        addProductPage.uploadImg("C:\\Users\\jabez\\Desktop\\shopeay\\download.jfif");

        homePage = addProductPage.submit();

        //Logout as ADMIN
        homePage.logout();
    }

    private void TestCaseTwo() {
        HomePage homePage = new HomePage(driver).login("ernest.niel@gmail.com", "Password123");
        ProductListPage productListPage = homePage.productList();
        productListPage.checkProductAvailable(product_Name, product_Price, product_UnitStock, product_Description, product_Manufacturer);
    }


    public static void main(String[] args) {
        TestCase1 test1 = new TestCase1();
        test1.openURl();
        test1.TestCaseOne();
        test1.TestCaseTwo();
    }
}