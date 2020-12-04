Feature: Edurete Functional Test Home Page

  @RunEdu1_Done
  Scenario: Search for present of Website  with google
    Given I open browser and enter https://www.google.com/ in google
    And I entered https://edrete.com/ in search box and send
    And I clicked the text link of webname on search result
    Then I can see the WebSite home page displayed

  @RunEdu1
  Scenario: Check the links Tabs on Home Page to other pages
    Given I am on homepage of Edurate https://edrete.com/
    When I clicked on About US tab to open the About Us page
    And I can navigate forward to Courses Page
    And I clicked on Plans tab to open the Plan page on courses page
    And I can navigate forward to the Contact page
    Then I can navigate back to the Home page

    @RunEdu1
    Scenario: Check the socialMediaIconsOnHomePage
      Given I am on homepage of Edurate https://edrete.com/
      And I clicked on the facebook icon to load facebook page
      And I scrolled down the current page and clicked on twitter icon to open


