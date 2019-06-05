Feature: Post welcome message

  @tags1
  Scenario Outline: Post Welcome message
    Given User sets up the Welcome Message request in proper "<Environment>"
    And User uses the following parameters:
      | "<Header1>" |
    #	| "<Header2>" |
    #	| "<QueryParam>" |
    When User sends the request with "<GetWelomeMessageData>" in the "<JsonTemplate>"
    Then User should get back the proper response

    Examples: 
      | Environment | Header1 | GetWelomeMessageData  | JsonTemplate    |
      | QAENV       | HDR01   | getWelcomeMessageData | WelcomeMsg.json |
