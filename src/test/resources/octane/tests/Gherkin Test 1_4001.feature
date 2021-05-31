#Auto generated Octane revision tag
@TID4001REV0.2.0
Feature: Customer Profile
  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | Nope   |
      | Sunday         | Nope   |