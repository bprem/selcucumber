Feature: Registrtion.

  Scenario Outline: Registar user
    Given navigate to application
    When user click on sign in link
    Then registration firm open
    And enter first Name "<firstName>"
    And enter last Name "<lastName>"
    And select day "<day>"
    And select month "<month>"
    And select year "<year>"
    And enter your Email address "<emailAddress>"
    And enter your address last Name "<addressLastName>"
    And enter your company Name "<addressCompanyName>"
    And Select mobile phone nymber "<mobilePhoneNumber>"
    And Assign an address alias "<addressAlias>"
    And click on registration button
    Then verify Registration success message

    Examples: 
      | firstName    | lastName      | day | month    | year |   emailAddress    	 |   addressCompanyName    | mobilePhoneNumber | addressAlias  |
      | firstNameone | lastNameone   |   3 | 2 				| 2013 | addressFirstNameone |   addressCompanyNameone |        9999999999 | addressAlias1 |
      | firstNametwo | lastNametwo   |   5 | 3     		| 2010 | addressFirstNametwo |   addressCompanyNametwo |        9999999999 | addressAlias2 |