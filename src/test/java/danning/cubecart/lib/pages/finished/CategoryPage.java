package danning.cubecart.lib.pages.finished;

import danning.cubecart.lib.pages.root.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends CommonPage {
  public CategoryPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(this.driver, this);
  }

  @FindBy(className = "success")
  private WebElement infoText;

  public boolean isCategorySuccessfulCreated() {
    waitUntilElementIsPresent(infoText);
    if (infoText.getText().equals("Category successfully created."))
      return true;
    else
      return false;
  }

  public boolean isCategorySuccessfulDeleted() {
    waitUntilElementIsPresent(infoText);
    if (infoText.getText().equals("Category successfully deleted."))
      return true;
    else
      return false;
  }

  @FindBy(xpath = "//a[text()='Add Category']")
  private WebElement addCategoryLink;

  public void clicksOnAddCategory() {
    clicksOn(addCategoryLink);
  }

  public boolean isAddCategoryLinkDisplayed() {
    return isDisplayed(addCategoryLink);
  }

  @FindBy(xpath = "//input[@id='status']/../img")
  private WebElement statusCheckBox;

  public void clicksOnStatusCheckBox() {
    clickAction(statusCheckBox);
  }

  @FindBy(xpath = "//input[@id='visible']/../img")
  private WebElement visibleCheckBox;

  public void clicksOnVisibleCheckBox() {
    clickAction(visibleCheckBox);
  }

  @FindBy(id = "name")
  private WebElement nameInputField;

  public void setName(String name) {
    sendKeys(nameInputField, name);
  }

  @FindBy(xpath = "//a[text()='Description']")
  private WebElement descriptionLink;

  public void clicksOnDescriptionLink() {
    clicksOn(descriptionLink);
  }

  @FindBy(xpath = "//iframe[contains(@class,'cke_wysiwyg_frame')]")
  WebElement textInputIFrame;

  public void switchToIFrame() {
    driver.switchTo().frame(textInputIFrame);
  }

  @FindBy(xpath = "//html/body")
  private WebElement descriptionTextInputField;

  public void setDescription(String description) {
    sendKeys(descriptionTextInputField, description);
  }

  public void switchBack() {
    driver.switchTo().parentFrame();
  }

  @FindBy(id = "cat_save")
  private WebElement saveBtn;

  public void clicksOnSaveBtn() {
    clicksOn(saveBtn);
  }

  public void fillCategoryInfo(String name, String description) {
    if (name==null) name="";
    if (description==null) description="";
    clicksOnStatusCheckBox();
    clicksOnVisibleCheckBox();
    setName(name);
    clicksOnDescriptionLink();
    switchToIFrame();
    setDescription(description);
    switchBack();
  }

  public void deleteCategory(String name) {
    String deleteXpath = "//tbody[@class='reorder-list ui-sortable']/tr/td[contains(text(),'" + name + "')]/..//a[@class='delete']";
    WebElement deleteLink = driver.findElement(By.xpath(deleteXpath));
    clicksOn(deleteLink);
    driver.switchTo().alert().accept();
  }
}
