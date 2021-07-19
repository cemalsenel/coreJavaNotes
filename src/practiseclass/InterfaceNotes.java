package practiseclass;

public class InterfaceNotes {
	
/*
 >By using interface we can use multiple inheritance in Java
  
  >Interface is not a class, interface is an interface
  
  >For concrete and abstract classes we use "extends" keyword
  but interfaces we use "implements" keyword:
  
  Child:     Parents:
  Class ==> Class use "extends"
  Class ==> Interface use "implements"
  Interface ==> Interface use "extends"
  Interface ==> Class it is not allowed
  
  >We cannot create an object from an interface, interfaces are full abstract. So we cannot
  create object from interfaces
  >We cannot have a constructors in interfaces
  
  >The methods should be abstract in interface.
  
  About methods:
  All the methods in interface are 
    public, abstract by default even if we don't write public abstract.
    (When you work in a class if you remove access modifier it is default but if you re working in an interface
    if you don't write an access modifier it is public)
    
  About Variables:
  All the variables in an interface are
    public, static, final by default. 
    Since variables are final we have to initialize them.
    
    
    !!!INTERVIEW QUESTION!!!
    Differences between abstract classes and interfaces:
    
    1)Abstract Class = We can use "abstract" and "concrete" methods 
      Interface = We can use just "abstract" methods (After Java 8, we are able to use concrete methods interfaces (you ll learn them)
     
    2)Abstract Class= We cannot have multiple inheritance
      Interface     = We can have multiple inheritance
      
    3)Abstract Class = We can have constructors
      Interface = We cannot have constructors
      
    4)Abstract Class = We can have any type of variable 
     Interface = All the variables are public, static, final
     
    5)Abstract Class=When we create an abstract method we have to write "abtract" keyword
      Interface = No need to write "abstract" keyword to create abstract methods.
      
      We cannot create an object from but abstract classes and interfaces.
    
   
  
 */
 

}
