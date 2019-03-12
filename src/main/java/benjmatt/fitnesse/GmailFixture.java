package benjmatt.fitnesse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailFixture {

    // Variables
    private WebDriver driver;
    private String goToUrl;
    private String productName;

    private final String PATH_TO_CHROME_DRIVER = "/Users/Matthew/Downloads/chromedriver";




    // Set and get functions

    public void setGoToUrl(String goToUrl) {
        setupSeleniumWebDrivers();
        this.goToUrl = goToUrl;
        driver.get(goToUrl);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    // Helper Functions

    private void setupSeleniumWebDrivers() {
        try {
            if (driver == null) {
                System.out.println("Setting up ChromeDriver... ");
                System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME_DRIVER);
                driver = new ChromeDriver();
                System.out.print("Done!\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean searchForText(String text, String textToFind) {
        return text.contains(textToFind);
    }

    private void goTo(String url) {
        if (driver != null) {
            System.out.println("Going to " + url);
            driver.get(url);
        }
    }


}
