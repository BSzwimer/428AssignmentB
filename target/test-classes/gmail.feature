Feature: Gmail

  Scenario: Sending an email to a recipient after attaching an image
    Given I am logged in as a Gmail user
    And I want to compose an email with an image
    When I Select the compose button the email screen should pop up
    Then I can fill in the recipient, subject and message field for one attachment
    When I click the attach icon
    Then I should be able to select an image and upload it by selecting open
    Then The attachment should be a part of the email
    When I click Send
    Then the email should be sent
    And I am returned to the main Gmail page

  Scenario: Sending an email to a recipient after attaching a zip file
    Given I am logged in as a Gmail user
    And I want to compose an email with a zip file
    When I Select the compose button the email screen should pop up
    Then I can fill in the recipient for, subject and message field for the ZIP file
    When I click the attach icon
    Then I should be able to select the zip file and upload it by selecting open
    Then The attachment should be a part of the email
    When I click Send
    Then the email should be sent
    And I am returned to the main Gmail page

  Scenario: Sending an email to a recipient after attaching a file with no subject or message field
    Given I am logged in as a Gmail user
    And I want to compose an email with a Word Document with no subject or message
    When I Select the compose button the email screen should pop up
    Then I can fill in just the recipient field
    When I click the attach icon
    Then I should be able to select a word document and upload it by selecting open
    Then The attachment should be a part of the email
    When I click Send
    Then A warning message should pop up
    When I click OK
    Then the email should be sent
    And I am returned to the main Gmail page

  Scenario: Sending an email to two recipients after attaching a file
    Given I am logged in as a Gmail user
    And I want to compose an email to two recipients with a dot s file
    When I Select the compose button the email screen should pop up
    Then I can fill in the recipient field with two different emails, subject and message field
    When I click the attach icon
    Then I should be able to select a dot s file and upload it by selecting open
    Then The attachment should be a part of the email
    When I click Send
    Then the email should be sent
    And I am returned to the main Gmail page

  Scenario: Sending an email to a recipient after attaching a pdf
    Given I am logged in as a Gmail user
    And I want to compose an email with a pdf attached
    When I Select the compose button the email screen should pop up
    Then I can fill in the recipient, subject and message field for the PDF
    When I click the attach icon
    Then I should be able to select the pdf and upload it by selecting open
    Then The attachment should be a part of the email
    When I click Send
    Then the email should be sent
    And I am returned to the main Gmail page