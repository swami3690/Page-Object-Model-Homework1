import org.testng.annotations.Test;

public class TestSuit  extends BaseTest{

HomePage homePage = new HomePage();
RegistrationPage registrationPage = new RegistrationPage();
RegistrationRusultPage registrationRusultPage = new RegistrationRusultPage();
Login login = new Login();
ReferToFriend referToFriend = new ReferToFriend();




@Test
    public  void  userShouldAbleToRegisterSuccessfully () {

    homePage.clickOnRegister();
    registrationPage.userEnterRegistrationDetails();

}
@Test

public void registerUserShouldBeAbleToReferProductToFriend()  {

    homePage.logIn();
    login.clickLogin();
    referToFriend.referFriendWhenloggedIn();
    referToFriend.testComparison();



}

@Test

    public  void  regsiterussershouldBeAbleToReferProductToFriend (){

    homePage.logIn();

    login.clickLogin();
    login.loginVisibility();

}







}
