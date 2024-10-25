import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.Assertion;
import org.testng.Assert;


import java.time.Duration;

public class ProductsPage {
    WebDriver driver;

    //constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By ProductsButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    private By SearchProductsTextField = By.xpath("//*[@id=\"search_product\"]");
    private By SearchProductsButton = By.xpath("//*[@id=\"submit_search\"]");
    private By AddToCartButton = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a");
    private By ExpectedPopUpWindow = By.xpath("//*[@id=\"cartModal\"]/div/div");
    private By ExpectedAddedText = By.xpath("//*[@id=\"cartModal\"]/div/div");
    private By ExpectedMessage = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[1]");
    private By ViewCartButton = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");
    private By ContinueShoppingButton = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");

    //actions
    public void NavigateToURL(String URL) {
        driver.get(URL);
    }
    public void ClickProductsButton() {
        driver.findElement(ProductsButton).click();
    }
    public void FillSearchTextField(String search){
        driver.findElement(SearchProductsTextField).sendKeys(search);
    }
    public void ClickSearchButton(){
        driver.findElement(SearchProductsButton).click();
    }
    public void ClickAddToCartButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(AddToCartButton).click();
    }

    //assertions
    public void assertOnPopUpWindow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(ExpectedPopUpWindow));
        Assert.assertTrue(driver.findElement(ExpectedPopUpWindow).isDisplayed());
    }
    public void assertOnAddedText(String expectedAddedText){
        String actualAddedField = driver.findElement(ExpectedAddedText).getText();
        Assert.assertEquals(actualAddedField, expectedAddedText);
    }
    public void assertOnMessage(String expectedMessage){
        String actualMessage = driver.findElement(ExpectedMessage).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    public void assertOnViewCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement viewCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(ViewCartButton));
        Assert.assertTrue(driver.findElement(ViewCartButton).isDisplayed());
    }
    public void assertOnContinueShoppingButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement continueShoppingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueShoppingButton));
        Assert.assertTrue(driver.findElement(ContinueShoppingButton).isDisplayed());
    }
}
