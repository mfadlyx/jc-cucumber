Feature: Recruitment Add Candidate

  Scenario: Admin Add new candidate
    Given Admin logged in
    And Admin go to menu recruitment
    When Admin click button Add
    And Admin enter firstname
    And Admin enter lastname
    And Admin enter email
    And Admin upload file resume
    And Admin click button save
    Then Admin redirect to page Application stage
    When Admin go to menu recruitment again
    And Admin click button view candidate
    Then Admin redirect to page Candidate profile