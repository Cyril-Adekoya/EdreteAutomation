package Handlers;

import Utilities.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WebHandlers {

    WebDriver driver;
    public WebHandlers (Hooks hooks ) {
        this.driver=hooks.getDriver();

    }
    //public void setCustomerNumber(String custNum){
       // driver.findElement(alertPopUpElement).sendKeys(custNum);
    //}
    public void locatealertSubmitButton(By by){
        driver.findElement(by).click();
    }
    public void catchTheAlert(){
        Alert alert=driver.switchTo().alert();
        alert.getText();
        alert.accept();

    }
    public void acceptAlert(){
        Alert acceptAlert=driver.switchTo().alert();
        acceptAlert.getText();
    }
    public void executealertIssues(String custNum){

        //this.setCustomerNumber(custNum);
        //this.locatealertSubmitButton();
        this.catchTheAlert();
        this.acceptAlert();


    }
    public void implicitWaitTest(By by){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(by).click();
        System.out.println("This will test implicit test");

    }
    public void explicitWaitTest(By by) {
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();



    }

    public void fluentWaitTest(By by){

        Wait<WebDriver> wait = new FluentWait<>(driver)

                .ignoring(NoSuchElementException.class);
        WebElement  clickSeleniumlink=wait.until(driver -> driver.findElement(by));
        clickSeleniumlink.click();
    }
    public void ScrollByVisibilityCommand(By by){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement Element=driver.findElement(by);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Element.click();
    }
    public void scrollWindowByPixelCommand(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(200,2000)");
    }
    public void scrollFullLengthCommand(){

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    public void doubleClickCommand(By by){

        Actions action=new Actions(driver);
        WebElement link=driver.findElement(by);
        action.doubleClick(link).perform();
        Alert alert=driver.switchTo().alert();
        System.out.println("Alert from double click"+alert.getText());
        alert.accept();
    }
    public void selectFromDropDownSingle(By by){
        WebElement element=driver.findElement(by);
        Select drpDownSelection=new Select(element);
        drpDownSelection.selectByVisibleText("NIGERIA");
        drpDownSelection.selectByIndex(4);
    }
    public void selectFromDropDownMultiple(By by) throws InterruptedException {
        WebElement element=driver.findElement(by);
        Select drpDownSelectionMulti=new Select(element);
        Thread.sleep(1000);
        //List<WebElement> elementzise=drpDownSelectionMulti.getOptions();
        //int iListSize=elementzise.size();
        for(int i=0;i<10;i++){
            String sValue=drpDownSelectionMulti.getOptions().get(i).getText();
            System.out.println(sValue);
            drpDownSelectionMulti.selectByIndex(i);
            Thread.sleep(10);
            drpDownSelectionMulti.selectByIndex(3);
        }
        driver.close();
    }
    public void selectElementByMouseHover(By by1,By by2,By by3) throws InterruptedException{

        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        WebElement menuOption=driver.findElement(by1);
        actions.moveToElement(menuOption).perform();
        Thread.sleep(2000);
        WebElement subMenuOption=driver.findElement(by2);
        Thread.sleep(2000);
        actions.moveToElement(subMenuOption).perform();
        WebElement selectMenuOption=driver.findElement(by3);
        Thread.sleep(2000);
        selectMenuOption.click();
        //driver.close();

    }
}
