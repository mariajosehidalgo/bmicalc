#Author: mariajose.hidalgo@uma.es
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@tag
Feature: Calculadora BMI
  Como usuario de la calculadora, yo quiero introducir mi masa corporal y mi altura para poder obtener el cálculo de mi BMI.

  @tag1
  Scenario Outline: Los datos son validos y devuelve un resultado
    Given Tenemos inicializada la calculadora
    When El usuario introduce valores validos de <mass> y <height>
    Then La calculadora devuelve el valor del <bmi> del usuario
    
    Examples: 
      |  mass | height |  bmi  |
      | 64.0  | 1.62   | 24.39 |
      | 50.3  | 1.32   | 28.87 |
      | 109.8 | 1.82   | 33.15 |
      | 12.39 | 0.78   | 20.36 |
      | 54.32 | 1.75   | 17.73 |
      
      
    
  @tag2
  Scenario Outline: Los datos introducidos no tienen formato valido
    Given Tenemos inicializada la calculadora
    When El usuario introduce valores invalidos de <masa> y <altura>
    Then La calculadora lanza un error en el que informa que los datos no estan en un formato valido. Vuelve al menu original.
   
   	Examples: 
      | masa | altura|
      |-64.0 |1.62   |
      |-50.3 |1.32   |
      |-109.8|1.82   |
      |12.39 |-0.78  |
      |54.32 |-1.75  |
