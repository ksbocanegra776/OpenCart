@stories
Feature: Process of adding a category.
  As a user of the opencart web portal
  I need to enter the catalog menu
  To enter a new category

  @stories1
  Scenario: Enter a new category.
    Given that Karina logs in correctly
      | Username | password |
      | demo | demo    |
    When Select menu Catalog to reach the Category
    And Add a new category
    Then Karina you can save the new record.

