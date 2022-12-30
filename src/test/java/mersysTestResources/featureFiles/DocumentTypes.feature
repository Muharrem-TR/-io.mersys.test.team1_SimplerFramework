Feature: Document Types under Parameters Setup Functionality

  Background:
    And Go to Document Types via left nav

  @Regression @DocumentTypes @DocumentTypesNegative
  Scenario: Add Document Types
    And Click Add Button
    And Enter name as "MuharremTR2626" and description as "Muharrem Karapazar Eskişehir 26" for Document Types
    And Fill in the form content for Document Types
    And Click the TAB key
    And Click the Save button
    Then Success message should be displayed


  @Regression @DocumentTypes @DocumentTypesNegative
  Scenario: Edit Document Types
    And Type "MuharremTR2626" in the search field
    And Press the search button and edit the result
    And Enter name as "MuharremTR2626Edit" and description as "M.K. Eskisehir 26 Duzenlendi." for Document Types
    And Fill in form two content for Document Types
    And Click the TAB key
    And Click the Save button
    Then Success message should be displayed

#
#
#  @Regression @DocumentTypes @DocumentTypesNegative
#  Scenario: Delete Document Types
#
#    And Click on the element in the left Nav
#      | setupOne      |
#      | parameters    |
#      | documentTypes |
#
#    And User delete item from Dialog
#      | MuharremTR2626Edit |
#
#    Then Success message should be displayed
#
#
#  @Regression @DocumentTypesNegative
#  Scenario: Negative Delete Document Types
#
#    And Click on the element in the left Nav
#      | setupOne      |
#      | parameters    |
#      | documentTypes |
#
#    And User sending the keys in Dialog content
#      | searchInput | MuharremTR2626Edit |
#
#    And Click on the element in the Dialog content
#      | searchButton |
#
#    Then Verify that there is no data to display
