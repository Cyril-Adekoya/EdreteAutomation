Feature: Edurete Functional Test

  @RunEdu1_hold
  Scenario: Search present of Website with google
    Given I open browser and enter https://www.google.com/ in google
    And I entered https://edrete.com/ in search box and send
    And I clicked the text link of webname on search result
    Then I can see the WebSite home page displayed

  @RunEdu1
  Scenario: Check link Tabs on Home Page to other pages
    Given I am on homepage of Edurate https://edrete.com/
    When I clicked on About US tab to open the About Us page
    And I can navigate forward to Courses Page https://edrete.com/courses/
    And I clicked on Plans tab to open the Plan page
    And I can navigate forward to the Contact page https://edrete.com/contact-us/
    Then I can navigate back to the Home page


