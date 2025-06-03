@tag
Feature: Open the Nile Airlines 
	@tag1
  Scenario Outline: To check the ticket booking in one way 
    Given User on nile airline home page 
    When To check the click flight tickets booking
    And To check the select a region from and to
    And To check a date "<Dates>"  
    And To check the adult child and infant and click search
    And To check Covid alert box and accept
    Then Open flex pricer availability 
		
		Examples:
		|Dates|
		|2023-06-27|			
 	
      
