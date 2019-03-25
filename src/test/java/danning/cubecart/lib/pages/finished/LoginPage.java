package danning.cubecart.lib.pages.finished;

import danning.cubecart.lib.pages.root.CommonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonPage {

  public LoginPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(this.driver, this);
  }

  @FindBy(id = "username")
  WebElement usernameInputBox;
  @FindBy(id = "password")
  WebElement passwordInputBox;
  @FindBy(id = "login")
  WebElement loginBtn;

  public void setUsernameInputBox(String username) {
   sendKeys(usernameInputBox,username);
  }

  public void setPasswordInputBox(String password) {
    sendKeys(passwordInputBox,password);
  }

  public void clickOnLoginBtn() {
    clicksOn(loginBtn);
  }
}
