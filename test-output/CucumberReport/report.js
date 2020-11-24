$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EduFunctionalTest.feature");
formatter.feature({
  "name": "Edurete Functional Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check link Tabs on Home Page to other pages",
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
  "location": "MyStepdefs.iAmOnHomepageOfEdurate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on About US tab to open the About Us page",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iClickedOnAboutUSTabToOpenTheAboutUsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can navigate forward to Courses Page https://edrete.com/courses/",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iCanNavigateForwardToCoursesPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on Plans tab to open the Plan page",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iClickedOnPlanTabToOpenPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can navigate forward to the Contact page https://edrete.com/contact-us/",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iCanNavigateForwardToTheContactPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can navigate back to the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iCanNavigateBackToTheHomePage()"
});
formatter.result({
  "status": "passed"
});
});