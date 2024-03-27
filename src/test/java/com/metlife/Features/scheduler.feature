Feature: Salesforce Scheduler
  I want to Login to Salesforce
  As a user
  I would like to access the Salesforce Scheduler

  Scenario1: Valid login
    Given user have a browser with salesforce application
    When user gave username
    And user gave password
    And user clicked on login
    Then user should able to login


