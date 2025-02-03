Feature: Home and Kitchen Module Testing 
Scenario: Search for an item in Home and Kitchen category
Given I am on the Naaptol homepage
When I search for "Microwave Oven"
Then I should see results related to "Microwave Oven"
