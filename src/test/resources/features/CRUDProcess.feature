@tarefa
Feature: CRUD Process

  Background:
    Given the user is on Agapito Server page
    And the user clicks on Process menu
    And the user clicks on new process button
    And the user fills "vara" with value equal "teste"
    And the user fills "numero_processo" with value equal "23"
    And the user fills "natureza" with value equal "divorcio"
    And the user fills "partes" with value equal "Augusto x Aline"
    And the user selects urgency with value equal "Sim"
    And the user clicks on arbitramento equals "Não"
    And the user fills "assistente_social" with value equal "Regina"
    And the user fills "data_entrada" with value equal "2019-10-20"
    And the user fills "data_saida" with value equal ""
    And the user fills "data_agendamento" with value equal ""
    And the user fills "status" with value equal "Aguardando"
    And the user fills "observacao" with value equal ""
    And the user clicks on save button

  Scenario: Create a new process
    Then the user should see "Processo foi criado com sucesso." into view process page

  Scenario Outline: Read a process
      Given the user backs to the process grid
      When the user clicks on show button
      Then the user should see "<field>" with value equal "<value>"
      And the user should see "<field1>" with value equal "<value1>"
#      And the user should see "natureza" with value equal "divorcio"
#      And the user should see "partes" with value equal "Augusto x Aline"
#      And the user should see "urgente" with value equal "Sim"
#      And the user should see "arbitramento" with value equal "Não"
#      And the user should see "as_social" with value equal "Regina"
#      And the user should see "dt_entrada" with value equal "2019-10-20"
#      And the user should see "dt_saida" with value equal ""
#      And the user should see "dt_agendamento" with value equal ""
#      And the user should see "status" with value equal "Aguardando"
#      And the user should see "observacao" with value equal ""
    Examples:
      | field | value | field1 | value1 |
      | vara  | teste | numero | 23   |

  Scenario: Update a process
        Given the user backs to the process grid
        And the user clicks on edit button
        And the user should see "observacao" with value equal "eu"
        And the user clicks on edit save button
        And the user backs to the process grid
        When the user clicks on show button
        Then the user should see "observacao" with value equal "eu"

       Scenario: Delete a process
         Given the user backs to the process grid
         When the user clicks on delete button
         And the user confirms delete
         Then the user should not see last process code



