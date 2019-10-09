import org.openqa.selenium.By;

public class HomePage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _clickRegisterLink = By.className("ico-register");
    private By _clickLoginLink = By.xpath("//a[@class=\"ico-login\"]");


    public void clickOnRegister() {

        clickElement(_clickRegisterLink);
    }



public void logIn (){
        clickElement(_clickLoginLink);


}





}
