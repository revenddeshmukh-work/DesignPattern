Abstract : Hide the object creation logic and let a factory decide which object to create and add one more specific extra layer where factory also doesn't know which logic have to call it is factory of factory and we remove the conditon we pass the factory adn from there it create the new object 



Here Employee factory decide what to create 
            Main
              |
              |
              v
      EmployeeFactory
              |
              |
              v
      EmployeAbstractFactory
       /            \
      /              \
  WebFactory      AndroidFactory
       /            \
      /              \
WebDeveloper    AndroidDeveloper