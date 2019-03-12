package com.benjmattt.cucumber;

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
