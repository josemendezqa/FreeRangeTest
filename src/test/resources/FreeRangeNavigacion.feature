Feature: Navitgation bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

    #Scenario Outline: I can access the supages through the navigation bar
    #    Given I navigate to www.freerangetesters.com
     #   When I go to <section> using the navigation bar
      #  Examples:
       #     | section |
        #    | Cursos |
         #   | Recursos |
          #  | Blog |
           # | Mentorías |
            #| Udemy |

#Scenario: Courses are presented correctly to potential customers
#    Given I navigate to www.freerangetesters.com
#    When I go to Cursos using the navigation bar
#    And select Introduccion al Testing

Scenario: Courses are presented correctly to potential customers
    Given I navigate to www.freerangetesters.com
    When I select Elegir Plan
    Then I can validate option on the options in the checkout page
