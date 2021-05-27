#Auto generated Octane revision tag
@BSPID1001REV0.2.0
Feature: Customer Profile
@TSCID2006
	Scenario: Add new profile
		Given Navigate to portal
		When add profile
		Then user added

@TSCID2007
	Scenario: Delete profile
		Given Navigate to portal
		When delete profile
		Then user deleted

@TSCID2008
	Scenario Outline: Update profile options
    	Given Navigate to portal
		When select option "<param1>" 
		When click <param2>  
		Then option updated

	Examples:
		| param1 | param2 |
		| a      | 1      |
		| b      | 2      |
