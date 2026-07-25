Factory : Hide the object creation logic and let a factory decide which object to create

instead of doing Employee emp = new WebDeveloper()

Employee emp = EmployeeFactory.getEmployee("web")

Here Employee factory decide what to create 
            Main
              |
              |
              v
      EmployeeFactory
       /            \
      /              \
WebDeveloper    AndroidDeveloper