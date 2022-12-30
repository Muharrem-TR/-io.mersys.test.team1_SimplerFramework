Feature: Document Types under Parameters Setup Functionality

  Background:
    And Go to Document Types via left nav

  @Regression @DocumentTypes @DocumentTypesNegative
  Scenario: Add Document Types
    And Click Add Button
    And Enter name as "MuharremTR2626" and description as "Muharrem Karapazar Eskişehir 26"
    And Fill in the form content
    And Click the TAB key
    And Click the Save button
    Then Success message should be displayed


#  @Regression @DocumentTypes @DocumentTypesNegative
#  Scenario: Edit Document Types
#
#    And Click on the element in the left Nav
#      | setupOne      |
#      | parameters    |
#      | documentTypes |
#
#    And User sending the keys in Dialog content
#      | searchInput | MuharremTR2626 |
#
#    And Click on the element in the Dialog content
#      | searchButton |
#      | editButton   |
#
#    And User sending the keys in Dialog content
#      | nameInput   | MuharremTR2626Edit            |
#      | description | M.K. Eskisehir 26 Duzenlendi. |
#
#    And Click on the element in the Form Content
#      | switchUseCamera  |
#      | stageSelect      |
#      | selectEmployment |
#      | selectContract   |
#
#    And Click the TAB key
#
#    And Click on the element in the Dialog content
#      | saveButton |
#
#    Then Success message should be displayed
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
