import org.openqa.selenium.By;
import org.testng.Assert;

public class Login extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _enterUserName = By.name("Email");
    private By _enterUserPassword = By.xpath("//*[@id=\"Password\"]");
    private By _enterLogin = By.xpath("//form/div[3]/input");
    private By _checkCondition = By.xpath("//a[@class=\"ico-account\"]");




    public void clickLogin() {

        enterText(_enterUserName, loadProp.getProperty("Email"));
        enterText(_enterUserPassword, loadProp.getProperty("passwordTXT"));
        clickElement(_enterLogin);

    }



public void loginVisibility(){

        Assert.assertEquals(getText(_checkCondition),"My account");

}

}




   /* //click on login
    clickElement(By.xpath("//a[@class=\"ico-login\"]"));
    // enter email
    enterText(By.name("Email"), "testtest1@test.com");
    //password
    enterText(By.xpath("//input[@id=\"Password\"]"), "abcd1234");

    clickElement(By.xpath("//input[@class=\"button-1 login-button\"]"));

    //click on mac product
    clickElement(By.linkText("Apple MacBook Pro 13-inch"));
    //Email to friend
    clickElement(By.xpath("//div[@ class=\"email-a-friend\" ]"));
    //Enter a friend email
    enterText(By.id(("FriendEmail")), "arpi.shah09@gmial.com");
    //enter a personal email
    enterText((By.xpath("//textarea[@id=\"PersonalMessage\" ]")), "Good deal I think please have a  look");
    clickElement(By.xpath("//input [@ value=\"Send email\" ]"));*/













