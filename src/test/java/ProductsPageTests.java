import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class ProductsPageTests {
    WebDriver driver;
    ProductsPage ProductsPage;

    //variables
    String URL = "https://automationexercise.com/";
    String search = "blue top";
    String expectedAddedText = "Added!";
    String expectedMessage = "Your product has been added to cart.";


    @BeforeMethod
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        ProductsPage = new ProductsPage(driver);
        ProductsPage.NavigateToURL(URL);
        ProductsPage.ClickProductsButton();
    }

    @Test
    public void signUpTC01(){
        ProductsPage.FillSearchTextField(search);
        ProductsPage.ClickSearchButton();
        ProductsPage.ClickAddToCartButton();
        ProductsPage.assertOnPopUpWindow();
        ProductsPage.assertOnAddedText(expectedAddedText);
        ProductsPage.assertOnMessage(expectedMessage);
        ProductsPage.assertOnContinueShoppingButton();
        ProductsPage.assertOnViewCartButton();
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
}
