package Examination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Examination {
    public class WebDriverManager {

        private static WebDriver driver;

        public static WebDriver getDriver() {
            if (driver == null) {
                // Initialize the WebDriver
                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
                driver = new ChromeDriver();
            }
            return driver;
        }
    }

    public class SearchProductSteps {
        private WebDriver driver;

        public SearchProductSteps() {
            driver = WebDriverManager.getDriver();
        }

        @When("I enter {string} in the search bar")
        public void i_enter_keyword_in_search_bar(String keyword) {
            WebElement searchBar = driver.findElement(By.id("searchBarId")); // Replace with actual locator
            searchBar.sendKeys(keyword);
        }

        @When("I click the 'Search' button")
        public void i_click_search_button() {
            WebElement searchButton = driver.findElement(By.id("searchButtonId")); // Replace with actual locator
            searchButton.click();
        }

        @Then("I should see a list of products related to {string}")
        public void i_should_see_list_of_products_related_to_keyword(String keyword) {
            WebElement searchResults = driver.findElement(By.id("searchResultsId"));
        }
    }

    public class WebDriverHooks {

        @Before
        public void setUp() {
            WebDriverManager.getDriver();
        }

        @After
        public void tearDown() {
            if (WebDriverManager.getDriver() != null) {
                WebDriverManager.getDriver().quit();
            }
        }
    }
}
