Feature: To test the high level functionality of zoo site

  Scenario: To set the start date
    Given I am on the zoo site
    When I click on the "Adoption"
    Then I set the start date to "Today"
    Then I close the broswer

  Scenario: To populate the contact form
    Given I am on the zoo site
    When I click on the "Contact"
    Then I populate the contact form
    Then I close the broswer
