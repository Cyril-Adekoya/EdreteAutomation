$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EduFunctionalTest.feature");
formatter.feature({
  "name": "Edurete Functional Test Home Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the links Tabs on Home Page to other pages",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RunEdu1"
    }
  ]
});
formatter.step({
  "name": "I am on homepage of Edurate https://edrete.com/",
  "keyword": "Given "
});
formatter.match({
  "location": "EduFunctionalTestStepdef.iAmOnHomepageOfEdurete(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on About US tab to open the About Us page",
  "keyword": "When "
});
formatter.match({
  "location": "EduFunctionalTestStepdef.iClickedOnAboutUSTabToOpenTheAboutUsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can navigate forward to Courses Page",
  "keyword": "And "
});
formatter.match({
  "location": "EduFunctionalTestStepdef.iCanNavigateForwardToCoursesPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on Plans tab to open the Plan page on courses page",
  "keyword": "And "
});
formatter.match({
  "location": "EduFunctionalTestStepdef.iClickedOnCoursesTabToOpenTheCoursesPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can navigate forward to the Contact page",
  "keyword": "And "
});
formatter.match({
  "location": "EduFunctionalTestStepdef.iCanNavigateForwardToTheContactPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can navigate back to the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "EduFunctionalTestStepdef.iCanNavigateBackToTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check the socialMediaIconsOnHomePage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RunEdu1"
    }
  ]
});
formatter.step({
  "name": "I am on homepage of Edurate https://edrete.com/",
  "keyword": "Given "
});
formatter.match({
  "location": "EduFunctionalTestStepdef.iAmOnHomepageOfEdurete(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on the facebook icon to load facebook page",
  "keyword": "And "
});
formatter.match({
  "location": "EduFunctionalTestStepdef.iClickedOnTheInstergramIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scrolled down the current page and clicked on twitter icon to open",
  "keyword": "And "
});
formatter.match({
  "location": "EduFunctionalTestStepdef.iScrolledDownTheCurrentPageAndClickedOnTwitterIconToOpen()"
});
formatter.result({
  "status": "passed"
});
});