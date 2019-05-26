Feature: Fetch tweets from Twitter Home timeline

  Scenario: Title of your scenario
    Given I need to fetch "1" tweet from the home timeline
    When I send the request to fetch the tweets
    Then The API should return a proper response
    And The Id in the response should not be null
    And The text field in the response should not be null
    And The Following parameter in the response should be "true"  