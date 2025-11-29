@runFirst
Feature: Selecting the train

  @tag1
  Scenario: Selecting the train
    Given User Launch browser 
		And Open URL "https://www.irctc.co.in/nget/train-search"
    #When the user select the train boarding station as "Hyderabad"
    #And the user enter the departure station as "Anantapur"
    #And the user select the travel date as "February 2024" 
    #And user click on the search button 
    #Then the system should display relevant travel details "IRCTC Next Generation eTicketing System"
    #And user enter the website and scroll near to train name "GARIBRATH EXP (12735)"
		#And click on  refresh on the specific class
		#And select the date of the train "Wed, 07 Feb"
		#And click on book now
		#And select the yes in the popup
    And close browser
    
    Scenario: opening the flipkart
    Given User Launch browser 
	And Open URL "https://www.flipkart.com/"
    And close browser
  