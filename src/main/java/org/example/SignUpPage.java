package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;

    //Constructor
    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    private By signUpTabButton = By.xpath("//a[@href=\"/login\"]");
    private By signUpHeader = By.xpath("//div[@class=\"signup-form\"]//h2");
    private By signUpNameTextField = By.xpath("//input[@data-qa=\"signup-name\"]");
    private By signUpEmailTextField = By.xpath("//input[@data-qa=\"signup-email\"]");
    private By signUpButton = By.xpath("//button[@data-qa=\"signup-button\"]");
    private By RadioButtonForMr = By.xpath("//*[@id=\"id_gender1\"]");
    private By RadioButtonForMrs = By.xpath("//*[@id=\"id_gender2\"]");
    private By PasswordTextField = By.xpath("//*[@id=\"password\"]");
    private By DayField = By.xpath("//*[@id=\"days\"]");
    private By MonthField = By.xpath("//*[@id=\"months\"]");
    private By YearField = By.xpath("//*[@id=\"years\"]");
    private By FirstNameTextField = By.xpath("//*[@id=\"first_name\"]");
    private By LastNameTextField = By.xpath("//*[@id=\"last_name\"]");
    private By AdressTextField = By.xpath("//*[@id=\"address1\"]");
    private By Country = By.xpath("//*[@id=\"country\"]");
    private By StateTextField = By.xpath("//*[@id=\"state\"]");
    private By CityTextField = By.xpath("//*[@id=\"city\"]");
    private By ZipCodeTextField = By.xpath("//*[@id=\"zipcode\"]");
    private By PhoneNumberTextField = By.xpath("//*[@id=\"mobile_number\"]");
    private By CreateAccountButton = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
    private By AccountCreatedHeader = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");



    //Actions
    public void NavigateToURL(String URL){
        driver.get(URL);
    }
    public void ClickSignUpTapButton(){
        driver.findElement(signUpTabButton).click();
    }
    public void FillSignUpNameTextField(String name){
        driver.findElement(signUpNameTextField).sendKeys(name);
    }
    public void FillSignUpEmailTextField(String email){
        driver.findElement(signUpEmailTextField).sendKeys(email);
    }
    public void ClickSignUpButton(){
        driver.findElement(signUpButton).click();
    }
    public void fillSignUpData(String name , String email){
        FillSignUpNameTextField(name);
        FillSignUpEmailTextField(email);
    }
    public void FillPasswordTextField(String password){
        driver.findElement(PasswordTextField).sendKeys(password);
    }
    public void FillFirstNameField(String firstName){
        driver.findElement(FirstNameTextField).sendKeys(firstName);
    }
    public void FillLastNameTextField(String lastName){
        driver.findElement(LastNameTextField).sendKeys(lastName);
    }
    public void FillAdressTextField(String adress){
        driver.findElement(AdressTextField).sendKeys(adress);
    }
    public void SelectCountry(){
        driver.findElement(Country).click();
    }
    public void FillStateTextField(String state){
        driver.findElement(StateTextField).sendKeys(state);
    }
    public void FillCityTextField(String city){
        driver.findElement(CityTextField).sendKeys(city);
    }
    public void FillZipCodeTextField(String zipCode){
        driver.findElement(ZipCodeTextField).sendKeys(zipCode);
    }
    public void FillPhoneNumberTextField(String phoneNumber){
        driver.findElement(PhoneNumberTextField).sendKeys(phoneNumber);
    }
    public void ClickCreateAccountButton(){
        driver.findElement(CreateAccountButton).click();
    }

//Assertions
    public void assertOnSignUpHeader(String expectedSignUpHeader){
        String actualSignUpHeader = driver.findElement(signUpHeader).getText();
    }
    public void assertOnAccountCreatedHeader(String expectedAccountCreatedHeader){
        String actualAcountCreatedHeader = driver.findElement(AccountCreatedHeader).getText();
    }

}
