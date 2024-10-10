Feature: API Test with Rest Assured

  @sanity
  Scenario: Get user information
    Given I send a GET request to "/users/1"

  @sanity1
  Scenario: post user information
    Given I send a GET request to "/users/1"