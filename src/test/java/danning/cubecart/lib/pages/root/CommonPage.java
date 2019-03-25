package danning.cubecart.lib.pages.root;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class CommonPage {
    protected WebDriver driver;
    private int defaultTimeOut = 10;


    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

    protected void waitUntilElementIsPresent(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, defaultTimeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    protected void clicksOn(WebElement element){
        waitUntilElementIsPresent(element);
        element.click();
    }
    protected void sendKeys(WebElement element, CharSequence charSequence){
        waitUntilElementIsPresent(element);
        element.sendKeys(charSequence);
    }
    protected void selectValue(WebElement element, String value){
        waitUntilElementIsPresent(element);
        Select select = new Select(element);
        select.selectByValue(value);
    }
    protected void selectVisibleText(WebElement element, String visibleText){
        waitUntilElementIsPresent(element);
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }
    protected void selectIndex(WebElement element, String index){
        waitUntilElementIsPresent(element);
        Select select = new Select(element);
        select.selectByIndex(Integer.valueOf(index));
    }
    protected boolean isDisplayed(WebElement element){
        waitUntilElementIsPresent(element);
        return element.isDisplayed();
    }
    protected void clickAction(WebElement element){
        waitUntilElementIsPresent(element);
        Actions actions = new Actions(driver);
        actions.click(element).build().perform();
    }
    protected WebElement findElement(By by){
        return driver.findElement(by);
    }
}
