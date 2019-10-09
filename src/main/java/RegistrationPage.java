import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    LoadProp loadProp = new LoadProp();
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _passWord = By.id("Password");
    private By _confirmaPassword = By.id ("ConfirmPassword");
    private By _registerButton = By.id("register-button");






    public  void  userEnterRegistrationDetails (){

    enterText(_firstName,loadProp.getProperty("FirstName"));
    enterText(_lastName,loadProp.getProperty("LastName"));
    enterText(_email,loadProp.getProperty("email")+ randomDate()+"@gmail.com");
    System.out.println(loadProp.getProperty("email")+ randomDate()+"@gmail.com");
    enterText(_passWord , loadProp.getProperty("password"));
    enterText(_confirmaPassword ,loadProp.getProperty("cpassword"));
    clickElement(_registerButton);







    }




}
