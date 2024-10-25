import org.example.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTests {
    WebDriver driver;
    SignUpPage SignUpPage;

    //variables
    String URL = "https://automationexercise.com/";
    String name = "youssef";
    String email = "ososjr00@outlook.com";
    String expectedSignUpHeader = "Enter Account Information";
    String password = "abc123";
    String firstName = "youssef";
    String lastName = "ossama";
    String adress = "ahmed oraby";
    String state = "Giza";
    String city = "agouza";
    String zipCode = "12345";
    String phoneNumber = "01028063065";
    String expectedAccountCreatedHeader = "Account Created!";


    @BeforeMethod
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        SignUpPage = new SignUpPage(driver);
        SignUpPage.NavigateToURL(URL);
        SignUpPage.ClickSignUpTapButton();
    }

    @Test
    public void signUpTC01(){
        SignUpPage.assertOnSignUpHeader(expectedSignUpHeader);
        SignUpPage.fillSignUpData(name,email);
        SignUpPage.ClickSignUpButton();
        SignUpPage.FillPasswordTextField(password);
        SignUpPage.FillFirstNameField(firstName);
        SignUpPage.FillLastNameTextField(lastName);
        SignUpPage.FillAdressTextField(adress);
        SignUpPage.FillStateTextField(state);
        SignUpPage.FillCityTextField(city);
        SignUpPage.FillZipCodeTextField(zipCode);
        SignUpPage.FillPhoneNumberTextField(phoneNumber);
        SignUpPage.ClickCreateAccountButton();
       // SignUpPage.assertOnAccountCreatedHeader(expectedAccountCreatedHeader);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

