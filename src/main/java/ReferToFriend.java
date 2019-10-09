import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferToFriend extends Utils {
LoadProp loadProp = new LoadProp();

private By _selectProduct = By.linkText("Apple MacBook Pro 13-inch");
private By _emailAFriendButton = By.xpath("//input[@value='Email a friend']");
private By _EmailAFriendField = By.id("FriendEmail");
private By _PersonalMassage = By.xpath("//textarea[@id=\"PersonalMessage\" ]");
private By _SendEmailButton = By.xpath("//input [@ value=\"Send email\" ]");
private By _actualMessage = By.xpath("//div[@class=\"result\"]");



public void referFriendWhenloggedIn() {

    clickElement(_selectProduct);
    clickElement(_emailAFriendButton);
    enterText(_EmailAFriendField, loadProp.getProperty("Friend_email"));
    enterText(_PersonalMassage, loadProp.getProperty("Massage"));
    clickElement(_SendEmailButton);
}

    public void testComparison() {

        Assert.assertEquals(getText(_actualMessage), "Your message has been sent.");


    }


}











