@Elements
Feature: This feature is to test the elements page

  @BasicElementsPage
  Scenario: OpenElementsPages
    Given user launches the application
    Then user should land on Demo QA home page
    When user navigates to elements page
