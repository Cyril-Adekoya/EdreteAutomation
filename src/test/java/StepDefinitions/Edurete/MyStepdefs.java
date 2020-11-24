package StepDefinitions.Edurete;

import Utilities.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.EduRete.EdureteHomePage;

import java.io.IOException;

public class MyStepdefs {
    WebDriver driver;
    EdureteHomePage edureteHomePage;
    public MyStepdefs (Hooks hooks) {

        this.driver= hooks.getDriver();
        edureteHomePage=new EdureteHomePage(hooks);

    }

    @Given ( "I open browser and enter (.*) in google" )
    public void iOpenBrowserAndEnterWebnameInGoogle (String url ){
        edureteHomePage.lunchGoogleHomePage(url);
    }
    @And ( "I entered (.*) in search box and send" )
    public void iEnteredHttpEdereComInSearchBoxAndSend (String item ) {
        edureteHomePage.enterSearchWordInGoogle(item);
    }
    @And ( "I clicked the text link of webname on search result" )
    public void iClickedTheTextLinkOfWebnameOnSearchResult ( ) {
        edureteHomePage.clickTheSearchTextReturned();
    }

    @Then ( "I can see the WebSite home page displayed" )
    public void iCanSeeTheWebSiteHomePageDisplayed ( ) throws IOException {
        edureteHomePage.assertTheTextResult();
    }


    @Given ( "I am on homepage of Edurate (.*)" )
    public void iAmOnHomepageOfEdurate (String url ) {
        edureteHomePage.navigateToUrl(url);
    }

    @When ( "I clicked on About US tab to open the About Us page" )
    public void iClickedOnAboutUSTabToOpenTheAboutUsPage ( ) throws IOException {
        edureteHomePage.selectAboutPageTab();
    }
    @And ( "I can navigate forward to Courses Page (.*)" )
    public void iCanNavigateForwardToCoursesPage (String url ) {
        edureteHomePage.navigateForwardToNextTab(url);
    }

    @When ( "I clicked on Courses tab to open the Courses page" )
    public void iClickedOnCoursesTabToOpenTheCoursesPage ( ) {
    }
    @And ( "I clicked on Plans tab to open the Plan page" )
    public void iClickedOnPlanTabToOpenPage() {
        //edureteHomePage.navigateForwardToNextTab(url);
        edureteHomePage.goToPlanPageWithTab();
    }
    @And ( "I can navigate forward to the Contact page (.*)" )
    public void iCanNavigateForwardToTheContactPage (String url ) {
        edureteHomePage.navigateForwardToNextTab(url);
    }
    @Then ( "I can navigate back to the Home page" )
    public void iCanNavigateBackToTheHomePage ( ) {
        edureteHomePage.navigateBackToHomePageFromCurrentPage();
    }
}
