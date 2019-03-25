package danning.cubecart.lib.pages.finished;

import danning.cubecart.lib.pages.root.CommonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsletterPage extends CommonPage {
  public NewsletterPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(this.driver, this);
  }
  @FindBy(xpath = "//a[contains(text(),'Create Newsletter')]")
  private WebElement createNewsletterLink;
  public void clicksOnCreateNewsletterLink() {
    clicksOn(createNewsletterLink);
  }

@FindBy(id = "email_subject")
  private WebElement email_subject;
  @FindBy(id = "sender_name")
  private WebElement sender_name;
  @FindBy(id = "sender_email")
  private WebElement sender_email;
  public void setEmail_subject(String name) {
    sendKeys(email_subject, name);
  }
  public void setSender_name(String name) {
    sendKeys(sender_name, name);
  }
  public void setSender_email(String name) {
    sendKeys(sender_email, name);
  }
  @FindBy(xpath = "//a[contains(text(),'HTML Content')]")
  private WebElement htmlContentLink;
  public void clicksOnHtmlContentLink() {
    clicksOn(htmlContentLink);
  }

  @FindBy(xpath = "//div[@id='cke_1_contents']//iframe")
  private WebElement htmlContentFrame;
  @FindBy(xpath = "//html/body")
  private WebElement textInputField;
  public void setDescription(String content) {
    driver.switchTo().frame(htmlContentFrame);
    sendKeys(textInputField, content);
    driver.switchTo().parentFrame();
  }
  public void fill(String subject,String senderName,String senderEmail,String newsletterContents){
    setEmail_subject(subject);
    setSender_name(senderName);
    setSender_email(senderEmail);
    clicksOnHtmlContentLink();
    setDescription(newsletterContents);
    clicksOnSaveBtn();
  }
  @FindBy(xpath = "//input[@value='Save']")
  private WebElement saveBtn;
  public void clicksOnSaveBtn(){
    clicksOn(saveBtn);
  }
  @FindBy(className = "success")
  private WebElement infoText;
  public boolean isNewsletterSuccessfulCreated() {
    waitUntilElementIsPresent(infoText);
    if (infoText.getText().equals("Newsletter Saved."))
      return true;
    else
      return false;
  }
}
