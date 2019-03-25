package danning.cubecart;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import danning.cubecart.lib.json.JsonObject;
import danning.cubecart.lib.pages.finished.OrdersPage;
import danning.cubecart.lib.pages.finished.*;
import org.apache.commons.exec.OS;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"html:target/cucumber-report/login.html",
                "json:target/cucumber-report/login.json"},
        features = "src/test/java/danning/cubecart/features/cubecart.feature",
        glue = "danning.cubecart.stepdefs"
)

public class RunCukeTest {
  private static String url;

  protected static Map<String, String> lib;
  protected static LoginPage loginPage;
  protected static CategoryPage categoryPage;
  protected static AdminControlPanelPage adminControlPanelPage;
  protected static ProductsPage productsPage;
  protected static ManufacturerPage manufacturerPage;
  protected static BulkPriceChangePage bulkPriceChangePage;
  protected static PromotionalCodePage promotionalCodePage;
  protected static OrdersPage ordersPage;
  protected static NewsletterPage newsletterPage;
  protected static WebDriver driver;

  @BeforeClass
  public static void setUp() {
    //loading data
    JsonObject object = new JsonObject();
    lib = object.get();
    url = lib.get("url");

    boolean os = OS.isFamilyUnix();
    if (os) {
      System.setProperty("webdriver.chrome.driver", "/usr/stepdefs/chromedriver");
      ChromeOptions co = new ChromeOptions();
      co.addArguments(Arrays.asList("-headless", "-disable-gpu", "window-size=1200,1100"));
      driver = new ChromeDriver(co);
    } else {
      System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
    }
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    loginPage = new LoginPage(driver);
    categoryPage = new CategoryPage(driver);
    productsPage = new ProductsPage(driver);
    adminControlPanelPage = new AdminControlPanelPage(driver);
    manufacturerPage = new ManufacturerPage(driver);
    bulkPriceChangePage = new BulkPriceChangePage(driver);
    promotionalCodePage = new PromotionalCodePage(driver);
    ordersPage = new OrdersPage(driver);
    newsletterPage =new NewsletterPage(driver);
    driver.get(url);
  }
  @Test
  public void testRunning(){

  }

  @AfterClass
  public static void tearDown() {
    driver.close();
    driver.quit();
  }
}
