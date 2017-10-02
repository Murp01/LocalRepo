Feature: Newsletter signup

Scenario: add all mandatory details and send form
Given the user opens the newsletter page
Then opens the form
And completes all mandatory fields
And clicks submite
Then the form will send
And a success message will appear