package com.kevinnam.cucumber;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.annotation.en_scouse.An;
import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

import java.net.MalformedURLException;

public class StepDefinitions {

    // Variables
    private WebDriver driver;
    private final String PATH_TO_CHROME_DRIVER = "/Users/Matthew/Downloads/chromedriver";
    private final String PRODUCT_NAME = "Monoprice 115365 Monoprice Select Mini 3D Printer";
    private final String DELETE_BTN_NAME = "submit.delete.C3NLW69582M4B4";
    private final String CART_URL = "https://www.amazon.ca/gp/cart/view.html/ref=nav_cart";
    private final String ADD_TO_CART_BTN = "add-to-cart-button";
    private final String ACTIVE_CART = "sc-active-cart";
    private final String CHECKOUT_BTN = "sc-proceed-to-checkout";

    private final String PRODUCT_URL= "https://mail.google.com/mail/#inbox?compose=new";

    // Given
    @Given("^I am logged in as a Gmail user$")
    public void loggedIntoGmail() throws Throwable {
        setupSeleniumWebDrivers();
        goTo(PRODUCT_URL);
        driver.findElement(By.id("identifierId")).sendKeys("ecseassignmentb627@gmail.com");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("SoftwareEng123");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        Thread.sleep(4000);
//        goTo(PRODUCT_URL);
//
//        Thread.sleep(4000);
//        //driver.wait().until(ExpectedConditions.elementToBeClickable(By.xpath(".//textarea[contains(@aria-label, 'To')]")));
//        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).click();
//        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).sendKeys("mattyz36@me.com");
//        driver.findElement(By.name("subjectbox")).click();
//        driver.findElement(By.name("subjectbox")).sendKeys("efgh");
//        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
//        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).sendKeys("This is an auto-generated mail");
//        //driver.findElement(By.xpath("//span[@class='T-I J-J5-Ji T-I-KE L3']")).click();
//        //driver.close();
//        //click on attachment
//        driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
//        Thread.sleep(3000);
//        Runtime.getRuntime().exec("osascript "+"/Users/Matthew/Desktop/upload_image.scpt");
//        Thread.sleep(30000);
//
//        driver.findElement(By.xpath("//div[text()='Send']")).click();
//
//        //use autoit tool to attach a file
//        //Runtime.getRuntime().exec("C:Desktop/Attach/6c3bfdec92fad54896275802f938bd83.29.jpg");
//        // enter the file path onto the file-selection input field
//        //WebElement upload = driver.findElement(By.id("myfile"));
//        //upload.sendKeys("/Users/Matthew/Desktop/6c3bfdec92fad54896275802f938bd83.29.jpg");
//
//
//
//        Thread.sleep(10000); //wait for 10sec to upload file
    }

    @And("^I want to compose an email with an image$")
    public void composeAnEmailWithImageAttachment()throws Throwable{
        Thread.sleep(4000);
        System.out.println("Composing an email with image");
    }
    @When("^I Select the compose button the email screen should pop up$")
    public void composeAnEmailButton() throws Throwable{
        Thread.sleep(4000);
        System.out.println("Selecting compose email button");
        goTo(PRODUCT_URL);
        //Thread.sleep(4000);
    }
    @Then("$The email screen should pop up$")
    public void emailScreenShowUp() throws Throwable{
        Thread.sleep(4000);
        System.out.println("Email screen popping up");

    }
    @Then("^I can fill in the recipient, subject and message field for one attachment$")
    public void fillInRecipientSubjectMessageFieldForOneAttachment() throws Throwable{
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).click();
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).sendKeys("matthew@hotmail.com");
        driver.findElement(By.name("subjectbox")).click();
        driver.findElement(By.name("subjectbox")).sendKeys("efgh");
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).sendKeys("This is an auto-generated mail");
    }

    @Then("^I can fill in the recipient, subject and message field for the PDF$")
    public void fillInRecipientSubjectMessageFieldForTwoAttachment() throws Throwable{
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).click();
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).sendKeys("jasonzdfgoltak@me.com");
        driver.findElement(By.name("subjectbox")).click();
        driver.findElement(By.name("subjectbox")).sendKeys("efgh");
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).sendKeys("This is an auto-generated mail");
    }
    @Then("^I can fill in the recipient for, subject and message field for the ZIP file$")
    public void fillInFieldsForZip() throws Throwable{
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).click();
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).sendKeys("benjiszwimsdgerrr@me.com");
        driver.findElement(By.name("subjectbox")).click();
        driver.findElement(By.name("subjectbox")).sendKeys("efgh");
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).sendKeys("This is an auto-generated mail");
    }
    @When("^I click the attach icon$")
    public void attachIcon() throws Throwable{
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
    }

    @Then("^I should be able to select an image and upload it by selecting open$")
    public void attachImage() throws Throwable{
        Thread.sleep(4000);
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
        Runtime.getRuntime().exec("osascript "+"/Users/Matthew/Desktop/upload_image.scpt");
        Thread.sleep(10000);
    }

    @Then("^I should be able to select the zip file and upload it by selecting open$")
    public void attachZip() throws Throwable{
        Thread.sleep(4000);
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
        Runtime.getRuntime().exec("osascript "+"/Users/Matthew/Desktop/zip_upload.scpt");
        Thread.sleep(10000);
    }
    @Then("^The attachment should be a part of the email$")
    public void theAttachmentIsPartOfEmail() throws Throwable{
        System.out.print("Email is a part");
    }
    @When("^I click Send$")
    public void clickSend() throws Throwable{
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[text()='Send']")).click();
    }
    @Then("^the email should be sent$")
    public void theEmailIsSent() throws Throwable{
        System.out.print("Email is sent");
    }
    @And("^I am returned to the main Gmail page$")
    public void returnedToMainPage() throws Throwable {
        System.out.println("Back on main page");
    }

    @And("^I want to compose an email with a zip file$")
    public void composeAnEmailWithZipFile()throws Throwable{
        Thread.sleep(4000);
        System.out.println("Composing an email with zip file");
    }
    @And("^I want to attach another file$")
    public void attachAnotherFile() throws Throwable{
        System.out.println("attach another file");
        Thread.sleep(10000);
    }

    @And("^I want to compose an email with a Word Document with no subject or message$")
    public void noMessageOrSubjectPrint() throws Throwable{
        System.out.println("sending email without a subject or message");
    }
    @Then("^I can fill in just the recipient field$")
    public void fillInJustRecipient() throws Throwable{
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).click();
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).sendKeys("benfasfsdfgdasj@me.com");
    }

    @Then("^I should be able to select a word document and upload it by selecting open$")
    public void attachWordDocument() throws Throwable{
        Thread.sleep(4000);
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
        Runtime.getRuntime().exec("osascript "+"/Users/Matthew/Desktop/upload_wordDocument.scpt");
        Thread.sleep(10000);
    }
    @Then("^A warning message should pop up$")
    public void warningPopUp() throws Throwable{
        System.out.println("warning");
    }

    @When("^I click OK$")
    public void clickOK() throws Throwable{
        Thread.sleep(4000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @And("^I want to compose an email to two recipients with a dot s file$")
    public void composeTwoPeople() throws Throwable{
        System.out.println("sending email to two people");
    }

    @Then("^I should be able to select a dot s file and upload it by selecting open$")
    public void attachDotS() throws Throwable{
        Thread.sleep(4000);
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
        Runtime.getRuntime().exec("osascript "+"/Users/Matthew/Desktop/upload_s.scpt");
        Thread.sleep(10000);
    }

    @Then("^I can fill in the recipient field with two different emails, subject and message field$")
    public void fillInTwoRecipientsWithSubjectAndMessage() throws Throwable{
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).click();
        driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]")).sendKeys("zoltydsgtak@me.com bennyssadzwimer@me.com");
        driver.findElement(By.name("subjectbox")).click();
        driver.findElement(By.name("subjectbox")).sendKeys("efgh");
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).sendKeys("This is an auto-generated mail");
    }

    @And("^I want to compose an email with a pdf attached$")
    public void composeEmailWithPDF() throws Throwable{
        System.out.println("sending email to with PDF");
    }

    @Then("^I should be able to select the pdf and upload it by selecting open$")
    public void attachPDF() throws Throwable{
        Thread.sleep(4000);
        driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).click();
        Runtime.getRuntime().exec("osascript "+"/Users/Matthew/Desktop/upload_pdf.scpt");
        Thread.sleep(10000);
    }

    @And("^I have a product that exists in my shopping cart$")
    public void iHaveAProductThatExistsInMyShoppingCart() throws Throwable {
        // Go to a product page
        goTo(PRODUCT_URL);

        // Add a product to shopping cart
        System.out.println("Attempting to find Add to Cart button.. ");
        WebElement btn = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.id(ADD_TO_CART_BTN)));
        System.out.print("Found!\n");
        btn.click();
        System.out.println("Clicking Add to Cart button");

        // Return to cart
        goTo(CART_URL);
    }

    @And("^my shopping cart is empty$")
    public void myShoppingCartIsEmpty() throws Throwable {
        goTo(CART_URL);

        // Wait for presence of current active cart
        WebElement cart = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id(ACTIVE_CART)));

        // If cart is not empty, delete whatever is in it
        if (!searchForText(cart.getText(), "empty")) {
            WebElement btn = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.elementToBeClickable(By.name(DELETE_BTN_NAME)));
            btn.click();
        }
    }

    @And("^I have the same product that already exists in my shopping cart$")
    public void iHaveTheSameProductThatAlreadyExistsInMyShoppingCart() throws Throwable {
        iHaveAProductThatExistsInMyShoppingCart();
    }

    // When
    @When("^I press \"Delete\"$")
    public void iPressDelete() throws Throwable {
        // Attempt to find a delete button and click on it
        try {
            System.out.println("Attempting to find delete button... ");
            WebElement btn = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.elementToBeClickable(By.name(DELETE_BTN_NAME)));
            System.out.print("Found!\n");
            btn.click();
            System.out.println("Clicking delete button.");
        } catch (Exception e) {
            System.out.println("No delete button present");
        }
    }

    @When("^I press \"Add to cart\"$")
    public void iPressAddToCart() throws Throwable {
        goTo(PRODUCT_URL);
        // Attempt to find add to cart button and click on it
        try {
            System.out.println("Attempting to find Add to cart button... ");
            WebElement btn = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.elementToBeClickable(By.id(ADD_TO_CART_BTN)));
            System.out.print("Found!\n");
            btn.click();
            System.out.println("Clicking add to cart button");
        } catch (Exception e) {
            System.out.println("No add to cart button present");
        }
    }

    // Then
    @Then("^the product should exist in my shopping cart$")
    public void theProductShouldExistInMyShoppingCart() throws Throwable {
        goTo(CART_URL);

        // Attempt to find active cart
        WebElement cart = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id(ACTIVE_CART)));

        // Product name should be in active cart
        Assert.assertTrue(searchForText(cart.getText(), PRODUCT_NAME));
    }

    @Then("^the product should no longer exist in my shopping cart$")
    public void theProductShouldNoLongerExistInMyShoppingCart() throws Throwable {
        goTo(CART_URL);

        // Attempt to find active cart
        WebElement cart = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id(ACTIVE_CART)));

        // Product name should not be in active cart
        Assert.assertFalse(searchForText(cart.getText(), PRODUCT_NAME));
    }

    @Then("^there is nothing to delete from the shopping cart$")
    public void thereIsNothingToDeleteFromTheShoppingCart() throws Throwable {
        // Attempt to find a delete button
        try {
            System.out.println("Attempting to find a delete button... ");
            WebElement btn = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.elementToBeClickable(By.name(DELETE_BTN_NAME)));
            btn.click();
            Assert.fail("Delete button should not be present");
        } catch (Exception e) {
            System.out.println("No delete button present");
        }
    }

    @And("^the quantity of the product should be equal to two$")
    public void theQuantityOfTheProductShouldBeEqualToTwo() throws Throwable {
        // Attempt to find quantity
        System.out.println("Attempting to find quantity... ");
        WebElement dropDown = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("a-dropdown-prompt")));
        System.out.print("Found!\n");

        // Quantity should be equal to two
        Assert.assertTrue(searchForText(dropDown.getText(), "2"));
    }

    @And("^the checkout button exists$")
    public void theCheckoutButtonExists() throws Throwable {
        // Attempt to find checkout button
        try {
            System.out.println("Attempting to find checkout button");
            WebElement checkoutBtn = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className(CHECKOUT_BTN)));
            System.out.println("Found checkout button.");
            driver.quit();
        } catch (Exception e) {
            Assert.fail("No checkout button found. Should have been present.");
        }
    }

    @And("^the checkout button does not exist$")
    public void theCheckoutButtonDoesNotExist() throws Throwable {
        // Attempt to find checkout button
        try {
            System.out.println("Attempting to find checkout button... ");
            WebElement checkoutBtn = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className(CHECKOUT_BTN)));
            Assert.fail("Checkout button was found. Should have not be present.");
        } catch (Exception e) {
            System.out.print("None found!\n");
            driver.quit();
        }
    }

    // Helper functions
    private void setupSeleniumWebDrivers() throws MalformedURLException {
        if (driver == null) {
            System.out.println("Setting up ChromeDriver... ");
            System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME_DRIVER);
            driver = new ChromeDriver();
            System.out.print("Done!\n");
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
